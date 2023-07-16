package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxTCallbackShape564S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3tx  reason: invalid class name and case insensitive filesystem */
public final class C65623tx implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ UserSession A02;

    public C65623tx(View view, C127397h3 r2, UserSession userSession) {
        this.A00 = view;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final boolean onPreDraw() {
        D0f d0f;
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        C127397h3 r4 = this.A01;
        C25553Dnn A012 = AnonymousClass4DS.A01((Activity) view.getContext(), r4.A0O(35, ""));
        A012.A05 = new IDxTCallbackShape564S0100000_1_I2(this, 0);
        A012.A01(view);
        String A0N = r4.A0N(38);
        if (A0N == null || A0N.hashCode() != -2048055687 || !A0N.equals("up_center")) {
            d0f = D0f.ABOVE_ANCHOR;
        } else {
            d0f = D0f.BELOW_ANCHOR;
        }
        A012.A03(d0f);
        String A0N2 = r4.A0N(40);
        if (A0N2 != null && A0N2.equals("always_dark")) {
            A012.A04(AnonymousClass3TC.A05);
        }
        C18200wM.A1Q(A012);
        return true;
    }
}
