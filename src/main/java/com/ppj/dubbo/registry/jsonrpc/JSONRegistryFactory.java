package com.ppj.dubbo.registry.jsonrpc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.support.AbstractRegistryFactory;

/**
 * 自定义注册中心
 * @author xiangnan
 * @date 2022年09月08日 3:30 PM
 */
public class JSONRegistryFactory extends AbstractRegistryFactory {

    @Override
    protected Registry createRegistry(URL url) {
        return new JSONRegistry(url);
    }
}
