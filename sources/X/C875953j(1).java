package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.53j  reason: invalid class name and case insensitive filesystem */
public final class C875953j extends AnonymousClass7YG implements C147768ps, C147748pq {
    public float A00;
    public Alignment A01;
    public C104136bI A02;
    public C115286uo A03;
    public C146878n1 A04;
    public boolean A05 = true;

    public C875953j(Alignment alignment, C104136bI r4, C115286uo r5, C146878n1 r6, float f) {
        C04220Ms.A0B(alignment, 3);
        this.A03 = r5;
        this.A01 = alignment;
        this.A04 = r6;
        this.A00 = f;
        this.A02 = r4;
    }

    public final int BfA(C147148nT r5, C147838q0 r6, int i) {
        C04220Ms.A0B(r5, 1);
        if (!A01()) {
            return r5.Bf8(i);
        }
        long A002 = A00(AnonymousClass7JT.A01(i));
        return Math.max(Constraints.A03(A002), r5.Bf8(i));
    }

    public final int BfD(C147148nT r5, C147838q0 r6, int i) {
        C04220Ms.A0B(r5, 1);
        if (!A01()) {
            return r5.BfB(i);
        }
        long A002 = A00(AnonymousClass7JT.A00(i));
        return Math.max(Constraints.A04(A002), r5.BfB(i));
    }

    public final C146098ld Bg3(C147578pZ r5, C147618pd r6, long j) {
        C04220Ms.A0B(r5, 1);
        C123657Xy Bg4 = r5.Bg4(A00(j));
        return C147618pd.A00(r6, C86154wM.A10(Bg4, 19), Bg4.A01, Bg4.A00);
    }

    public final int BgL(C147148nT r5, C147838q0 r6, int i) {
        C04220Ms.A0B(r5, 1);
        if (!A01()) {
            return r5.BgJ(i);
        }
        long A002 = A00(AnonymousClass7JT.A01(i));
        return Math.max(Constraints.A03(A002), r5.BgJ(i));
    }

    public final int BgO(C147148nT r5, C147838q0 r6, int i) {
        C04220Ms.A0B(r5, 1);
        if (!A01()) {
            return r5.BgM(i);
        }
        long A002 = A00(AnonymousClass7JT.A00(i));
        return Math.max(Constraints.A04(A002), r5.BgM(i));
    }

