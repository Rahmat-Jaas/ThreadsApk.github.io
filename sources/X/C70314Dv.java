package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDCallbackShape633S0100000_1_I2;
import com.facebook.redex.IDxDListenerShape320S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Dv  reason: invalid class name and case insensitive filesystem */
public final class C70314Dv implements C83634rj {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ C23171cc A01;

    public final void CGo(C82674q5 r3) {
        r3.Cek(new IDxDCallbackShape633S0100000_1_I2(this, 1));
    }

    public C70314Dv(C11630kW r1, C23171cc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BrI(boolean z, String str) {
        C23171cc r1 = this.A01;
        C11630kW r4 = this.A00;
        FragmentActivity activity = r1.getActivity();
        UserSession userSession = r1.A03;
        C13950oZ.A00(C49022qi.A00(activity, new IDxDListenerShape320S0100000_1_I2(r1, 3), r4, userSession, AnonymousClass006.A1C, AnonymousClass0wJ.A0Y(userSession).BK7(), r1.A03.getUserId()));
    }
}
