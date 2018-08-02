package com.pn.hiraeth.service;

import com.pn.hiraeth.support.UserBean;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Description: TODO
 *
 * <p>@author Ives.l
 * <p>@date 2018/7/31
 * <p>@time 23:10
 */
@Service
public class UserService {
    public UserBean getUser(String username) {
        // 没有此用户直接返回null
        if (! DataSource.getData().containsKey(username))
            return null;

        UserBean user = new UserBean();
        Map<String, String> detail = DataSource.getData().get(username);

        user.setUsername(username);
        user.setPassword(detail.get("password"));
        user.setRole(detail.get("role"));
        user.setPermission(detail.get("permission"));
        return user;
    }
}
