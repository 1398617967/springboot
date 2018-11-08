/**
 * FileName: LiveActivityTeamService
 * Author:   Administrator
 * Date:     2018/10/10 14:02
 * Description: 测试mybatis的service接口
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/10 14:02      1.0.0             描述
 */
package com.lz.springboot.service;

import com.lz.springboot.bean.LiveActivityTeam;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试mybatis的service接口〉
 *
 * @author Administrator
 * @create 2018/10/10
 * @since 1.0.0
 */
public interface LiveActivityTeamService {

    List<LiveActivityTeam> getLiveActivityTeam();

    int update();
}
