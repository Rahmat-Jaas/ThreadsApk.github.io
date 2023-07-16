package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1n7  reason: invalid class name */
public final class AnonymousClass1n7 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n7(C697249u r7) {
        super("maybeSendAuthDataToFoAs", 2022138370, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        C04220Ms.A0B(userSession, 0);
        SharedPreferences A01 = C08340dC.A01("access_library_shared_storage");
        if (System.currentTimeMillis() - C18180wK.A05(A01, "last_auth_token_send_timestamp") > C18210wN.A06()) {
            AnonymousClass0gN.A00().AKp(new C25191mg(new AnonymousClass3YQ(), userSession, "AuthDataSender", new AnonymousClass224[]{AnonymousClass224.A01, AnonymousClass224.A02}));
            AnonymousClass0wJ.A12(A01.edit(), "last_auth_token_send_timestamp", System.currentTimeMillis());
        }
    }
}
