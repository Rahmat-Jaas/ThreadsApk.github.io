package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.KtLambdaShape3S0302000_I2;

/* renamed from: X.6Du  reason: invalid class name and case insensitive filesystem */
public final class C98006Du {
    public static final void A00(AnonymousClass84E r13, C147188nY r14, Object obj, AnonymousClass0YP r16, int i, int i2) {
        Snapshot A05;
        C142978fu r0;
        AnonymousClass84E r8 = r13;
        AnonymousClass0YP r10 = r16;
        AnonymousClass0wJ.A1Q(r13, r10);
        r14.Cvd(-2079116560);
        Object obj2 = obj;
        boolean A10 = C147188nY.A10(r14, obj, r13, 511388516);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r14;
        Object A13 = r4.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass7Y2(r13, obj);
            r4.A14(A13);
        }
        AnonymousClass7W3.A0w(r4, false);
        AnonymousClass7Y2 r3 = (AnonymousClass7Y2) A13;
        int i3 = i;
        C147368pE.A03(r3.A01, i3);
        AnonymousClass534 r2 = C102796Wo.A00;
        C142988fv r5 = (C142988fv) r14.AEA(r2);
        Snapshot A02 = C121637Hc.A02();
        try {
            A05 = A02.A05();
            C147368pE r1 = r3.A00;
            if (r5 != ((C142988fv) r1.getValue())) {
                r1.CrC(r5);
                if (AnonymousClass0wJ.A04(r3.A03.getValue()) > 0) {
                    C147368pE r12 = r3.A02;
                    C142978fu r02 = (C142978fu) r12.getValue();
                    if (r02 != null) {
                        r02.release();
                    }
                    if (r5 != null) {
                        r0 = r5.CWg();
                    } else {
                        r0 = null;
                    }
                    r12.CrC(r0);
                }
            }
            C86144wL.A1N(A05);
            A02.A0A();
            boolean A0y = C147188nY.A0y(r14, r3);
            Object A132 = r4.A13();
            if (A0y || A132 == AnonymousClass7GN.A00) {
                A132 = C86154wM.A0z(r3, 4);
                r4.A14(A132);
            }
            AnonymousClass7W3.A0c(r14, r4, A132, r3, false);
            int i4 = i2;
            AnonymousClass7Ai.A01(r14, r10, AnonymousClass7DS.A01(r2, r3, true), i2 >> 6);
            C147178nW AKE = r14.AKE();
            if (AKE != null) {
                AKE.D9d(new KtLambdaShape3S0302000_I2(r8, obj2, r10, i4, i3, 0));
            }
        } catch (Throwable th) {
            A02.A0A();
            throw th;
        }
    }
}
