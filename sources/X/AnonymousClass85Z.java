package X;

import android.content.Context;
import com.facebook.redex.IDxProviderShape105S0000000_2_I2;
import com.facebook.redex.IDxProviderShape63S0300000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.85Z  reason: invalid class name */
public final class AnonymousClass85Z implements C04560Oe {
    public Context A00;
    public UserSession A01;
    public C04560Oe A02;

    public final /* bridge */ /* synthetic */ Object get() {
        Context context = this.A00;
        IDxProviderShape105S0000000_2_I2 iDxProviderShape105S0000000_2_I2 = new IDxProviderShape105S0000000_2_I2(8);
        UserSession userSession = this.A01;
        return new C121817Ig(context, userSession, new IDxProviderShape63S0300000_2_I2(context, userSession, iDxProviderShape105S0000000_2_I2, 2), this.A02);
    }

    public AnonymousClass85Z(Context context, UserSession userSession, C04560Oe r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = userSession;
    }
}
