package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.0AS  reason: invalid class name */
public final class AnonymousClass0AS {
    public final Context A00;
    public final String A01;

    public final void A00(AnonymousClass0KD r5) {
        String str;
        AnonymousClass0KD.A00(r5, this.A01, "tier");
        AnonymousClass0KD.A00(r5, Double.valueOf(((double) System.currentTimeMillis()) / 1000.0d), "sent_time");
        Context context = this.A00;
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            networkOperatorName = "n/a";
        }
        AnonymousClass0KD.A00(r5, networkOperatorName, "carrier");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            str = activeNetworkInfo.getTypeName();
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        AnonymousClass0KD.A00(r5, str, "conn");
    }

    public AnonymousClass0AS(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }
}
