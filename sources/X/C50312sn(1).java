package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.2sn  reason: invalid class name and case insensitive filesystem */
public final class C50312sn {
    public static void A00(C62133Xg r4, C57583Bq r5, AnonymousClass13J r6) {
        View view = r6.itemView;
        view.setOnClickListener(r4.A03);
        C18210wN.A0y(view);
        view.setClickable(true);
        CharSequence charSequence = r4.A04;
        if (charSequence != null) {
            view.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = r4.A05;
        TextView textView = r6.A00;
        if (charSequence2 != null) {
            textView.setText(charSequence2);
        } else {
            textView.setText(r4.A01);
        }
        int i = r4.A02;
        if (i != -1) {
            textView.setTextColor(i);
        }
        view.setBackgroundResource(C50322so.A00(view.getContext(), r5));
        int i2 = 8388627;
        if (r5.A03) {
            i2 = 17;
        }
        textView.setGravity(i2);
        textView.setAlpha(r4.A00);
        r6.A02.setVisibility(8);
        r6.A01.setVisibility(8);
    }
}
