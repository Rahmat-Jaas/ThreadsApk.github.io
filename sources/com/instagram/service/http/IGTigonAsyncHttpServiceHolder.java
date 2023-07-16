package com.instagram.service.http;

import X.C04220Ms;
import X.C10300i6;
import X.C15020qa;
import X.C49002qg;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;

public final class IGTigonAsyncHttpServiceHolder extends TigonServiceHolder {
    public static final C49002qg Companion = new C49002qg();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IGTigonAsyncHttpServiceHolder(com.instagram.service.http.IGTigonAsyncHttpService r2) {
        /*
            r1 = this;
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            com.facebook.jni.HybridData r0 = initHybrid(r2)
            X.C04220Ms.A0A(r0)
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpServiceHolder.<init>(com.instagram.service.http.IGTigonAsyncHttpService):void");
    }

    public static final IGTigonAsyncHttpServiceHolder getInstance(C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        return (IGTigonAsyncHttpServiceHolder) r3.A01(IGTigonAsyncHttpServiceHolder.class, new KtLambdaShape115S0100000_I2_95(r3, 7));
    }

    public static final native HybridData initHybrid(IGTigonAsyncHttpService iGTigonAsyncHttpService);

    static {
        C15020qa.A0A("igtigonasynchttpservice-jni");
    }
}
