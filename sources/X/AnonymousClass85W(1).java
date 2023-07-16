package X;

import android.content.Context;
import com.facebook.redex.IDxProviderShape105S0000000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.85W  reason: invalid class name */
public final class AnonymousClass85W implements C04560Oe {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ Object get() {
        UserSession userSession = this.A01;
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "payflows";
        C13330nS A002 = r1.A00();
        AnonymousClass01V r12 = AnonymousClass01V.A0p;
        Context context = this.A00;
        IDxProviderShape105S0000000_2_I2 iDxProviderShape105S0000000_2_I2 = new IDxProviderShape105S0000000_2_I2(0);
        IDxProviderShape105S0000000_2_I2 iDxProviderShape105S0000000_2_I22 = new IDxProviderShape105S0000000_2_I2(1);
        C04220Ms.A06(r12);
        return new AnonymousClass7JJ(context, new C128957ke(A002, r12), new C128927kb(A002), userSession.getUserId(), iDxProviderShape105S0000000_2_I2, iDxProviderShape105S0000000_2_I22, AnonymousClass4UJ.A00(new AnonymousClass85T()));
    }

    public AnonymousClass85W(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
