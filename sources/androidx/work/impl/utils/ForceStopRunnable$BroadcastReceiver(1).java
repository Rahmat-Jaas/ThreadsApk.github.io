package androidx.work.impl.utils;

import X.AnonymousClass000;
import X.C14030oh;
import X.M2O;
import X.MRN;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        M2O.A01("ForceStopRunnable$Rcvr");
    }

    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(10042950);
        if (intent != null) {
            if (AnonymousClass000.A00(239).equals(intent.getAction())) {
                M2O.A00();
                MRN.A00(context);
            }
        }
        C14030oh.A0E(-1794513049, A01, intent);
    }
}
