package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.0l7  reason: invalid class name and case insensitive filesystem */
public final class C11980l7 implements AnonymousClass0W9 {
    public static final Map A01;
    public ConnectivityManager A00;

    public final String AHL() {
        return "network_connectivity";
    }

    public final long BgD() {
        return 16777216;
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(4, "vpn");
        builder.put(2, NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
        builder.put(0, NetInfoModule.CONNECTION_TYPE_CELLULAR);
        builder.put(3, NetInfoModule.CONNECTION_TYPE_ETHERNET);
        builder.put(1, NetInfoModule.CONNECTION_TYPE_WIFI);
        builder.put(5, "wifi_aware");
        builder.put(6, "lowpan");
        builder.put(8, "usb");
        A01 = builder.build();
    }

    public C11980l7(Context context) {
        this.A00 = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void CCC(C05800Wc r7) {
        ConnectivityManager connectivityManager;
        String str;
        if (r7.BWA(16777216) && (connectivityManager = this.A00) != null) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            if (restrictBackgroundStatus == 1) {
                str = "disabled";
            } else if (restrictBackgroundStatus == 2) {
                str = "whitelisted";
            } else if (restrictBackgroundStatus != 3) {
                str = "unknown";
            } else {
                str = "enabled";
            }
            r7.AvU().A03("restrict_background_status", str);
            String str2 = null;
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : A01.entrySet()) {
                        if (networkCapabilities.hasTransport(((Integer) entry.getKey()).intValue())) {
                            arrayList.add((String) entry.getValue());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        str2 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
                        if (str2 != null) {
                            r7.AvU().A03("network_capabilities", str2);
                        }
                    }
                }
            } catch (RuntimeException | SecurityException unused) {
            }
        }
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36319317196936282L));
    }
}
