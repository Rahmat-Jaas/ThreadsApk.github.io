package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6NE  reason: invalid class name */
public final class AnonymousClass6NE {
    public static final void A00(C147188nY r21, Modifier modifier, C142918fo r23, AnonymousClass59F r24, AnonymousClass0YP r25, float f, int i, int i2, long j, long j2, long j3) {
        int i3;
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        float f2 = f;
        C142918fo r8 = r23;
        Modifier modifier2 = modifier;
        AnonymousClass59F r3 = r24;
        C04220Ms.A0B(r3, 0);
        C147188nY r6 = r21;
        r6.Cvd(1733129854);
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            r8 = C103486Zj.A01;
            i3 = i4 & -897;
        } else {
            i3 = i4;
        }
        if ((i2 & 8) != 0) {
            f2 = C103486Zj.A00;
            i3 &= -7169;
        }
        if ((i2 & 16) != 0) {
            j6 = C120537Bh.A00(r6).A07;
            i3 &= -57345;
        }
        if ((i2 & 32) != 0) {
            j5 = AnonymousClass7KB.A02(r6);
            i3 &= -458753;
        }
        if ((i2 & 64) != 0) {
            r6.Cvb(31167449);
            j4 = C121657He.A04(C86154wM.A0G(AnonymousClass7KE.A01), AnonymousClass7KE.A03(AnonymousClass7KE.A01), AnonymousClass7KE.A02(AnonymousClass7KE.A01), AnonymousClass7KE.A01(AnonymousClass7KE.A01), 0.5f);
            AnonymousClass7W3.A0z(r6, false);
            i3 &= -3670017;
        }
        int i5 = i3 << 3;
        AnonymousClass7GX.A01(r6, modifier2, r8, r3.A01, r25, r3.A03, f2, C86114wI.A04(i5, (i3 & 112) | 512 | (i5 & 7168)) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024), 0, j6, j5, j4);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8T0(modifier2, r8, r24, r25, f2, i, i2, j6, j5, j4));
        }
    }
}
