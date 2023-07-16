package com.fbpay.ptt.impl;

import X.C15020qa;
import com.facebook.jni.HybridData;
import java.util.List;

public class ServerCertsVerifier {
    public HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native String verifyCerts(String[] strArr);

    public String verifyCerts(List list) {
        return verifyCerts((String[]) list.toArray(new String[0]));
    }

    static {
        C15020qa.A0A("fbpayptt-android");
    }
}
