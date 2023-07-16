package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: X.0U1  reason: invalid class name */
public abstract class AnonymousClass0U1 extends AnonymousClass0AM {
    public FileFilter A00;
    public Comparator A01;

    public abstract AnonymousClass0AM A01(File file);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.File[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.File[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Iterator A00() {
        /*
            r3 = this;
            java.io.File r2 = r3.A00
            java.io.FileFilter r0 = r3.A00
            java.util.Comparator r1 = r3.A01
            if (r0 == 0) goto L_0x0016
            java.io.File[] r2 = r2.listFiles(r0)
        L_0x000c:
            if (r2 == 0) goto L_0x001f
            if (r1 == 0) goto L_0x0024
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            goto L_0x001b
        L_0x0016:
            java.io.File[] r2 = r2.listFiles()
            goto L_0x000c
        L_0x001b:
            java.util.Arrays.sort(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0024 }
            goto L_0x0023
        L_0x001f:
            r0 = 0
            java.io.File[] r2 = new java.io.File[r0]
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            X.0AL r1 = new X.0AL
            r1.<init>(r2)
            X.0AK r0 = new X.0AK
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0U1.A00():java.util.Iterator");
    }

    public AnonymousClass0U1(File file) {
        super(file);
    }
}
