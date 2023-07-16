package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.view.IDxDCompatShape35S0100000_2_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAnchorShape167S0000000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.0wi  reason: invalid class name and case insensitive filesystem */
public final class C18340wi extends Dialog {
    public static final C41706Ma1 A0I = new IDxAnchorShape167S0000000_1_I2(0);
    public static final C41706Ma1 A0J = new IDxAnchorShape167S0000000_1_I2(1);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -16777216;
    public Context A03;
    public FrameLayout A04;
    public AnonymousClass32B A05;
    public C81834oT A06;
    public C41706Ma1 A07 = new C66813yJ(this);
    public C41706Ma1 A08 = A0J;
    public L75 A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = true;
    public View A0F;
    public final Handler A0G = AnonymousClass0wJ.A0F();
    public final AnonymousClass3GX A0H = new AnonymousClass3GX(this);

    public final void show() {
        C41706Ma1 ma1;
        AccessibilityManager accessibilityManager;
        this.A0D = false;
        L75 l75 = this.A09;
        l75.A06.A08();
        l75.A0B = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (ma1 = this.A07) == null) {
            ma1 = this.A08;
        }
        l75.A03(ma1, -1);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C18340wi r5, float r6) {
        /*
            float r4 = r5.A01
            float r4 = r4 * r6
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x0039
            android.view.View r3 = r0.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 == 0) goto L_0x0017
            r3 = r0
        L_0x0017:
            int r2 = r5.A02
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = java.lang.Math.max(r0, r4)
            float r1 = java.lang.Math.min(r1, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = X.C31163GhW.A06(r2, r0)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x003a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
        L_0x0036:
            r1.setColor(r2)
        L_0x0039:
            return
        L_0x003a:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>()
            r3.setBackground(r1)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18340wi.A01(X.0wi, float):void");
    }

    public static C41706Ma1[] A02(C41706Ma1 ma1, C41706Ma1 ma12) {
        C41706Ma1 ma13 = A0I;
        if (ma1 == null) {
            if (ma12 == null) {
                return new C41706Ma1[]{ma13};
            }
            return new C41706Ma1[]{ma13, ma12};
        } else if (ma12 == null) {
            return new C41706Ma1[]{ma13, ma1};
        } else {
            return new C41706Ma1[]{ma13, ma1, ma12};
        }
    }

    public final void A04(C41706Ma1 ma1) {
        this.A08 = ma1;
        this.A09.A04(A02(ma1, this.A07), isShowing());
    }

    public final void A05(Integer num) {
        C81834oT r0 = this.A06;
        if (r0 == null || r0.Bno(num)) {
            super.cancel();
        }
    }

    public final void cancel() {
        A05(AnonymousClass006.A0Y);
    }

    public final void onBackPressed() {
        if (this.A0B) {
            A05(AnonymousClass006.A01);
        }
    }

    public C18340wi(Context context) {
        super(context, R.style.Bloks_BottomSheetDialog);
        Context context2 = getContext();
        this.A03 = context2;
        L75 l75 = new L75(context2);
        this.A09 = l75;
        l75.A03 = this.A0H;
        l75.A00 = -1;
        l75.A04(new C41706Ma1[]{A0I, this.A08, this.A07}, true);
        L75 l752 = this.A09;
        l752.A04 = new AnonymousClass32C(this);
        l752.setFitsSystemWindows(true);
        this.A09.A06.A08();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A04 = frameLayout;
        frameLayout.addView(this.A09);
        super.setContentView(this.A04);
        C006702y.A0C(this.A09, new IDxDCompatShape35S0100000_2_I2(this, 0));
    }

    public static void A00(C18340wi r4) {
        InputMethodManager inputMethodManager;
        Window window = r4.getWindow();
        L75 l75 = r4.A09;
        if (!l75.hasWindowFocus()) {
            r4.A03();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        r4.A0D = true;
        if (!r4.A0A && r4.A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            r4.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            A01(r4, r4.A00);
        }
        l75.A06.A08();
        l75.A03(A0I, -1);
        l75.setInteractable(false);
        View currentFocus = r4.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void A03() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (!(currentFocus == null || (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) == null)) {
            C18230wP.A14(currentFocus, inputMethodManager);
        }
        super.dismiss();
    }

    public final void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0G;
        if (myLooper == handler.getLooper()) {
            A00(this);
        } else {
            handler.post(new AnonymousClass4OB(this));
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0B = z;
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0C = z;
    }

    public final void setContentView(int i) {
        setContentView(AnonymousClass0wJ.A0H(LayoutInflater.from(getContext()), this.A09, i), (ViewGroup.LayoutParams) null);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A0F;
        if (view2 != null) {
            this.A09.removeView(view2);
        }
        this.A0F = view;
        L75 l75 = this.A09;
        if (layoutParams == null) {
            l75.addView(view);
        } else {
            l75.addView(view, layoutParams);
        }
    }

    public final void setContentView(View view) {
        setContentView(view, (ViewGroup.LayoutParams) null);
    }
}
