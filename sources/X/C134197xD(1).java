package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7xD  reason: invalid class name and case insensitive filesystem */
public final class C134197xD implements C27944Evu {
    public final float A00;
    public final Path A01;
    public final RectF A02;

    public final /* synthetic */ void cleanup() {
    }

    public final void CmJ(Rect rect) {
        RectF rectF = this.A02;
        rectF.set(rect);
        Path path = this.A01;
        if (path != null) {
            path.rewind();
            float f = this.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        }
    }

    public C134197xD(float f) {
        Path path;
        this.A00 = f;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            path = C86144wL.A0G();
        } else {
            path = null;
        }
        this.A01 = path;
        this.A02 = C86134wK.A0E();
    }

    public final void AJF(Canvas canvas, C25892DuC duC, C25801DsF dsF) {
        int save = canvas.save();
        float f = dsF.A00;
        Rect rect = dsF.A0B;
        canvas.rotate(f, rect.exactCenterX() + dsF.A02, rect.exactCenterY() + dsF.A03);
        float f2 = dsF.A01;
        canvas.scale(f2, f2, rect.exactCenterX() + dsF.A02, rect.exactCenterY() + dsF.A03);
        canvas.translate(dsF.A02, dsF.A03);
        Path path = this.A01;
        if (path != null) {
            int save2 = canvas.save();
            canvas.clipPath(path);
            Drawable drawable = duC.A00;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restoreToCount(save2);
        } else {
            Drawable drawable2 = duC.A00;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
        canvas.restoreToCount(save);
    }

    public final void CkF(boolean z) {
    }
}
