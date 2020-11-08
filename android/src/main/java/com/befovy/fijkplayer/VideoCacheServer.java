package com.befovy.fijkplayer;

import android.content.Context;

import com.danikula.videocache.HttpProxyCacheServer;

public class VideoCacheServer {

    private static HttpProxyCacheServer proxy;

    public static HttpProxyCacheServer getProxy(Context context) {
        if (proxy == null) {
            proxy = newProxy(context);
        }
        return proxy;
    }

    private static HttpProxyCacheServer newProxy(Context context) {
        return new HttpProxyCacheServer.Builder(context)
                .cacheDirectory(Utils.getVideoCacheDir(context))
                .build();
    }
}