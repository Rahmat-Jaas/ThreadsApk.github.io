package com.facebook.redex;

import X.AnonymousClass08O;
import X.AnonymousClass08P;
import X.AnonymousClass0LU;
import X.AnonymousClass0UP;
import X.C04410Nm;
import X.C04680Or;
import X.C06890aY;
import X.C06910aa;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.util.List;

public class IDxCListenerShape169S0000000_I2 implements C04410Nm {
    public final int A00;

    public IDxCListenerShape169S0000000_I2(int i) {
        this.A00 = i;
    }

    public final void Bzu(boolean z) {
        if (this.A00 != 0) {
            synchronized (C04680Or.class) {
                C04680Or.A00 = true;
                C04680Or.A01 = z;
                synchronized (AppStateLoggerNative.class) {
                    if (AppStateLoggerNative.sAppStateLoggerNativeInited) {
                        AppStateLoggerNative.appInForeground(z, z);
                    } else {
                        AnonymousClass0LU.A0C("AppStateLoggerNative", "AppStateLoggerNative.initializeNativeCrashReporting not called.");
                    }
                }
            }
            return;
        }
        C06890aY r0 = C06910aa.A0C;
        if (r0 != null) {
            List<AnonymousClass0UP> list = r0.A00;
            synchronized (list) {
                if (z) {
                    for (AnonymousClass0UP r2 : list) {
                        r2.A00.A0Q.post(new AnonymousClass08O(r2));
                    }
                    return;
                }
                for (AnonymousClass0UP r22 : list) {
                    r22.A00.A0Q.post(new AnonymousClass08P(r22));
                }
            }
        }
    }
}
