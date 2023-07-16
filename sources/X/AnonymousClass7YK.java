package X;

import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7YK  reason: invalid class name */
public final class AnonymousClass7YK implements C146648mb {
    public static final AnonymousClass0YP A0C = C140418Wi.A00;
    public long A00 = AnonymousClass79F.A01;
    public C146398mB A01;
    public AnonymousClass0ZU A02;
    public AnonymousClass0YY A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AndroidComposeView A07;
    public final C146688mh A08;
    public final AnonymousClass7A6 A09;
    public final C104126bH A0A = new C104126bH();
    public final C113966sS A0B = new C113966sS(A0C);

    public AnonymousClass7YK(AndroidComposeView androidComposeView, AnonymousClass0ZU r5, AnonymousClass0YY r6) {
        C146688mh r0;
        this.A07 = androidComposeView;
        this.A03 = r6;
        this.A02 = r5;
        this.A09 = new AnonymousClass7A6(androidComposeView.A06);
        if (Build.VERSION.SDK_INT >= 29) {
            r0 = new AnonymousClass7YT(androidComposeView);
        } else {
            r0 = new AnonymousClass7YU(androidComposeView);
        }
        C146688mh r02 = r0;
        r02.Clj(true);
        this.A08 = r02;
    }

    public final void AJ1(C146678mg r11) {
        Canvas canvas = ((C123447Wy) r11).A00;
        boolean z = false;
        if (canvas.isHardwareAccelerated()) {
            D94();
            C146688mh r2 = this.A08;
            if (r2.AfF() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                z = true;
            }
            this.A04 = z;
            if (z) {
                r11.AJl();
            }
            r2.AJ0(canvas);
            if (this.A04) {
                r11.AI4();
                return;
            }
            return;
        }
        C146688mh r3 = this.A08;
        float left = (float) r3.getLeft();
        float BHP = (float) r3.BHP();
        float right = (float) r3.getRight();
        float AU1 = (float) r3.AU1();
        if (r3.AQV() < 1.0f) {
            C146398mB r22 = this.A01;
            if (r22 == null) {
                r22 = new AnonymousClass7X0();
                this.A01 = r22;
            }
            r22.Chk(r3.AQV());
            canvas.saveLayer(left, BHP, right, AU1, ((AnonymousClass7X0) r22).A01);
        } else {
            r11.Cfm();
        }
        r11.D7f(left, BHP);
        r11.ADu(this.A0B.A01(r3));
        if (r3.AXg() || r3.AXf()) {
            this.A09.A02(r11);
        }
        AnonymousClass0YY r0 = this.A03;
        if (r0 != null) {
            r0.invoke(r11);
        }
        r11.Ces();
        A00(false);
    }

    public final void CfE(AnonymousClass0ZU r3, AnonymousClass0YY r4) {
        A00(false);
        this.A05 = false;
        this.A04 = false;
        this.A00 = AnonymousClass79F.A01;
        this.A03 = r4;
        this.A02 = r3;
    }

    private final void A00(boolean z) {
        if (z != this.A06) {
            this.A06 = z;
            this.A07.A0E(this, z);
        }
    }

