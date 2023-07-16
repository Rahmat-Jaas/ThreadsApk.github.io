package X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactCountryCodeRoute;

/* renamed from: X.81v  reason: invalid class name and case insensitive filesystem */
public final class C1362081v implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ IgReactCountryCodeRoute A01;

    public C1362081v(Callback callback, IgReactCountryCodeRoute igReactCountryCodeRoute) {
        this.A01 = igReactCountryCodeRoute;
        this.A00 = callback;
    }

    public final void run() {
        AnonymousClass1XY r3 = new AnonymousClass1XY();
        Bundle A06 = C18180wK.A06();
        IgReactCountryCodeRoute igReactCountryCodeRoute = this.A01;
        C05050Qq.A00(A06, igReactCountryCodeRoute.mSession);
        r3.setArguments(A06);
        r3.A01 = new C133837wX(this.A00);
        C34640IcN A002 = C1186671u.A00(igReactCountryCodeRoute.getCurrentActivity());
        if (A002 != null && (A002 instanceof C34611Ibh)) {
            r3.A0A(A002.mFragmentManager, (String) null);
        }
    }
}
