package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.3j0  reason: invalid class name */
public final class AnonymousClass3j0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass378 A00;
    public final /* synthetic */ AnonymousClass1cB A01;

    public AnonymousClass3j0(AnonymousClass378 r1, AnonymousClass1cB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C58163Ei.A01.A00();
        AnonymousClass1cB r4 = this.A01;
        UserSession userSession = r4.A03;
        String A012 = this.A00.A01.A01();
        String userId = userSession.getUserId();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("child_user_id_key", A012);
        A0E.putString("main_user_id_key", userId);
        AnonymousClass1QY r2 = new AnonymousClass1QY();
        r2.setArguments(A0E);
        C25786Drz A0Q = C18180wK.A0Q(r4.getActivity(), r4.A03);
        A0Q.A09 = getClass().getCanonicalName();
        A0Q.A03 = r2;
        A0Q.A0C(r4, 0);
        A0Q.A05();
    }
}
