package com.gxr.codegenerate.service;

import com.gxr.codegenerate.model.dto.app.AppAddRequest;
import com.gxr.codegenerate.model.dto.app.AppQueryRequest;
import com.gxr.codegenerate.model.entity.App;
import com.gxr.codegenerate.model.entity.User;
import com.gxr.codegenerate.model.vo.AppVo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

/**
 * 应用 服务层。
 *
 * @author gxr
 */
public interface AppService extends IService<App> {

    boolean removeById(Serializable id);

    String deployApp(Long appId, User loginUser);

    void generateAppScreenshotAsync(Long appId, String appUrl);

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Long createApp(AppAddRequest appAddRequest, User loginUser);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);
}
