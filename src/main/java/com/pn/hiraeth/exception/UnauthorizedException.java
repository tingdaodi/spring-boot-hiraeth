package com.pn.hiraeth.exception;

/**
 * Description: TODO
 *
 * <p>@author Ives.l
 * <p>@date 2018/7/31
 * <p>@time 23:05
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() {
        super();
    }
}
