package X;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* renamed from: X.048  reason: invalid class name */
public final class AnonymousClass048 {
    public static void A00(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass047.A00(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        int i2 = editorInfo.initialSelStart;
        int i3 = i2;
        int i4 = editorInfo.initialSelEnd;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i3 > i4) {
            i4 = i3;
        }
        int length = charSequence.length();
        if (i2 < 0 || i4 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
            A01(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            A01(editorInfo, charSequence, i2, i4);
        } else {
            int i5 = i4 - i2;
            int i6 = i5;
            if (i5 > 1024) {
                i6 = 0;
            }
            int i7 = 2048 - i6;
            int min = Math.min(charSequence.length() - i4, i7 - Math.min(i2, (int) (((double) i7) * 0.8d)));
            int min2 = Math.min(i2, i7 - min);
            int i8 = i2 - min2;
            if (Character.isLowSurrogate(charSequence.charAt(i8))) {
                i8++;
                min2--;
            }
            if (Character.isHighSurrogate(charSequence.charAt((i4 + min) - 1))) {
                min--;
            }
            int i9 = min2 + i6;
            int i10 = i9 + min;
            if (i6 != i5) {
                subSequence = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i8, i8 + min2), charSequence.subSequence(i4, min + i4)});
            } else {
                subSequence = charSequence.subSequence(i8, i10 + i8);
            }
            A01(editorInfo, subSequence, min2, i9);
        }
    }

    public static void A01(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
