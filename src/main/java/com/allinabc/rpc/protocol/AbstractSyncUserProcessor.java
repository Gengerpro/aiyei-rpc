package com.allinabc.rpc.protocol;

import com.allinabc.rpc.core.RequestContext;

/**
 * 同步用户请求处理器
 * @author Fenger
 * @date 2020-12-18 14:56
 */
public abstract class AbstractSyncUserProcessor<T, R> {

    /**
     * 接收处理请求，客户端等待返回值
     *
     * @param requestContext
     * @param requestBody
     * @return
     */
    abstract R handleRequest(RequestContext requestContext, T requestBody);

}
