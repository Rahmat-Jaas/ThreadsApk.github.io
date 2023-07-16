package androidx.compose.runtime;

import X.AnonymousClass0YP;
import X.C109636kK;
import X.C142578fF;
import X.C148808sD;
import X.C148848sH;
import X.C27952Ew2;
import X.C86104wH;
import X.C86144wL;

public final class PausableMonotonicFrameClock implements C148808sD {
    public final C109636kK A00 = new C109636kK();
    public final C148808sD A01;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r0 == r5) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DBB(X.C146958n9 r7, X.AnonymousClass0YY r8) {
        /*
            r6 = this;
            r3 = 4
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0070
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r4.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r0) goto L_0x0027
            if (r2 != r1) goto L_0x0076
            X.AnonymousClass0OU.A00(r3)
        L_0x0026:
            return r3
        L_0x0027:
            java.lang.Object r8 = r4.A02
            X.0YY r8 = (X.AnonymousClass0YY) r8
            java.lang.Object r0 = r4.A01
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = (androidx.compose.runtime.PausableMonotonicFrameClock) r0
            X.AnonymousClass0OU.A00(r3)
            goto L_0x0064
        L_0x0033:
            X.AnonymousClass0OU.A00(r3)
            X.6kK r3 = r6.A00
            X.C86124wJ.A1S(r6, r8, r4, r0)
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x004e
            X.EnC r1 = X.C18220wO.A11(r4)
            monitor-enter(r2)
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x007b }
            r0.add(r1)     // Catch:{ all -> 0x007b }
            goto L_0x0051
        L_0x004e:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x0061
        L_0x0051:
            monitor-exit(r2)
            r0 = 49
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r0 = X.C86164wN.A10(r1, r3, r0)
            r1.BQt(r0)
            java.lang.Object r0 = r1.A0B()
            if (r0 != r5) goto L_0x004e
        L_0x0061:
            if (r0 == r5) goto L_0x006f
            r0 = r6
        L_0x0064:
            X.8sD r0 = r0.A01
            X.C86164wN.A1N(r4)
            java.lang.Object r3 = r0.DBB(r4, r8)
            if (r3 != r5) goto L_0x0026
        L_0x006f:
            return r5
        L_0x0070:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.DBB(X.8n9, X.0YY):java.lang.Object");
    }

    public final /* synthetic */ C142578fF Aqq() {
        return C148808sD.A00;
    }

    public PausableMonotonicFrameClock(C148808sD r2) {
        this.A01 = r2;
    }

    public final Object ANL(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C148848sH AOA(C142578fF r2) {
        return C86144wL.A13(this, r2);
    }

    public final C27952Ew2 BgS(C142578fF r2) {
        return C86144wL.A14(this, r2);
    }

    public final C27952Ew2 CWl(C27952Ew2 ew2) {
        return C86144wL.A15(this, ew2);
    }
}
