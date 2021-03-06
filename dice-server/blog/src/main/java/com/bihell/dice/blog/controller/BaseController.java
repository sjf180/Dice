package com.bihell.dice.blog.controller;

import com.bihell.dice.blog.model.auth.User;
import com.bihell.dice.blog.security.context.SecurityContextHolder;
import com.bihell.dice.blog.utils.CacheUtil;
import com.bihell.dice.blog.utils.ErrorCode;
import com.bihell.dice.blog.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * 公共类 Controller
 *
 * @author bihell
 * @since 2017/7/8 10:25
 */
public abstract class BaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected CacheUtil cacheUtil;

    protected User user() {
        return Objects.requireNonNull(SecurityContextHolder.getContext().getAuthentication()).getDetail().getUser();
    }

    protected RestResponse error404() {
        return RestResponse.fail(ErrorCode.NOT_FOUND.getCode(), ErrorCode.NOT_FOUND.getMsg());
    }
}
