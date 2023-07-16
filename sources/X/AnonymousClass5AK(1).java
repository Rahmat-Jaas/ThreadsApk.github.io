package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5AK  reason: invalid class name */
public final class AnonymousClass5AK extends C61803Vq {
    public boolean A00 = false;
    public float A01;
    public AnonymousClass5AU A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Rect A07;
    public final C110586lw A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D = C86144wL.A0F();
    public final RectF A0E = C86134wK.A0E();
    public final RectF A0F = C86134wK.A0E();

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
        RectF rectF;
        RectF rectF2;
        float f;
        int i;
        Rect rect;
        int width;
        AnonymousClass5AU r1 = this.A02;
        if (r1 != null && !this.A00 && !r1.A04 && r1.A02) {
            C1360181a r2 = new C1360181a(recyclerView, r1);
            r1.A01 = r2;
            recyclerView.postDelayed(r2, 1500);
        }
        boolean z = true;
        this.A00 = true;
        if (this.A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            M6x m6x = recyclerView.A0H;
            if (m6x instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m6x;
                boolean A1T = AnonymousClass0wJ.A1T(linearLayoutManager.A08.getLayoutDirection(), 1);
                int i2 = linearLayoutManager.A01;
                int A0A2 = LinearLayoutManager.A0A(linearLayoutManager, ltt);
                if (i2 == 1) {
                    int A0o = linearLayoutManager.A0o(ltt);
                    int height = recyclerView.getHeight();
                    boolean z2 = this.A0A;
                    if (z2) {
                        Rect rect2 = this.A07;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A0n = linearLayoutManager.A0n(ltt);
                    if (A0o != A0A2) {
                        int round = Math.round((((float) height) * ((float) A0A2)) / ((float) A0o));
                        int i3 = height >> 1;
                        if (round > i3) {
                            round = i3;
                        }
                        int round2 = Math.round((((float) (height - round)) * ((float) A0n)) / ((float) (A0o - A0A2)));
                        rectF = this.A0F;
                        if (A1T) {
                            rect = this.A07;
                            int i4 = rect.right;
                            rectF.left = (float) i4;
                            width = this.A06 + i4;
                        } else {
                            rect = this.A07;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A06) - rect.right);
                            width = recyclerView.getWidth() - rect.right;
                        }
                        float f2 = (float) width;
                        rectF.right = f2;
                        rectF.top = (float) round2;
                        rectF.bottom = (float) (round2 + round);
                        rectF2 = this.A0E;
                        rectF2.left = rectF.left;
                        rectF2.right = f2;
                        rectF2.top = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        rectF2.bottom = (float) recyclerView.getHeight();
                        if (z2) {
                            float f3 = rectF.top;
                            float f4 = (float) rect.top;
                            rectF.top = f3 + f4;
                            rectF.bottom += f4;
                            rectF2.top += f4;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A0l = linearLayoutManager.A0l(ltt);
                    int width2 = recyclerView.getWidth();
                    boolean z3 = this.A0A;
                    if (z3) {
                        Rect rect3 = this.A07;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A0k = linearLayoutManager.A0k(ltt);
                    if (A0l != A0A2) {
                        int round3 = Math.round((((float) width2) * ((float) A0A2)) / ((float) A0l));
                        int i5 = width2 >> 1;
                        if (round3 > i5) {
                            round3 = i5;
                        }
                        int round4 = Math.round((((float) (width2 - round3)) * ((float) A0k)) / ((float) (A0l - A0A2)));
                        rectF = this.A0F;
                        rectF.left = (float) round4;
                        rectF.right = (float) (round4 + round3);
                        Rect rect4 = this.A07;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A06) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0E;
                        rectF2.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        rectF2.top = rectF.top;
                        rectF2.right = (float) recyclerView.getWidth();
                        rectF2.bottom = rectF.bottom;
                        if (z3) {
                            float f5 = rectF.left;
                            if (A1T) {
                                float f6 = (float) rect4.right;
                                rectF.left = f5 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f = rectF2.right;
                                i = rect4.left;
                            } else {
                                float f7 = (float) rect4.left;
                                rectF.left = f5 + f7;
                                rectF.right += f7;
                                rectF2.left += f7;
                                f = rectF2.right;
                                i = rect4.right;
                            }
                            rectF2.right = f - ((float) i);
                        }
                    } else {
                        return;
                    }
                }
                int i6 = this.A03;
                if (i6 != 0) {
                    C110586lw r8 = this.A08;
                    float f8 = r8.A03;
                    if (f8 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || !canvas.isHardwareAccelerated()) {
                        z = false;
                    } else {
                        this.A0D.setShadowLayer(f8, r8.A01, r8.A00, r8.A05);
                    }
                    Paint paint = this.A0D;
                    paint.setColor(i6);
                    paint.setAlpha((int) (this.A01 * ((float) this.A0B)));
                    float f9 = (float) this.A05;
                    canvas.drawRoundRect(rectF2, f9, f9, paint);
                    if (z) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A0D;
                paint2.setColor(this.A04);
                paint2.setAlpha((int) (this.A01 * ((float) this.A0C)));
                float f10 = (float) this.A05;
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
        }
    }

    public AnonymousClass5AK(Rect rect, C110586lw r3, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A04 = i;
        this.A0C = Color.alpha(i);
        this.A0B = Color.alpha(i2);
        this.A06 = i3;
        this.A05 = i4;
        this.A09 = z;
        if (z) {
            this.A01 = 1.0f;
        }
        this.A07 = rect;
        this.A0A = z2;
        this.A08 = r3;
    }
}
