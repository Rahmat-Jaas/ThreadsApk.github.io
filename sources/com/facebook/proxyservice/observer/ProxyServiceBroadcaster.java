package com.facebook.proxyservice.observer;

import X.AnonymousClass0wJ;
import X.C111456ni;
import X.C145248kA;
import java.util.List;

public class ProxyServiceBroadcaster {
    public static final C111456ni Companion = new C111456ni();
    public static final ProxyServiceBroadcaster instance = new ProxyServiceBroadcaster();
    public String clientAddress = "";
    public String clientRegion = "";
    public int httpProxyPort;
    public boolean isProxyMode;
    public final List observers = AnonymousClass0wJ.A0v();
    public String proxyAddress = "";
    public int socksProxyPort;

    public final synchronized String getProxyAddress() {
        return this.proxyAddress;
    }

    public final synchronized int getSocksProxyPort() {
        return this.socksProxyPort;
    }

    public final synchronized void registerObserver(C145248kA r5) {
        if (this.isProxyMode) {
            r5.Brj(this.proxyAddress, this.httpProxyPort, this.socksProxyPort, this.clientAddress);
        }
        this.observers.add(r5);
    }

    public static final ProxyServiceBroadcaster getInstance() {
        return instance;
    }
}
