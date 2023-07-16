package X;

import android.content.Context;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLListenerShape382S0100000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.6qn  reason: invalid class name and case insensitive filesystem */
public final class C113126qn {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Interpolator A03;
    public final Interpolator A04;
    public final C143198gH A05;
    public final C143208gI A06;
    public final AnonymousClass3HX A07;
    public final C121997Jj A08;
    public final Integer A09;
    public final String A0A;
    public final boolean A0B;

    public final void A00() {
        int i;
        AnonymousClass3HX r1 = this.A07;
        Context context = r1.A00;
        boolean z = this.A0B;
        Integer num = this.A09;
        AnonymousClass51R r3 = new AnonymousClass51R(context, num, z);
        r3.setBloksContentViewFromParseResult(r1, this.A08);
        r3.A00 = this.A00;
        r3.A02 = this.A02;
        r3.A01 = this.A01;
        r3.A04 = this.A04;
        r3.A03 = this.A03;
        r3.A06 = new C125237cl(this);
        r3.A05 = new C125217cj(r3, this);
        r3.setTag(R.id.foa_toast_tag_server_id, this.A0A);
        AnonymousClass51R r12 = (AnonymousClass51R) C1188872r.A00.get();
        if (r12 != null) {
            r12.A02(r12.A01);
        }
        int i2 = -1;
        if (z) {
            i2 = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
        if (z) {
            i = 17;
        } else {
            i = 80;
            if (num.equals(AnonymousClass006.A00)) {
                i = 48;
            }
        }
        layoutParams.gravity = i;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.addView(r3, layoutParams);
                C1188872r.A00 = C86144wL.A0w(r3);
                r3.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                r3.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape382S0100000_2_I2(r3, 1));
                return;
            }
            throw C18180wK.A0a("Window manager required but not found.");
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public C113126qn(Interpolator interpolator, Interpolator interpolator2, C143198gH r3, C143208gI r4, AnonymousClass3HX r5, C121997Jj r6, Integer num, String str, int i, int i2, int i3, boolean z) {
        this.A07 = r5;
        this.A08 = r6;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = interpolator;
        this.A03 = interpolator2;
        this.A06 = r4;
        this.A05 = r3;
        this.A0A = str;
        this.A0B = z;
        this.A09 = num;
    }
}
