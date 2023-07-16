package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yq  reason: invalid class name and case insensitive filesystem */
public final class C67083yq implements CallerContextable {
    public static final String __redex_internal_original_name = "NuxHelper";
    public final Fragment A00;
    public final UserSession A01;
    public final C11630kW A02;

    public final void A00() {
        UserSession userSession = this.A01;
        userSession.A03(AnonymousClass2S1.class);
        C62313Yf.A00().A03();
        C67123yu r0 = C67123yu.A04;
        if (r0 == null) {
            r0 = new C67123yu(userSession);
            C67123yu.A04 = r0;
        }
        r0.A01();
        C67323zM.A08(this.A00.getActivity(), this.A02, userSession);
    }

    public final void A01() {
        Fragment fragment = this.A00;
        C25786Drz A002 = C63463hW.A00(fragment.getActivity(), this.A01);
        Bundle bundle = fragment.mArguments;
        AnonymousClass1cR r0 = new AnonymousClass1cR();
        r0.setArguments(bundle);
        C18220wO.A1A(r0, A002);
    }

    public C67083yq(Fragment fragment, C11630kW r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = r2;
    }
}
