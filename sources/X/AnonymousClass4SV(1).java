package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.4SV  reason: invalid class name */
public final class AnonymousClass4SV implements Runnable {
    public final /* synthetic */ C26601qu A00;
    public final /* synthetic */ AnonymousClass1iQ A01;
    public final /* synthetic */ UserSession A02;

    public AnonymousClass4SV(C26601qu r1, AnonymousClass1iQ r2, UserSession userSession) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = r1;
    }

    public final void run() {
        C63463hW.A03();
        UserSession userSession = this.A02;
        C26601qu r0 = this.A00;
        String str = r0.A00;
        String str2 = r0.A01;
        AnonymousClass1iQ r3 = this.A01;
        Uri uri = r3.A05;
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("argument_token", str);
        A0E.putString("argument_source", str2);
        A0E.putParcelable("argument_redirect_uri", uri);
        C23171cc r2 = new C23171cc();
        r2.setArguments(A0E);
        AnonymousClass0wJ.A19(r2, r3.A00, r3.A03);
    }
}
