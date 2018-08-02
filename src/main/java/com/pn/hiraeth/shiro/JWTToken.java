package com.pn.hiraeth.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Description: TODO
 *
 * <p>@author Ives.l
 * <p>@date 2018/7/31
 * <p>@time 23:15
 */
public class JWTToken implements AuthenticationToken {
    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
