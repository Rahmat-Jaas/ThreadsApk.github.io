package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X.4Tr  reason: invalid class name */
public final class AnonymousClass4Tr implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public AnonymousClass4Tr(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Account[] accountArr;
        Context context = this.A00;
        String str = this.A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (context.checkCallingOrSelfPermission("android.permission.GET_ACCOUNTS") == 0) {
            accountArr = AccountManager.get(context).getAccountsByType("com.google");
            C04220Ms.A06(accountArr);
        } else {
            accountArr = new Account[0];
        }
        for (Account account : accountArr) {
            String str2 = null;
            try {
                String A0L = AnonymousClass00U.A0L("audience:server:client_id:", str);
                AnonymousClass7K9.A06(context, AnonymousClass7K9.A03(account, context, A0L));
                str2 = AnonymousClass7K9.A03(account, context, A0L);
            } catch (Exception unused) {
            }
            String str3 = account.name;
            C04220Ms.A05(str3);
            if (str2 == null) {
                str2 = "";
            }
            A0y.put(str3, str2);
        }
        return A0y;
    }
}
