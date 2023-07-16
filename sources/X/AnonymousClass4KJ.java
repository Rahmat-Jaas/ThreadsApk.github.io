package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4KJ  reason: invalid class name */
public final class AnonymousClass4KJ implements C04860Pl {
    public static final String A00 = C18190wL.A0n(AnonymousClass4KJ.class);

    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r4, AnonymousClass0PT r5) {
        AnonymousClass4KN r52 = (AnonymousClass4KN) r5;
        AnonymousClass0wJ.A1M(userSession, 0, r4);
        if (r52 != null) {
            String str = C61793Vp.A00(userSession).A04;
            if (!AnonymousClass0hA.A08(str)) {
                r52.A00 = str;
            }
        } else {
            C10450iM.A03(A00, "payload is null when making the api callback wrapper");
        }
        r4.ADn(r52);
    }
}
