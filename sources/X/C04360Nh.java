package X;

import android.app.Application;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Nh  reason: invalid class name and case insensitive filesystem */
public final class C04360Nh {
    public static final Map A05 = new HashMap();
    public int A00;
    public int A01;
    public File A02;
    public Object A03 = new Object();
    public String A04;

    public static synchronized C04360Nh A00(String str) {
        C04360Nh r0;
        synchronized (C04360Nh.class) {
            Map map = A05;
            r0 = (C04360Nh) map.get(str);
            if (r0 == null) {
                r0 = new C04360Nh(str);
                map.put(str, r0);
            }
        }
        return r0;
    }

    public final void A01() {
        synchronized (this.A03) {
            AnonymousClass0LU.A0C("lacrima", "FixedLengthFiles.forceDeleteAllFiles");
            File[] listFiles = this.A02.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r10 = this;
            java.io.File r0 = r10.A02
            r0.mkdirs()
            java.io.File r0 = r10.A02
            java.io.File[] r0 = r0.listFiles()
            int r1 = r10.A00
            long r4 = (long) r1
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length
            int r1 = r1 - r0
            long r4 = (long) r1
        L_0x0013:
            long r2 = X.AnonymousClass0N9.A00()
            int r0 = r10.A01
            long r0 = (long) r0
            long r2 = r2 / r0
            long r8 = java.lang.Math.min(r2, r4)
            r7 = 0
        L_0x0020:
            long r1 = (long) r7
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            java.io.File r2 = r10.A02     // Catch:{ IOException -> 0x0064 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x0064 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = "_prop.txt"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException -> 0x0064 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0064 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0064 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0064 }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x0064 }
            r2 = 0
        L_0x0043:
            int r0 = r10.A01     // Catch:{ all -> 0x005f }
            long r4 = (long) r0     // Catch:{ all -> 0x005f }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            r6.seek(r2)     // Catch:{ all -> 0x005f }
            r0 = 32
            r6.writeByte(r0)     // Catch:{ all -> 0x005f }
            r0 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 + r0
            goto L_0x0043
        L_0x0056:
            r6.setLength(r4)     // Catch:{ all -> 0x005f }
            r6.close()     // Catch:{ IOException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x0020
        L_0x005f:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Initialization failed."
            X.AnonymousClass0LU.A0G(r1, r0, r2)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Nh.A02():void");
    }

    public final void A03(Application application, int i, int i2) {
        synchronized (this.A03) {
            if (this.A02 != null) {
                AnonymousClass0LU.A0C("lacrima", "FixedLengthFiles.init() called twice.");
            } else {
                this.A00 = i;
                this.A01 = i2;
                this.A02 = application.getDir(AnonymousClass00U.A0L("file_pool", this.A04), 0);
            }
        }
    }

    public C04360Nh(String str) {
        this.A04 = str;
    }
}
