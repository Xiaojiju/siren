package com.summer.siren;

import com.summer.siren.request.VersionRequestMappingHandler;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
  *@date 2020/8/5 23:58
  *@author moyang
  *
  **/
@SpringBootConfiguration
public class WebManagerConfiguration implements WebMvcRegistrations {

    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new VersionRequestMappingHandler();
    }
}
