package com.heima.apis.wemedia;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.pojos.WmUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 梁峥嵘
 */
@FeignClient("leadnews-wemedia")
public interface IWemediaClient {

    @GetMapping("/api/v1/channel/list")
    public ResponseResult getChannels();

    WmUser findWmUserByName(String name);

    void saveWmUser(WmUser wmUser);
}
