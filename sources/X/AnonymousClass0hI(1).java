package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0hI  reason: invalid class name */
public final class AnonymousClass0hI {
    public static final List A00 = Arrays.asList(new String[]{".jpg", ".jpeg"});

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 == 1296891946) goto L_0x001a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0023=Splitter:B:15:0x0023, B:9:0x001b=Splitter:B:9:0x001b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.io.File r5) {
        /*
            r4 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0024 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0024 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0024 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0024 }
            int r2 = r3.readInt()     // Catch:{ all -> 0x001f }
            r0 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r0) goto L_0x001a
            r1 = 1296891946(0x4d4d002a, float:2.14958752E8)
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r3.close()     // Catch:{ IOException -> 0x0024 }
            return r0
        L_0x001f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            r5.getPath()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0hI.A00(java.io.File):boolean");
    }
}
