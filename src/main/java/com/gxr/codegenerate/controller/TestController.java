package com.gxr.codegenerate.controller;


import com.gxr.codegenerate.common.BaseResponse;
import com.gxr.codegenerate.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public BaseResponse<String> testCheck() {
        return ResultUtils.success("success");
    }
}
