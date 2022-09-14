package com.ppj.dubbo.registry.jsonrpc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.NotifyListener;
import org.apache.dubbo.registry.support.FailbackRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangnan
 * @date 2022年09月08日 3:32 PM
 */
public class JSONRegistry extends FailbackRegistry {

    public JSONRegistry(URL url){
        super(url);

    }

    @Override
    public void doRegister(URL url) {

    }

    @Override
    public void doUnregister(URL url) {

    }

    @Override
    public void doSubscribe(URL url, NotifyListener listener) {
        List<URL> urls = new ArrayList<>();
        URL providerUrl = new URL("jsonrpc","127.0.0.1",8080);
        urls.add(providerUrl);
        listener.notify(urls);
    }

    @Override
    public void doUnsubscribe(URL url, NotifyListener listener) {

    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
