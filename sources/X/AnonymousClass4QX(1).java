package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4QX  reason: invalid class name */
public final class AnonymousClass4QX implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C57653Bx A01;

    public AnonymousClass4QX(FrameLayout frameLayout, C57653Bx r2) {
        this.A01 = r2;
        this.A00 = frameLayout;
    }

    public final void run() {
        int i;
        int i2;
        C57653Bx r4 = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = r4.A02;
        boolean A012 = AnonymousClass3JD.A01(context, (AnonymousClass3HX) null);
        Integer num = r4.A01;
        F12 f12 = new F12(context, 2.0f, C62833aq.A02(num, AnonymousClass006.A1L, A012 ? 1 : 0), (int) AnonymousClass3W1.A00(context, (float) C62833aq.A01(num, AnonymousClass006.A0C)));
        F5i f5i = new F5i(context);
        f5i.A01(f12);
        if (r4.A00 == null) {
            r4.A00 = new FrameLayout(context);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Integer num2 = AnonymousClass006.A01;
        C58893Hx A03 = C62833aq.A03(num, num2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AnonymousClass3W1.A00(context, (float) C62833aq.A00(num, num2)));
        int i3 = A03.A00;
        C58903Hy r0 = A03.A01;
        if (A012) {
            i = r0.A00;
        } else {
            i = r0.A01;
        }
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setColor(C62833aq.A02(num, AnonymousClass006.A15, A012));
        if (C18240wQ.A06(num, 0) != 0) {
            i2 = 16;
        } else {
            i2 = 17;
        }
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(2131825662);
        float f = (float) i2;
        button.setTextSize(f);
        button.setTextColor(C62833aq.A02(num, AnonymousClass006.A1C, A012));
        button.setHeight((int) AnonymousClass3W1.A00(context, (float) C62833aq.A01(num, num2)));
        button.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.05f);
        C04220Ms.A0B(context, 0);
        C18200wM.A14(context, button, f, 0.3f);
        AnonymousClass0wJ.A16(button, 2, r4);
        LinearLayout A02 = AnonymousClass3W1.A02(context, button);
        r4.A00.addView(f5i, layoutParams);
        r4.A00.addView(A02);
        ViewGroup viewGroup = (ViewGroup) r4.A00.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(r4.A00);
        }
        frameLayout.addView(r4.A00);
        f5i.A00();
    }
}
