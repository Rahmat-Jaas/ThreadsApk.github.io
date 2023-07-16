package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: X.0Sg  reason: invalid class name */
public interface AnonymousClass0Sg {
    List C0e(TelephonyManager telephonyManager);

    WifiInfo C0f(WifiManager wifiManager);

    Location C0i(LocationManager locationManager, String str);

    void CFm(LocationListener locationListener, LocationManager locationManager);

    void CGT(LocationListener locationListener, LocationManager locationManager, String str, float f, int i, long j);
}
