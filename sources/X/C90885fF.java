package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5fF  reason: invalid class name and case insensitive filesystem */
public final class C90885fF extends LLI {
    public C111276n4 A00 = new C111276n4(this);

    public C111276n4 getDecorationHelper() {
        return this.A00;
    }

    public C90885fF(Context context) {
        super(context);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C111276n4 r4 = this.A00;
        if (r4.A04) {
            Path path = r4.A08;
            if (path.isEmpty()) {
                RectF rectF = r4.A09;
                float f = r4.A00;
                RectF rectF2 = r4.A0A;
                rectF.set(f, f, rectF2.right - f, rectF2.bottom - f);
                Path.Direction direction = Path.Direction.CW;
                path.addRect(rectF2, direction);
                int i = r4.A03;
                boolean A02 = C120517Bf.A02(i);
                float f2 = r4.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f2, f2, Path.Direction.CCW);
                } else {
                    float[] fArr = r4.A0C;
                    C120517Bf.A01(fArr, f2, i);
                    path.addRoundRect(rectF2, fArr, direction);
                    Path path2 = r4.A07;
                    path2.reset();
                    C120517Bf.A01(fArr, r4.A01, r4.A03);
                    path2.addRoundRect(rectF, fArr, direction);
                }
            }
            canvas.drawPath(path, r4.A06);
            if (C120517Bf.A02(r4.A03)) {
                RectF rectF3 = r4.A09;
                float f3 = r4.A01;
                canvas.drawRoundRect(rectF3, f3, f3, r4.A05);
                return;
            }
            canvas.drawPath(r4.A07, r4.A05);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C111276n4 r5 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = r5.A0A;
        float f = (float) measuredWidth;
        if (rectF.right != f || rectF.bottom != ((float) measuredHeight)) {
            rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, (float) measuredHeight);
            r5.A08.reset();
        }
    }
}
