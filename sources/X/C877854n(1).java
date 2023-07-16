package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.54n  reason: invalid class name and case insensitive filesystem */
public final class C877854n extends C871950n {
    public AnonymousClass69J A00;
    public C143128g9 A01;
    public C1201478v A02;
    public String A03;
    public AnonymousClass0ZU A04;
    public C115096uV A05;
    public boolean A06;
    public final Rect A07;
    public final View A08;
    public final WindowManager.LayoutParams A09;
    public final WindowManager A0A;
    public final C147368pE A0B;
    public final C147368pE A0C;
    public final C147368pE A0D;
    public final C81784oM A0E;
    public final C143118g8 A0F;
    public final int[] A0G;

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public final void A09(C146508mM r2) {
        C04220Ms.A0B(r2, 0);
        setParentLayoutCoordinates(r2);
        A07();
    }

    public final void A0A(AnonymousClass69J r5, C1201478v r6, String str, AnonymousClass0ZU r8) {
        C04220Ms.A0B(r6, 1);
        AnonymousClass0wJ.A1Q(str, r5);
        this.A04 = r8;
        this.A02 = r6;
        this.A03 = str;
        setIsFocusable(false);
        setSecurePolicy(r6.A00);
        setClippingEnabled(r6.A01);
        int ordinal = r5.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw AnonymousClass4VZ.A00();
        }
        super.setLayoutDirection(i);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C04220Ms.A0B(keyEvent, 0);
        if (keyEvent.getKeyCode() == 4 && this.A02.A02 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                AnonymousClass0ZU r0 = this.A04;
                if (r0 != null) {
                    r0.invoke();
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(AnonymousClass69J r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void setPositionProvider(C143128g9 r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void setTestTag(String str) {
        C04220Ms.A0B(str, 0);
        this.A03 = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C877854n(android.view.View r8, X.C147168nV r9, X.C143128g9 r10, X.C1201478v r11, java.lang.String r12, java.util.UUID r13, X.AnonymousClass0ZU r14) {
        /*
            r7 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00f8
            X.55Q r5 = new X.55Q
            r5.<init>()
        L_0x000b:
            r2 = 2
            X.C04220Ms.A0B(r11, r2)
            X.AnonymousClass0wJ.A1R(r12, r8)
            r0 = 5
            X.C04220Ms.A0B(r9, r0)
            r1 = 8
            android.content.Context r3 = X.C18190wL.A0A(r8)
            r6 = 0
            r4 = 0
            r7.<init>(r3, r6, r4)
            r7.A04 = r14
            r7.A02 = r11
            r7.A03 = r12
            r7.A08 = r8
            r7.A0F = r5
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            r0 = 14
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C04220Ms.A0C(r3, r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r7.A0A = r3
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>()
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r5.gravity = r0
            int r3 = r5.flags
            r0 = -8552473(0xffffffffff7d7fe7, float:-3.369588E38)
            r3 = r3 & r0
            r5.flags = r3
            r0 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r0
            r5.flags = r3
            r0 = 1002(0x3ea, float:1.404E-42)
            r5.type = r0
            android.view.View r3 = r7.A08
            android.os.IBinder r0 = r3.getApplicationWindowToken()
            r5.token = r0
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = -3
            r5.format = r0
            android.content.res.Resources r3 = X.C86164wN.A0D(r3)
            r0 = 2131824839(0x7f1110c7, float:1.9282517E38)
            java.lang.String r0 = r3.getString(r0)
            r5.setTitle(r0)
            r7.A09 = r5
            r7.A01 = r10
            X.69J r0 = X.AnonymousClass69J.Ltr
            r7.A00 = r0
            X.7WR r5 = X.AnonymousClass7WR.A00
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C86104wH.A0I(r5, r6, r3)
            r7.A0D = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C86104wH.A0I(r5, r6, r3)
            r7.A0C = r0
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r0 = X.C86154wM.A13(r7, r0)
            X.7Wf r0 = X.C123267Wf.A01(r0)
            r7.A0E = r0
            float r6 = (float) r1
            android.graphics.Rect r0 = X.C86134wK.A0D()
            r7.A07 = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r0)
            X.066 r0 = X.C116066wM.A00(r8)
            X.C116066wM.A01(r7, r0)
            X.06C r1 = androidx.lifecycle.ViewTreeViewModelStoreOwner.A00(r8)
            r0 = 2131309013(0x7f0931d5, float:1.8236298E38)
            r7.setTag(r0, r1)
            X.8Me r0 = X.C138978Me.A00
            X.8mw r1 = X.AnonymousClass8bL.A08(r8, r0)
            X.8Mf r0 = X.C138988Mf.A00
            java.lang.Object r1 = X.C146838mw.A00(r0, r1)
            X.0rp r1 = (X.C15750rp) r1
            r0 = 2131309012(0x7f0931d4, float:1.8236296E38)
            r7.setTag(r0, r1)
            r1 = 2131298915(0x7f090a63, float:1.8215817E38)
            java.lang.String r0 = "Popup:"
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r13)
            r7.setTag(r1, r0)
            r7.setClipChildren(r4)
            float r0 = r9.CxL(r6)
            r7.setElevation(r0)
            com.facebook.redex.IDxOProviderShape4S0000000_2_I2 r0 = new com.facebook.redex.IDxOProviderShape4S0000000_2_I2
            r0.<init>(r2)
            r7.setOutlineProvider(r0)
            X.0YP r0 = X.AnonymousClass306.A00
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C86104wH.A0I(r5, r0, r3)
            r7.A0B = r0
            int[] r0 = new int[r2]
            r7.A0G = r0
            return
        L_0x00f8:
            X.7ZM r5 = new X.7ZM
            r5.<init>()
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877854n.<init>(android.view.View, X.8nV, X.8g9, X.78v, java.lang.String, java.util.UUID, X.0ZU):void");
    }

    private final AnonymousClass0YP getContent() {
        return (AnonymousClass0YP) this.A0B.getValue();
    }

    /* access modifiers changed from: private */
    public final C146508mM getParentLayoutCoordinates() {
        return (C146508mM) this.A0C.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        WindowManager.LayoutParams layoutParams = this.A09;
        int i = layoutParams.flags;
        int i2 = i | 512;
        if (z) {
            i2 = i & -513;
        }
        layoutParams.flags = i2;
        WindowManager windowManager = this.A0A;
        AnonymousClass0wJ.A1M(windowManager, 0, layoutParams);
        windowManager.updateViewLayout(this, layoutParams);
    }

    private final void setIsFocusable(boolean z) {
        WindowManager.LayoutParams layoutParams = this.A09;
        int i = layoutParams.flags;
        int i2 = i & -9;
        if (!z) {
            i2 = i | 8;
        }
        layoutParams.flags = i2;
        WindowManager windowManager = this.A0A;
        AnonymousClass0wJ.A1M(windowManager, 0, layoutParams);
        windowManager.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(C146508mM r2) {
        this.A0C.CrC(r2);
    }

    private final void setSecurePolicy(AnonymousClass20X r6) {
        WindowManager.LayoutParams layoutParams;
        View view = this.A08;
        C04220Ms.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        boolean z = false;
        if (!(layoutParams == null || (layoutParams.flags & 8192) == 0)) {
            z = true;
        }
        int A042 = C18230wP.A04(r6, 0);
        if (A042 == 2) {
            z = false;
        } else if (A042 == 1) {
            z = true;
        } else if (A042 != 0) {
            throw AnonymousClass4VZ.A00();
        }
        WindowManager.LayoutParams layoutParams3 = this.A09;
        int i = layoutParams3.flags;
        int i2 = i & -8193;
        if (z) {
            i2 = i | 8192;
        }
        layoutParams3.flags = i2;
        WindowManager windowManager = this.A0A;
        AnonymousClass0wJ.A1M(windowManager, 0, layoutParams3);
        windowManager.updateViewLayout(this, layoutParams3);
    }

    public final void A08() {
        C114336t4 r0;
        C115096uV r6 = this.A05;
        if (r6 != null && (r0 = m18getPopupContentSizebOM6tXw()) != null) {
            long j = r0.A00;
            Rect rect = this.A07;
            C143118g8 r4 = this.A0F;
            View view = this.A08;
            AnonymousClass0wJ.A1N(view, rect);
            view.getWindowVisibleDisplayFrame(rect);
            int i = rect.left;
            int i2 = rect.top;
            long A002 = AnonymousClass7FV.A00(rect.right - i, rect.bottom - i2);
            long ABd = this.A01.ABd(r6, this.A00, A002, j);
            WindowManager.LayoutParams layoutParams = this.A09;
            layoutParams.x = (int) (ABd >> 32);
            layoutParams.y = C86104wH.A08(ABd);
            if (this.A02.A04) {
                r4.ClR(this, (int) (A002 >> 32), C86104wH.A08(A002));
            }
            WindowManager windowManager = this.A0A;
            AnonymousClass0wJ.A1M(windowManager, 0, layoutParams);
            windowManager.updateViewLayout(this, layoutParams);
        }
    }

    public final boolean getCanCalculatePosition() {
        return C86104wH.A1X(this.A0E);
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.A09;
    }

    public final AnonymousClass69J getParentLayoutDirection() {
        return this.A00;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C114336t4 m18getPopupContentSizebOM6tXw() {
        return (C114336t4) this.A0D.getValue();
    }

    public final C143128g9 getPositionProvider() {
        return this.A01;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A06;
    }

    public C871950n getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.A03;
    }

    public /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m19setPopupContentSizefhxjrPA(C114336t4 r2) {
        this.A0D.CrC(r2);
    }

    private final int getDisplayHeight() {
        Context context = getContext();
        float f = C18230wP.A0E(context).density;
        getContext();
        return AnonymousClass8bA.A03((float) C86114wI.A0B(context).screenHeightDp, f);
    }

    private final int getDisplayWidth() {
        Context context = getContext();
        float f = C18230wP.A0E(context).density;
        getContext();
        return AnonymousClass8bA.A03((float) C86114wI.A0B(context).screenWidthDp, f);
    }

    public final void A04(int i, int i2) {
        super.A04(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Process.WAIT_RESULT_TIMEOUT));
    }

    public final void A05(C147188nY r3, int i) {
        r3.Cvd(-857613600);
        getContent().invoke(r3, C18220wO.A0d());
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, this, i, 14);
        }
    }

    public final void A06(boolean z, int i, int i2, int i3, int i4) {
        super.A06(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            WindowManager.LayoutParams layoutParams = this.A09;
            layoutParams.width = childAt.getMeasuredWidth();
            layoutParams.height = childAt.getMeasuredHeight();
            WindowManager windowManager = this.A0A;
            C04220Ms.A0B(windowManager, 0);
            windowManager.updateViewLayout(this, layoutParams);
        }
    }

    public final void A07() {
        C146508mM parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long BCI = parentLayoutCoordinates.BCI();
            long Bb2 = parentLayoutCoordinates.Bb2(AnonymousClass7KC.A03);
            long A002 = AnonymousClass7Hh.A00(AnonymousClass8bA.A02(AnonymousClass7KC.A01(Bb2)), AnonymousClass8bA.A02(AnonymousClass7KC.A02(Bb2)));
            int i = (int) (A002 >> 32);
            int A082 = C86104wH.A08(A002);
            C115096uV r1 = new C115096uV(i, A082, i + ((int) (BCI >> 32)), C86104wH.A08(BCI) + A082);
            if (!r1.equals(this.A05)) {
                this.A05 = r1;
                A08();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int i2;
        int A052 = C14030oh.A05(-958499268);
        if (!this.A02.A03) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = 1749863787;
        } else {
            if (motionEvent != null) {
                if (motionEvent.getAction() == 0 && (motionEvent.getX() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || motionEvent.getY() >= ((float) getHeight()))) {
                    AnonymousClass0ZU r0 = this.A04;
                    if (r0 != null) {
                        r0.invoke();
                    }
                    i2 = -240948272;
                } else if (motionEvent.getAction() == 4) {
                    AnonymousClass0ZU r02 = this.A04;
                    if (r02 != null) {
                        r02.invoke();
                    }
                    i2 = -2012280296;
                }
                C14030oh.A0C(i2, A052);
                return true;
            }
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = 1611794680;
        }
        C14030oh.A0C(i, A052);
        return onTouchEvent;
    }

    public final void setContent(C115506vH r2, AnonymousClass0YP r3) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r3);
        setParentCompositionContext(r2);
        setContent(r3);
        this.A06 = A1Z;
    }

    private final void setContent(AnonymousClass0YP r2) {
        this.A0B.CrC(r2);
    }
}
