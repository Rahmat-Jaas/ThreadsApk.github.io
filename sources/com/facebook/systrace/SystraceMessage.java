package com.facebook.systrace;

import X.C14270p7;
import X.C14290p9;
import X.C14300pA;
import X.C14310pB;
import X.C17820vb;
import X.C17830vc;
import X.C17890vi;
import X.C17940vn;

public final class SystraceMessage {
    public static final C14270p7 A00 = new C17940vn();
    public static final C14290p9 A01 = new C17830vc();
    public static final C14270p7 A02 = new C17890vi();
    public static final ThreadLocal A03 = new C14310pB();

    public static C14290p9 A00(long j) {
        return A01(A02, "", j);
    }

    public static C14290p9 A01(C14270p7 r6, String str, long j) {
        if (!Systrace.A0F(j)) {
            return A01;
        }
        C17820vb r5 = (C17820vb) A03.get();
        r5.A00 = j;
        r5.A02 = r6;
        r5.A03 = str;
        C14300pA r4 = r5.A01;
        for (int i = 0; i < r4.A00; i++) {
            r4.A01[i] = null;
        }
        r4.A00 = 0;
        return r5;
    }
}
