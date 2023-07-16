package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.82Z  reason: invalid class name */
public final class AnonymousClass82Z implements Runnable {
    public final /* synthetic */ C880856r A00;
    public final /* synthetic */ C104946cd A01;
    public final /* synthetic */ C125627dd A02;

    public AnonymousClass82Z(C880856r r1, C104946cd r2, C125627dd r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String A012;
        AnonymousClass7Kx A0B;
        C125627dd r5 = this.A02;
        UserSession userSession = r5.A01.A00;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r4, userSession, 36310418024693815L)) {
            Context context = r5.A00;
            if (!AnonymousClass3JM.A00(context, "com.facebook.wakizashi") && !AnonymousClass3JM.A00(context, "com.facebook.orca")) {
                A0B = AnonymousClass7Kx.A0B((Object) null, C18190wL.A0a("FB and ORCA apps are not installed"));
                this.A00.A0G(A0B);
            }
        }
        UserSession userSession2 = r5.A02;
        if (C63803iN.A0E(r4, userSession2, 36323539149660051L)) {
            A012 = C35692Ol.A00(userSession2).A03(C125627dd.A04, "ig_android_linking_fbpay_sso");
        } else {
            A012 = C62963bD.A01(C125627dd.A04, userSession2, "ig_sso_provider_ig4a");
        }
        if (A012 != null) {
            A0B = AnonymousClass7Kx.A0A(new C104936cc(A012));
            AnonymousClass7Kz.A07().A07.Bb8("sso_access_token_generation_success", this.A01.A00);
        } else {
            A0B = AnonymousClass7Kx.A0B((Object) null, C18190wL.A0a("FB access token is null"));
        }
        this.A00.A0G(A0B);
    }
}
