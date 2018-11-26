/**
 * FileName: LiveActivityTeamController
 * Author:   liuzhuo
 * Date:     2018/10/10 13:46
 * Description: 测试集成mybatis是否成功
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/10 13:46      1.0.0             描述
 */
package com.lz.springboot.controller;

import com.lz.springboot.bean.LiveActivityTeam;
import com.lz.springboot.service.LiveActivityTeamService;
import com.sun.xml.internal.ws.wsdl.writer.document.ParamType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试集成mybatis是否成功〉
 *
 * @author Administrator
 * @create 2018/10/10
 * @since 1.0.0
 */
@RestController
@Api(tags = "LiveActivityTeamController", description = "活动团队类")
public class LiveActivityTeamController {

    @Autowired
    private LiveActivityTeamService liveActivityTeamService;

    /**
     * paramType :
     * path        以地址的形式提交数据
     * query       直接跟参数完成自动映射赋值
     * body        以流的形式提交 仅支持POST
     * header      参数在request headers 里边提交
     * form        以form表单的形式提交 仅支持POST
     */

    @ApiOperation(value = "这是一个方法的说明", notes = "")
    @ApiImplicitParam(paramType = "query", name = "team_id", value = "团队ID", required = true, dataType = "String")
    @PostMapping("/boot/testTeam")
    public Object testTeam(@RequestParam("team_id") String team_id) {
       /* //字符串的序列化缓存的key
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                liveActivityTeamService.getLiveActivityTeam();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(25);
        for (int i = 0; i < 10000; i++) {
            executorService.submit(runnable);

        }
        return liveActivityTeamService.getLiveActivityTeam();
    }


    @ApiOperation(value = "RestFull风格方法", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "teamId", value = "团队ID", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "path", name = "number", value = "人数", required = false, dataType = "int")
    })
    @GetMapping("/boot/testRestFull/{teamId}")
    public Object testRestFull(@PathVariable("teamId") String teamId) {
        LiveActivityTeam liveActivityTeam = new LiveActivityTeam();
        liveActivityTeam.setTeamId(teamId);
        System.err.println(teamId);
        return liveActivityTeam;
    }

    @ApiOperation(value = "传入Json参数", notes = "")
    @PutMapping("/boot/testJson")
    @ApiImplicitParam(paramType = "query", name = "jsonpObject", value = "传入的json", required = true, dataType = "string")
    public String testJson(String jsonpObject) {
        System.err.println(jsonpObject);
        return jsonpObject;
    }
}
