package com.allinabc.rpc.core;

import com.allinabc.rpc.entity.Peer;

/**
 * @author Fenger
 * @date 2020-12-18 14:30
 */
public interface RequestContext {

    Peer getRemotePeer();

}
