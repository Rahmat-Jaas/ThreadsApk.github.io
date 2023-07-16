package X;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0MV  reason: invalid class name */
public class AnonymousClass0MV extends C15010qZ {
    public final File A00;
    public final int A01;
    public final List A02;

    public final void A03(Collection collection) {
        collection.add(this.A00.getAbsolutePath());
    }

    public int A05(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        return A07(threadPolicy, this.A00, str, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[SYNTHETIC, Splitter:B:33:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089 A[Catch:{ UnsatisfiedLinkError -> 0x0093, all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A07(android.os.StrictMode.ThreadPolicy r14, java.io.File r15, java.lang.String r16, int r17) {
        /*
            r13 = this;
            X.0qg r0 = X.C15020qa.A03
            if (r0 == 0) goto L_0x00b8
            java.util.List r0 = r13.A02
            r2 = r16
            boolean r0 = r0.contains(r2)
            r6 = 0
            java.lang.String r5 = "SoLoader"
            if (r0 == 0) goto L_0x0019
            r15.getCanonicalPath()
            r0 = 3
        L_0x0015:
            android.util.Log.isLoggable(r5, r0)
            return r6
        L_0x0019:
            java.io.File r9 = r13.A08(r2)
            if (r9 != 0) goto L_0x0024
            r15.getCanonicalPath()
            r0 = 2
            goto L_0x0015
        L_0x0024:
            r15.getCanonicalPath()
            r4 = 3
            android.util.Log.isLoggable(r5, r4)
            r7 = r17
            r0 = r17 & 1
            if (r0 == 0) goto L_0x003c
            int r0 = r13.A01
            r1 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x003c
            android.util.Log.isLoggable(r5, r4)
        L_0x003b:
            return r1
        L_0x003c:
            r3 = 0
            int r0 = r13.A01
            r12 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0045
            r6 = 1
        L_0x0045:
            java.lang.String r0 = r9.getName()
            boolean r11 = r0.equals(r2)
            if (r6 != 0) goto L_0x0051
            if (r11 != 0) goto L_0x007a
        L_0x0051:
            X.0N0 r0 = new X.0N0     // Catch:{ all -> 0x00b1 }
            r0.<init>(r9)     // Catch:{ all -> 0x00b1 }
            r3 = r0
            if (r6 == 0) goto L_0x007a
            java.lang.String[] r10 = X.C15140qn.A03(r0, r2)     // Catch:{ all -> 0x00b1 }
            java.util.Arrays.toString(r10)     // Catch:{ all -> 0x00b1 }
            android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x00b1 }
            int r8 = r10.length     // Catch:{ all -> 0x00b1 }
            r6 = 0
        L_0x0065:
            if (r6 >= r8) goto L_0x007d
            r2 = r10[r6]     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "/"
            boolean r0 = r2.startsWith(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0077
            r1 = r17 | 1
            r0 = 0
            X.C15020qa.A09(r14, r2, r0, r0, r1)     // Catch:{ all -> 0x00b1 }
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x0065
        L_0x007a:
            android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x00b1 }
        L_0x007d:
            if (r11 == 0) goto L_0x0089
            X.0qg r1 = X.C15020qa.A03     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            r1.load(r0, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            goto L_0x00aa
        L_0x0089:
            X.0qg r1 = X.C15020qa.A03     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            r1.loadBytes(r0, r3, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0093 }
            goto L_0x00aa
        L_0x0093:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00b0
            r1 = 3
            android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x003b
            r3.close()
            return r1
        L_0x00aa:
            if (r3 == 0) goto L_0x00af
            r3.close()
        L_0x00af:
            return r12
        L_0x00b0:
            throw r2     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            if (r3 == 0) goto L_0x00bf
            r3.close()
            throw r1
        L_0x00b8:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x00bf:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MV.A07(android.os.StrictMode$ThreadPolicy, java.io.File, java.lang.String, int):int");
    }

    public final File A08(String str) {
        File file = new File(this.A00, str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A00.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A00.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A01);
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass0MV(File file, String[] strArr, int i) {
        this.A00 = file;
        this.A01 = i;
        this.A02 = Arrays.asList(strArr);
    }

    public final File A01(String str) {
        return A08(str);
    }

    public final String A02(String str) {
        File A08 = A08(str);
        if (A08 == null) {
            return null;
        }
        return A08.getCanonicalPath();
    }

    public final String[] A04(String str) {
        File A08 = A08(str);
        if (A08 == null) {
            return null;
        }
        AnonymousClass0N0 r1 = new AnonymousClass0N0(A08);
        try {
            String[] A03 = C15140qn.A03(r1, str);
            r1.close();
            return A03;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
