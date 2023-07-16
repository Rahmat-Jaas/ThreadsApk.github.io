package X;

import android.app.Activity;
import android.view.View;
import com.facebook.redex.IDxCListenerShape251S0200000_4_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ss  reason: invalid class name and case insensitive filesystem */
public final class C61313Ss {
    public boolean A00;
    public final Activity A01;
    public final C25831Dsp A02;
    public final UserSession A03;

    public static final void A00(View view, C61313Ss r5, C84334sy r6, D0f d0f, String str) {
        C25553Dnn dnn = new C25553Dnn(r5.A01, new C26431qd((CharSequence) str));
        dnn.A01(view);
        dnn.A03(d0f);
        dnn.A05 = r6;
        view.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape251S0200000_4_I2(view, dnn.A00(), 0));
    }

    public C61313Ss(Activity activity, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = activity;
        this.A02 = C25567Do3.A02(userSession);
    }
}
