package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.72t  reason: invalid class name and case insensitive filesystem */
public final class C1189072t {
    public static final boolean A00 = C86114wI.A1U(Build.VERSION.SDK_INT, 31);

    public static void A00(Context context) {
        if (!A00 && C18210wN.A1S(36315121013754230L)) {
            if (!C02710Cn.A00) {
                C02710Cn.A00 = true;
                HandlerThread handlerThread = new HandlerThread("SystemConfigReader", 10);
                C13820oM.A00(handlerThread);
                handlerThread.start();
                new Handler(handlerThread.getLooper()).postDelayed(new C02700Cm(context, handlerThread), 180000);
            }
            C126137ee.A01 = true;
        }
    }
}
