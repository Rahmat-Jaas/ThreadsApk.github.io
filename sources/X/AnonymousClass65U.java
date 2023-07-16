package X;

import android.content.res.Resources;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.65U  reason: invalid class name */
public final class AnonymousClass65U extends C64493mQ {
    public Spannable A00;
    public final int A01;
    public final DynamicLayout A02;
    public final SpannableStringBuilder A03;
    public final TextPaint A04;
    public final EditText A05;
    public final /* synthetic */ H96 A06;

    public final void afterTextChanged(Editable editable) {
        CharSequence charSequence = editable;
        if (TextUtils.isEmpty(editable)) {
            charSequence = this.A05.getHint();
        }
        charSequence.getClass();
        SpannableStringBuilder A0E = C18200wM.A0E(charSequence);
        SpannableStringBuilder spannableStringBuilder = this.A03;
        spannableStringBuilder.replace(0, spannableStringBuilder.length(), A0E);
        H96 h96 = this.A06;
        float f = h96.A05;
        float f2 = f * 0.05f;
        DynamicLayout dynamicLayout = this.A02;
        int height = dynamicLayout.getHeight();
        int i = this.A01;
        if (height > i || dynamicLayout.getLineCount() > 2) {
            TextPaint textPaint = this.A04;
            float textSize = textPaint.getTextSize();
            while (true) {
                textSize -= f2;
                if (textSize < h96.A06) {
                    EditText editText = this.A05;
                    Spannable spannable = this.A00;
                    spannable.getClass();
                    H96.A01(editText, spannable);
                    break;
                }
                textPaint.setTextSize(textSize);
                spannableStringBuilder.replace(0, spannableStringBuilder.length(), A0E);
                if (dynamicLayout.getHeight() <= i && dynamicLayout.getLineCount() <= 2) {
                    this.A05.setTextSize(0, textSize);
                    break;
                }
            }
        } else {
            TextPaint textPaint2 = this.A04;
            float textSize2 = textPaint2.getTextSize();
            while (true) {
                textSize2 += f2;
                if (textSize2 > f) {
                    break;
                }
                textPaint2.setTextSize(textSize2);
                spannableStringBuilder.replace(0, spannableStringBuilder.length(), A0E);
                if (dynamicLayout.getHeight() > i || dynamicLayout.getLineCount() > 2) {
                    textPaint2.setTextSize(this.A05.getTextSize());
                } else {
                    this.A05.setTextSize(0, textSize2);
                }
            }
            textPaint2.setTextSize(this.A05.getTextSize());
        }
        this.A00 = C18200wM.A0E(editable);
    }

    public AnonymousClass65U(EditText editText, H96 h96) {
        this.A06 = h96;
        this.A05 = editText;
        TextPaint textPaint = new TextPaint(editText.getPaint());
        this.A04 = textPaint;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.A03 = spannableStringBuilder;
        Resources resources = editText.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.camera_pre_capture_utility_menu_width) - (resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) << 1);
        textPaint.density = resources.getDisplayMetrics().density;
        this.A02 = new DynamicLayout(spannableStringBuilder, textPaint, dimensionPixelSize, Layout.Alignment.ALIGN_NORMAL, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true);
        this.A01 = resources.getDimensionPixelSize(R.dimen.avatar_reel_ring_size_xxxlarge) - (resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) << 1);
    }
}
