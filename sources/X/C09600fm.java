package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.Arrays;

/* renamed from: X.0fm  reason: invalid class name and case insensitive filesystem */
public final class C09600fm {
    public static final Matrix A00 = new Matrix();
    public static final C09600fm A01 = new C09600fm();

    public static final BackgroundGradientColors A00(Bitmap bitmap, Integer num) {
        C04220Ms.A0B(bitmap, 0);
        return A01(bitmap, num);
    }

    public static /* synthetic */ BackgroundGradientColors A01(Bitmap bitmap, Integer num) {
        int width;
        int max;
        String str;
        int intValue = num.intValue();
        Bitmap bitmap2 = bitmap;
        if (intValue != 0) {
            width = Math.max((int) (((float) bitmap2.getWidth()) * 0.05f), 1);
            max = bitmap2.getHeight();
        } else {
            width = bitmap2.getWidth();
            max = Math.max((int) (((float) bitmap2.getHeight()) * 0.05f), 1);
        }
        Matrix matrix = A00;
        float f = (float) width;
        float f2 = (float) max;
        matrix.setScale(1.0f / f, 1.0f / f2);
        try {
            C13760oG.A00(bitmap2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, max, matrix, true);
            if (createBitmap == null) {
                C10450iM.A03("BackgroundGradientUtil_error_creating_startColorBitmap", "startColorBitmap is null");
            } else {
                int pixel = createBitmap.getPixel(0, 0);
                if (!createBitmap.equals(bitmap2)) {
                    createBitmap.recycle();
                }
                try {
                    C13760oG.A00(bitmap2);
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, bitmap2.getWidth() - width, bitmap2.getHeight() - max, width, max, matrix, true);
                    int pixel2 = createBitmap2.getPixel(0, 0);
                    if (!createBitmap2.equals(bitmap2)) {
                        createBitmap2.recycle();
                    }
                    return new BackgroundGradientColors(pixel, pixel2);
                } catch (RuntimeException unused) {
                    RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2);
                    RectF rectF2 = new RectF();
                    matrix.mapRect(rectF2, rectF);
                    int round = Math.round(rectF2.width());
                    int round2 = Math.round(rectF2.height());
                    Integer valueOf = Integer.valueOf(bitmap2.getWidth());
                    Integer valueOf2 = Integer.valueOf(bitmap2.getHeight());
                    Integer valueOf3 = Integer.valueOf(width);
                    Integer valueOf4 = Integer.valueOf(max);
                    Integer valueOf5 = Integer.valueOf(round);
                    Integer valueOf6 = Integer.valueOf(round2);
                    if (intValue != 0) {
                        str = "HORIZONTAL";
                    } else {
                        str = "VERTICAL";
                    }
                    String format = String.format("BackgroundGradientUtil_error_creating_endColorBitmap bitmapWidth=%d bitmapHeight=%d width=%d height=%d newWidth=%d newHeight=%d extractionType=%s", Arrays.copyOf(new Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str}, 7));
                    C04220Ms.A06(format);
                    C10450iM.A03(format, format);
                }
            }
            return new BackgroundGradientColors(-1, -1);
        } catch (RuntimeException e) {
            C10450iM.A07("BackgroundGradientUtil_error_creating_startColorBitmap", e);
            return new BackgroundGradientColors(-1, -1);
        }
    }

    public static final void A02(GradientDrawable.Orientation orientation, View view, BackgroundGradientColors backgroundGradientColors) {
        C04220Ms.A0B(view, 1);
        view.setBackground(new GradientDrawable(orientation, new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00}));
    }
}
