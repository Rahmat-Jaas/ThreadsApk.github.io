package X;

import java.io.RandomAccessFile;

/* renamed from: X.09U  reason: invalid class name */
public final class AnonymousClass09U {
    public int A00;
    public int A01;
    public RandomAccessFile A02;

    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00ac */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e A[Catch:{ all -> 0x00a8, all -> 0x00ac, Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3 A[Catch:{ all -> 0x00a8, all -> 0x00ac, Exception -> 0x00b1 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x00a4=Splitter:B:44:0x00a4, B:50:0x00ac=Splitter:B:50:0x00ac} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            r5 = -87110918(0xfffffffffacecafa, float:-5.36865E35)
            java.io.RandomAccessFile r4 = r7.A02     // Catch:{ Exception -> 0x00ad }
            int r0 = r7.A01     // Catch:{ Exception -> 0x00ad }
            long r0 = (long) r0     // Catch:{ Exception -> 0x00ad }
            r4.seek(r0)     // Catch:{ Exception -> 0x00ad }
            r3 = 0
        L_0x000d:
            int r0 = r7.A00     // Catch:{ Exception -> 0x00ad }
            if (r3 >= r0) goto L_0x0040
            int r2 = A00(r7)     // Catch:{ Exception -> 0x00ad }
            int r1 = A00(r7)     // Catch:{ Exception -> 0x00ad }
            int r0 = A00(r7)     // Catch:{ Exception -> 0x00ad }
            if (r2 != r5) goto L_0x003d
            X.09S r2 = new X.09S     // Catch:{ Exception -> 0x00ad }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00ad }
            int r0 = r2.A00     // Catch:{ Exception -> 0x00ad }
            long r0 = (long) r0     // Catch:{ Exception -> 0x00ad }
            r4.seek(r0)     // Catch:{ Exception -> 0x00ad }
            int r0 = r2.A01     // Catch:{ Exception -> 0x00ad }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x00ad }
            r4.read(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00ad }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00ad }
        L_0x0036:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00ad }
            if (r0 == 0) goto L_0x0043
            goto L_0x0042
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0040:
            r4 = 0
            goto L_0x0036
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x00bd
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ Exception -> 0x00b1 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00b1 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ Exception -> 0x00b1 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r3 = "global"
            r5.beginObject()     // Catch:{ all -> 0x00a8 }
        L_0x0054:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = r5.nextName()     // Catch:{ all -> 0x00a8 }
            android.util.JsonToken r1 = r5.peek()     // Catch:{ all -> 0x00a8 }
            android.util.JsonToken r0 = android.util.JsonToken.NULL     // Catch:{ all -> 0x00a8 }
            if (r1 == r0) goto L_0x0054
            boolean r0 = r2.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r5.skipValue()     // Catch:{ all -> 0x00a8 }
            goto L_0x0054
        L_0x0071:
            r3 = r5
            goto L_0x0077
        L_0x0073:
            r5.endObject()     // Catch:{ all -> 0x00a8 }
            r3 = r6
        L_0x0077:
            if (r3 == 0) goto L_0x009b
            r3.beginObject()     // Catch:{ all -> 0x00a8 }
        L_0x007c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = r3.nextName()     // Catch:{ all -> 0x00a8 }
            android.util.JsonToken r1 = r3.peek()     // Catch:{ all -> 0x00a8 }
            android.util.JsonToken r0 = android.util.JsonToken.NULL     // Catch:{ all -> 0x00a8 }
            if (r1 == r0) goto L_0x007c
            boolean r0 = r2.equals(r8)     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x009c
            r3.skipValue()     // Catch:{ all -> 0x00a8 }
            goto L_0x007c
        L_0x0098:
            r3.endObject()     // Catch:{ all -> 0x00a8 }
        L_0x009b:
            r3 = r6
        L_0x009c:
            if (r3 == 0) goto L_0x00a3
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x00a8 }
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            r5.close()     // Catch:{ Exception -> 0x00b1 }
            return r0
        L_0x00a8:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            throw r0     // Catch:{ Exception -> 0x00b1 }
        L_0x00ad:
            r3 = move-exception
            java.lang.String r4 = ""
            goto L_0x00b2
        L_0x00b1:
            r3 = move-exception
        L_0x00b2:
            java.lang.String r2 = "MinidumpReader"
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "getCustomData error: %s"
            X.AnonymousClass0LU.A0K(r2, r0, r3, r1)
        L_0x00bd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09U.A01(java.lang.String):java.lang.String");
    }

    public static int A00(AnonymousClass09U r2) {
        int readInt = r2.A02.readInt();
        return ((readInt >> 24) & 255) | ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >> 8);
    }

    public AnonymousClass09U(RandomAccessFile randomAccessFile) {
        this.A02 = randomAccessFile;
        randomAccessFile.seek(0);
        if (A00(this) == 1347241037) {
            this.A02.skipBytes(4);
            this.A00 = A00(this);
            this.A01 = A00(this);
            return;
        }
        throw new RuntimeException("Invalid minidump signature");
    }
}
