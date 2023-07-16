package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.01g  reason: invalid class name and case insensitive filesystem */
public final class C002701g extends C007803j {
    public C002701g(Context context, File file, String str) {
        super(context, file, str, "^lib/([^/]+)/([^/]+\\.so)$");
    }

    public final C14910qO A09(byte b) {
        return new AnonymousClass0EB(this, this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:4|5)|6|7|(1:9)(2:10|(1:12)(1:13))|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[Catch:{ all -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A0A() {
        /*
            r6 = this;
            java.io.File r0 = r6.A00
            java.io.File r1 = r0.getCanonicalFile()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r5 = 2
            r3.writeByte(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0073 }
            r3.writeString(r0)     // Catch:{ all -> 0x0073 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0073 }
            r3.writeLong(r0)     // Catch:{ all -> 0x0073 }
            android.content.Context r4 = r6.A03     // Catch:{ all -> 0x0073 }
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ all -> 0x0073 }
            r1 = 0
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = r4.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x002f }
        L_0x002f:
            r3.writeInt(r1)     // Catch:{ all -> 0x0073 }
            r2 = 1
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r0.nativeLibraryDir     // Catch:{ all -> 0x0073 }
            if (r1 != 0) goto L_0x0043
            r3.writeByte(r2)     // Catch:{ all -> 0x0073 }
            byte[] r0 = r3.marshall()     // Catch:{ all -> 0x0073 }
            goto L_0x006f
        L_0x0043:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0073 }
            r0.<init>(r1)     // Catch:{ all -> 0x0073 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0073 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x005a
            r3.writeByte(r2)     // Catch:{ all -> 0x0073 }
            byte[] r0 = r3.marshall()     // Catch:{ all -> 0x0073 }
            goto L_0x006f
        L_0x005a:
            r3.writeByte(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x0073 }
            r3.writeString(r0)     // Catch:{ all -> 0x0073 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x0073 }
            r3.writeLong(r0)     // Catch:{ all -> 0x0073 }
            byte[] r0 = r3.marshall()     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r3.recycle()
            return r0
        L_0x0073:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002701g.A0A():byte[]");
    }
}
