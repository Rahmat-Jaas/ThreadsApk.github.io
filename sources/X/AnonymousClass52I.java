package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.IDxDCompatShape35S0100000_2_I2;
import com.facebook.forker.Process;
import com.facebook.redex.IDxIListenerShape487S0100000_2_I2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.barcelona.R;

/* renamed from: X.52I  reason: invalid class name */
public class AnonymousClass52I extends C39918L7q {
    public FrameLayout A00;
    public C36433JUv A01;
    public C36433JUv A02;
    public BottomSheetBehavior A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public FrameLayout A07;
    public CoordinatorLayout A08;
    public boolean A09;

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A00(view, layoutParams, 0));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass52I(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968767(0x7f0400bf, float:1.7546197E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x0048
            int r6 = r3.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r1 = 1
            r4.A04 = r1
            r4.A05 = r1
            com.google.android.material.bottomsheet.IDxSCallbackShape97S0100000_2_I2 r0 = new com.google.android.material.bottomsheet.IDxSCallbackShape97S0100000_2_I2
            r0.<init>(r4, r1)
            r4.A01 = r0
            X.M5g r0 = r4.A01()
            r0.A0M(r1)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r0 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r1 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0)
            boolean r0 = r0.getBoolean(r1, r1)
            r4.A09 = r0
            return
        L_0x0048:
            r6 = 2131887170(0x7f120442, float:1.940894E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52I.<init>(android.content.Context, int):void");
    }

    public static void A02(AnonymousClass52I r1) {
        if (r1.A03 == null) {
            A03(r1);
        }
    }

    public static void A03(AnonymousClass52I r3) {
        if (r3.A07 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(r3.getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            r3.A07 = frameLayout;
            r3.A08 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) r3.A07.findViewById(R.id.design_bottom_sheet);
            r3.A00 = frameLayout2;
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(frameLayout2);
            r3.A03 = A012;
            A012.A0M(r3.A01);
            r3.A03.A0N(r3.A04);
        }
    }

    private View A00(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A03(this);
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = AnonymousClass0wJ.A0H(getLayoutInflater(), viewGroup, i);
        }
        if (this.A09) {
            C006002r.A00(this.A00, new IDxIListenerShape487S0100000_2_I2(this, 1));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        C86104wH.A1C(viewGroup.findViewById(R.id.touch_outside), 78, this);
        C006702y.A0C(this.A00, new IDxDCompatShape35S0100000_2_I2(this, 3));
        C86164wN.A1A(this.A00, 4, this);
        return this.A07;
    }

    public void cancel() {
        A02(this);
        super.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x0038
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            android.widget.FrameLayout r1 = r4.A07
            if (r1 == 0) goto L_0x0024
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x0024:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A08
            if (r1 == 0) goto L_0x002d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x002d:
            if (r2 == 0) goto L_0x0038
            r1 = 768(0x300, float:1.076E-42)
            android.view.View r0 = r3.getDecorView()
            r0.setSystemUiVisibility(r1)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52I.onAttachedToWindow():void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Process.WAIT_RESULT_TIMEOUT);
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0I == 5) {
            bottomSheetBehavior.A0I(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A04 != z) {
            this.A04 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0N(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A04) {
            this.A04 = true;
        }
        this.A05 = z;
        this.A06 = true;
    }

    public AnonymousClass52I(Context context) {
        this(context, 0);
        this.A09 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public final void setContentView(View view) {
        super.setContentView(A00(view, (ViewGroup.LayoutParams) null, 0));
    }

    public final void setContentView(int i) {
        super.setContentView(A00((View) null, (ViewGroup.LayoutParams) null, i));
    }
}
