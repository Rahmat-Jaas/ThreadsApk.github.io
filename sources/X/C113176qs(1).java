package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape74S0200000_5_I2;
import com.instagram.barcelona.R;
import java.util.Locale;

/* renamed from: X.6qs  reason: invalid class name and case insensitive filesystem */
public final class C113176qs {
    public boolean A00;
    public Integer A01;
    public final int A02;
    public final View A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final Context A09;
    public final TextView A0A;
    public final TextView A0B;
    public final G2K A0C;
    public final Integer A0D;

    public C113176qs(View view, C210218n r16, G2K g2k, Integer num, Integer num2, int i, int i2) {
        C210218n r0 = r16;
        AnonymousClass0wJ.A1M(view, 1, r0);
        this.A03 = view;
        this.A02 = i;
        G2K g2k2 = g2k;
        this.A0C = g2k2;
        this.A0D = num;
        this.A01 = num2;
        Context A0A2 = C18190wL.A0A(view);
        this.A09 = A0A2;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_answer_text);
        this.A0A = textView;
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_answer_text_white);
        this.A0B = textView2;
        TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_result_percentage);
        this.A07 = textView3;
        TextView textView4 = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_result_percentage_white);
        this.A08 = textView4;
        TextView textView5 = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_result_percentage_sign);
        this.A05 = textView5;
        TextView textView6 = (TextView) AnonymousClass0wJ.A0J(view, R.id.poll_v2_sticker_result_percentage_sign_white);
        this.A06 = textView6;
        LinearLayout linearLayout = (LinearLayout) AnonymousClass0wJ.A0J(view, R.id.white_text_layout);
        this.A04 = linearLayout;
        int color = A0A2.getColor(R.color.poll_v2_sticker_option_text);
        int color2 = A0A2.getColor(R.color.poll_v2_sticker_option_text_white);
        String str = r0.A02;
        textView.setText(str);
        textView.setTextColor(color);
        textView2.setText(str);
        textView2.setTextColor(color2);
        textView3.setTextColor(color);
        textView4.setTextColor(color2);
        textView5.setTextColor(color);
        textView6.setTextColor(color2);
        GYQ.A00(textView3);
        GYQ.A00(textView4);
        GYQ.A00(textView5);
        GYQ.A00(textView6);
        C86154wM.A1B(PorterDuff.Mode.SRC_IN, linearLayout.getBackground().mutate(), A0A2.getColor(i2));
        Integer num3 = this.A01;
        if (num3 == null) {
            num3 = C18220wO.A0d();
            this.A01 = num3;
        }
        C09860go.A0g(this.A03, new C1362381y(this, C86134wK.A0A(num3)));
        float f = num == null ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : 1.0f;
        textView3.setAlpha(f);
        textView4.setAlpha(f);
        textView5.setAlpha(f);
        textView6.setAlpha(f);
        if (g2k != null) {
            this.A03.setOnClickListener(new IDxCListenerShape74S0200000_5_I2(39, this, g2k2));
        }
        this.A00 = true;
    }

    public final void A00(Runnable runnable, int i) {
        TextView textView = this.A07;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(String.format((Locale) null, "%d", new Object[]{valueOf}));
        TextView textView2 = this.A08;
        textView2.setText(String.format((Locale) null, "%d", new Object[]{valueOf}));
        TextView textView3 = this.A05;
        textView3.setText(String.format((Locale) null, "%%", new Object[0]));
        TextView textView4 = this.A06;
        textView4.setText(String.format((Locale) null, "%%", new Object[0]));
        if (this.A0D == null) {
            textView2.animate().setDuration(350).alpha(1.0f);
            textView4.animate().setDuration(350).alpha(1.0f);
            textView.animate().setDuration(350).alpha(1.0f);
            textView3.animate().setDuration(350).alpha(1.0f);
            C09860go.A0g(this.A03, new C1363082f(this, runnable, i));
        }
        this.A00 = false;
    }
}
