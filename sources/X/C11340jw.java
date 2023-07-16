package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* renamed from: X.0jw  reason: invalid class name and case insensitive filesystem */
public abstract class C11340jw extends BroadcastReceiver {
    public static final SparseArray A00 = new SparseArray();

    public static void A00(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray = A00;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    C13750oF.A02(wakeLock);
                    sparseArray.remove(intExtra);
                } else {
                    AnonymousClass0LU.A0O("WakefulBroadcastReceiver", "No active wake lock id #%s", Integer.valueOf(intExtra));
                }
            }
        }
    }
}
