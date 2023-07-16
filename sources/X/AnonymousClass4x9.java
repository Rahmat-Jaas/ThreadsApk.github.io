package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4x9  reason: invalid class name */
public final class AnonymousClass4x9 extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final boolean A03;
    public final AnonymousClass7A7 A04;
    public final C104256bU A05;
    public final AnonymousClass76C A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4x9(android.content.Context r9, X.AnonymousClass7A7 r10, X.C104256bU r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            int r6 = r10.A00
            X.7M9 r7 = new X.7M9
            r7.<init>(r10, r11)
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A05 = r11
            r8.A04 = r10
            r8.A03 = r13
            if (r12 != 0) goto L_0x0020
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = X.C18190wL.A0n(r0)
        L_0x0020:
            java.io.File r1 = r9.getCacheDir()
            X.76C r0 = new X.76C
            r0.<init>(r1, r4)
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4x9.<init>(android.content.Context, X.7A7, X.6bU, java.lang.String, boolean):void");
    }

    public final K01 A01(SQLiteDatabase sQLiteDatabase) {
        C104256bU r2 = this.A05;
        C04220Ms.A0B(r2, 0);
        K01 k01 = r2.A00;
        if (k01 != null && C04220Ms.A0I(k01.A00, sQLiteDatabase)) {
            return k01;
        }
        K01 k012 = new K01(sQLiteDatabase);
        r2.A00 = k012;
        return k012;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C04220Ms.A0B(sQLiteDatabase, 0);
        if (!this.A01 && this.A04.A00 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            this.A04.A02(A01(sQLiteDatabase));
        } catch (Throwable th) {
            throw new AnonymousClass88Y(AnonymousClass006.A00, th);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C04220Ms.A0B(sQLiteDatabase, 0);
        try {
            this.A04.A04(A01(sQLiteDatabase));
        } catch (Throwable th) {
            throw new AnonymousClass88Y(AnonymousClass006.A01, th);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C04220Ms.A0B(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            this.A04.A05(A01(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass88Y(AnonymousClass006.A0N, th);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C04220Ms.A0B(sQLiteDatabase, 0);
        if (!this.A01) {
            try {
                this.A04.A03(A01(sQLiteDatabase));
            } catch (Throwable th) {
                throw new AnonymousClass88Y(AnonymousClass006.A0Y, th);
            }
        }
        this.A00 = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C04220Ms.A0B(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            this.A04.A06(A01(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new AnonymousClass88Y(AnonymousClass006.A0C, th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:(6:0|1|(1:3)|5|6|(3:8|9|(3:11|(1:13)|14)(2:15|16)))|21|(2:26|(1:28))|29|30|31|32|33|34|35|36|61|62|(1:64)(1:65)|66|67|(1:69)|70|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (getDatabaseName() == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b3, code lost:
        if ((r2 instanceof android.database.sqlite.SQLiteException) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0080 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C34094I0o A00() {
        /*
            r7 = this;
            X.76C r4 = r7.A06     // Catch:{ all -> 0x00e1 }
            boolean r0 = r7.A00     // Catch:{ all -> 0x00e1 }
            r6 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = r7.getDatabaseName()     // Catch:{ all -> 0x00e1 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.concurrent.locks.Lock r3 = r4.A02     // Catch:{ all -> 0x00e1 }
            r3.lock()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0044
            java.io.File r1 = r4.A01     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x0032
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x0023
            r0.mkdirs()     // Catch:{ IOException -> 0x0039 }
        L_0x0023:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0039 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0039 }
            r0.lock()     // Catch:{ IOException -> 0x0039 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0039 }
            goto L_0x0044
        L_0x0032:
            java.lang.String r0 = "No lock directory was provided."
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ IOException -> 0x0039 }
            throw r0     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r2 = move-exception
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x00e1 }
        L_0x0044:
            r7.A01 = r6     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = r7.getDatabaseName()     // Catch:{ all -> 0x00e1 }
            boolean r0 = r7.A00     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x0070
            if (r0 != 0) goto L_0x0070
            android.content.Context r0 = r7.A02     // Catch:{ all -> 0x00e1 }
            java.io.File r0 = r0.getDatabasePath(r5)     // Catch:{ all -> 0x00e1 }
            java.io.File r1 = r0.getParentFile()     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0070
            r1.mkdirs()     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            java.lang.String r1 = X.AnonymousClass0wJ.A0t(r0, r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00e1 }
        L_0x0070:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x0078 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0078 }
            goto L_0x00c1
        L_0x0078:
            super.close()     // Catch:{ all -> 0x00e1 }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0080 }
        L_0x0080:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x0088 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x00c1
        L_0x0088:
            r1 = move-exception
            super.close()     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1 instanceof X.AnonymousClass88Y     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00a6
            X.88Y r1 = (X.AnonymousClass88Y) r1     // Catch:{ all -> 0x00e1 }
            java.lang.Throwable r2 = r1.A01     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r0 = r1.A00     // Catch:{ all -> 0x00e1 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x00e1 }
            if (r1 == r6) goto L_0x00df
            r0 = 1
            if (r1 == r0) goto L_0x00df
            r0 = 2
            if (r1 == r0) goto L_0x00df
            r0 = 3
            if (r1 == r0) goto L_0x00df
            goto L_0x00b1
        L_0x00a6:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00e0
            if (r5 == 0) goto L_0x00e0
            boolean r0 = r7.A03     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00e0
            goto L_0x00b5
        L_0x00b1:
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00df
        L_0x00b5:
            android.content.Context r0 = r7.A02     // Catch:{ all -> 0x00e1 }
            r0.deleteDatabase(r5)     // Catch:{ all -> 0x00e1 }
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ 88Y -> 0x00dc }
            X.C04220Ms.A06(r1)     // Catch:{ 88Y -> 0x00dc }
        L_0x00c1:
            boolean r0 = r7.A01     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00cd
            r7.close()     // Catch:{ all -> 0x00e1 }
            X.I0o r1 = r7.A00()     // Catch:{ all -> 0x00e1 }
            goto L_0x00d1
        L_0x00cd:
            X.K01 r1 = r7.A01(r1)     // Catch:{ all -> 0x00e1 }
        L_0x00d1:
            java.nio.channels.FileChannel r0 = r4.A00     // Catch:{ IOException -> 0x00d8 }
            if (r0 == 0) goto L_0x00d8
            r0.close()     // Catch:{ IOException -> 0x00d8 }
        L_0x00d8:
            r3.unlock()
            return r1
        L_0x00dc:
            r0 = move-exception
            java.lang.Throwable r2 = r0.A01     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            throw r2     // Catch:{ all -> 0x00e1 }
        L_0x00e0:
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r2 = move-exception
            X.76C r1 = r7.A06
            java.nio.channels.FileChannel r0 = r1.A00     // Catch:{ IOException -> 0x00eb }
            if (r0 == 0) goto L_0x00eb
            r0.close()     // Catch:{ IOException -> 0x00eb }
        L_0x00eb:
            java.util.concurrent.locks.Lock r0 = r1.A02
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4x9.A00():X.I0o");
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            AnonymousClass76C r4 = this.A06;
            Lock lock = r4.A02;
            lock.lock();
            super.close();
            this.A05.A00 = null;
            this.A00 = false;
            try {
                FileChannel fileChannel = r4.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            AnonymousClass76C r1 = this.A06;
            try {
                FileChannel fileChannel2 = r1.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            r1.A02.unlock();
            throw th;
        }
    }
}
