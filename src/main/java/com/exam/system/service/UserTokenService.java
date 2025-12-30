package com.exam.system.service;

import com.exam.system.domain.User;
import com.exam.system.domain.UserToken;

public interface UserTokenService extends BaseService<UserToken> {

    /**
     * 微信token绑定
     *
     * @param user user
     * @return UserToken
     */
    UserToken bind(User user);

    /**
     * 检查微信openId是否绑定�?
     *
     * @param openId openId
     * @return UserToken
     */
    UserToken checkBind(String openId);

    /**
     * 根据token获取UserToken，带缓存�?
     *
     * @param token token
     * @return UserToken
     */
    UserToken getToken(String token);

    /**
     * 插入用户Token
     *
     * @param user user
     * @return UserToken
     */
    UserToken insertUserToken(User user);

    /**
     * 微信小程序退出，清除缓存
     *
     * @param userToken userToken
     */
    void unBind(UserToken userToken);
}
