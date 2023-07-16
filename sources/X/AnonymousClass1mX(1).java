package X;

import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: X.1mX  reason: invalid class name */
public final class AnonymousClass1mX extends AnonymousClass0gG {
    public final /* synthetic */ C63723iC A00;
    public final /* synthetic */ Integer A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mX(C63723iC r2, Integer num) {
        super(702);
        this.A00 = r2;
        this.A01 = num;
    }

    public final void run() {
        AnonymousClass7M8 r1;
        C63723iC r3 = this.A00;
        AnonymousClass38Y r2 = r3.A07;
        String userId = r3.A08.getUserId();
        synchronized (r2) {
            r1 = r2.A00;
            if (r1 == null) {
                r1 = AnonymousClass3SL.A00(r2.A01.getApplicationContext(), "onetap_prefs");
                r2.A00 = r1;
            }
        }
        SharedPreferences.Editor edit = r1.edit();
        try {
            String string = r1.getString(userId, (String) null);
            if (string != null && C50472t3.parseFromJson(C18180wK.A0L(string)).A01 == AnonymousClass23T.FACEBOOK) {
                edit.remove("AccountCachingHelper.FACEBOOK_USER_ID");
            }
        } catch (IOException e) {
            C10450iM.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
        }
        C18180wK.A0u(edit, userId);
        C63723iC.A04(r3, this.A01);
    }
}
