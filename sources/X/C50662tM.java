package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2tM  reason: invalid class name and case insensitive filesystem */
public final class C50662tM {
    public static final List A00(Context context) {
        C04220Ms.A0B(context, 0);
        Account[] accounts = AccountManager.get(context).getAccounts();
        C04220Ms.A06(accounts);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Account account : accounts) {
            if (account.name != null && AnonymousClass0hA.A09(account.name) && !A0v.contains(account.name)) {
                boolean equalsIgnoreCase = "com.google".equalsIgnoreCase(account.type);
                String str = account.name;
                if (equalsIgnoreCase) {
                    C04220Ms.A05(str);
                    A0v.add(0, str);
                } else {
                    C04220Ms.A05(str);
                    A0v.add(str);
                }
            }
        }
        return A0v;
    }
}
