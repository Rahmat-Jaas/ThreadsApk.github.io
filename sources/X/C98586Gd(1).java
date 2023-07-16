package X;

import android.os.StrictMode;
import java.util.UUID;

/* renamed from: X.6Gd  reason: invalid class name and case insensitive filesystem */
public final class C98586Gd {
    public static final UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            C04220Ms.A06(randomUUID);
            return randomUUID;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
