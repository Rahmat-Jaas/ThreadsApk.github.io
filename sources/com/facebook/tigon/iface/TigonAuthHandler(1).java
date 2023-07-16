package com.facebook.tigon.iface;

import java.util.Map;

public interface TigonAuthHandler {
    Map getAllHeaders(String str);

    Map getRoutingHeaders(String str);

    void update(String str, Map map);
}
