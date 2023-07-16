package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.4x2  reason: invalid class name */
public final class AnonymousClass4x2 extends BroadcastReceiver {
    public Context A00;
    public final C111506nn A01;

    public final synchronized void A00() {
        Context context = this.A00;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.A00 = null;
    }

    public AnonymousClass4x2(C111506nn r1) {
        this.A01 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int A012 = C14030oh.A01(-1153110321);
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.A01.A00();
            A00();
            i = -63624013;
        } else {
            i = -241227437;
        }
        C14030oh.A0E(i, A012, intent);
    }
}
