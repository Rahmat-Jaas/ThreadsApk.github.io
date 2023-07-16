package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.4x0  reason: invalid class name */
public final class AnonymousClass4x0 extends BroadcastReceiver {
    public C1364482t A00;

    public AnonymousClass4x0(C1364482t r1) {
        this.A00 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        NetworkInfo activeNetworkInfo;
        int A01 = C14030oh.A01(-98332995);
        C1364482t r0 = this.A00;
        if (r0 == null) {
            i = -767938924;
        } else {
            C121787Id r02 = r0.A00.A02;
            C121787Id.A01(r02);
            ConnectivityManager connectivityManager = (ConnectivityManager) r02.A00.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                i = -446118876;
            } else {
                Log.isLoggable("FirebaseInstanceId", 3);
                FirebaseInstanceId.A04(this.A00, 0);
                C121787Id r03 = this.A00.A00.A02;
                C121787Id.A01(r03);
                r03.A00.unregisterReceiver(this);
                this.A00 = null;
                i = -400368065;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
