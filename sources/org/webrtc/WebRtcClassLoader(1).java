package org.webrtc;

import X.C18250wR;

public class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw C18250wR.A0V("Failed to get WebRTC class loader.");
    }
}
