package com.yyd.bytedance.open.demo.controller.query.info;

import java.util.List;
import lombok.Data;

/**
 * @author yangyidian
 * @date 2020/07/23
 **/
@Data
public class AppModifyWebviewDomainQuery {
    /**
     * add 添加，delete 删除，set 覆盖，get 获取
     * 若不填此项，默认将第三方平台配置好的 webview 域名全部添加到授权小程序
     */
    private String action;

    private List<String> webview;
}