    public final /* synthetic */ void C5z() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (androidx.compose.ui.unit.Constraints.A00(r9) == 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(long r9) {
        /*
            r8 = this;
            int[] r5 = androidx.compose.ui.unit.Constraints.A04
            r3 = 3
            long r1 = r9 & r3
            int r0 = (int) r1
            r3 = r5[r0]
            r0 = 33
            long r1 = r9 >> r0
            int r0 = (int) r1
            r0 = r0 & r3
            boolean r0 = X.C18180wK.A1V(r0)
            r3 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = androidx.compose.ui.unit.Constraints.A00(r9)
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            int r1 = androidx.compose.ui.unit.Constraints.A02(r9)
            int r0 = androidx.compose.ui.unit.Constraints.A04(r9)
            if (r1 != r0) goto L_0x0100
            int r1 = androidx.compose.ui.unit.Constraints.A01(r9)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r9)
            if (r1 != r0) goto L_0x0100
        L_0x0032:
            boolean r0 = r8.A01()
            if (r0 != 0) goto L_0x003a
            if (r2 != 0) goto L_0x00f7
        L_0x003a:
            if (r3 != 0) goto L_0x00f7
            X.6uo r0 = r8.A03
            long r2 = r0.A01()
            boolean r0 = A03(r2)
            if (r0 == 0) goto L_0x00f1
            float r0 = X.AnonymousClass7JK.A02(r2)
            int r1 = X.AnonymousClass8bA.A02(r0)
        L_0x0050:
            boolean r0 = A02(r2)
            if (r0 == 0) goto L_0x00eb
            float r0 = X.AnonymousClass7JK.A00(r2)
            int r0 = X.AnonymousClass8bA.A02(r0)
        L_0x005e:
            int r1 = X.AnonymousClass8bI.A04(r9, r1)
            int r0 = X.AnonymousClass8bI.A03(r9, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            long r6 = X.C86104wH.A0C(r1, r0)
            r4 = r6
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x00b8
            X.6uo r0 = r8.A03
            long r0 = r0.A01()
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x00e0
            float r2 = X.AnonymousClass7JK.A02(r6)
        L_0x0083:
            X.6uo r0 = r8.A03
            long r0 = r0.A01()
            boolean r0 = A02(r0)
            if (r0 == 0) goto L_0x0095
            X.6uo r0 = r8.A03
            long r6 = r0.A01()
        L_0x0095:
            float r0 = X.AnonymousClass7JK.A00(r6)
            long r2 = X.C86104wH.A0C(r2, r0)
            float r0 = X.AnonymousClass7JK.A02(r4)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            float r0 = X.AnonymousClass7JK.A00(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            X.8n1 r0 = r8.A04
            long r0 = r0.ADs(r2, r4)
            long r6 = X.C98266Ev.A00(r2, r0)
        L_0x00b8:
            float r0 = X.AnonymousClass7JK.A02(r6)
            int r0 = X.AnonymousClass8bA.A02(r0)
            int r1 = X.AnonymousClass8bI.A04(r9, r0)
            float r0 = X.AnonymousClass7JK.A00(r6)
            int r0 = X.AnonymousClass8bA.A02(r0)
            int r0 = X.AnonymousClass8bI.A03(r9, r0)
        L_0x00d0:
            int r3 = androidx.compose.ui.unit.Constraints.A02(r9)
            int r2 = androidx.compose.ui.unit.Constraints.A01(r9)
            long r0 = androidx.compose.ui.unit.Constraints.A05(r1, r3, r0, r2)
            return r0
        L_0x00dd:
            long r6 = X.AnonymousClass7JK.A02
            goto L_0x00b8
        L_0x00e0:
            X.6uo r0 = r8.A03
            long r0 = r0.A01()
            float r2 = X.AnonymousClass7JK.A02(r0)
            goto L_0x0083
        L_0x00eb:
            int r0 = androidx.compose.ui.unit.Constraints.A03(r9)
            goto L_0x005e
        L_0x00f1:
            int r1 = androidx.compose.ui.unit.Constraints.A04(r9)
            goto L_0x0050
        L_0x00f7:
            int r1 = androidx.compose.ui.unit.Constraints.A02(r9)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r9)
            goto L_0x00d0
        L_0x0100:
            r3 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875953j.A00(long):long");
    }

    private final boolean A01() {
        if (!this.A05 || this.A03.A01() == AnonymousClass7JK.A01) {
            return false;
        }
        return true;
    }

    public static final boolean A02(long j) {
        if (j == AnonymousClass7JK.A01) {
            return false;
        }
        float A002 = AnonymousClass7JK.A00(j);
        if (Float.isInfinite(A002) || Float.isNaN(A002)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(long j) {
        if (j == AnonymousClass7JK.A01) {
            return false;
        }
        float A022 = AnonymousClass7JK.A02(j);
        if (Float.isInfinite(A022) || Float.isNaN(A022)) {
            return false;
        }
        return true;
    }

    public final void AIj(C147558pX r18) {
        float A022;
        long j;
        long A012 = this.A03.A01();
        C147558pX r7 = r18;
        if (A03(A012)) {
            A022 = AnonymousClass7JK.A02(A012);
        } else {
            A022 = AnonymousClass7JK.A02(r7.BCH());
        }
        if (!A02(A012)) {
            A012 = r7.BCH();
        }
        long A0C = C86104wH.A0C(A022, AnonymousClass7JK.A00(A012));
        long BCH = r7.BCH();
        if (AnonymousClass7JK.A02(BCH) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || AnonymousClass7JK.A00(BCH) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            j = AnonymousClass7JK.A02;
        } else {
            j = C98266Ev.A00(A0C, this.A04.ADs(A0C, BCH));
        }
        long A88 = this.A01.A88(r7.getLayoutDirection(), AnonymousClass7FV.A01(j), AnonymousClass7FV.A01(BCH));
        float A07 = (float) C86104wH.A07(A88);
        float A08 = (float) C86104wH.A08(A88);
        C146278lx r3 = ((AnonymousClass7X9) r7.Ae6()).A00;
        r3.D7f(A07, A08);
        this.A03.A02(this.A02, r7, this.A00, j);
        r3.D7f(-A07, -A08);
        r7.AIq();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PainterModifier(painter=");
        A0s.append(this.A03);
        A0s.append(", sizeToIntrinsics=");
        A0s.append(this.A05);
        A0s.append(", alignment=");
        A0s.append(this.A01);
        A0s.append(", alpha=");
        A0s.append(this.A00);
        A0s.append(", colorFilter=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public final /* synthetic */ void ANV() {
        C121847Ik.A01(this).ANV();
    }
}
