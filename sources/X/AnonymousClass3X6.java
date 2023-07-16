package X;

import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3X6  reason: invalid class name */
public final class AnonymousClass3X6 {
    public static final C58813Hj A00 = new C58813Hj();

    public static void A01(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextSize(0, (float) textView.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static void A00(TextView textView) {
        for (TextView A04 : new TextView[]{textView}) {
            C63163fI.A04(A04, R.color.igds_link);
        }
    }
}
