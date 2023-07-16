package com.facebook.msys.mci;

import X.AnonymousClass737;

public class Proxies {
    public static boolean sConfigured;

    public static native void configureInternal(ProxyProvider proxyProvider);

    static {
        AnonymousClass737.A00();
    }

    public static boolean isMCPEnabledForProxies(int i) {
        return false;
    }
}
