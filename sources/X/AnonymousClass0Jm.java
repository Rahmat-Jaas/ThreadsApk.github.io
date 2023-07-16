package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Jm  reason: invalid class name */
public class AnonymousClass0Jm extends AnonymousClass0FJ {
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(boolean r6) {
        /*
            r5 = this;
            java.io.File r4 = r5.A00
            X.AnonymousClass0SJ.A00(r4)
            r2 = 2147483648(0x80000000, double:1.0609978955E-314)
            java.lang.String r1 = "AppUnpacker.fsync"
            r0 = -283075799(0xffffffffef209b29, float:-4.970518E28)
            X.C13850oP.A01(r2, r1, r0)
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002f }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x002f }
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ all -> 0x002a }
            r0.sync()     // Catch:{ all -> 0x002a }
            r1.close()     // Catch:{ all -> 0x002f }
            r0 = -1677413782(0xffffffff9c04b26a, float:-4.390573E-22)
            X.C13850oP.A00(r2, r0)
            return
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            r0 = -1948416264(0xffffffff8bdd86f8, float:-8.532918E-32)
            X.C13850oP.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Jm.A01(boolean):void");
    }

    public final boolean A02(Context context, byte[] bArr) {
        File file = this.A00;
        AnonymousClass0SJ.A00(file);
        return !file.exists();
    }

    public AnonymousClass0Jm(String str, String str2) {
        super(str, str2);
    }
}
