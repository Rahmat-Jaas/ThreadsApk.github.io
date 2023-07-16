package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxOProviderShape4S0000000_2_I2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.50g  reason: invalid class name */
public final class AnonymousClass50g extends View implements C146648mb {
    public static Field A0E;
    public static Method A0F;
    public static boolean A0G;
    public static boolean A0H;
    public static final ViewOutlineProvider A0I = new IDxOProviderShape4S0000000_2_I2(0);
    public static final C111376nE A0J = new C111376nE();
    public static final AnonymousClass0YP A0K = C140428Wj.A00;
    public boolean A00;
    public long A01 = AnonymousClass79F.A01;
    public Rect A02;
    public AnonymousClass0ZU A03;
    public AnonymousClass0YY A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass7A6 A08;
    public final long A09;
    public final C104126bH A0A = new C104126bH();
    public final AndroidComposeView A0B;
    public final AnonymousClass50k A0C;
    public final C113966sS A0D = new C113966sS(A0K);

    public final void CfE(AnonymousClass0ZU r3, AnonymousClass0YY r4) {
        this.A0C.addView(this);
        this.A05 = false;
        this.A06 = false;
        this.A01 = AnonymousClass79F.A01;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.A0B;
        androidComposeView.A09 = true;
        this.A04 = null;
        this.A03 = null;
        androidComposeView.A0D(this);
        this.A0C.removeViewInLayout(this);
    }

