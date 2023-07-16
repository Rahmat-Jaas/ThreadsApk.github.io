package X;

import android.app.Activity;
import android.view.View;
import com.instagram.igds.components.tooltip.IDxTCallbackShape159S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Lf  reason: invalid class name and case insensitive filesystem */
public final class C34872Lf {
    public static final C25918DvM A00(Activity activity, View view, D0f d0f, UserSession userSession, String str) {
        C18180wK.A1Q(view, 1, d0f);
        C25553Dnn A01 = AnonymousClass4DS.A01(activity, str);
        A01.A01(view);
        A01.A06 = d0f;
        A01.A04(AnonymousClass3TC.A09);
        A01.A05(AnonymousClass3TC.A08);
        A01.A05 = new IDxTCallbackShape159S0100000_1_I2(userSession, 3);
        return A01.A00();
    }
}
