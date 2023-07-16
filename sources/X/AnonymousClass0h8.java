package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0h8  reason: invalid class name */
public abstract class AnonymousClass0h8 {
    public static float A01(AnonymousClass0h9 r7, int i, int i2) {
        int i3 = (int) (((float) i) * 2.0f);
        int i4 = (int) (((float) i2) * 2.0f);
        while (true) {
            int floor = ((int) Math.floor((double) (((float) (i4 - i3)) / 2.0f))) + i3;
            float f = ((float) floor) / 2.0f;
            if (i3 >= floor) {
                return f;
            }
            if (r7.ACi(f)) {
                i3 = floor;
            } else {
                i4 = floor;
            }
        }
    }

    public static void A04(TextView textView, int i) {
        textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        textView.setLineSpacing((float) (i - textView.getLineHeight()), 1.0f);
    }

    public static float A00(Layout.Alignment alignment, TextPaint textPaint, String str, int i, int i2, int i3, int i4) {
        float A01 = A01(new C13110n1(alignment, textPaint, str, i, i2), i3, i4);
        float f = Float.MAX_VALUE;
        for (String r1 : str.split(" ")) {
            f = Math.min(f, A01(new C13090mz(textPaint, r1, i), i3, i4));
        }
        return Math.min(A01, f);
    }

    public static int A02(Context context, Typeface typeface, CharSequence charSequence, float f, int i, int i2) {
        TextView textView = new TextView(context);
        textView.setTypeface(typeface);
        textView.setText(charSequence);
        textView.setTextSize(0, (float) i);
        textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i2, Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    public static boolean A06(TextView textView, CharSequence charSequence) {
        String replaceAll = AnonymousClass0hA.A04.matcher(charSequence).replaceAll(" ");
        if (charSequence.equals(replaceAll)) {
            return false;
        }
        textView.setText(replaceAll);
        return true;
    }

    public static void A03(SpannableString spannableString, String str, int i) {
        int length = str.length();
        int indexOf = spannableString.toString().toLowerCase().indexOf(str.toLowerCase());
        if (indexOf > -1) {
            spannableString.setSpan(new ForegroundColorSpan(i), indexOf, length + indexOf, 0);
        }
    }

    public static void A05(TextView textView, int i) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), C31163GhW.A06(textView.getShadowColor(), i));
    }
}
