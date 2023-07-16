package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.3fI  reason: invalid class name and case insensitive filesystem */
public final class C63163fI {
    public static void A01(SpannableStringBuilder spannableStringBuilder, Spanned spanned, TextView textView, Object[] objArr, int i) {
        for (Object obj : objArr) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getContext().getColor(i)), spanStart, spanEnd, 33);
        }
    }

    public static void A00(Context context, ImageView imageView) {
        A02(imageView, C121907Is.A02(context, R.attr.glyphColorPrimary));
    }

    public static void A02(ImageView imageView, int i) {
        C63393hP.A04(imageView.getContext(), imageView, i);
    }

    public static void A03(TextView textView, int i) {
        ColorFilter A01 = C63393hP.A01(textView.getContext(), i);
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (drawable != null) {
            drawable.mutate().setColorFilter(A01);
        }
        Drawable drawable2 = textView.getCompoundDrawablesRelative()[0];
        if (drawable2 != null) {
            drawable2.mutate().setColorFilter(A01);
        }
    }

    public static void A04(TextView textView, int i) {
        Spanned spanned = (Spanned) textView.getText();
        if (spanned != null) {
            SpannableStringBuilder A0E = C18200wM.A0E(textView.getText());
            A01(A0E, spanned, textView, spanned.getSpans(0, textView.getText().length(), StyleSpan.class), i);
            A01(A0E, spanned, textView, spanned.getSpans(0, textView.getText().length(), C18720xk.class), i);
            textView.setText(A0E);
        }
    }

    public static void A05(SearchEditText searchEditText) {
        searchEditText.setClearButtonColorFilter(C63393hP.A01(searchEditText.getContext(), R.color.grey_5));
    }
}
