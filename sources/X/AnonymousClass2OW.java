package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.facebook.redex.IDxCBackShape137S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2OW  reason: invalid class name */
public final class AnonymousClass2OW {
    public static final void A00(Activity activity, UserSession userSession) {
        C63733iD A01 = C63733iD.A01();
        A01.A01 = 5000;
        A01.A0A = activity.getResources().getString(2131828302);
        A01.A0E(AnonymousClass22b.ICON);
        Drawable drawable = activity.getDrawable(R.drawable.instagram_text_pano_outline_24);
        if (drawable != null) {
            C63733iD.A05(activity, drawable, A01);
            A01.A0I = true;
            A01.A0D = C18190wL.A0g(activity.getResources(), 2131828304);
            A01.A07 = new IDxCBackShape137S0200000_1_I2(activity, userSession, 5);
            C63733iD.A0A(A01);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
