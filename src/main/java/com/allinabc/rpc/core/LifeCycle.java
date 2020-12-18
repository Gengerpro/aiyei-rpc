package com.allinabc.rpc.core;

import com.allinabc.rpc.exeception.LifeCycleExeception;

/**
 * @author: Fenger
 * @date: 2020-12-18 11:13
 */
public interface LifeCycle {

    void startup() throws LifeCycleExeception;

    void shundown() throws LifeCycleExeception;

    boolean isStarted();

}
