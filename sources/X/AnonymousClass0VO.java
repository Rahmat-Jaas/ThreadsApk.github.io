package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.0VO  reason: invalid class name */
public final class AnonymousClass0VO {
    public static final Object A01 = new Object();
    public final File A00;

    public final File A01(String str) {
        File[] listFiles;
        File file = this.A00;
        if (!file.isDirectory() || !file.exists()) {
            file = null;
        }
        if (file == null || (listFiles = file.listFiles(new AnonymousClass0VN(this, AnonymousClass00U.A0L(A00(str), ".buff")))) == null || listFiles.length != 1) {
            return null;
        }
        return listFiles[0];
    }

    public final String A02(String str) {
        File file = this.A00;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            return AnonymousClass00U.A0V(file.getCanonicalPath(), File.separator, str);
        } catch (IOException unused) {
            return null;
        }
    }

    public AnonymousClass0VO(File file) {
        this.A00 = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = "_";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r1 != '.') goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 > r0) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r5) {
        /*
            int r4 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r2 = 0
        L_0x000a:
            if (r2 >= r4) goto L_0x003f
            char r1 = r5.charAt(r2)
            r0 = 65
            if (r1 < r0) goto L_0x002b
            r0 = 90
            if (r1 <= r0) goto L_0x003a
            r0 = 97
            if (r1 < r0) goto L_0x0028
            r0 = 122(0x7a, float:1.71E-43)
        L_0x001e:
            if (r1 <= r0) goto L_0x003a
        L_0x0020:
            java.lang.String r0 = "_"
        L_0x0022:
            r3.append(r0)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0028:
            r0 = 95
            goto L_0x0034
        L_0x002b:
            r0 = 48
            if (r1 < r0) goto L_0x0032
            r0 = 57
            goto L_0x001e
        L_0x0032:
            r0 = 45
        L_0x0034:
            if (r1 == r0) goto L_0x003a
            r0 = 46
            if (r1 != r0) goto L_0x0020
        L_0x003a:
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            goto L_0x0022
        L_0x003f:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VO.A00(java.lang.String):java.lang.String");
    }
}
