package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape145S0100000_I2;

/* renamed from: X.7Y0  reason: invalid class name */
public final class AnonymousClass7Y0 implements C147448pM, C147458pN, C141688cn {
    public long A00 = 0;
    public C146508mM A01;
    public boolean A02;
    public boolean A03;
    public AnonymousClass7F6 A04;
    public C146508mM A05;
    public final C111646o5 A06 = new C111646o5();
    public final C967266l A07;
    public final C146258lv A08;
    public final UpdatableAnimationState A09 = new UpdatableAnimationState();
    public final Modifier A0A;
    public final boolean A0B;
    public final C83224qz A0C;

    public AnonymousClass7Y0(C967266l r4, C146258lv r5, C83224qz r6, boolean z) {
        AnonymousClass0YY r0;
        AnonymousClass0YY r02;
        this.A0C = r6;
        this.A07 = r4;
        this.A08 = r5;
        this.A0B = z;
        KtLambdaShape145S0100000_I2 A16 = C86144wL.A16(this, 27);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(A16, 22);
        } else {
            r0 = InspectableValueKt.A00;
        }
        Modifier A012 = C120417Am.A01(this, A16, r0, 2);
        if (C86134wK.A1Z(A012)) {
            r02 = C86154wM.A0z(this, 10);
        } else {
            r02 = InspectableValueKt.A00;
        }
        this.A0A = C120417Am.A01(A012, this, r02, 5);
    }

    public static final float A00(float f, float f2, float f3) {
        if ((f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f2 <= f3) || (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f2 > f3)) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) >= Math.abs(f4)) {
            return f4;
        }
        return f;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r5 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r5 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r3 = X.AnonymousClass7FV.A02(r11.A00);
        r1 = r11.A07.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r1 == 0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r1 != 1) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r2 = r5.A01;
        r1 = r5.A02;
        r0 = X.AnonymousClass7JK.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return A00(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        r2 = r5.A03;
        r1 = r5.A00;
        r0 = X.AnonymousClass7JK.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        throw X.AnonymousClass4VZ.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float A01(X.AnonymousClass7Y0 r11) {
        /*
            long r3 = r11.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r10 = 0
            if (r0 != 0) goto L_0x0067
            X.6o5 r0 = r11.A06
            X.84X r1 = r0.A00
            int r0 = r1.A00
            r5 = 0
            if (r0 <= 0) goto L_0x005d
            int r9 = r0 + -1
            java.lang.Object[] r6 = r1.A01
        L_0x001a:
            r0 = r6[r9]
            X.6oo r0 = (X.C112006oo) r0
            X.0ZU r0 = r0.A00
            java.lang.Object r4 = r0.invoke()
            X.7F6 r4 = (X.AnonymousClass7F6) r4
            if (r4 == 0) goto L_0x0057
            float r2 = r4.A02
            float r0 = r4.A01
            float r2 = r2 - r0
            float r1 = r4.A00
            float r0 = r4.A03
            float r1 = r1 - r0
            long r7 = X.C86104wH.A0C(r2, r1)
            long r0 = r11.A00
            long r2 = X.AnonymousClass7FV.A02(r0)
            X.66l r0 = r11.A07
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0068
            r0 = 1
            if (r1 != r0) goto L_0x009e
            float r1 = X.AnonymousClass7JK.A02(r7)
            float r0 = X.AnonymousClass7JK.A02(r2)
        L_0x0050:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 > 0) goto L_0x005b
            r5 = r4
        L_0x0057:
            int r9 = r9 + -1
            if (r9 >= 0) goto L_0x001a
        L_0x005b:
            if (r5 != 0) goto L_0x0071
        L_0x005d:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0067
            X.7F6 r5 = A03(r11)
            if (r5 != 0) goto L_0x0071
        L_0x0067:
            return r10
        L_0x0068:
            float r1 = X.AnonymousClass7JK.A00(r7)
            float r0 = X.AnonymousClass7JK.A00(r2)
            goto L_0x0050
        L_0x0071:
            long r0 = r11.A00
            long r3 = X.AnonymousClass7FV.A02(r0)
            X.66l r0 = r11.A07
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0090
            r0 = 1
            if (r1 != r0) goto L_0x0099
            float r2 = r5.A01
            float r1 = r5.A02
            float r0 = X.AnonymousClass7JK.A02(r3)
        L_0x008b:
            float r10 = A00(r2, r1, r0)
            return r10
        L_0x0090:
            float r2 = r5.A03
            float r1 = r5.A00
            float r0 = X.AnonymousClass7JK.A00(r3)
            goto L_0x008b
        L_0x0099:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x009e:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Y0.A01(X.7Y0):float");
    }

    public static final AnonymousClass7F6 A03(AnonymousClass7Y0 r4) {
        C146508mM r1;
        C146508mM r3 = r4.A05;
        if (r3 == null || !r3.BRS() || (r1 = r4.A01) == null || !r1.BRS()) {
            return null;
        }
        return r3.Bax(r1, false);
    }

    public static final void A04(AnonymousClass7Y0 r5) {
        if (!r5.A02) {
            C25237DiI.A00(AnonymousClass006.A0N, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2(r5, (C146958n9) null, 7), r5.A0C, 1);
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final void CFP(long j) {
        int i;
        long j2;
        AnonymousClass7F6 A032;
        long j3 = this.A00;
        this.A00 = j;
        int ordinal = this.A07.ordinal();
        if (ordinal == 0) {
            i = (int) (j & 4294967295L);
            j2 = j3 & 4294967295L;
        } else if (ordinal == 1) {
            i = (int) (j >> 32);
            j2 = j3 >> 32;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        if (C04220Ms.A00(i, (int) j2) < 0 && (A032 = A03(this)) != null) {
            AnonymousClass7F6 r1 = this.A04;
            if (r1 == null) {
                r1 = A032;
            }
            if (!this.A02 && !this.A03) {
                long A022 = A02(this, r1, j3);
                long j4 = AnonymousClass7KC.A03;
                if (A022 == j4 && A02(this, A032, j) != j4) {
                    this.A03 = true;
                    A04(this);
                }
            }
            this.A04 = A032;
        }
    }

    public static final long A02(AnonymousClass7Y0 r5, AnonymousClass7F6 r6, long j) {
        long A022 = AnonymousClass7FV.A02(j);
        int ordinal = r5.A07.ordinal();
        if (ordinal == 0) {
            return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A00(r6.A03, r6.A00, AnonymousClass7JK.A00(A022)));
        }
        if (ordinal == 1) {
            return C86104wH.A0C(A00(r6.A01, r6.A02, AnonymousClass7JK.A02(A022)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        throw AnonymousClass4VZ.A00();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final void CBC(C146508mM r1) {
        this.A05 = r1;
    }
}
