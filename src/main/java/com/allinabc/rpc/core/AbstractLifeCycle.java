package com.allinabc.rpc.core;

import com.allinabc.rpc.exeception.LifeCycleExeception;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author: Fenger
 * @date: 2020-12-18 11:20
 */
public abstract class AbstractLifeCycle implements LifeCycle {

    private final AtomicBoolean isStarted = new AtomicBoolean(false);

    public void startup() throws LifeCycleExeception {
        if (isStarted.compareAndSet(false, true))   return;
        throw new LifeCycleExeception("this component has started");
    }

    public void shundown() {
        if (isStarted.compareAndSet(true, false))   return;
        throw new LifeCycleExeception("this component has closed");
    }

    public boolean isStarted() {
        return isStarted.get();
    }

}
