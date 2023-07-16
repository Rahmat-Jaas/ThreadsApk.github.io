package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4T4  reason: invalid class name */
public final class AnonymousClass4T4 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ BKU A03;
    public final /* synthetic */ UserSession A04;

    public AnonymousClass4T4(Activity activity, Context context, C11630kW r3, BKU bku, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = bku;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        C25828Dsm A0W = C18190wL.A0W(this.A01);
        A0W.A0L(2131834783);
        A0W.A0K(2131834781);
        UserSession userSession = this.A04;
        BKU bku = this.A03;
        Activity activity = this.A00;
        A0W.A0P(C18250wR.A0E(activity, bku, userSession, 14), 2131834782);
        A0W.A0N(C18250wR.A0E(activity, this.A02, userSession, 15), 2131834780);
        A0W.A0O(C64153ji.A00, 2131826195);
        AnonymousClass0wJ.A1K(A0W);
    }
}
