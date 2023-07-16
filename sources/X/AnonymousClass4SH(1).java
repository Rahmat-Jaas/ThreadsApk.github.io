package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.4SH  reason: invalid class name */
public final class AnonymousClass4SH implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;

    public AnonymousClass4SH(UserSession userSession, Context context, View view) {
        this.A00 = context;
        this.A01 = view;
        this.A02 = userSession;
    }

    public final void run() {
        C25553Dnn A002 = AnonymousClass4DS.A00((Activity) this.A00, 2131824173);
        C18230wP.A15(this.A01, A002);
        A002.A0A = false;
        A002.A0B = false;
        AnonymousClass4DQ.A01(A002, this.A02, 1);
    }
}
