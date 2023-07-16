package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

/* renamed from: X.0Y3  reason: invalid class name */
public final class AnonymousClass0Y3 implements AnonymousClass0O7 {
    public AnonymousClass0Y4 A00;
    public BufferedReader A01;
    public boolean A02 = false;
    public final File A03;

    public final void A6C(Properties properties) {
        AnonymousClass0Y4 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass0Y4();
            this.A00 = r0;
        }
        r0.A6C(properties);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r7 = r8.length();
        r6 = new java.lang.StringBuilder(r7);
        r4 = new char[4];
        r1 = 0;
        r13 = true;
        r9 = false;
        r11 = false;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r1 >= r7) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r10 = r8.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r9 == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r0 = r12 + 1;
        r4[r12] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r0 != 4) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.append((char) java.lang.Integer.parseInt(new java.lang.String(r4), 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r11 == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r10 == ' ') goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r0 = '!';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r10 == '!') goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r0 = '#';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r10 == '#') goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r0 = ':';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r10 == ':') goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        r0 = '=';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r10 == '=') goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r10 == '\\') goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r10 == 'f') goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r10 == 'n') goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        if (r10 == 'r') goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        if (r10 == 't') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009f, code lost:
        if (r10 == 'u') goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a2, code lost:
        r10 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        r10 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        r10 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r10 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ae, code lost:
        r6.append('\\');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b1, code lost:
        r6.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
        r6.append('\\');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b9, code lost:
        r6.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bd, code lost:
        if (r13 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        if (r6.length() == 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        r6.append('\\');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c8, code lost:
        r6.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cb, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cd, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ce, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        if (r10 != '\\') goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d4, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
        if (r13 == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00da, code lost:
        if (r10 == '=') goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00de, code lost:
        if (r10 != ':') goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e0, code lost:
        r15.A00 = r6.toString();
        r6.delete(0, r6.length());
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ef, code lost:
        r6.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f9, code lost:
        r0 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fd, code lost:
        if (r13 == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ff, code lost:
        r15.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0102, code lost:
        r15.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0124, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0125, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AxZ(X.AnonymousClass0O6 r15) {
        /*
            r14 = this;
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x000d
        L_0x0004:
            X.0Y4 r0 = r14.A00
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.AxZ(r15)
            return r0
        L_0x000d:
            r3 = 1
            java.io.BufferedReader r0 = r14.A01     // Catch:{ IOException -> 0x0105 }
            java.lang.String r0 = r0.readLine()     // Catch:{ IOException -> 0x0105 }
            if (r0 != 0) goto L_0x0026
            r14.A02 = r3     // Catch:{ IOException -> 0x0105 }
            java.io.BufferedReader r0 = r14.A01     // Catch:{ IOException -> 0x0105 }
            r0.close()     // Catch:{ IOException -> 0x0105 }
            X.0Y4 r0 = r14.A00     // Catch:{ IOException -> 0x0105 }
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.AxZ(r15)     // Catch:{ IOException -> 0x0105 }
            return r0
        L_0x0026:
            java.lang.String r8 = r0.trim()     // Catch:{ IOException -> 0x0105 }
            java.lang.String r0 = "#"
            boolean r0 = r8.startsWith(r0)     // Catch:{ IOException -> 0x0105 }
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "!"
            boolean r0 = r8.startsWith(r0)     // Catch:{ IOException -> 0x0105 }
            if (r0 != 0) goto L_0x000d
            int r7 = r8.length()     // Catch:{ IOException -> 0x0105 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0105 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0105 }
            r5 = 4
            char[] r4 = new char[r5]     // Catch:{ IOException -> 0x0105 }
            r2 = 0
            r1 = 0
            r13 = 1
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x004c:
            if (r1 >= r7) goto L_0x00f9
            char r10 = r8.charAt(r1)     // Catch:{ IOException -> 0x0105 }
            if (r9 == 0) goto L_0x0073
            int r0 = r12 + 1
            r4[r12] = r10     // Catch:{ IOException -> 0x0105 }
            if (r0 != r5) goto L_0x0070
            java.lang.String r9 = new java.lang.String     // Catch:{ NumberFormatException -> 0x006b }
            r9.<init>(r4)     // Catch:{ NumberFormatException -> 0x006b }
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r9, r0)     // Catch:{ NumberFormatException -> 0x006b }
            char r0 = (char) r0     // Catch:{ NumberFormatException -> 0x006b }
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x00f3
        L_0x006b:
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0105 }
            goto L_0x00f3
        L_0x0070:
            r12 = r0
            goto L_0x00f5
        L_0x0073:
            if (r11 == 0) goto L_0x00d0
            r11 = 32
            r9 = 92
            if (r10 == r11) goto L_0x00bd
            r0 = 33
            if (r10 == r0) goto L_0x00b9
            r0 = 35
            if (r10 == r0) goto L_0x00b9
            r0 = 58
            if (r10 == r0) goto L_0x00b9
            r0 = 61
            if (r10 == r0) goto L_0x00b9
            if (r10 == r9) goto L_0x00b5
            r0 = 102(0x66, float:1.43E-43)
            if (r10 == r0) goto L_0x00ab
            r0 = 110(0x6e, float:1.54E-43)
            if (r10 == r0) goto L_0x00a8
            r0 = 114(0x72, float:1.6E-43)
            if (r10 == r0) goto L_0x00a5
            r0 = 116(0x74, float:1.63E-43)
            if (r10 == r0) goto L_0x00a2
            r0 = 117(0x75, float:1.64E-43)
            if (r10 == r0) goto L_0x00cd
            goto L_0x00ae
        L_0x00a2:
            r10 = 9
            goto L_0x00b1
        L_0x00a5:
            r10 = 13
            goto L_0x00b1
        L_0x00a8:
            r10 = 10
            goto L_0x00b1
        L_0x00ab:
            r10 = 12
            goto L_0x00b1
        L_0x00ae:
            r6.append(r9)     // Catch:{ IOException -> 0x0105 }
        L_0x00b1:
            r6.append(r10)     // Catch:{ IOException -> 0x0105 }
            goto L_0x00cb
        L_0x00b5:
            r6.append(r9)     // Catch:{ IOException -> 0x0105 }
            goto L_0x00cb
        L_0x00b9:
            r6.append(r0)     // Catch:{ IOException -> 0x0105 }
            goto L_0x00cb
        L_0x00bd:
            if (r13 != 0) goto L_0x00c8
            int r0 = r6.length()     // Catch:{ IOException -> 0x0105 }
            if (r0 == 0) goto L_0x00c8
            r6.append(r9)     // Catch:{ IOException -> 0x0105 }
        L_0x00c8:
            r6.append(r11)     // Catch:{ IOException -> 0x0105 }
        L_0x00cb:
            r9 = 0
            goto L_0x00ce
        L_0x00cd:
            r9 = 1
        L_0x00ce:
            r11 = 0
            goto L_0x00f5
        L_0x00d0:
            r0 = 92
            if (r10 != r0) goto L_0x00d6
            r11 = 1
            goto L_0x00f5
        L_0x00d6:
            if (r13 == 0) goto L_0x00ef
            r0 = 61
            if (r10 == r0) goto L_0x00e0
            r0 = 58
            if (r10 != r0) goto L_0x00ef
        L_0x00e0:
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0105 }
            r15.A00 = r0     // Catch:{ IOException -> 0x0105 }
            int r0 = r6.length()     // Catch:{ IOException -> 0x0105 }
            r6.delete(r2, r0)     // Catch:{ IOException -> 0x0105 }
            r13 = 0
            goto L_0x00f5
        L_0x00ef:
            r6.append(r10)     // Catch:{ IOException -> 0x0105 }
            goto L_0x00f5
        L_0x00f3:
            r9 = 0
            r12 = 0
        L_0x00f5:
            int r1 = r1 + 1
            goto L_0x004c
        L_0x00f9:
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0105 }
            if (r13 == 0) goto L_0x0102
            r15.A00 = r0     // Catch:{ IOException -> 0x0105 }
            goto L_0x0124
        L_0x0102:
            r15.A01 = r0     // Catch:{ IOException -> 0x0105 }
            goto L_0x0125
        L_0x0105:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Error reading properties from file"
            X.AnonymousClass0LU.A0F(r1, r0, r2)
            boolean r0 = r14.A02
            if (r0 != 0) goto L_0x0004
            r14.A02 = r3
            java.io.BufferedReader r0 = r14.A01     // Catch:{ IOException -> 0x011d }
            r0.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0004
        L_0x011d:
            X.C04790Pd.A00()
            goto L_0x0004
        L_0x0122:
            r0 = 0
            return r0
        L_0x0124:
            return r3
        L_0x0125:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y3.AxZ(X.0O6):boolean");
    }

    public final void reset() {
        try {
            this.A01 = new BufferedReader(new FileReader(this.A03));
            this.A02 = false;
        } catch (FileNotFoundException unused) {
            C04790Pd.A00();
            this.A02 = true;
        }
        AnonymousClass0Y4 r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public AnonymousClass0Y3(File file) {
        this.A03 = file;
        this.A01 = new BufferedReader(new FileReader(file));
    }

    public final String[] B4x(List list) {
        String str;
        String[] strArr = new String[list.size()];
        AnonymousClass0O6 r3 = new AnonymousClass0O6();
        while (AxZ(r3)) {
            for (int i = 0; i < list.size(); i++) {
                if (strArr[i] == null && (str = r3.A00) != null && str.equals(list.get(i))) {
                    strArr[i] = r3.A01;
                }
            }
        }
        reset();
        return strArr;
    }
}
