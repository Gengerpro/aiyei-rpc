package com.allinabc.rpc.protocol;

import com.allinabc.rpc.core.LifeCycle;
import com.allinabc.rpc.core.RequestContext;

import java.util.concurrent.Executor;

/**
 * 用户请求处理模型
 *
 * @author: Fenger
 * @date: 2020-12-18 11:33
 */
public interface UserProcessor extends LifeCycle {

    Executor getExecutor();

}
