package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4xd  reason: invalid class name and case insensitive filesystem */
public final class C86414xd extends Drawable {
    public int[] A00 = AnonymousClass325.A02;
    public final Paint A01;
    public final float A02;
    public final float A03;
    public final Paint A04;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C86414xd(Context context) {
        this.A02 = C09860go.A03(context, 2);
        float A032 = C09860go.A03(context, 2);
        this.A03 = A032;
        Paint A0C = C86114wI.A0C(3);
        this.A04 = A0C;
        A0C.setStrokeWidth(A032);
        C86134wK.A12(A0C);
        C86104wH.A18(context, A0C, R.color.igds_primary_text);
        this.A01 = C86114wI.A0C(3);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        float width = ((float) bounds.width()) / 2.0f;
        int[] state = getState();
        int length = state.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (state[i] == 16842913) {
                float f = this.A03;
                canvas.drawCircle(exactCenterX, exactCenterY, width - (f / 2.0f), this.A04);
                width = (width - this.A02) - f;
                break;
            } else {
                i++;
            }
        }
        canvas.drawCircle(exactCenterX, exactCenterY, width, this.A01);
    }

    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        Rect bounds = getBounds();
        if (bounds.width() != 0 && bounds.height() != 0 && (iArr = this.A00) != null) {
            this.A01.setShader(new LinearGradient((float) bounds.left, (float) bounds.bottom, (float) bounds.right, (float) bounds.top, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
    }
}
