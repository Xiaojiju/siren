package com.summer.siren.api;

import com.summer.siren.common.Constants;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
  *@date 2020/7/14 23:11
  *@author moyang
  * 基础控制器，包含一些基本的方法
  **/
public class BaseController {

    protected HttpServletRequest httpServletRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

    protected String currentToken() {
        return this.httpServletRequest().getHeader(Constants.AUTH_TOKEN);
    }

    protected long currentSubject() {
        return 0;
    }
}
