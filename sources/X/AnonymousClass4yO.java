package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4yO  reason: invalid class name */
public final class AnonymousClass4yO extends Drawable implements C33680HsR {
    public final AnonymousClass4yQ A00;
    public final F10 A01;

    public final float AZz() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void CjT(float f) {
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A01.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        this.A00.setBounds(rect);
        F10 f10 = this.A01;
        f10.A0G(rect.width());
        int i = f10.A07;
        int width = rect.left + ((rect.width() - i) >> 1);
        int i2 = rect.top;
        f10.setBounds(C86164wN.A0F(width, i2, i + width, f10.A04 + i2));
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4yO(Context context) {
        this.A00 = new AnonymousClass4yQ(context);
        F10 A0T = C86164wN.A0T(context, 0);
        Resources resources = context.getResources();
        A0T.A0O(resources.getString(2131837974));
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        float A002 = (float) C18250wR.A00(resources);
        Typeface A0C = C86154wM.A0C(context);
        if (A0C != null) {
            C31167Ghl.A0B(A0C, A0T, (float) resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size), A002, A002);
            this.A01 = A0T;
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
