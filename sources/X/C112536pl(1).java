package X;

import android.content.Context;
import com.instagram.common.task.IDxCallbackShape129S0100000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6pl  reason: invalid class name and case insensitive filesystem */
public final class C112536pl {
    public final Context A00;
    public final C145598kl A01;
    public final UserSession A02;

    public C112536pl(Context context, C145598kl r2, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void A00(String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(str, str2);
        H8a h8a = new H8a(new C32993HdZ(this, str, str2, str3), (int) System.nanoTime());
        h8a.A00 = new IDxCallbackShape129S0100000_2_I2(this, 5);
        C31155GhB.A03(h8a);
    }
}
