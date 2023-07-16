package X;

import android.content.Context;
import android.os.Build;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0J4  reason: invalid class name */
public final class AnonymousClass0J4 {
    public static final List A00 = new CopyOnWriteArrayList();
    public static final Set A01 = new HashSet();
    public static final Map A02 = new HashMap();

    public static void A00() {
        if (A02.isEmpty()) {
            A04(new AnonymousClass09V());
            if (Build.VERSION.SDK_INT >= 29) {
                A04(new C020009h());
            }
            A04(new AnonymousClass0CX());
            A04(new C020609p());
            A04(new C02470Bm());
            A04(new AnonymousClass0J8("connectivity", "mService", "android.net.IConnectivityManager"));
            A04(new AnonymousClass0J8("alarm", "mService", "android.app.IAlarmManager"));
            A04(new AnonymousClass0J8("power", "mService", "android.os.IPowerManager"));
            A04(new AnonymousClass0J8("location", "mService", "android.location.ILocationManager"));
            A04(new AnonymousClass0J8(NetInfoModule.CONNECTION_TYPE_WIFI, "mService", "android.net.wifi.IWifiManager"));
            A04(new AnonymousClass0J8("accessibility", "mService", "android.view.accessibility.IAccessibilityManager"));
            A04(new AnonymousClass0J8("storage", "mStorageManager", "android.os.storage.IStorageManager"));
            A04(new AnonymousClass0J8("storagestats", "mService", "android.app.usage.IStorageStatsManager"));
            A04(new AnonymousClass0J8("account", "mService", "android.accounts.IAccountManager"));
            A04(new AnonymousClass0J8("clipboard", "mService", "android.content.IClipboard"));
            A04(new AnonymousClass0J8("notification", "sService", "android.app.INotificationManager", "getService"));
            A04(new AnonymousClass0J8(MediaStreamTrack.AUDIO_TRACK_KIND, "sService", "android.media.IAudioService", "getService"));
            A04(new AnonymousClass0J8("appops", "mService", "com.android.internal.app.IAppOpsService"));
            A04(new AnonymousClass0J8("batterymanager", "mBatteryStats", "com.android.internal.app.IBatteryStats"));
            A04(new AnonymousClass0J8("jobscheduler", "mBinder", "android.app.job.IJobScheduler"));
            A04(new AnonymousClass0J8("user", "mService", "android.os.IUserManager"));
        }
    }

    public static void A03(AnonymousClass0J5 r2) {
        List list = A00;
        if (!list.contains(r2)) {
            list.add(r2);
        }
    }

    public static void A04(AnonymousClass0J8 r2) {
        A02.put(r2.A03, r2);
    }

    public static void A01(Context context) {
        A00();
        try {
            for (AnonymousClass0J8 r2 : A02.values()) {
                if (!A01.contains(r2.A03)) {
                    r2.A00(context, C03470In.A00());
                }
            }
        } catch (Error | Exception unused) {
        }
    }

    public static void A02(Context context, String str) {
        A00();
        try {
            Map map = A02;
            if (map.containsKey(str)) {
                AnonymousClass0J8 r2 = (AnonymousClass0J8) map.get(str);
                if (!A01.contains(r2.A03)) {
                    r2.A00(context, C03470In.A00());
                }
            }
        } catch (Error | Exception unused) {
        }
    }
}
