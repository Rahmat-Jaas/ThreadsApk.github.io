package X;

import android.content.Context;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Fj  reason: invalid class name */
public final class AnonymousClass3Fj {
    public final Context A00;
    public final UserSession A01;
    public final C561636a A02;
    public final C63873iU A03 = C63873iU.A06(this, 180);

    public AnonymousClass3Fj(Context context, C11630kW r3, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = new C561636a(r3, userSession);
    }

    public final void A00() {
        long A07 = C18190wL.A07();
        UserSession userSession = this.A01;
        Boolean A0Y = C18180wK.A0Y();
        Long valueOf = Long.valueOf((C63803iN.A03(AnonymousClass0TJ.A06, userSession, 36602291117100864L) * SandboxRepository.CACHE_TTL) + A07);
        Long valueOf2 = Long.valueOf(A07);
        C63873iU r4 = this.A03;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("users/set_limited_interactions_settings/");
        A0N.A0B(C21931Ss.class, C60533Pm.class);
        A0N.A0M("is_enabled", A0Y);
        A0N.A0M("non_followers", (Boolean) null);
        A0N.A0M("new_followers", (Boolean) null);
        if (valueOf != null) {
            A0N.A0K("reminder_date", valueOf.intValue());
        }
        if (valueOf2 != null) {
            A0N.A0K("start_date", valueOf2.intValue());
        }
        C32165H8c A022 = A0N.A02();
        A022.A00 = r4;
        C31155GhB.A03(A022);
    }
}
