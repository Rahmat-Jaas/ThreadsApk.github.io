package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4QW  reason: invalid class name */
public final class AnonymousClass4QW implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ AnonymousClass3D5 A01;

    public AnonymousClass4QW(FrameLayout frameLayout, AnonymousClass3D5 r2) {
        this.A01 = r2;
        this.A00 = frameLayout;
    }

    public final void run() {
        int i;
        int i2;
        String str;
        AnonymousClass3D5 r5 = this.A01;
        C81804oQ r3 = r5.A01;
        FrameLayout frameLayout = this.A00;
        if (r3 != null) {
            FrameLayout frameLayout2 = r5.A00;
            if (frameLayout2 == null) {
                frameLayout2 = new FrameLayout(r5.A02);
                r5.A00 = frameLayout2;
            }
            r3.Bsc(r5.A02, frameLayout2, r5.A04);
            frameLayout.addView(r5.A00);
            return;
        }
        Context context = r5.A02;
        boolean A012 = AnonymousClass3JD.A01(context, r5.A05);
        Integer num = r5.A06;
        F12 f12 = new F12(context, 2.0f, C62833aq.A02(num, AnonymousClass006.A1L, A012 ? 1 : 0), (int) AnonymousClass3W1.A00(context, (float) C62833aq.A01(num, AnonymousClass006.A0C)));
        F5i f5i = new F5i(context);
        f5i.A01(f12);
        if (r5.A00 == null) {
            r5.A00 = new FrameLayout(context);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!r5.A07) {
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
                str = "Optimistic Text App Medium";
            } else {
                i2 = 17;
                str = "Optimistic Display App Medium";
            }
            Button button = new Button(context);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(2131825662);
            float f = (float) i2;
            button.setTextSize(f);
            button.setTextColor(C62833aq.A02(num, AnonymousClass006.A1C, A012));
            button.setHeight((int) AnonymousClass3W1.A00(context, (float) C62833aq.A01(num, num2)));
            button.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.05f);
            AnonymousClass3TV.A00(context, button, str);
            C18200wM.A14(context, button, f, 0.3f);
            AnonymousClass0wJ.A16(button, 1, r5);
            r5.A00.addView(AnonymousClass3W1.A02(context, button));
        }
        r5.A00.addView(f5i, layoutParams);
        frameLayout.addView(r5.A00);
        f5i.A00();
    }
}
