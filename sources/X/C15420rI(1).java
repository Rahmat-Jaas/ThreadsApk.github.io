package X;

import android.text.TextUtils;

/* renamed from: X.0rI  reason: invalid class name and case insensitive filesystem */
public final class C15420rI {
    public final C15410rH A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static int A00(int[] iArr, int i) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 >= 0) {
                i2 = Math.min(i2, i3);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return i;
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(":");
        }
        C15410rH r1 = this.A00;
        if (r1 != null) {
            sb.append("//");
            sb.append(r1.A01());
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            sb.append("?<REDACTED>");
        }
        if (!TextUtils.isEmpty(this.A01)) {
            sb.append("#<REDACTED>");
        }
        return sb.toString();
    }

    public C15420rI(C15410rH r1, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A00 = r1;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        return A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ce, code lost:
        if (r23 >= (r11.length() - 1)) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        r2 = new java.lang.IllegalArgumentException(X.AnonymousClass00U.A05(r9, "Fragment contains illegal character ", new java.lang.String(new int[]{r10}, 0, 1), " at string index "));
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0345  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C15420rI A01(java.lang.String r30, java.lang.String r31, java.text.BreakIterator r32, int r33, int r34) {
        /*
            r8 = r33
            java.lang.String r0 = "//"
            r4 = r30
            int r0 = r4.indexOf(r0, r8)
            r30 = 63
            r7 = 1
            r2 = 0
            r29 = 2
            r1 = 0
            r28 = 35
            r3 = r32
            r32 = r34
            if (r0 != r8) goto L_0x0332
            int r9 = r0 + 2
            r0 = 47
            int r6 = r4.indexOf(r0, r9)
            r0 = r30
            int r5 = r4.indexOf(r0, r9)
            r0 = r28
            int r0 = r4.indexOf(r0, r9)
            int[] r5 = new int[]{r6, r5, r0}
            r0 = r32
            int r8 = A00(r5, r0)
            if (r9 >= r0) goto L_0x0332
            int r0 = r8 - r9
            if (r0 <= 0) goto L_0x0332
            java.lang.String r6 = r4.substring(r9, r8)     // Catch:{ 0rG -> 0x0318 }
            r0 = 64
            int r0 = r6.indexOf(r0)     // Catch:{ 0rG -> 0x0318 }
            r27 = 0
            if (r0 <= 0) goto L_0x0095
            java.lang.String r10 = r6.substring(r2, r0)     // Catch:{ 0rG -> 0x0318 }
            int r5 = r0 + 1
        L_0x0051:
            int r0 = r6.length()     // Catch:{ 0rG -> 0x0318 }
            if (r5 >= r0) goto L_0x030b
            java.lang.String r11 = r6.substring(r5)     // Catch:{ 0rG -> 0x0318 }
            r26 = 58
            r0 = r26
            int r25 = r11.lastIndexOf(r0)     // Catch:{ 0rG -> 0x0318 }
            if (r25 == 0) goto L_0x02fe
            java.lang.String r0 = "["
            boolean r0 = r11.startsWith(r0)     // Catch:{ 0rG -> 0x0318 }
            if (r0 == 0) goto L_0x0241
            r24 = 93
            r0 = r24
            int r0 = r11.lastIndexOf(r0)     // Catch:{ 0rG -> 0x0318 }
            if (r0 < 0) goto L_0x0234
            int r23 = r0 + 1
            r0 = r23
            java.lang.String r9 = r11.substring(r2, r0)     // Catch:{ 0rG -> 0x0318 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 0rG -> 0x0318 }
            if (r0 != 0) goto L_0x022c
            r3.setText(r9)     // Catch:{ 0rG -> 0x0318 }
            int r22 = r9.length()     // Catch:{ 0rG -> 0x0318 }
            int r5 = r3.current()     // Catch:{ 0rG -> 0x0318 }
            r0 = r22
            if (r5 >= r0) goto L_0x0224
            goto L_0x0098
        L_0x0095:
            r10 = r1
            r5 = 0
            goto L_0x0051
        L_0x0098:
            r21 = -1
            r0 = r21
            if (r5 == r0) goto L_0x0224
            int r5 = r9.codePointAt(r5)     // Catch:{ 0rG -> 0x0318 }
            r0 = 91
            if (r5 != r0) goto L_0x020f
            int r14 = r3.next()     // Catch:{ 0rG -> 0x0318 }
            r0 = r22
            if (r14 >= r0) goto L_0x0207
            r0 = r21
            if (r14 == r0) goto L_0x0207
            int r5 = r9.codePointAt(r14)     // Catch:{ 0rG -> 0x0318 }
            r0 = 86
            if (r5 == r0) goto L_0x01ff
            r0 = 118(0x76, float:1.65E-43)
            if (r5 == r0) goto L_0x01ff
            r20 = 4
            java.nio.CharBuffer r19 = java.nio.CharBuffer.allocate(r20)     // Catch:{ 0rG -> 0x0318 }
            r0 = r19
            java.nio.Buffer r0 = r0.position(r2)     // Catch:{ 0rG -> 0x0318 }
            r0.limit(r2)     // Catch:{ 0rG -> 0x0318 }
            r13 = 0
            r12 = 0
            r6 = 0
            r5 = 0
            r18 = 0
            r17 = 1
        L_0x00d5:
            r0 = r22
            if (r14 >= r0) goto L_0x01c1
            r0 = r21
            if (r14 == r0) goto L_0x01c1
            int r16 = r9.codePointAt(r14)     // Catch:{ 0rG -> 0x0318 }
            boolean r0 = X.C15440rK.A01(r16)     // Catch:{ 0rG -> 0x0318 }
            if (r0 == 0) goto L_0x0101
            if (r13 != 0) goto L_0x00eb
            int r5 = r5 + 1
        L_0x00eb:
            int r13 = r13 + 1
            r0 = r20
            if (r13 > r0) goto L_0x014e
            r0 = r19
            r0.limit(r13)     // Catch:{ 0rG -> 0x0318 }
            int r14 = r13 + -1
            r0 = r16
            char r12 = (char) r0     // Catch:{ 0rG -> 0x0318 }
            r0 = r19
            r0.put(r14, r12)     // Catch:{ 0rG -> 0x0318 }
            goto L_0x013b
        L_0x0101:
            r0 = 46
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0127
            r15 = r26
            if (r0 == r15) goto L_0x0113
            r15 = r24
            if (r0 != r15) goto L_0x015f
            if (r6 <= 0) goto L_0x01c1
            goto L_0x015b
        L_0x0113:
            int r12 = r12 + 1
            r0 = r29
            if (r12 != r0) goto L_0x0120
            if (r18 != 0) goto L_0x017e
            r18 = 1
        L_0x011d:
            if (r6 <= 0) goto L_0x0139
            goto L_0x0176
        L_0x0120:
            if (r12 > r0) goto L_0x0198
            if (r17 != 0) goto L_0x011d
            if (r13 != 0) goto L_0x011d
            goto L_0x018c
        L_0x0127:
            X.C15410rH.A00(r19)     // Catch:{ 0rG -> 0x0318 }
            r0 = r19
            java.nio.Buffer r0 = r0.position(r2)     // Catch:{ 0rG -> 0x0318 }
            r0.limit(r2)     // Catch:{ 0rG -> 0x0318 }
            if (r13 <= 0) goto L_0x0137
            int r5 = r5 + -1
        L_0x0137:
            int r6 = r6 + 1
        L_0x0139:
            r13 = 0
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            r0 = 8
            if (r18 == 0) goto L_0x0141
            r0 = 7
        L_0x0141:
            if (r5 > r0) goto L_0x01ad
            r0 = r20
            if (r6 > r0) goto L_0x01a5
            int r14 = r3.next()     // Catch:{ 0rG -> 0x0318 }
            r17 = 0
            goto L_0x00d5
        L_0x014e:
            java.lang.String r0 = "Illegal length hex run >4 characters starting at string index "
            int r14 = r14 - r13
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r14)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x015b:
            X.C15410rH.A00(r19)     // Catch:{ 0rG -> 0x0318 }
            goto L_0x01b5
        L_0x015f:
            java.lang.String r4 = "Illegal character "
            int[] r0 = new int[]{r16}     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r3 = new java.lang.String     // Catch:{ 0rG -> 0x0318 }
            r3.<init>(r0, r2, r7)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r0 = " at string index "
            java.lang.String r2 = X.AnonymousClass00U.A05(r14, r4, r3, r0)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0176:
            java.lang.String r2 = "IPV4 address is only valid at the end of an IPV6 address string"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x017e:
            java.lang.String r0 = "Second double colon run detected at string index "
            int r14 = r14 - r29
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r14)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x018c:
            java.lang.String r0 = "Missing hex digit before colon at string index "
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r14)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0198:
            java.lang.String r0 = "Illegal length colon run starting at string index "
            int r14 = r14 - r12
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r14)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01a5:
            java.lang.String r2 = "IPV4 address at the end of IPV6 address must have at most 4 octets"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01ad:
            java.lang.String r2 = "IPV6 must have 8 or fewer pieces"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01b5:
            if (r13 <= 0) goto L_0x01b9
            int r5 = r5 + -1
        L_0x01b9:
            int r6 = r6 + 1
            r0 = r20
            if (r6 != r0) goto L_0x01c1
            int r5 = r5 + 2
        L_0x01c1:
            if (r18 == 0) goto L_0x01d1
            r0 = r29
            if (r12 == r0) goto L_0x02c6
            if (r5 > 0) goto L_0x02c6
            java.lang.String r2 = "IPV6 address with zero elision must have at least one non-zero piece"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01d1:
            r0 = 8
            if (r5 == r0) goto L_0x02c6
            if (r12 == r7) goto L_0x01f7
            r0 = r20
            if (r6 == r0) goto L_0x01e9
            java.lang.String r2 = "IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found "
            java.lang.String r0 = " octets"
            java.lang.String r2 = X.AnonymousClass00U.A0S(r2, r0, r6)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01e9:
            java.lang.String r2 = "IPV6 without zero elision must have have exactly 8 pieces, found "
            java.lang.String r0 = " pieces"
            java.lang.String r2 = X.AnonymousClass00U.A0S(r2, r0, r5)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01f7:
            java.lang.String r2 = "IPV6 must not end with a single colon"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x01ff:
            java.lang.String r2 = "IPFuture address types not supported"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0207:
            java.lang.String r2 = "No characters after opening bracket '['"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x020f:
            java.lang.String r4 = "Illegal character at start of literal "
            int[] r3 = new int[]{r5}     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r0 = new java.lang.String     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2, r7)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ 0rG -> 0x0318 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0224:
            java.lang.String r2 = "BreakIterator#current is past the end of string"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x022c:
            java.lang.String r2 = "IP literal cannot be empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0234:
            X.0rH r3 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r3.<init>(r10, r1, r1)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = "IPFutureV6 / IPFutureAddress missing closing bracket"
            X.0rG r0 = new X.0rG     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0241:
            if (r25 >= 0) goto L_0x0245
            r9 = r11
            goto L_0x024b
        L_0x0245:
            r0 = r25
            java.lang.String r9 = r11.substring(r2, r0)     // Catch:{ 0rG -> 0x0318 }
        L_0x024b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            if (r0 != 0) goto L_0x02e8
            r3.setText(r9)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            int r12 = r9.length()     // Catch:{ IllegalArgumentException -> 0x02f0 }
            int r5 = r3.current()     // Catch:{ IllegalArgumentException -> 0x02f0 }
        L_0x025c:
            r0 = -1
            if (r5 == r0) goto L_0x02a4
            if (r5 >= r12) goto L_0x02a4
            int r6 = r9.codePointAt(r5)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            boolean r0 = X.C15440rK.A03(r6)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            if (r0 != 0) goto L_0x027b
            boolean r0 = X.C15440rK.A02(r6)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            if (r0 != 0) goto L_0x027b
            r0 = 37
            if (r6 != r0) goto L_0x028d
            r3.next()     // Catch:{ IllegalArgumentException -> 0x0280 }
            X.C15440rK.A00(r9, r3)     // Catch:{ IllegalArgumentException -> 0x0280 }
        L_0x027b:
            int r5 = r3.next()     // Catch:{ IllegalArgumentException -> 0x02f0 }
            goto L_0x025c
        L_0x0280:
            r3 = move-exception
            java.lang.String r0 = "Host contains invalid percent encoded character at string index "
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r5)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02f0 }
            r0.<init>(r2, r3)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02f0 }
        L_0x028d:
            java.lang.String r4 = "Host contains illegal character "
            int[] r0 = new int[]{r6}     // Catch:{ IllegalArgumentException -> 0x02f0 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x02f0 }
            r3.<init>(r0, r2, r7)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            java.lang.String r0 = " at string index "
            java.lang.String r2 = X.AnonymousClass00U.A05(r5, r4, r3, r0)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02f0 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02f0 }
        L_0x02a4:
            if (r25 <= 0) goto L_0x02d0
            int r0 = r25 + 1
            java.lang.String r27 = r11.substring(r0)     // Catch:{ 0rG -> 0x0318 }
            r5 = 10
            r0 = r27
            long r5 = java.lang.Long.parseLong(r0, r5)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r11 = 0
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d0
            java.lang.String r0 = "Port cannot be negative "
            java.lang.String r2 = X.AnonymousClass00U.A08(r5, r0)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02d8 }
        L_0x02c6:
            int r0 = r11.length()     // Catch:{ 0rG -> 0x0318 }
            int r5 = r0 + -1
            r0 = r23
            if (r0 < r5) goto L_0x02a4
        L_0x02d0:
            X.0rH r5 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r0 = r27
            r5.<init>(r10, r9, r0)     // Catch:{ 0rG -> 0x0318 }
            goto L_0x0333
        L_0x02d8:
            r4 = move-exception
            X.0rH r3 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r0 = r27
            r3.<init>(r10, r9, r0)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = "Invalid port number"
            X.0rG r0 = new X.0rG     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2, r4)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x02e8:
            java.lang.String r2 = "Host cannot be empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02f0 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02f0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02f0 }
        L_0x02f0:
            r4 = move-exception
            X.0rH r3 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r3.<init>(r10, r9, r1)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = "Invalid host name"
            X.0rG r0 = new X.0rG     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2, r4)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x02fe:
            X.0rH r3 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r3.<init>(r10, r1, r1)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = "Host string started with colon (':')"
            X.0rG r0 = new X.0rG     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x030b:
            X.0rH r3 = new X.0rH     // Catch:{ 0rG -> 0x0318 }
            r3.<init>(r10, r1, r1)     // Catch:{ 0rG -> 0x0318 }
            java.lang.String r2 = "No host string was present"
            X.0rG r0 = new X.0rG     // Catch:{ 0rG -> 0x0318 }
            r0.<init>(r3, r2)     // Catch:{ 0rG -> 0x0318 }
            throw r0     // Catch:{ 0rG -> 0x0318 }
        L_0x0318:
            r3 = move-exception
            X.0rH r0 = r3.A00
            X.0rI r2 = new X.0rI
            r29 = r2
            r30 = r0
            r32 = r1
            r33 = r1
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            java.lang.String r1 = "Unable to parse authority"
            X.0rF r0 = new X.0rF
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0332:
            r5 = r1
        L_0x0333:
            r0 = r32
            if (r8 < r0) goto L_0x0345
            X.0rI r29 = new X.0rI
            r30 = r5
            r32 = r1
            r33 = r1
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            return r29
        L_0x0345:
            r0 = r30
            int r6 = r4.indexOf(r0, r8)
            r0 = r28
            int r0 = r4.indexOf(r0, r8)
            int[] r6 = new int[]{r6, r0}
            r0 = r32
            int r9 = A00(r6, r0)
            java.lang.String r6 = r4.substring(r8, r9)
            if (r5 != 0) goto L_0x0362
            r7 = 0
        L_0x0362:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalArgumentException -> 0x0556 }
            if (r0 != 0) goto L_0x03e7
            r3.setText(r6)     // Catch:{ IllegalArgumentException -> 0x0556 }
            int r13 = r6.length()     // Catch:{ IllegalArgumentException -> 0x0556 }
            int r8 = r3.current()     // Catch:{ IllegalArgumentException -> 0x0556 }
            int r0 = r6.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x0556 }
            r12 = -1
            r11 = 47
            if (r7 != 0) goto L_0x0394
            if (r0 != r11) goto L_0x0394
            int r8 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0556 }
            if (r8 >= r13) goto L_0x03e7
            if (r8 == r12) goto L_0x03e7
            int r0 = r6.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x0556 }
            if (r0 != r11) goto L_0x0394
            java.lang.String r2 = "Path cannot start with two slashes '//' when Uri contains an authority"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0556 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0556 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0556 }
        L_0x0394:
            if (r8 >= r13) goto L_0x03e7
            if (r8 == r12) goto L_0x03e7
            int r10 = r6.codePointAt(r8)     // Catch:{ IllegalArgumentException -> 0x0556 }
            boolean r0 = X.C15440rK.A03(r10)     // Catch:{ IllegalArgumentException -> 0x0556 }
            if (r0 != 0) goto L_0x03bd
            boolean r0 = X.C15440rK.A02(r10)     // Catch:{ IllegalArgumentException -> 0x0556 }
            if (r0 != 0) goto L_0x03bd
            r0 = 37
            if (r10 == r0) goto L_0x03b7
            if (r10 == r11) goto L_0x03bd
            r0 = 58
            if (r10 == r0) goto L_0x03bd
            r0 = 64
            if (r10 == r0) goto L_0x03bd
            goto L_0x03c2
        L_0x03b7:
            r3.next()     // Catch:{ IllegalArgumentException -> 0x03da }
            X.C15440rK.A00(r6, r3)     // Catch:{ IllegalArgumentException -> 0x03da }
        L_0x03bd:
            int r8 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0556 }
            goto L_0x0394
        L_0x03c2:
            java.lang.String r7 = "Path contains illegal character "
            r4 = 1
            int[] r0 = new int[]{r10}     // Catch:{ IllegalArgumentException -> 0x0556 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0556 }
            r3.<init>(r0, r2, r4)     // Catch:{ IllegalArgumentException -> 0x0556 }
            java.lang.String r0 = " at string index "
            java.lang.String r2 = X.AnonymousClass00U.A05(r8, r7, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0556 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0556 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0556 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0556 }
        L_0x03da:
            r3 = move-exception
            java.lang.String r0 = "Path contains invalid percent encoded character at string index "
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r8)     // Catch:{ IllegalArgumentException -> 0x0556 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0556 }
            r0.<init>(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0556 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0556 }
        L_0x03e7:
            r0 = r32
            if (r9 < r0) goto L_0x03f9
            X.0rI r29 = new X.0rI
            r30 = r5
            r32 = r6
            r33 = r1
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            return r29
        L_0x03f9:
            int r8 = r4.codePointAt(r9)
            r0 = r30
            if (r8 != r0) goto L_0x04a2
            r0 = r28
            int r10 = r4.indexOf(r0, r9)
            if (r10 >= 0) goto L_0x040b
            r10 = r32
        L_0x040b:
            java.lang.String r7 = r4.substring(r9, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalArgumentException -> 0x048a }
            if (r0 != 0) goto L_0x04a4
            r3.setText(r7)     // Catch:{ IllegalArgumentException -> 0x048a }
            int r8 = r7.length()     // Catch:{ IllegalArgumentException -> 0x048a }
            int r0 = r3.current()     // Catch:{ IllegalArgumentException -> 0x048a }
            int r9 = r7.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x048a }
            r0 = r30
            if (r9 == r0) goto L_0x0430
            java.lang.String r2 = "Query must start with ASCII question mark '?'"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x048a }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x048a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x048a }
        L_0x0430:
            int r9 = r3.next()     // Catch:{ IllegalArgumentException -> 0x048a }
            if (r9 >= r8) goto L_0x04a4
            r0 = -1
            if (r9 == r0) goto L_0x04a4
            int r11 = r7.codePointAt(r9)     // Catch:{ IllegalArgumentException -> 0x048a }
            boolean r0 = X.C15440rK.A03(r11)     // Catch:{ IllegalArgumentException -> 0x048a }
            if (r0 != 0) goto L_0x0430
            boolean r0 = X.C15440rK.A02(r11)     // Catch:{ IllegalArgumentException -> 0x048a }
            if (r0 != 0) goto L_0x0430
            r0 = 37
            if (r11 == r0) goto L_0x045e
            r0 = 47
            if (r11 == r0) goto L_0x0430
            r0 = 58
            if (r11 == r0) goto L_0x0430
            r0 = r30
            if (r11 == r0) goto L_0x0430
            r0 = 64
            if (r11 == r0) goto L_0x0430
            goto L_0x0465
        L_0x045e:
            r3.next()     // Catch:{ IllegalArgumentException -> 0x047d }
            X.C15440rK.A00(r7, r3)     // Catch:{ IllegalArgumentException -> 0x047d }
            goto L_0x0430
        L_0x0465:
            java.lang.String r8 = "Query contains illegal character "
            r4 = 1
            int[] r0 = new int[]{r11}     // Catch:{ IllegalArgumentException -> 0x048a }
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x048a }
            r3.<init>(r0, r2, r4)     // Catch:{ IllegalArgumentException -> 0x048a }
            java.lang.String r0 = " at string index "
            java.lang.String r2 = X.AnonymousClass00U.A05(r9, r8, r3, r0)     // Catch:{ IllegalArgumentException -> 0x048a }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x048a }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x048a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x048a }
        L_0x047d:
            r3 = move-exception
            java.lang.String r0 = "Query contains invalid percent encoded character at string index "
            java.lang.String r2 = X.AnonymousClass00U.A0J(r0, r9)     // Catch:{ IllegalArgumentException -> 0x048a }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x048a }
            r0.<init>(r2, r3)     // Catch:{ IllegalArgumentException -> 0x048a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x048a }
        L_0x048a:
            r3 = move-exception
            X.0rI r2 = new X.0rI
            r29 = r2
            r30 = r5
            r32 = r6
            r33 = r7
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            java.lang.String r1 = "Uri contained invalid query string"
            X.0rF r0 = new X.0rF
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x04a2:
            r7 = r1
            goto L_0x04ad
        L_0x04a4:
            r0 = r32
            if (r10 >= r0) goto L_0x0548
            int r8 = r4.codePointAt(r10)
            r9 = r10
        L_0x04ad:
            r0 = r28
            if (r8 != r0) goto L_0x04b5
            java.lang.String r1 = r4.substring(r9)
        L_0x04b5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalArgumentException -> 0x0530 }
            if (r0 != 0) goto L_0x0548
            r3.setText(r1)     // Catch:{ IllegalArgumentException -> 0x0530 }
            int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0530 }
            int r0 = r3.current()     // Catch:{ IllegalArgumentException -> 0x0530 }
            int r8 = r1.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x0530 }
            r0 = r28
            if (r8 == r0) goto L_0x04d6
            java.lang.String r0 = "Fragment must start with ASCII number sign '#'"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0530 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0530 }
        L_0x04d5:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0530 }
        L_0x04d6:
            int r9 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0530 }
            if (r9 >= r4) goto L_0x0548
            r0 = -1
            if (r9 == r0) goto L_0x0548
            int r10 = r1.codePointAt(r9)     // Catch:{ IllegalArgumentException -> 0x0530 }
            boolean r0 = X.C15440rK.A03(r10)     // Catch:{ IllegalArgumentException -> 0x0530 }
            if (r0 != 0) goto L_0x04d6
            boolean r0 = X.C15440rK.A02(r10)     // Catch:{ IllegalArgumentException -> 0x0530 }
            if (r0 != 0) goto L_0x04d6
            r0 = 37
            if (r10 == r0) goto L_0x0504
            r0 = 47
            if (r10 == r0) goto L_0x04d6
            r0 = 58
            if (r10 == r0) goto L_0x04d6
            r0 = r30
            if (r10 == r0) goto L_0x04d6
            r0 = 64
            if (r10 == r0) goto L_0x04d6
            goto L_0x050b
        L_0x0504:
            r3.next()     // Catch:{ IllegalArgumentException -> 0x0523 }
            X.C15440rK.A00(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0523 }
            goto L_0x04d6
        L_0x050b:
            java.lang.String r8 = "Fragment contains illegal character "
            r4 = 1
            int[] r0 = new int[]{r10}     // Catch:{ IllegalArgumentException -> 0x0530 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0530 }
            r3.<init>(r0, r2, r4)     // Catch:{ IllegalArgumentException -> 0x0530 }
            java.lang.String r0 = " at string index "
            java.lang.String r0 = X.AnonymousClass00U.A05(r9, r8, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0530 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0530 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0530 }
            goto L_0x04d5
        L_0x0523:
            r3 = move-exception
            java.lang.String r0 = "Fragment contains invalid percent encoded character at string index "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0530 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0530 }
            r2.<init>(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0530 }
            goto L_0x04d5
        L_0x0530:
            r3 = move-exception
            X.0rI r2 = new X.0rI
            r29 = r2
            r30 = r5
            r32 = r6
            r33 = r7
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            java.lang.String r1 = "Uri contained invalid fragment"
            X.0rF r0 = new X.0rF
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0548:
            X.0rI r29 = new X.0rI
            r30 = r5
            r32 = r6
            r33 = r7
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            return r29
        L_0x0556:
            r3 = move-exception
            X.0rI r2 = new X.0rI
            r29 = r2
            r30 = r5
            r32 = r6
            r33 = r1
            r34 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            java.lang.String r1 = "Uri contained an invalid path"
            X.0rF r0 = new X.0rF
            r0.<init>(r2, r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15420rI.A01(java.lang.String, java.lang.String, java.text.BreakIterator, int, int):X.0rI");
    }
}
