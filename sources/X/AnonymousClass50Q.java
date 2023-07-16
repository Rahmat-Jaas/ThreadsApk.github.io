package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.50Q  reason: invalid class name */
public final class AnonymousClass50Q extends View {
    public String A00 = "";
    public String A01 = "";
    public final float A02;
    public final int A03;
    public final Paint A04;
    public final DynamicLayout A05;
    public final SpannableStringBuilder A06;

    public static void A00(AnonymousClass50Q r4) {
        String str = r4.A01;
        boolean isEmpty = str.isEmpty();
        String str2 = r4.A00;
        if (!isEmpty) {
            if (str2.isEmpty()) {
                str2 = str;
            } else {
                str2 = AnonymousClass00U.A0V(str, "\n", str2);
            }
        }
        SpannableStringBuilder spannableStringBuilder = r4.A06;
        spannableStringBuilder.replace(0, spannableStringBuilder.length(), str2);
    }

    public final void onDraw(Canvas canvas) {
        canvas.translate((float) ((int) (((double) this.A03) * 0.1d)), (float) ((int) (this.A02 * 40.0f)));
        DynamicLayout dynamicLayout = this.A05;
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) dynamicLayout.getWidth(), (float) dynamicLayout.getHeight(), this.A04);
        dynamicLayout.draw(canvas);
    }

    public AnonymousClass50Q(Context context) {
        super(context);
        DisplayMetrics A0E = C18230wP.A0E(context);
        float f = A0E.density;
        this.A02 = f;
        int i = A0E.widthPixels;
        this.A03 = i;
        Paint A0C = C86114wI.A0C(1);
        this.A04 = A0C;
        C86104wH.A18(context, A0C, R.color.canvas_text_tool_scrim);
        C86134wK.A13(A0C);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.A06 = spannableStringBuilder;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f * 14.0f);
        C86104wH.A18(context, textPaint, R.color.igds_icon_on_color);
        this.A05 = new DynamicLayout(spannableStringBuilder, textPaint, (int) (((double) i) * 0.8d), Layout.Alignment.ALIGN_NORMAL, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
    }
}
