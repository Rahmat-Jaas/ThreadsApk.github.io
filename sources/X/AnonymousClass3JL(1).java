package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.facebook.graphql.impls.PAYTextWithEntitiesFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.instagram.barcelona.R;

/* renamed from: X.3JL  reason: invalid class name */
public final class AnonymousClass3JL {
    public static void A00(TextView textView, PAYTextWithEntitiesFragmentImpl pAYTextWithEntitiesFragmentImpl, String str, int i) {
        int intValue;
        int i2;
        int intValue2;
        int i3 = 0;
        if (pAYTextWithEntitiesFragmentImpl != null && !TextUtils.isEmpty(pAYTextWithEntitiesFragmentImpl.getStringValue("text"))) {
            SpannableString spannableString = new SpannableString(pAYTextWithEntitiesFragmentImpl.getStringValue("text"));
            Context context = textView.getContext();
            C1366783w A0G = C18250wR.A0G(pAYTextWithEntitiesFragmentImpl, PAYTextWithEntitiesFragmentImpl.ColorRanges.class, "color_ranges");
            while (A0G.hasNext()) {
                TreeJNI A0G2 = C18210wN.A0G(A0G);
                C30031zi r2 = C30031zi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A0G2.getEnumValue("usage_color_enum", r2) != null) {
                    int ordinal = ((C30031zi) A0G2.getEnumValue("usage_color_enum", r2)).ordinal();
                    if (ordinal != 7) {
                        i2 = R.attr.fbpay_primary_text_color;
                        if (ordinal != 9) {
                            i2 = R.attr.fbpay_secondary_text_color;
                        }
                    } else {
                        i2 = R.attr.fbpay_positive_color;
                    }
                    int A01 = C117006xy.A01(context, i2);
                    if (A0G2.getIntValue("offset") + A0G2.getIntValue("length") > spannableString.length()) {
                        intValue2 = spannableString.length();
                    } else {
                        intValue2 = A0G2.getIntValue("offset") + A0G2.getIntValue("length");
                    }
                    spannableString.setSpan(new ForegroundColorSpan(A01), A0G2.getIntValue("offset"), intValue2, 17);
                }
            }
            C1366783w A0G3 = C18250wR.A0G(pAYTextWithEntitiesFragmentImpl, PAYTextWithEntitiesFragmentImpl.InlineStyleRanges.class, "inline_style_ranges");
            while (A0G3.hasNext()) {
                TreeJNI A0G4 = C18210wN.A0G(A0G3);
                C40303Lc9 lc9 = C40303Lc9.A01;
                if (A0G4.getEnumValue("inline_style", lc9) != null) {
                    A0G4.getEnumValue("inline_style", lc9);
                    if (A0G4.getIntValue("offset") + A0G4.getIntValue("length") > spannableString.length()) {
                        intValue = spannableString.length();
                    } else {
                        intValue = A0G4.getIntValue("offset") + A0G4.getIntValue("length");
                    }
                    spannableString.setSpan(new StrikethroughSpan(), A0G4.getIntValue("offset"), intValue, 17);
                }
            }
            textView.setText(spannableString);
        } else if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
            textView.setVisibility(0);
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    public static void A01(TextView textView, String str, int i) {
        int i2 = 0;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }
}
