package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0120000_I2;

/* renamed from: X.2Mk  reason: invalid class name and case insensitive filesystem */
public final class C35182Mk {
    public static void A00(TextView textView, KtCSuperShape0S0120000_I2 ktCSuperShape0S0120000_I2, String str, boolean z) {
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        if (z) {
            C63563ho.A04(textView.getContext(), A0E, true);
        }
        if (ktCSuperShape0S0120000_I2 != null) {
            A0E = C59633Lp.A01(textView, str, ktCSuperShape0S0120000_I2.A02);
            textView.getViewTreeObserver().addOnPreDrawListener(new C65633ty(textView, ktCSuperShape0S0120000_I2, str));
        }
        textView.setText(A0E);
    }
}
