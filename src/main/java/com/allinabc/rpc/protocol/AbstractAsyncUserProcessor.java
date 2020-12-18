package com.allinabc.rpc.protocol;

import com.allinabc.rpc.core.RequestContext;

/**
 * 异步请求处理器
 * @author Fenger
 * @date 2020-12-18 14:59
 */
public abstract class AbstractAsyncUserProcessor<T> implements UserProcessor {

    /**
     * 接收请求，客户端无需等待结果，使用asyncContext异步获取结果
     * @param requestContext
     * @param asyncContext
     * @param requestBody
     */
    abstract void handleRequest(RequestContext requestContext, Object asyncContext, T requestBody);

}
