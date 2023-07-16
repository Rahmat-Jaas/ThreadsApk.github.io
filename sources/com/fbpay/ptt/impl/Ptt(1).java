package com.fbpay.ptt.impl;

import X.AnonymousClass0wJ;
import X.C15020qa;
import X.C18180wK;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ptt {
    public Set mAtFingerprints;
    public HybridData mHybridData;

    private native String decodeResponsePtt(String str);

    private native String generatePtt(String str);

    private native String getE2eeError();

    private native byte[] getSigningPayload(String str);

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, String str);

    public String decodeResponse(String str) {
        return decodeResponsePtt((String) null);
    }

    static {
        C15020qa.A0A("fbpayptt-android");
    }

    public Ptt(byte[] bArr, byte[] bArr2, byte[] bArr3, Set set, String str) {
        this.mAtFingerprints = set;
        this.mHybridData = initHybrid(bArr, bArr2, bArr3, (String[]) set.toArray(new String[0]), str);
    }

    public String createPtt(String str) {
        return generatePtt(str);
    }

    public String getEncryptionError() {
        return getE2eeError();
    }

    public Map getSigningPayloads() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator it = this.mAtFingerprints.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0y.put(A0k, getSigningPayload(A0k));
        }
        return Collections.unmodifiableMap(A0y);
    }
}