    public final void dispatchDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        boolean z = false;
        setInvalidated(false);
        C123447Wy r2 = this.A0A.A00;
        Canvas canvas2 = r2.A00;
        r2.A00 = canvas;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            r2.Cfm();
            this.A08.A02(r2);
        }
        AnonymousClass0YY r0 = this.A04;
        if (r0 != null) {
            r0.invoke(r2);
        }
        if (z) {
            r2.Ces();
        }
        r2.A00 = canvas2;
    }

    public final void forceLayout() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        Rect rect;
        if (this.A05) {
            Rect rect2 = this.A02;
            if (rect2 == null) {
                this.A02 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A02;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A0B.A0E(this, z);
        }
    }

    public final void BeY(C113796s9 r2, boolean z) {
        float[] fArr;
        C113966sS r0 = this.A0D;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                r2.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r2.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r2.A02 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r2.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                return;
            }
        } else {
            fArr = r0.A01(this);
        }
        AnonymousClass7Hf.A01(r2, fArr);
    }

    public final long BeZ(long j, boolean z) {
        float[] fArr;
        C113966sS r0 = this.A0D;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                return AnonymousClass7KC.A01;
            }
        } else {
            fArr = r0.A01(this);
        }
        return AnonymousClass7Hf.A00(fArr, j);
    }

    public final void Ceg(long j) {
        ViewOutlineProvider viewOutlineProvider;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i != getWidth() || i2 != getHeight()) {
            float f = (float) i;
            setPivotX(C86124wJ.A02(this.A01) * f);
            float f2 = (float) i2;
            setPivotY(Float.intBitsToFloat((int) (this.A01 & 4294967295L)) * f2);
            AnonymousClass7A6 r7 = this.A08;
            long A0C2 = C86104wH.A0C(f, f2);
            if (r7.A03 != A0C2) {
                r7.A03 = A0C2;
                r7.A06 = true;
            }
            if (r7.A01() != null) {
                viewOutlineProvider = A0I;
            } else {
                viewOutlineProvider = null;
            }
            setOutlineProvider(viewOutlineProvider);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
            A00();
            C113966sS r1 = this.A0D;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    public final void D94() {
        if (this.A00 && !A0H) {
            setInvalidated(false);
            A0J.A00(this);
        }
    }

    public final AnonymousClass50k getContainer() {
        return this.A0C;
    }

    public long getLayerId() {
        return this.A09;
    }

    public final AndroidComposeView getOwnerView() {
        return this.A0B;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass6FC.A00(this.A0B);
        }
        return -1;
    }

    public final boolean hasOverlappingRendering() {
        return this.A07;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass50g(AndroidComposeView androidComposeView, AnonymousClass50k r5, AnonymousClass0ZU r6, AnonymousClass0YY r7) {
        super(androidComposeView.getContext());
        boolean A1Z = C18200wM.A1Z(r5);
        this.A0B = androidComposeView;
        this.A0C = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A08 = new AnonymousClass7A6(androidComposeView.A06);
        this.A07 = A1Z;
        setWillNotDraw(false);
        r5.addView(this);
        this.A09 = (long) View.generateViewId();
    }

    private final C147018nF getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        AnonymousClass7A6 r1 = this.A08;
        if (!r1.A08) {
            return null;
        }
        AnonymousClass7A6.A00(r1);
        return r1.A05;
    }

    public final void AJ1(C146678mg r4) {
        boolean A1X = C18180wK.A1X((getElevation() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (getElevation() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1)));
        this.A06 = A1X;
        if (A1X) {
            r4.AJl();
        }
        this.A0C.A00(this, r4, getDrawingTime());
        if (this.A06) {
            r4.AI4();
        }
    }

    public final boolean BUu(long j) {
        float A012 = AnonymousClass7KC.A01(j);
        float A022 = AnonymousClass7KC.A02(j);
        if (this.A05) {
            if (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > A012 || A012 >= ((float) getWidth()) || BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER > A022 || A022 >= ((float) getHeight())) {
                return false;
            }
        } else if (getClipToOutline()) {
            return this.A08.A03(j);
        }
        return true;
    }

    public final void Bgc(long j) {
        int A072 = C86104wH.A07(j);
        if (A072 != getLeft()) {
            offsetLeftAndRight(A072 - getLeft());
            C113966sS r1 = this.A0D;
            r1.A00 = true;
            r1.A01 = true;
        }
        int A082 = C86104wH.A08(j);
        if (A082 != getTop()) {
            offsetTopAndBottom(A082 - getTop());
            C113966sS r12 = this.A0D;
            r12.A00 = true;
            r12.A01 = true;
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final void invalidate() {
        int A032 = C14030oh.A03(-1441561288);
        if (!this.A00) {
            setInvalidated(true);
            super.invalidate();
            this.A0B.invalidate();
        }
        C14030oh.A0A(-1432923878, A032);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006b, code lost:
        if (r15 != X.C102746Wj.A00) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0080, code lost:
        if (r15 == X.C102746Wj.A00) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9I(X.C97726Cn r14, X.C142918fo r15, X.C147168nV r16, X.AnonymousClass69J r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, int r28, long r29, long r31, long r33, boolean r35) {
        /*
            r13 = this;
            r3 = 0
            r2 = 0
            r0 = 17
            r9 = r17
            X.C04220Ms.A0B(r9, r0)
            r0 = 18
            r8 = r16
            X.C04220Ms.A0B(r8, r0)
            r0 = r29
            r13.A01 = r0
            r0 = r18
            r13.setScaleX(r0)
            r0 = r19
            r13.setScaleY(r0)
            r0 = r20
            r13.setAlpha(r0)
            r0 = r21
            r13.setTranslationX(r0)
            r0 = r22
            r13.setTranslationY(r0)
            r0 = r23
            r13.setElevation(r0)
            r0 = r26
            r13.setRotation(r0)
            r13.setRotationX(r2)
            r13.setRotationY(r2)
            long r0 = r13.A01
            float r1 = X.C86104wH.A00(r0)
            int r0 = r13.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r13.setPivotX(r1)
            long r0 = r13.A01
            int r0 = X.C86104wH.A08(r0)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r13.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r13.setPivotY(r1)
            r0 = r27
            r13.setCameraDistancePx(r0)
            r4 = 1
            r7 = r15
            if (r35 == 0) goto L_0x006d
            X.8fo r1 = X.C102746Wj.A00
            r0 = 1
            if (r15 == r1) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            r13.A05 = r0
            r13.A00()
            X.8nF r0 = r13.getManualClipPath()
            boolean r1 = X.AnonymousClass0wJ.A1W(r0)
            if (r35 == 0) goto L_0x0082
            X.8fo r5 = X.C102746Wj.A00
            r0 = 1
            if (r15 != r5) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r13.setClipToOutline(r0)
            X.7A6 r6 = r13.A08
            float r10 = r13.getAlpha()
            boolean r12 = r13.getClipToOutline()
            float r11 = r13.getElevation()
            boolean r5 = r6.A04(r7, r8, r9, r10, r11, r12)
            android.graphics.Outline r0 = r6.A01()
            if (r0 == 0) goto L_0x00f6
            android.view.ViewOutlineProvider r0 = A0I
        L_0x00a0:
            r13.setOutlineProvider(r0)
            X.8nF r0 = r13.getManualClipPath()
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            if (r1 != r0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b4
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            r13.invalidate()
        L_0x00b4:
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x00c7
            float r0 = r13.getElevation()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
            X.0ZU r0 = r13.A03
            if (r0 == 0) goto L_0x00c7
            r0.invoke()
        L_0x00c7:
            X.6sS r0 = r13.A0D
            r0.A00 = r4
            r0.A01 = r4
            int r0 = X.C121657He.A01(r31)
            r13.setOutlineAmbientShadowColor(r0)
            int r0 = X.C121657He.A01(r33)
            r13.setOutlineSpotShadowColor(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00e4
            X.AnonymousClass6FD.A00(r13)
        L_0x00e4:
            boolean r0 = X.AnonymousClass0wJ.A1T(r3, r4)
            r1 = 0
            if (r0 == 0) goto L_0x00f2
            r0 = 2
            r13.setLayerType(r0, r1)
        L_0x00ef:
            r13.A07 = r4
            return
        L_0x00f2:
            r13.setLayerType(r3, r1)
            goto L_0x00ef
        L_0x00f6:
            r0 = 0
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass50g.D9I(X.6Cn, X.8fo, X.8nV, X.69J, float, float, float, float, float, float, float, float, float, float, int, long, long, long, boolean):void");
    }
}
