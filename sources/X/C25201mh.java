package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1mh  reason: invalid class name and case insensitive filesystem */
public final class C25201mh extends AnonymousClass0gG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1hW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void run() {
        AnonymousClass1hW r0 = this.A01;
        Context context = r0.A01;
        UserSession userSession = r0.A03;
        String str = this.A03;
        String str2 = this.A02;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("session/flush_session/");
        A0N.A0O(AnonymousClass3QB.A00(0, 9, 122), C18220wO.A0g(context, A0N, "user_id", str));
        C18180wK.A0t(context, A0N, "session_flush_nonce", str2);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C85814vo.class, AnonymousClass3Za.class);
        C63873iU.A0E(A0T, this, 75);
        A0T.run();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25201mh(AnonymousClass1hW r2, String str, String str2, int i) {
        super(1929956249);
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
