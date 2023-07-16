package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Qi  reason: invalid class name and case insensitive filesystem */
public final class C101216Qi {
    public static final void A00(Modifier modifier, C147188nY r35, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r2 = r35;
        r2.Cvd(-167840704);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r2, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 11) != 2 || !r2.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            String A01 = AnonymousClass7JS.A01(r2, 2131829146);
            long j = C120537Bh.A00(r2).A0l;
            AnonymousClass534 r7 = AnonymousClass6YR.A00;
            long A04 = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), C18240wQ.A00(r2.AEA(r7)));
            r2.AEA(AnonymousClass6YT.A00);
            Modifier A06 = AnonymousClass7K4.A06(C115656vh.A01(modifier2, AnonymousClass7D5.A01, A04), (float) 4, 1);
            long A042 = C121657He.A04(C86154wM.A0G(AnonymousClass7KB.A00(r2)), AnonymousClass7KE.A03(AnonymousClass7KB.A00(r2)), AnonymousClass7KE.A02(AnonymousClass7KB.A00(r2)), AnonymousClass7KE.A01(AnonymousClass7KB.A00(r2)), C18240wQ.A00(r2.AEA(r7)));
            long A03 = AnonymousClass7Hi.A03(10);
            C134817yQ r15 = C134817yQ.A01;
            AnonymousClass79N r0 = new AnonymousClass79N();
            long j2 = AnonymousClass7HC.A01;
            C115746vq.A01(r2, A06, new C121807If(new C121237Ex(r0.A00, (C114276sy) null, (C114316t2) null, (AnonymousClass795) null, (C121117Ee) null, (C114326t3) null, (AnonymousClass79W) null, (AnonymousClass79X) null, j2), r0, new AnonymousClass7F0((C1201679b) null, (C98126Eh) null, r0.A01, (C1188372l) null, (C114236su) null, (C114246sv) null, r15, (AnonymousClass83Y) null, (C114266sx) null, (AnonymousClass79I) null, AnonymousClass7CC.A00(A042), (C121147Ei) null, (String) null, A03, j2, AnonymousClass7KE.A06)), A01, (AnonymousClass0YY) null, 0, 1, 1, 14155776, 56, false);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, modifier2, i4, i6, 9);
        }
    }
}
