package X;

import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.facebook.secure.fileprovider.common.FileStatHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.7Il  reason: invalid class name */
public final class AnonymousClass7Il {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0023 A[Catch:{ all -> 0x0024 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.io.File r4, java.io.File r5) {
        /*
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x001c }
            r1.<init>(r5)     // Catch:{ all -> 0x001c }
            A02(r2, r1)     // Catch:{ all -> 0x001a }
            r2.close()     // Catch:{ all -> 0x0015 }
            r1.close()
            return
        L_0x0015:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x001a:
            r0 = move-exception
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            r1 = r3
        L_0x001e:
            r2.close()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x002a
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            if (r1 == 0) goto L_0x002a
        L_0x0027:
            r1.close()
        L_0x002a:
            throw r0
        L_0x002b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Il.A01(java.io.File, java.io.File):void");
    }

    public static boolean A03(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return false;
        }
        if (FileStatHelper.statOpenFile(parcelFileDescriptor.getFd()).device == A00()) {
            return true;
        }
        try {
            return A05(new File("/proc/self/fd", String.format("%d", C18210wN.A1X(parcelFileDescriptor.getFd()))).getCanonicalPath());
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public static boolean A05(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        ParcelFileDescriptor open = ParcelFileDescriptor.open(C86144wL.A0Z(str), 268435456);
        try {
            if (FileStatHelper.statOpenFile(open.getFd()).device == A00()) {
                z = true;
            }
            return z;
        } finally {
            open.close();
        }
    }

    public static void A02(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static long A00() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return -1;
        }
        ParcelFileDescriptor open = ParcelFileDescriptor.open(externalStorageDirectory, 268435456);
        try {
            return FileStatHelper.statOpenFile(open.getFd()).device;
        } finally {
            open.close();
        }
    }

    public static boolean A04(ParcelFileDescriptor parcelFileDescriptor) {
        return AnonymousClass0wJ.A1T(Process.myUid(), FileStatHelper.statOpenFile(parcelFileDescriptor.getFd()).ownerUid);
    }
}
