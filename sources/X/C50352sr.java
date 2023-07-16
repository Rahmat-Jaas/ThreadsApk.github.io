package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.2sr  reason: invalid class name and case insensitive filesystem */
public final class C50352sr {
    public static void A00(AnonymousClass12Z r2, C63293hC r3) {
        TextView textView = r2.A00;
        r3.A03(textView);
        View.OnClickListener onClickListener = r3.A03;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
        int i = 8388627;
        if (r3.A05) {
            i = 17;
        }
        textView.setGravity(i);
    }
}
