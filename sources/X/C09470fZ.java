package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.HashSet;

/* renamed from: X.0fZ  reason: invalid class name and case insensitive filesystem */
public final class C09470fZ {
    public static C09470fZ A06;
    public static boolean A07;
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public NetworkCapabilities A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final HashSet A05 = new HashSet();

    public C09470fZ(Context context) {
        this.A04 = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
