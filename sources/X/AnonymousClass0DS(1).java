package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0DS  reason: invalid class name */
public abstract class AnonymousClass0DS extends BroadcastReceiver implements C16200se {
    public C16980u6 A00;

    public abstract Object A00(String str);

    public final String A01(Context context) {
        return AnonymousClass00U.A0N(context.getPackageName(), getClass().getName(), '/');
    }

    public void onReceive(Context context, Intent intent) {
        C16980u6 r1;
        int A01 = C14030oh.A01(-1791394330);
        String action = intent.getAction();
        boolean z = false;
        if (action != null) {
            if (!(!C16100sU.A00().A01(context, intent, A00(action)) || (r1 = this.A00) == null || r1.A09(context, intent, (String) null) == null)) {
                z = true;
            }
        }
        AnonymousClass0EH r3 = C16260sk.A00;
        String A012 = A01(context);
        if (z) {
            r3.A00(intent, A012, (String) null, "allow");
            C14030oh.A0E(1434617652, A01, intent);
            return;
        }
        r3.A00(intent, A012, (String) null, "deny");
        SecurityException securityException = new SecurityException("The received intent failed one or more security checks, so no further action is allowed.");
        C14030oh.A0E(2092530903, A01, intent);
        throw securityException;
    }
}
