/**
 * FileName: LiveActivityTeamServiceImpl
 * Author:   liuzhuo
 * Date:     2018/10/10 14:11
 * Description: 测试集成mybatis的impl类
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/10 14:11      1.0.0             描述
 */
package com.lz.springboot.service.impl;

import com.lz.springboot.bean.LiveActivityTeam;
import com.lz.springboot.mapper.LiveActivityTeamMapper;
import com.lz.springboot.service.LiveActivityTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试集成mybatis的impl类〉
 *
 * @author Administrator
 * @create 2018/10/10
 * @since 1.0.0
 */
@Service
public class LiveActivityTeamServiceImpl implements LiveActivityTeamService {

    @Autowired
    private LiveActivityTeamMapper liveActivityTeamMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public List<LiveActivityTeam> getLiveActivityTeam() {
        //查询缓存
        List<LiveActivityTeam> liveActivityTeam = (List<LiveActivityTeam>) redisTemplate.opsForValue().get("liveActivityTeam");
        if (liveActivityTeam == null || liveActivityTeam.size() == 0) {
            synchronized (this) {
                liveActivityTeam = (List<LiveActivityTeam>) redisTemplate.opsForValue().get("liveActivityTeam");
                if (liveActivityTeam == null || liveActivityTeam.size() == 0) {
                    System.err.println("查询数据库......");
                    liveActivityTeam = liveActivityTeamMapper.selectLiveActivityTeam();
                    redisTemplate.opsForValue().set("liveActivityTeam", liveActivityTeam);
                } else {
                    System.out.println("查询缓存......");
                }
            }
        } else {
            System.out.println("查询缓存........");
        }

        return liveActivityTeam;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update() {
        LiveActivityTeam liveActivityTeam = new LiveActivityTeam();
        liveActivityTeam.setTeamId("00974ccbcf404b45aa22a12dd3bdc69b");
        liveActivityTeam.setCusId("liu123");
        return liveActivityTeamMapper.updateByPrimaryKeySelective(liveActivityTeam);
    }
}
