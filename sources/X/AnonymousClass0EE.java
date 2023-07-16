package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* renamed from: X.0EE  reason: invalid class name */
public abstract class AnonymousClass0EE extends AnonymousClass0DS {
    public final Object A00(String str) {
        return this;
    }

    public abstract void A02(Context context, Intent intent, C16200se r3);

    public final void onReceive(Context context, Intent intent) {
        int i;
        ActivityInfo activityInfo;
        IntentFilter intentFilter;
        int A01 = C14030oh.A01(-619043177);
        try {
            super.onReceive(context, intent);
            if (intent.getComponent() != null) {
                String action = intent.getAction();
                action.getClass();
                PackageManager packageManager = context.getPackageManager();
                Intent intent2 = new Intent(action);
                try {
                    packageManager.getClass();
                    loop0:
                    for (ResolveInfo next : packageManager.queryBroadcastReceivers(intent2, 64)) {
                        if (!(next == null || (activityInfo = next.activityInfo) == null || !activityInfo.packageName.equals(context.getPackageName()) || !next.activityInfo.name.equals(intent.getComponent().getClassName()) || (intentFilter = next.filter) == null)) {
                            int countActions = intentFilter.countActions();
                            int i2 = 0;
                            while (i2 < countActions) {
                                String action2 = intentFilter.getAction(i2);
                                if (action2 == null || action2.compareTo(action) != 0) {
                                    i2++;
                                }
                            }
                            continue;
                        }
                    }
                } catch (RuntimeException unused) {
                }
                C16260sk.A00.A00(intent, A01(context), (String) null, "deny");
                i = 2038865751;
                C14030oh.A0E(i, A01, intent);
            }
            A02(context, intent, this);
            C16260sk.A00.A00(intent, A01(context), (String) null, "allow");
            i = 1464439651;
            break loop0;
        } catch (SecurityException e) {
            C16260sk.A00.A00(intent, A01(context), (String) null, "deny");
            i = 17134509;
            if (e instanceof C15630rd) {
                C14030oh.A0E(-1462407272, A01, intent);
                throw e;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
