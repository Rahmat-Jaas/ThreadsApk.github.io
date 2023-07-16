package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.7EE  reason: invalid class name */
public final class AnonymousClass7EE {
    public final Context A00;
    public final SharedPreferences A01;
    public final AnonymousClass7K1 A02;
    public final Map A03 = new C013306f();

    public final synchronized void A02() {
        this.A03.clear();
        Context context = this.A00;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        for (File file : noBackupFilesDir.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        java.lang.String.valueOf(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7EE(android.content.Context r4) {
        /*
            r3 = this;
            X.7K1 r1 = new X.7K1
            r1.<init>()
            java.lang.String r2 = "FirebaseInstanceId"
            r3.<init>()
            X.06f r0 = new X.06f
            r0.<init>()
            r3.A03 = r0
            r3.A00 = r4
            java.lang.String r0 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = X.C86164wN.A0C(r4, r0)
            r3.A01 = r0
            r3.A02 = r1
            java.io.File r1 = r4.getNoBackupFilesDir()
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.io.File r1 = X.C86154wM.A0U(r1, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r1.createNewFile()     // Catch:{ IOException -> 0x0054 }
            if (r0 == 0) goto L_0x0063
            r1 = r3
            monitor-enter(r1)     // Catch:{ IOException -> 0x0054 }
            android.content.SharedPreferences r0 = r3.A01     // Catch:{ all -> 0x0051 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0054 }
            if (r0 != 0) goto L_0x0063
            r3.A02()     // Catch:{ IOException -> 0x0054 }
            X.7Id r0 = X.C121787Id.A00()     // Catch:{ IOException -> 0x0054 }
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x0054 }
            r0.A06()     // Catch:{ IOException -> 0x0054 }
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0054 }
            throw r0     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r1.getMessage()
            java.lang.String.valueOf(r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EE.<init>(android.content.Context):void");
    }

    public static String A00(String str) {
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A("") + 3 + C86104wH.A0A(str));
        A0s.append("");
        A0s.append("|S|");
        return C18180wK.A0i(str, A0s);
    }

    public static String A01(String str, String str2) {
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A("") + 4 + C86104wH.A0A(str) + C86104wH.A0A(str2));
        A0s.append("");
        A0s.append("|T|");
        A0s.append(str);
        A0s.append("|");
        return C18180wK.A0i(str2, A0s);
    }
}
