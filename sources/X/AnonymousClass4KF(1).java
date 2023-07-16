package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4KF  reason: invalid class name */
public final class AnonymousClass4KF implements C04860Pl {
    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r8, AnonymousClass0PT r9) {
        AnonymousClass4KR r92 = (AnonymousClass4KR) r9;
        AnonymousClass0PF r5 = new AnonymousClass0PF(r92.A02, r8);
        Context context = r92.A00;
        AnonymousClass06E r3 = r92.A01;
        String str = r92.A03;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0O("enc_new_password", C62663aU.A00(A0N, userSession, str));
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
        A0S.A00 = r5;
        C31155GhB.A01(context, r3, A0S);
    }
}
