package X;

import android.graphics.Bitmap;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.44w  reason: invalid class name and case insensitive filesystem */
public final class C686444w implements C39769Kzd {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AnonymousClass0YY A04;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        int i;
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            String str = this.A03;
            int i2 = this.A01;
            float f = this.A00;
            AnonymousClass0YY r2 = this.A04;
            if (C04220Ms.A0I(str, "TWO_FACES")) {
                i = 24;
                if (i2 == 0) {
                    i = 32;
                }
            } else if (i2 != 0) {
                i = 22;
                if (i2 != 1) {
                    i = 16;
                }
            } else {
                i = 30;
            }
            int i3 = (int) (f * ((float) i));
            C13760oG.A00(bitmap);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i3, false);
            C04220Ms.A09(createScaledBitmap);
            r2.invoke(createScaledBitmap);
        }
    }

    public final void C25(L5E l5e, int i) {
    }

    public C686444w(UserSession userSession, String str, AnonymousClass0YY r3, float f, int i) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = i;
        this.A00 = f;
        this.A04 = r3;
    }

    public final void C1y(L5E l5e, KHQ khq) {
        C10770iu.A00().ABJ("Exception getting bitmap from user profile image url", 817896325);
    }
}
