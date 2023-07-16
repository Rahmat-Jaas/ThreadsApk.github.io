package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.4xW  reason: invalid class name */
public final class AnonymousClass4xW extends Drawable {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final float A05;
    public final Paint A06;
    public final PointF A07 = new PointF();
    public final int A08;
    public final Path A09 = C86144wL.A0G();
    public final PointF A0A = new PointF();
    public final PointF A0B = new PointF();
    public final PointF A0C = new PointF();
    public final PointF A0D = new PointF();
    public final List A0E = AnonymousClass0wJ.A0v();
    public final boolean A0F;

    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AnonymousClass4xW(Context context, float f, int i, int i2) {
        Paint A0C2 = C86114wI.A0C(1);
        this.A06 = A0C2;
        this.A05 = f;
        this.A08 = i2;
        C86104wH.A18(context, A0C2, i);
        this.A0F = AnonymousClass0hB.A02(context);
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect bounds = getBounds();
        int i7 = this.A08;
        Canvas canvas2 = canvas;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 3) {
                    f = (float) (bounds.left + this.A03);
                    f2 = (float) (bounds.top + this.A04);
                    f3 = f + this.A05;
                } else if (i7 == 5) {
                    f3 = (float) (bounds.right - this.A02);
                    f = f3 - this.A05;
                    f2 = (float) (bounds.top + this.A04);
                } else if (i7 == 16) {
                    float f5 = ((float) (bounds.left + bounds.right)) / 2.0f;
                    float f6 = this.A05 / 2.0f;
                    f = f5 - f6;
                    f2 = (float) (bounds.top + this.A04);
                    f3 = f5 + f6;
                } else if (i7 == 48) {
                    int i8 = bounds.left;
                    boolean z = this.A0F;
                    if (z) {
                        i3 = this.A02;
                    } else {
                        i3 = this.A03;
                    }
                    f = (float) (i8 + i3);
                    f2 = (float) (bounds.top + this.A04);
                    int i9 = bounds.right;
                    if (z) {
                        i4 = this.A03;
                    } else {
                        i4 = this.A02;
                    }
                    f3 = (float) (i9 - i4);
                    f4 = f2 + this.A05;
                } else if (i7 == 80) {
                    int i10 = bounds.left;
                    boolean z2 = this.A0F;
                    if (z2) {
                        i5 = this.A02;
                    } else {
                        i5 = this.A03;
                    }
                    f = (float) (i10 + i5);
                    f4 = (float) (bounds.bottom - this.A01);
                    f2 = f4 - this.A05;
                    int i11 = bounds.right;
                    if (z2) {
                        i6 = this.A03;
                    } else {
                        i6 = this.A02;
                    }
                    f3 = (float) (i11 - i6);
                } else {
                    return;
                }
                f4 = (float) (bounds.bottom - this.A01);
            } else {
                int i12 = bounds.left;
                boolean z3 = this.A0F;
                if (z3) {
                    i = this.A02;
                } else {
                    i = this.A03;
                }
                f = (float) (i12 + i);
                float f7 = ((float) (bounds.top + bounds.bottom)) / 2.0f;
                float f8 = this.A05 / 2.0f;
                f2 = f7 - f8;
                int i13 = bounds.right;
                if (z3) {
                    i2 = this.A03;
                } else {
                    i2 = this.A02;
                }
                f3 = (float) (i13 - i2);
                f4 = f7 + f8;
            }
            canvas2.drawRect(f, f2, f3, f4, this.A06);
            return;
        }
        double d = this.A00;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        if (cos != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            PointF pointF = this.A07;
            float f9 = pointF.y + (((-pointF.x) / cos) * sin);
            if (f9 >= ((float) bounds.top) && f9 < ((float) bounds.bottom)) {
                PointF pointF2 = this.A0B;
                pointF2.x = (float) bounds.left;
                pointF2.y = f9;
                this.A0E.add(pointF2);
            }
            float f10 = (float) bounds.right;
            float f11 = pointF.y + (((f10 - pointF.x) / cos) * sin);
            if (f11 >= ((float) bounds.top) && f11 < ((float) bounds.bottom)) {
                PointF pointF3 = this.A0C;
                pointF3.x = f10;
                pointF3.y = f11;
                this.A0E.add(pointF3);
            }
        }
        if (sin != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            PointF pointF4 = this.A07;
            float f12 = pointF4.x + (((-pointF4.y) / sin) * cos);
            if (f12 >= ((float) bounds.left) && f12 < ((float) bounds.right)) {
                PointF pointF5 = this.A0D;
                pointF5.x = f12;
                pointF5.y = (float) bounds.top;
                this.A0E.add(pointF5);
            }
            float f13 = (float) bounds.bottom;
            float f14 = pointF4.x + (((f13 - pointF4.y) / sin) * cos);
            if (f14 >= ((float) bounds.left) && f14 < ((float) bounds.right)) {
                PointF pointF6 = this.A0A;
                pointF6.x = f14;
                pointF6.y = f13;
                this.A0E.add(pointF6);
            }
        }
        List list = this.A0E;
        if (list.size() >= 2) {
            PointF pointF7 = (PointF) C18240wQ.A0b(list);
            PointF pointF8 = (PointF) list.get(C86144wL.A0C(list, 1));
            Path path = this.A09;
            path.moveTo(pointF7.x, pointF7.y);
            path.lineTo(pointF8.x, pointF8.y);
            canvas2.drawPath(path, this.A06);
            list.clear();
            path.reset();
        }
    }
}
