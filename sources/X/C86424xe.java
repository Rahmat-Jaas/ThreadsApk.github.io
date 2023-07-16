package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.4xe  reason: invalid class name and case insensitive filesystem */
public final class C86424xe extends Drawable {
    public int A00;
    public int A01;
    public final boolean A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Paint A07;
    public final boolean A08;

    public C86424xe(Context context, List list, int i, boolean z) {
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        float f;
        Bitmap A002;
        float f2;
        this.A08 = z;
        Paint A0C = C86114wI.A0C(3);
        this.A06 = A0C;
        Paint A0C2 = C86114wI.A0C(3);
        this.A07 = A0C2;
        this.A03 = C09860go.A03(context, 8);
        int A022 = C18240wQ.A02(context, 208);
        this.A04 = C18240wQ.A02(context, 10);
        boolean A1X = C86134wK.A1X(list.size(), 1);
        this.A02 = A1X;
        i = A1X ? A022 : i;
        this.A05 = i;
        C147068nL r1 = (C147068nL) AnonymousClass00J.A0C(list);
        if (r1 instanceof C90365Ls) {
            imageUrl = (ImageUrl) AnonymousClass00J.A0C(((C90365Ls) r1).A04);
        } else if (r1 instanceof C90375Lt) {
            imageUrl = ((C90375Lt) r1).A02;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        if (!(imageUrl == null || (A002 = C37744K2e.A00(C37744K2e.A01(), imageUrl, "barcelona_post_sticker", false)) == null)) {
            float width = (float) A002.getWidth();
            float height = (float) A002.getHeight();
            if (this.A02) {
                f2 = AnonymousClass6MM.A00(width, height);
            } else if (width <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || height <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f2 = 1.0f;
            } else {
                f2 = width / height;
            }
            Bitmap A062 = C31176Gi6.A06(A002, i, AnonymousClass8bA.A02(((float) i) / f2), 0, false);
            C04220Ms.A06(A062);
            this.A00 = A062.getHeight();
            C86124wJ.A1B(A062, A0C);
        }
        if (A1X && this.A00 > 0) {
            C147068nL r12 = (C147068nL) list.get(1);
            if (r12 instanceof C90365Ls) {
                imageUrl2 = (ImageUrl) AnonymousClass00J.A0C(((C90365Ls) r12).A04);
            } else if (r12 instanceof C90375Lt) {
                imageUrl2 = ((C90375Lt) r12).A02;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            if (imageUrl2 != null) {
                int i2 = this.A00;
                Bitmap A003 = C37744K2e.A00(C37744K2e.A01(), imageUrl2, "barcelona_post_sticker", false);
                if (A003 != null) {
                    float width2 = (float) A003.getWidth();
                    float height2 = (float) A003.getHeight();
                    if (this.A02) {
                        f = AnonymousClass6MM.A00(width2, height2);
                    } else if (width2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || height2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f = 1.0f;
                    } else {
                        f = width2 / height2;
                    }
                    Bitmap A063 = C31176Gi6.A06(A003, AnonymousClass8bA.A03((float) i2, f), i2, 0, false);
                    C04220Ms.A06(A063);
                    C86124wJ.A1B(A063, A0C2);
                    this.A01 = A063.getWidth();
                }
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        Rect A0D = C86114wI.A0D(this, canvas2);
        float f3 = (float) this.A05;
        float f4 = (float) this.A01;
        float f5 = (float) this.A00;
        canvas2.save();
        canvas2.clipRect(A0D);
        boolean z = this.A08;
        if (z) {
            f = ((float) A0D.right) - f3;
        } else {
            f = (float) A0D.left;
        }
        canvas2.translate(f, (float) A0D.top);
        float f6 = this.A03;
        canvas2.drawRoundRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3, f5, f6, f6, this.A06);
        if (this.A02) {
            if (z) {
                f2 = (-f4) - ((float) this.A04);
            } else {
                f2 = f3 + ((float) this.A04);
            }
            canvas2.translate(f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            canvas2.drawRoundRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f4, f5, f6, f6, this.A07);
        }
        canvas2.restore();
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        boolean z = this.A02;
        int i = this.A05;
        if (z) {
            return i + this.A04 + this.A01;
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A07.setAlpha(i);
    }
}
