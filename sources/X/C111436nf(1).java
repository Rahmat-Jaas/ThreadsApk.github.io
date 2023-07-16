package X;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.6nf  reason: invalid class name and case insensitive filesystem */
public final class C111436nf {
    public final String A00(Context context, GoogleSignInAccount googleSignInAccount) {
        Account account;
        Account account2;
        String str = googleSignInAccount.A04;
        if (str == null) {
            account = null;
        } else {
            account = new Account(str, "com.google");
        }
        AnonymousClass7K9.A06(context, AnonymousClass7K9.A03(account, context, "oauth2:https://www.googleapis.com/auth/drive.appdata"));
        if (str == null) {
            account2 = null;
        } else {
            account2 = new Account(str, "com.google");
        }
        return AnonymousClass7K9.A03(account2, context, "oauth2:https://www.googleapis.com/auth/drive.appdata");
    }
}
