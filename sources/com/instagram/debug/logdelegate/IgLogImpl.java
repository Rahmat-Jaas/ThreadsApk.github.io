package com.instagram.debug.logdelegate;

import X.AnonymousClass0JW;
import X.C03680Kg;
import X.C04220Ms;
import X.C10450iM;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgLogImpl extends C03680Kg {
    public static final Companion Companion = new Companion();
    public static final IgLogImpl sInstance = new IgLogImpl();

    public void wtf(String str, String str2, Throwable th) {
        C04220Ms.A0B(str, 0);
        C04220Ms.A0B(str2, 1);
        C04220Ms.A0B(th, 2);
        C10450iM.A06(str, str2, th);
        Log.e(str, str2, th);
    }

    public final class Companion {
        public final AnonymousClass0JW getInstance() {
            return IgLogImpl.sInstance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final AnonymousClass0JW getInstance() {
        return sInstance;
    }

    public void wtf(String str, String str2) {
        C04220Ms.A0B(str, 0);
        C04220Ms.A0B(str2, 1);
        C10450iM.A03(str, str2);
        Log.e(str, str2);
    }
}
