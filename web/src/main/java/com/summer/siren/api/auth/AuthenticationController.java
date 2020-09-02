package com.summer.siren.api.auth;

import com.summer.siren.anotations.VersionMaker;
import com.summer.siren.api.auth.params.LoginParams;
import com.summer.siren.api.auth.params.RegisterParams;
import com.summer.siren.response.WebResponse;
import com.summer.siren.vo.SubjectVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    /**
     * 登录
     * @param loginParams 登录参数
     * @return 主体基本信息
     */
    @PostMapping("/login")
    @VersionMaker
    public WebResponse<SubjectVo> login(@RequestBody LoginParams loginParams) {
        return null;
    }

    /**
     * 注册
     * 注册权限需要管理员进行分配
     * @param registerParams 注册参数
     * @return 0 成功 1 失败
     */
    @PostMapping("/register")
    @VersionMaker
    public WebResponse<Integer> register(@RequestBody RegisterParams registerParams) {
        return null;
    }
}
