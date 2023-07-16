package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.55B  reason: invalid class name */
public final class AnonymousClass55B extends AnonymousClass7YV implements C147528pU {
    public final float A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55B(AnonymousClass0YY r3, float f, boolean z) {
        super(r3);
        C04220Ms.A0B(r3, 3);
        this.A00 = f;
        this.A01 = z;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw C18190wL.A0a(AnonymousClass00U.A0Q("aspectRatio ", " must be > 0", f));
        }
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final int BfA(C147148nT r3, C147838q0 r4, int i) {
        C04220Ms.A0B(r3, 1);
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass8bA.A02(((float) i) / this.A00);
        }
        return r3.Bf8(i);
    }

    public final int BfD(C147148nT r3, C147838q0 r4, int i) {
        C04220Ms.A0B(r3, 1);
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass8bA.A03((float) i, this.A00);
        }
        return r3.BfB(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 != 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r0 != 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r0 == 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r0 == r9) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (r0 != 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (r0 != 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r0 == 0) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146098ld Bg3(X.C147578pZ r12, X.C147618pd r13, long r14) {
        /*
            r11 = this;
            r7 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r13, r12)
            boolean r0 = r11.A01
            if (r0 != 0) goto L_0x0090
            long r0 = r11.A01(r14, r3)
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            long r0 = r11.A00(r14, r3)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            int r5 = androidx.compose.ui.unit.Constraints.A04(r14)
            float r6 = (float) r5
            float r8 = r11.A00
            float r6 = r6 / r8
            int r0 = X.AnonymousClass8bA.A02(r6)
            if (r0 <= 0) goto L_0x0037
            long r0 = X.AnonymousClass7FV.A00(r5, r0)
            boolean r2 = X.AnonymousClass7JT.A06(r14, r0)
            if (r2 == 0) goto L_0x0037
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x0037:
            int r3 = androidx.compose.ui.unit.Constraints.A03(r14)
            float r4 = (float) r3
            float r4 = r4 * r8
            int r0 = X.AnonymousClass8bA.A02(r4)
            if (r0 <= 0) goto L_0x0051
            long r0 = X.AnonymousClass7FV.A00(r0, r3)
            boolean r2 = X.AnonymousClass7JT.A06(r14, r0)
            if (r2 == 0) goto L_0x0051
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x0051:
            long r0 = r11.A01(r14, r7)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            long r0 = r11.A00(r14, r7)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            int r0 = X.AnonymousClass8bA.A02(r6)
            if (r0 <= 0) goto L_0x006f
            long r0 = X.AnonymousClass7FV.A00(r5, r0)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x006f:
            int r0 = X.AnonymousClass8bA.A02(r4)
            if (r0 <= 0) goto L_0x007d
            long r0 = X.AnonymousClass7FV.A00(r0, r3)
        L_0x0079:
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x007d:
            X.7Xy r3 = r12.Bg4(r14)
            int r2 = r3.A01
            int r1 = r3.A00
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r0 = X.C86144wL.A16(r3, r0)
            X.8ld r0 = X.C147618pd.A00(r13, r0, r2, r1)
            return r0
        L_0x0090:
            long r0 = r11.A00(r14, r3)
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            long r0 = r11.A01(r14, r3)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            int r5 = androidx.compose.ui.unit.Constraints.A03(r14)
            float r6 = (float) r5
            float r8 = r11.A00
            float r6 = r6 * r8
            int r0 = X.AnonymousClass8bA.A02(r6)
            if (r0 <= 0) goto L_0x00be
            long r0 = X.AnonymousClass7FV.A00(r0, r5)
            boolean r2 = X.AnonymousClass7JT.A06(r14, r0)
            if (r2 == 0) goto L_0x00be
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x00be:
            int r3 = androidx.compose.ui.unit.Constraints.A04(r14)
            float r4 = (float) r3
            float r4 = r4 / r8
            int r0 = X.AnonymousClass8bA.A02(r4)
            if (r0 <= 0) goto L_0x00d8
            long r0 = X.AnonymousClass7FV.A00(r3, r0)
            boolean r2 = X.AnonymousClass7JT.A06(r14, r0)
            if (r2 == 0) goto L_0x00d8
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x00d8:
            long r0 = r11.A00(r14, r7)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            long r0 = r11.A01(r14, r7)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
            int r0 = X.AnonymousClass8bA.A02(r6)
            if (r0 <= 0) goto L_0x00f6
            long r0 = X.AnonymousClass7FV.A00(r0, r5)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0102
        L_0x00f6:
            int r0 = X.AnonymousClass8bA.A02(r4)
            if (r0 <= 0) goto L_0x007d
            long r0 = X.AnonymousClass7FV.A00(r3, r0)
            goto L_0x0079
        L_0x0102:
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x007d
            X.79v r3 = androidx.compose.ui.unit.Constraints.A01
            int r2 = X.C86104wH.A07(r0)
            int r0 = X.C86104wH.A08(r0)
            long r14 = r3.A03(r2, r0)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55B.Bg3(X.8pZ, X.8pd, long):X.8ld");
    }

    public final int BgL(C147148nT r3, C147838q0 r4, int i) {
        C04220Ms.A0B(r3, 1);
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass8bA.A02(((float) i) / this.A00);
        }
        return r3.BgJ(i);
    }

    public final int BgO(C147148nT r3, C147838q0 r4, int i) {
        C04220Ms.A0B(r3, 1);
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass8bA.A03((float) i, this.A00);
        }
        return r3.BgM(i);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        AnonymousClass55B r2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass55B) {
            r2 = (AnonymousClass55B) obj;
        } else {
            r2 = null;
        }
        return r2 != null && this.A00 == r2.A00 && this.A01 == ((AnonymousClass55B) obj).A01;
    }

    public final int hashCode() {
        return C86134wK.A03(this.A00) + C86124wJ.A04(this.A01 ? 1 : 0);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("AspectRatioModifier(aspectRatio=", ')', this.A00);
    }

    private final long A00(long j, boolean z) {
        int A03;
        int A012 = Constraints.A01(j);
        if (A012 == Integer.MAX_VALUE || (A03 = AnonymousClass8bA.A03((float) A012, this.A00)) <= 0) {
            return 0;
        }
        long A002 = AnonymousClass7FV.A00(A03, A012);
        if (!z || AnonymousClass7JT.A06(j, A002)) {
            return A002;
        }
        return 0;
    }

    private final long A01(long j, boolean z) {
        int A02;
        int A022 = Constraints.A02(j);
        if (A022 == Integer.MAX_VALUE || (A02 = AnonymousClass8bA.A02(((float) A022) / this.A00)) <= 0) {
            return 0;
        }
        long A002 = AnonymousClass7FV.A00(A022, A02);
        if (!z || AnonymousClass7JT.A06(j, A002)) {
            return A002;
        }
        return 0;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
