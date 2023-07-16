package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.0RC  reason: invalid class name */
public abstract class AnonymousClass0RC extends BroadcastReceiver implements C16200se {
    public AnonymousClass0ED A00 = AnonymousClass0ED.A00;
    public String A01;

    public final void onReceive(Context context, Intent intent) {
        C16210sf r5;
        int i;
        boolean A002;
        int A012 = C14030oh.A01(-1544703797);
        String str = this.A01;
        if (str == null) {
            str = String.format("%s/%s", new Object[]{context.getPackageName(), getClass().getName()});
            this.A01 = str;
        }
        if (str != null) {
            String action = intent.getAction();
            if (action == null) {
                Log.e("SecureBroadcastReceiver", "action is null for SecureBroadcastReceiver");
                i = -1553093352;
            } else {
                AnonymousClass0EF r0 = (AnonymousClass0EF) this;
                synchronized (this) {
                    r5 = (C16210sf) r0.A01.get(action);
                }
                if (r5 == null) {
                    synchronized (this) {
                    }
                    C16260sk.A00.A00(intent, str, (String) null, "deny");
                    Log.e("SecureBroadcastReceiver", AnonymousClass00U.A0d("Rejected the intent for the receiver because it was not registered: ", action, ":", "SecureBroadcastReceiver"));
                } else if (!C16100sU.A00().A01(context, intent, r5)) {
                    C16260sk.A00.A00(intent, str, (String) null, "deny");
                    i = -975594931;
                } else {
                    synchronized (this) {
                        A002 = this.A00.A00(context, intent, (C16240si) null, this);
                    }
                    if (A002) {
                        C16260sk.A00.A00(intent, str, (String) null, "allow");
                        r5.CEI(context, intent, this);
                    } else {
                        C16260sk.A00.A00(intent, str, (String) null, "deny");
                        i = 1800194351;
                    }
                }
                i = -1140512073;
            }
            C14030oh.A0E(i, A012, intent);
            return;
        }
        throw new NullPointerException("Object is null!");
    }
}
