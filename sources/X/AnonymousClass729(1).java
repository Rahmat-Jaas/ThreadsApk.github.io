package X;

import kotlin.Unit;

/* renamed from: X.729  reason: invalid class name */
public final class AnonymousClass729 {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C146958n9 r5) {
        /*
            r3 = 8
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x0026
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r0) goto L_0x003c
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0026:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2
            r4.<init>(r3, r5)
            goto L_0x0016
        L_0x002c:
            X.AnonymousClass0OU.A00(r3)
            r4.A00 = r0
            X.EnC r0 = X.C18220wO.A11(r4)
            java.lang.Object r0 = r0.A0B()
            if (r0 != r2) goto L_0x003f
            return r2
        L_0x003c:
            X.AnonymousClass0OU.A00(r3)
        L_0x003f:
            X.4VV r0 = new X.4VV
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass729.A00(X.8n9):java.lang.Object");
    }

    public static final Object A01(C146958n9 r3, long j) {
        C145648kq r1;
        if (j > 0) {
            C27420EnC A17 = C86104wH.A17(r3);
            if (j < Long.MAX_VALUE) {
                C148848sH AOA = A17.A02.AOA(C148798sC.A00);
                if (!(AOA instanceof C145648kq) || (r1 = (C145648kq) AOA) == null) {
                    r1 = AnonymousClass6Z8.A00;
                }
                r1.Cg9(A17, j);
            }
            Object A0B = A17.A0B();
            if (A0B == D0E.COROUTINE_SUSPENDED) {
                return A0B;
            }
        }
        return Unit.A00;
    }
}
