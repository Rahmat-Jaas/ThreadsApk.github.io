package X;

import android.os.Environment;
import java.io.File;

/* renamed from: X.0pq  reason: invalid class name and case insensitive filesystem */
public final class C14620pq {
    public static File A00(String str) {
        synchronized (C14620pq.class) {
        }
        if (str == null) {
            return Environment.getExternalStorageDirectory();
        }
        return Environment.getExternalStoragePublicDirectory(str);
    }
}
