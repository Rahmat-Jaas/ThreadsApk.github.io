package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4S7  reason: invalid class name */
public final class AnonymousClass4S7 implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C57893Cw A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4S7(FrameLayout frameLayout, C57893Cw r2, boolean z) {
        this.A01 = r2;
        this.A00 = frameLayout;
        this.A02 = z;
    }

    public final void run() {
        FrameLayout frameLayout;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        C57893Cw r2 = this.A01;
        FrameLayout frameLayout2 = this.A00;
        C81794oP r4 = r2.A03;
        boolean z = this.A02;
        FrameLayout frameLayout3 = r2.A00;
        if (frameLayout3 == null) {
            r2.A00 = new FrameLayout(r2.A01);
        } else if (!(frameLayout3.getParent() == null || (frameLayout = r2.A00) == null)) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00.removeAllViews();
        }
        Context context = r2.A01;
        boolean A012 = AnonymousClass3JD.A01(context, r2.A05);
        Integer num = r2.A06;
        Integer num2 = AnonymousClass006.A0C;
        int A06 = C18240wQ.A06(num, 0);
        LCH A013 = LCH.A01((Resources.Theme) null, context.getResources(), R.drawable.ic_error_outline_96_rev);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(A013);
        Integer num3 = AnonymousClass006.A0N;
        switch (A06) {
            case 0:
            case 1:
                i = 16;
                break;
            default:
                i = 14;
                break;
        }
        imageView.setPadding(0, 0, 0, (int) AnonymousClass3W1.A00(context, (float) i));
        imageView.setColorFilter(C62833aq.A02(num, AnonymousClass006.A0Y, A012 ? 1 : 0));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        float f = (float) 16;
        linearLayout.setPadding((int) AnonymousClass3W1.A00(context, f), 0, (int) AnonymousClass3W1.A00(context, f), 0);
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(R.string.f0nameremoved);
        textView.setTextColor(C62833aq.A02(num, num3, A012));
        float f2 = (float) 24;
        textView.setTextSize(f2);
        textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.96f);
        C18200wM.A14(context, textView, f2, 0.32f);
        AnonymousClass3TV.A00(context, textView, "Optimistic Display App");
        textView.setMaxLines(3);
        Integer num4 = AnonymousClass006.A01;
        textView.setPadding(0, 0, 0, (int) AnonymousClass3W1.A00(context, (float) 20));
        if (num.intValue() != 0) {
            str = "Optimistic Text App Regular";
        } else {
            str = "Optimistic Display App Regular";
        }
        TextView textView2 = new TextView(context);
        textView2.setText(R.string.f0nameremoved);
        textView2.setTextColor(C62833aq.A02(num, num4, A012));
        float f3 = (float) 15;
        textView2.setTextSize(f3);
        textView2.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.15f);
        AnonymousClass3TV.A00(context, textView, str);
        C18200wM.A14(context, textView2, f3, 0.245f);
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        Integer num5 = AnonymousClass006.A00;
        C58893Hx A03 = C62833aq.A03(num, num5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AnonymousClass3W1.A00(context, (float) C62833aq.A00(num, num5)));
        gradientDrawable.setColor(C62833aq.A02(num, AnonymousClass006.A0j, A012));
        int i5 = A03.A00;
        C58903Hy r5 = A03.A01;
        if (A012) {
            i2 = r5.A00;
        } else {
            i2 = r5.A01;
        }
        gradientDrawable.setStroke(i5, i2);
        if (num.intValue() != 0) {
            i3 = 16;
            str2 = "Optimistic Text App Medium";
        } else {
            i3 = 17;
            str2 = "Optimistic Display App Medium";
        }
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(R.string.f0nameremoved);
        float f4 = (float) i3;
        button.setTextSize(f4);
        button.setTextColor(C62833aq.A02(num, AnonymousClass006.A0u, A012));
        button.setHeight((int) AnonymousClass3W1.A00(context, (float) C62833aq.A01(num, num5)));
        button.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.05f);
        AnonymousClass3TV.A00(context, button, str2);
        C18200wM.A14(context, button, f4, 0.3f);
        switch (A06) {
            case 0:
            case 1:
                i4 = 16;
                break;
            default:
                i4 = 20;
                break;
        }
        button.setPadding(i4, 0, i4, 0);
        AnonymousClass0wJ.A18(button, 0, r4, r2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) AnonymousClass3W1.A00(context, 20.0f), 0, (int) AnonymousClass3W1.A00(context, 20.0f), (int) AnonymousClass3W1.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        if (z) {
            FrameLayout frameLayout4 = r2.A00;
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.company_layer_icons_close_outline_24);
            imageView2.setColorFilter(C62833aq.A02(num, num2, A012));
            AnonymousClass0wJ.A16(imageView2, 0, r2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) AnonymousClass3W1.A00(context, 24.0f), (int) AnonymousClass3W1.A00(context, 24.0f));
            layoutParams3.setMargins((int) AnonymousClass3W1.A00(context, 20.0f), (int) AnonymousClass3W1.A00(context, 30.0f), 0, 0);
            layoutParams3.gravity = 51;
            frameLayout4.addView(imageView2, layoutParams3);
        }
        r2.A00.addView(linearLayout);
        r2.A00.addView(linearLayout2);
        frameLayout2.addView(r2.A00);
    }
}
