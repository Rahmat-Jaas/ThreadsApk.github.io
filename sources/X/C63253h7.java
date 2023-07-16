package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.3h7  reason: invalid class name and case insensitive filesystem */
public final class C63253h7 {
    public static String A00;
    public static String A01;

    public static synchronized long A00(String str) {
        long j;
        Class<C63253h7> cls = C63253h7.class;
        synchronized (cls) {
            try {
                File file = new File(str, AnonymousClass00U.A0L(Environment.DIRECTORY_DCIM, "/Camera"));
                A01 = file.getAbsolutePath();
                file.mkdirs();
                if (!file.isDirectory() || !file.canWrite()) {
                    j = -1;
                } else {
                    StatFs statFs = new StatFs(str);
                    j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
                }
            } catch (Exception e) {
                AnonymousClass0LU.A06(cls, "Failed to access external storage %s", e, str);
                j = -3;
            }
        }
        return j;
    }

    public static synchronized String A01() {
        String str;
        synchronized (C63253h7.class) {
            str = A00;
        }
        return str;
    }

    public static synchronized String A02(Context context, boolean z) {
        String str;
        synchronized (C63253h7.class) {
            if (z) {
                if (Build.VERSION.SDK_INT >= 33 || C18180wK.A1W(context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
                    if (A01 == null) {
                        A04();
                    }
                    str = A01;
                }
            }
            str = A00;
        }
        return str;
    }

    public static synchronized void A04() {
        synchronized (C63253h7.class) {
            synchronized (C14620pq.class) {
            }
            String path = Environment.getExternalStorageDirectory().getPath();
            long j = -1;
            if ("mounted".equals(Environment.getExternalStorageState())) {
                j = A00(path);
                if (j > 50000000) {
                }
            }
            String str = System.getenv("SECONDARY_STORAGE");
            if (str != null) {
                String[] split = str.split(":");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str2 = split[i];
                    long A002 = A00(str2);
                    if (A002 > 50000000) {
                        break;
                    }
                    if (A002 > j) {
                        path = str2;
                        j = A002;
                    }
                    i++;
                }
            }
            A01 = new File(path, AnonymousClass00U.A0L(Environment.DIRECTORY_DCIM, "/Camera")).getAbsolutePath();
        }
    }

    public static String A03(UserSession userSession, String str) {
        if (C28161tl.A04(userSession).getBoolean("save_original_photos", true)) {
            return AnonymousClass00U.A0L(str, ".jpg");
        }
        return "temp.jpg";
    }
}
