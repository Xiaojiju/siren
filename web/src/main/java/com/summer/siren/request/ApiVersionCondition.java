package com.summer.siren.request;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
  *@date 2020/8/5 23:46
  *@author moyang
  * 解析版本控制
  **/
public class ApiVersionCondition implements RequestCondition<ApiVersionCondition> {

    private final static Pattern VERSION_COMPARE_PREFIX = Pattern.compile("/v(\\d+)/.*");
    private final int apiVersion;

    public ApiVersionCondition(int apiVersion) {
        this.apiVersion = apiVersion;
    }

    @Override
    @NonNull
    public ApiVersionCondition combine(ApiVersionCondition apiVersionCondition) {
        return new ApiVersionCondition(apiVersionCondition.getApiVersion());
    }

    @Override
    @Nullable
    public ApiVersionCondition getMatchingCondition(HttpServletRequest httpServletRequest) {
        Matcher matcher = getVersionComparePrefix().matcher(httpServletRequest.getRequestURI());
        if (matcher.find()) {
            int version = Integer.parseInt(matcher.group(1));
            if (version >= this.getApiVersion()) {
                return this;
            }
        }
        return null;
    }

    @Override
    public int compareTo(ApiVersionCondition apiVersionCondition, @NonNull HttpServletRequest httpServletRequest) {
        return apiVersionCondition.getApiVersion() - this.apiVersion;
    }

    public static Pattern getVersionComparePrefix() {
        return VERSION_COMPARE_PREFIX;
    }

    public int getApiVersion() {
        return this.apiVersion;
    }
}
