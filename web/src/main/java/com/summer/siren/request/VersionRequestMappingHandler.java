package com.summer.siren.request;

import com.summer.siren.anotations.VersionMaker;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
/**
  *@date 2020/8/5 23:58
  *@author moyang
  *
  **/
public class VersionRequestMappingHandler extends RequestMappingHandlerMapping {

    /**
     * controller类的解析客户端的版本号
     * @param handlerType url映射对应的controller类
     * @return org.springframework.web.servlet.mvc.condition.RequestCondition<com.xbg.rich.common.request.ApiVersionCondition>
     */
    @Override
    protected RequestCondition<ApiVersionCondition> getCustomTypeCondition(Class<?> handlerType) {
        VersionMaker apiVersion = AnnotationUtils.findAnnotation(handlerType, VersionMaker.class);
        return createCondition(apiVersion);
    }

    /**
     * controller类的方法解析版本
     * @param method 对应的方法
     * @return org.springframework.web.servlet.mvc.condition.RequestCondition<com.xbg.rich.common.request.ApiVersionCondition>
     */
    @Override
    protected RequestCondition<ApiVersionCondition> getCustomMethodCondition(Method method) {
        VersionMaker apiVersion = AnnotationUtils.findAnnotation(method, VersionMaker.class);
        return createCondition(apiVersion);
    }

    /**
     * 自定义创建RequestCondition对象方法
     * @param apiVersion 注解
     * @return org.springframework.web.servlet.mvc.condition.RequestCondition<com.xbg.rich.common.request.ApiVersionCondition>
     */
    private RequestCondition<ApiVersionCondition> createCondition(VersionMaker apiVersion) {
        return apiVersion == null ? null : new ApiVersionCondition(apiVersion.value());
    }
}
