package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.7B4  reason: invalid class name */
public final class AnonymousClass7B4 {
    public static final void A01(File file, int... iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        C04220Ms.A0B(copyOf, 2);
        File[] listFiles = file.listFiles();
        C04220Ms.A06(listFiles);
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                try {
                    String name = file2.getName();
                    C04220Ms.A06(name);
                    int parseInt = Integer.parseInt(name);
                    boolean z = true;
                    for (int i : copyOf) {
                        if (parseInt == i) {
                            z = false;
                        }
                    }
                    if (z) {
                        A00(file2);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r5.listFiles().length == 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A00(java.io.File r5) {
        /*
            java.lang.Class<X.7B4> r4 = X.AnonymousClass7B4.class
            monitor-enter(r4)
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.isDirectory()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002c
            java.io.File[] r3 = r5.listFiles()     // Catch:{ all -> 0x0031 }
            X.C04220Ms.A06(r3)     // Catch:{ all -> 0x0031 }
            r2 = 0
            int r1 = r3.length     // Catch:{ all -> 0x0031 }
        L_0x0018:
            if (r2 >= r1) goto L_0x0025
            r0 = r3[r2]     // Catch:{ all -> 0x0031 }
            X.C04220Ms.A03(r0)     // Catch:{ all -> 0x0031 }
            A00(r0)     // Catch:{ all -> 0x0031 }
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0025:
            java.io.File[] r0 = r5.listFiles()     // Catch:{ all -> 0x0031 }
            int r0 = r0.length     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
        L_0x002c:
            r5.delete()     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r4)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7B4.A00(java.io.File):void");
    }
}
