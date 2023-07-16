package X;

import java.nio.ByteBuffer;

/* renamed from: X.0kA  reason: invalid class name and case insensitive filesystem */
public final class C11420kA {
    public static final ByteBuffer A04 = ByteBuffer.allocate(4);
    public final int A00;
    public final C17370um A01;
    public final C13390nc A02 = new C13390nc();
    public final ByteBuffer A03;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012a, code lost:
        if (r0 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 > 0) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C11420kA r8, java.lang.String r9, byte[] r10, int r11, int r12) {
        /*
            if (r11 == 0) goto L_0x0139
            if (r9 == 0) goto L_0x0138
            X.0nc r4 = r8.A02
            byte[] r0 = r9.getBytes()
            r4.A01 = r0
            r4.A02 = r10
            r4.A00 = r12
            java.nio.ByteBuffer r5 = r8.A03
            if (r5 == 0) goto L_0x0138
            int r0 = r0.length
            int r2 = r0 + 1
            if (r12 == 0) goto L_0x00aa
            int r2 = r2 + 1
            int[] r0 = X.C13390nc.A03
            r0 = r0[r12]
            if (r0 <= 0) goto L_0x00aa
        L_0x0021:
            int r2 = r2 + r0
            int r7 = r2 + 4
            int r0 = r7 % 4
            if (r0 == 0) goto L_0x002b
            int r0 = 4 - r0
            int r7 = r7 + r0
        L_0x002b:
            int r6 = r8.A00
            int r0 = r6 + -12
            if (r7 > r0) goto L_0x0138
            int r0 = r5.position()
            int r0 = r0 + r7
            if (r0 <= r6) goto L_0x0050
            int r0 = r5.position()
            int r0 = r0 + 4
            if (r0 > r6) goto L_0x0044
            r0 = 0
            r5.putInt(r0)
        L_0x0044:
            X.0um r1 = r8.A01
            r0 = 1
            r1.A03 = r0
            r0 = 12
            r5.position(r0)
            r1.A02 = r0
        L_0x0050:
            X.0um r8 = r8.A01
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x00c4
            int r3 = r8.A02
            int r2 = r5.position()
        L_0x005c:
            int r0 = r2 + r7
            if (r0 <= r3) goto L_0x00bb
            r5.position(r3)
            int r0 = r5.getInt()
            if (r0 != 0) goto L_0x0076
            int r0 = r5.capacity()
            int r1 = r0 + 4
            int r0 = r5.position()
            int r1 = r1 - r0
        L_0x0074:
            int r3 = r3 + r1
            goto L_0x005c
        L_0x0076:
            int r1 = r5.position()
            byte r0 = r5.get()
            int r9 = r0 + 1
            int r1 = r1 + r9
            r5.position(r1)
            byte r1 = r5.get()
            int r0 = r1 + 1
            if (r1 >= 0) goto L_0x0098
            int r1 = java.lang.Math.abs(r1)
            int[] r0 = X.C13390nc.A03
            r0 = r0[r1]
            if (r0 <= 0) goto L_0x00a3
            int r0 = r0 + 1
        L_0x0098:
            int r9 = r9 + r0
            int r1 = r9 + 4
            int r0 = r1 % 4
            if (r0 == 0) goto L_0x0074
            int r0 = 4 - r0
            int r1 = r1 + r0
            goto L_0x0074
        L_0x00a3:
            byte r0 = r5.get()
            int r0 = r0 + 2
            goto L_0x0098
        L_0x00aa:
            boolean[] r0 = X.C13390nc.A04
            boolean r0 = r0[r12]
            int r1 = r10.length
            if (r0 != 0) goto L_0x00b7
            r0 = 50
            int r1 = java.lang.Math.min(r1, r0)
        L_0x00b7:
            int r0 = r1 + 1
            goto L_0x0021
        L_0x00bb:
            r5.position(r2)
            if (r3 <= r6) goto L_0x00c2
            r3 = 12
        L_0x00c2:
            r8.A02 = r3
        L_0x00c4:
            r5.putInt(r11)
            byte[] r1 = r4.A01
            int r0 = r1.length
            r3 = 50
            if (r0 <= r3) goto L_0x0130
            r5.put(r3)
            r0 = 0
            r5.put(r1, r0, r3)
        L_0x00d5:
            int r2 = r4.A00
            if (r2 != 0) goto L_0x0119
            byte[] r1 = r4.A02
        L_0x00db:
            boolean[] r0 = X.C13390nc.A04
            boolean r0 = r0[r2]
            if (r0 == 0) goto L_0x0113
            int r0 = r1.length
            if (r0 <= r3) goto L_0x0113
            r5.put(r3)
            r0 = 0
            r5.put(r1, r0, r3)
        L_0x00eb:
            int r0 = r5.position()
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x00fd
            int r0 = r5.position()
            int r0 = r0 + 4
            int r0 = r0 - r1
            r5.position(r0)
        L_0x00fd:
            int r1 = r5.position()
            r8.A00 = r1
            r0 = 0
            r5.putInt(r0, r1)
            boolean r0 = r8.A03
            int r1 = r8.A02
            if (r0 == 0) goto L_0x010e
            int r1 = -r1
        L_0x010e:
            r0 = 4
            r5.putInt(r0, r1)
            return
        L_0x0113:
            int r0 = r1.length
            byte r0 = (byte) r0
            r5.put(r0)
            goto L_0x012c
        L_0x0119:
            int r0 = -r2
            byte r0 = (byte) r0
            r5.put(r0)
            int r2 = r4.A00
            int[] r0 = X.C13390nc.A03
            r1 = r0[r2]
            r0 = 0
            if (r1 <= 0) goto L_0x0128
            r0 = 1
        L_0x0128:
            byte[] r1 = r4.A02
            if (r0 == 0) goto L_0x00db
        L_0x012c:
            r5.put(r1)
            goto L_0x00eb
        L_0x0130:
            byte r0 = (byte) r0
            r5.put(r0)
            r5.put(r1)
            goto L_0x00d5
        L_0x0138:
            return
        L_0x0139:
            java.lang.String r1 = "0 can't be used as id - it is reserved"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11420kA.A00(X.0kA, java.lang.String, byte[], int, int):void");
    }

    public C11420kA(ByteBuffer byteBuffer, int i) {
        C17370um r1 = new C17370um();
        this.A01 = r1;
        this.A03 = byteBuffer;
        this.A00 = i;
        r1.A01 = i;
        byteBuffer.putInt(r1.A00);
        byteBuffer.putInt(r1.A02);
        byteBuffer.putInt(r1.A01);
    }
}
