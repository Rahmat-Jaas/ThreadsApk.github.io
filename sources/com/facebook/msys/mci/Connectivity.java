package com.facebook.msys.mci;

import X.AnonymousClass0fS;
import X.AnonymousClass737;
import X.C108186hx;
import X.C18180wK;
import X.C86164wN;
import com.instagram.realtimeclient.RealtimeClientManager;

public class Connectivity {
    public static C108186hx sConnectivityHandler;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized void ensureInitialized() {
        synchronized (Connectivity.class) {
            if (sConnectivityHandler == null) {
                throw C18180wK.A0a("Connectivity is not initialized");
            }
        }
    }

    public static synchronized int getDgwState() {
        synchronized (Connectivity.class) {
            ensureInitialized();
        }
        return 1;
    }

    public static synchronized int getMqttState() {
        int A04;
        synchronized (Connectivity.class) {
            ensureInitialized();
            A04 = C86164wN.A04(RealtimeClientManager.getInstance(sConnectivityHandler.A01).isMqttConnected() ? 1 : 0);
        }
        return A04;
    }

    public static synchronized int getNetworkState() {
        int A04;
        synchronized (Connectivity.class) {
            ensureInitialized();
            A04 = C86164wN.A04(AnonymousClass0fS.A0A(sConnectivityHandler.A00) ? 1 : 0);
        }
        return A04;
    }

    static {
        AnonymousClass737.A00();
    }
}