    public final void BeY(C113796s9 r3, boolean z) {
        float[] fArr;
        C113966sS r1 = this.A0B;
        C146688mh r0 = this.A08;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                r3.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r3.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r3.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r3.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                return;
            }
        } else {
            fArr = r1.A01(r0);
        }
        AnonymousClass7Hf.A01(r3, fArr);
    }

    public final long BeZ(long j, boolean z) {
        float[] fArr;
        C113966sS r1 = this.A0B;
        C146688mh r0 = this.A08;
        if (z) {
            fArr = r1.A00(r0);
            if (fArr == null) {
                return AnonymousClass7KC.A01;
            }
        } else {
            fArr = r1.A01(r0);
        }
        return AnonymousClass7Hf.A00(fArr, j);
    }

    public final void Bgc(long j) {
        C146688mh r4 = this.A08;
        int left = r4.getLeft();
        int BHP = r4.BHP();
        int A072 = C86104wH.A07(j);
        int A082 = C86104wH.A08(j);
        if (left != A072 || BHP != A082) {
            r4.Bir(A072 - left);
            r4.Biu(A082 - BHP);
            AndroidComposeView androidComposeView = this.A07;
            ViewParent parent = androidComposeView.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(androidComposeView, androidComposeView);
            }
            C113966sS r1 = this.A0B;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    public final void Ceg(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        C146688mh r6 = this.A08;
        float f = (float) i;
        r6.Cnx(C86124wJ.A02(this.A00) * f);
        float f2 = (float) i2;
        r6.Cny(Float.intBitsToFloat((int) (this.A00 & 4294967295L)) * f2);
        if (r6.Co6(r6.getLeft(), r6.BHP(), r6.getLeft() + i, r6.BHP() + i2)) {
            AnonymousClass7A6 r5 = this.A09;
            long A0C2 = C86104wH.A0C(f, f2);
            if (r5.A03 != A0C2) {
                r5.A03 = A0C2;
                r5.A06 = true;
            }
            r6.Cnd(r5.A01());
            invalidate();
            C113966sS r1 = this.A0B;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D94() {
        /*
            r4 = this;
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x000c
            X.8mh r0 = r4.A08
            boolean r0 = r0.Ali()
            if (r0 != 0) goto L_0x002e
        L_0x000c:
            r0 = 0
            r4.A00(r0)
            X.8mh r3 = r4.A08
            boolean r0 = r3.AXg()
            if (r0 == 0) goto L_0x002f
            X.7A6 r1 = r4.A09
            boolean r0 = r1.A08
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002f
            X.AnonymousClass7A6.A00(r1)
            X.8nF r2 = r1.A05
        L_0x0025:
            X.0YY r1 = r4.A03
            if (r1 == 0) goto L_0x002e
            X.6bH r0 = r4.A0A
            r3.CZJ(r0, r2, r1)
        L_0x002e:
            return
        L_0x002f:
            r2 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7YK.D94():void");
    }

    public final void destroy() {
        C146688mh r1 = this.A08;
        if (r1.Ali()) {
            r1.AI6();
        }
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        A00(false);
        AndroidComposeView androidComposeView = this.A07;
        androidComposeView.A09 = true;
        androidComposeView.A0D(this);
    }

    public final void invalidate() {
        if (!this.A06 && !this.A05) {
            this.A07.invalidate();
            A00(true);
        }
    }

    public final boolean BUu(long j) {
        float A012 = AnonymousClass7KC.A01(j);
        float A022 = AnonymousClass7KC.A02(j);
        C146688mh r3 = this.A08;
        if (r3.AXf()) {
            if (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > A012 || A012 >= ((float) r3.getWidth()) || BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > A022 || A022 >= ((float) r3.getHeight())) {
                return false;
            }
        } else if (r3.AXg()) {
            return this.A09.A03(j);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
        if (r9 != X.C102746Wj.A00) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if ((!r15.A09.A08) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0089, code lost:
        if (r9 == X.C102746Wj.A00) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9I(X.C97726Cn r16, X.C142918fo r17, X.C147168nV r18, X.AnonymousClass69J r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, int r30, long r31, long r33, long r35, boolean r37) {
        /*
            r15 = this;
            r7 = 0
            r2 = 0
            r6 = 0
            r0 = 17
            r11 = r19
            X.C04220Ms.A0B(r11, r0)
            r0 = 18
            r10 = r18
            X.C04220Ms.A0B(r10, r0)
            r0 = r31
            r15.A00 = r0
            X.8mh r3 = r15.A08
            boolean r4 = r3.AXg()
            r5 = 1
            if (r4 == 0) goto L_0x0027
            X.7A6 r4 = r15.A09
            boolean r4 = r4.A08
            r8 = r4 ^ 1
            r4 = 1
            if (r8 == 0) goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            r8 = r20
            r3.CpR(r8)
            r8 = r21
            r3.CpS(r8)
            r8 = r22
            r3.Chk(r8)
            r8 = r23
            r3.Cqr(r8)
            r8 = r24
            r3.Cqs(r8)
            r8 = r25
            r3.CkY(r8)
            int r8 = X.C121657He.A01(r33)
            r3.Chn(r8)
            int r8 = X.C121657He.A01(r35)
            r3.Cq4(r8)
            r8 = r28
            r3.CpJ(r8)
            r3.CpH(r2)
            r3.CpI(r2)
            r8 = r29
            r3.Cib(r8)
            float r9 = X.C86104wH.A00(r0)
            int r8 = r3.getWidth()
            float r8 = (float) r8
            float r9 = r9 * r8
            r3.Cnx(r9)
            int r0 = X.C86104wH.A08(r0)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r3.Cny(r1)
            r9 = r17
            if (r37 == 0) goto L_0x008b
            X.8fo r1 = X.C102746Wj.A00
            r0 = 1
            if (r9 != r1) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r3.Cj5(r0)
            if (r37 == 0) goto L_0x0096
            X.8fo r1 = X.C102746Wj.A00
            r0 = 1
            if (r9 == r1) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r3.Cj4(r0)
            r3.Cp4(r6)
            r3.CjG(r7)
            X.7A6 r8 = r15.A09
            float r12 = r3.AQV()
            boolean r14 = r3.AXg()
            float r13 = r3.AfF()
            boolean r1 = r8.A04(r9, r10, r11, r12, r13, r14)
            android.graphics.Outline r0 = r8.A01()
            r3.Cnd(r0)
            boolean r0 = r3.AXg()
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r8.A08
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f5
        L_0x00c5:
            if (r4 != r5) goto L_0x00cb
            if (r5 == 0) goto L_0x00e9
            if (r1 == 0) goto L_0x00e9
        L_0x00cb:
            r15.invalidate()
        L_0x00ce:
            boolean r0 = r15.A04
            if (r0 != 0) goto L_0x00e1
            float r0 = r3.AfF()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            X.0ZU r0 = r15.A02
            if (r0 == 0) goto L_0x00e1
            r0.invoke()
        L_0x00e1:
            X.6sS r1 = r15.A0B
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
            return
        L_0x00e9:
            androidx.compose.ui.platform.AndroidComposeView r1 = r15.A07
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.onDescendantInvalidated(r1, r1)
            goto L_0x00ce
        L_0x00f5:
            r5 = 0
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7YK.D9I(X.6Cn, X.8fo, X.8nV, X.69J, float, float, float, float, float, float, float, float, float, float, int, long, long, long, boolean):void");
    }
}
