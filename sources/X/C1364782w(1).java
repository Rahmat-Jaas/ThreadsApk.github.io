package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape28S0400000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.82w  reason: invalid class name and case insensitive filesystem */
public final class C1364782w implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass066 A01;
    public final /* synthetic */ AnonymousClass56V A02;
    public final /* synthetic */ UserSession A03;

    public C1364782w(FragmentActivity fragmentActivity, AnonymousClass066 r2, AnonymousClass56V r3, UserSession userSession) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
    }

    public final void run() {
        AnonymousClass56V r6 = this.A02;
        M5J m5j = r6.A02;
        AnonymousClass066 r3 = this.A01;
        m5j.A0C(r3, new IDxObserverShape28S0400000_2_I2(4, r3, this.A03, this.A00, r6));
    }
}
