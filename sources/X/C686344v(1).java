package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.44v  reason: invalid class name and case insensitive filesystem */
public final class C686344v implements C39769Kzd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Canvas A01;
    public final /* synthetic */ UserSession A02;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            int i = this.A00;
            Canvas canvas = this.A01;
            C13760oG.A00(bitmap);
            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, i, i, false), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Paint) null);
        }
    }

    public final void C25(L5E l5e, int i) {
    }

    public C686344v(Canvas canvas, UserSession userSession, int i) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = canvas;
    }

    public final void C1y(L5E l5e, KHQ khq) {
        C10770iu.A00().ABJ("Exception getting bitmap from user cover image url", 817896325);
    }
}
