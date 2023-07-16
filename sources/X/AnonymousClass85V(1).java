package X;

import android.content.Context;
import com.facebook.redex.IDxProviderShape105S0000000_2_I2;
import com.facebook.redex.IDxProviderShape245S0100000_2_I2;
import com.facebook.redex.IDxProviderShape63S0300000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.85V  reason: invalid class name */
public final class AnonymousClass85V implements C04560Oe {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ Object get() {
        UserSession userSession = this.A01;
        C128917ka r5 = new C128917ka(C13330nS.A00(C130517qD.A00, C10690il.A06, userSession), AnonymousClass286.IG_ANDROID);
        AnonymousClass01V r4 = AnonymousClass01V.A0p;
        C04220Ms.A06(r4);
        return new C115366uw(r4, r5, new IDxProviderShape63S0300000_2_I2(this.A00, userSession, C1369785h.A00, 0), C1369485e.A00, C1369685g.A00, new IDxProviderShape245S0100000_2_I2((Object) userSession, 9), new IDxProviderShape105S0000000_2_I2(2), new IDxProviderShape245S0100000_2_I2((Object) userSession, 8));
    }

    public AnonymousClass85V(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
