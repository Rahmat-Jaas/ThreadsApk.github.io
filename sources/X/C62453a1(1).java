package X;

import java.util.TimeZone;

/* renamed from: X.3a1  reason: invalid class name and case insensitive filesystem */
public final class C62453a1 {
    public static final TimeZone A00 = TimeZone.getTimeZone("UTC");

    public static int A00(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i3 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i4 = -digit;
            } else {
                throw new NumberFormatException(AnonymousClass00U.A0L("Invalid number: ", str.substring(i, i2)));
            }
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < i2) {
            int i5 = i3 + 1;
            int digit2 = Character.digit(str.charAt(i3), 10);
            if (digit2 >= 0) {
                i4 = (i4 * 10) - digit2;
                i3 = i5;
            } else {
                throw new NumberFormatException(AnonymousClass00U.A0L("Invalid number: ", str.substring(i, i2)));
            }
        }
        return -i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0177 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date A01(java.lang.String r16, java.text.ParsePosition r17) {
        /*
            r3 = r16
            int r0 = r17.getIndex()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r2 = r0 + 4
            int r16 = A00(r3, r0, r2)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r15 = 45
            boolean r0 = A02(r3, r15, r2)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == 0) goto L_0x0016
            int r2 = r2 + 1
        L_0x0016:
            int r1 = r2 + 2
            int r12 = A00(r3, r2, r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            boolean r0 = A02(r3, r15, r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == 0) goto L_0x0024
            int r1 = r1 + 1
        L_0x0024:
            int r6 = r1 + 2
            int r11 = A00(r3, r1, r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 84
            boolean r1 = A02(r3, r0, r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r8 = 0
            r13 = 1
            if (r1 != 0) goto L_0x004f
            int r0 = r3.length()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 > r6) goto L_0x004f
            int r12 = r12 - r13
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = r16
            r1.<init>(r0, r12, r11)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r1.setLenient(r8)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = r17
            r0.setIndex(r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.util.Date r0 = r1.getTime()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            return r0
        L_0x004f:
            r14 = 43
            r5 = 90
            r10 = 2
            if (r1 == 0) goto L_0x00cb
            int r0 = r6 + 1
            int r4 = r0 + 2
            int r9 = A00(r3, r0, r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r2 = 58
            boolean r0 = A02(r3, r2, r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == 0) goto L_0x0068
            int r4 = r4 + 1
        L_0x0068:
            int r1 = r4 + 2
            int r8 = A00(r3, r4, r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            boolean r0 = A02(r3, r2, r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == 0) goto L_0x0076
            int r1 = r1 + 1
        L_0x0076:
            int r4 = r3.length()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r4 <= r1) goto L_0x00ce
            char r0 = r3.charAt(r1)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == r5) goto L_0x00ce
            if (r0 == r14) goto L_0x00ce
            if (r0 == r15) goto L_0x00ce
            int r6 = r1 + 2
            int r7 = A00(r3, r1, r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 59
            if (r7 <= r0) goto L_0x0096
            r0 = 63
            if (r7 >= r0) goto L_0x0096
            r7 = 59
        L_0x0096:
            r0 = 46
            boolean r0 = A02(r3, r0, r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 == 0) goto L_0x00c9
            int r1 = r6 + 1
            int r6 = r1 + 1
        L_0x00a2:
            if (r6 >= r4) goto L_0x00b3
            char r2 = r3.charAt(r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 48
            if (r2 < r0) goto L_0x00b4
            r0 = 57
            if (r2 > r0) goto L_0x00b4
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00b3:
            r6 = r4
        L_0x00b4:
            int r0 = r1 + 3
            int r0 = java.lang.Math.min(r6, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r2 = A00(r3, r1, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r0 = r0 - r1
            if (r0 == r13) goto L_0x00c6
            if (r0 != r10) goto L_0x00d1
            int r2 = r2 * 10
            goto L_0x00d1
        L_0x00c6:
            int r2 = r2 * 100
            goto L_0x00d1
        L_0x00c9:
            r2 = 0
            goto L_0x00d1
        L_0x00cb:
            r9 = 0
            r2 = 0
            goto L_0x00d0
        L_0x00ce:
            r2 = 0
            r6 = r1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            int r0 = r3.length()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 <= r6) goto L_0x0177
            char r4 = r3.charAt(r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r1 = 5
            if (r4 != r5) goto L_0x0115
            java.util.TimeZone r4 = A00     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r6 = r6 + 1
        L_0x00e2:
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 0
            r5.setLenient(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = r16
            r5.set(r13, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r12 = r12 - r13
            r5.set(r10, r12)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r5.set(r1, r11)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 11
            r5.set(r0, r9)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 12
            r5.set(r0, r8)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 13
            r5.set(r0, r7)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = 14
            r5.set(r0, r2)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r0 = r17
            r0.setIndex(r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.util.Date r0 = r5.getTime()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            return r0
        L_0x0115:
            if (r4 == r14) goto L_0x011a
            if (r4 == r15) goto L_0x011a
            goto L_0x017e
        L_0x011a:
            java.lang.String r4 = r3.substring(r6)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r0 = r4.length()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 >= r1) goto L_0x012a
            java.lang.String r0 = "00"
            java.lang.String r4 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
        L_0x012a:
            int r0 = r4.length()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            int r6 = r6 + r0
            java.lang.String r0 = "+0000"
            boolean r0 = r0.equals(r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "+00:00"
            boolean r0 = r0.equals(r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "GMT"
            java.lang.String r5 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r5)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.lang.String r15 = r4.getID()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            boolean r0 = r15.equals(r5)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r14 = ":"
            java.lang.String r0 = ""
            java.lang.String r0 = r15.replace(r14, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            boolean r0 = r0.equals(r5)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            if (r0 != 0) goto L_0x00e2
            java.lang.String r2 = "Mismatching time zone indicator: "
            java.lang.String r1 = " given, resolves to "
            java.lang.String r0 = r4.getID()     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r5, r1, r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            goto L_0x018b
        L_0x0173:
            java.util.TimeZone r4 = A00     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            goto L_0x00e2
        L_0x0177:
            java.lang.String r0 = "No time zone indicator"
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            goto L_0x018b
        L_0x017e:
            java.lang.String r1 = "Invalid time zone indicator '"
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass00U.A0N(r1, r0, r4)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
        L_0x018b:
            throw r1     // Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x018c }
        L_0x018c:
            r4 = move-exception
            if (r3 != 0) goto L_0x01bd
            r3 = 0
        L_0x0190:
            java.lang.String r2 = r4.getMessage()
            if (r2 == 0) goto L_0x019c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01a8
        L_0x019c:
            java.lang.String r2 = "("
            java.lang.String r1 = X.C18220wO.A0q(r4)
            java.lang.String r0 = ")"
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r1, r0)
        L_0x01a8:
            java.lang.String r1 = "Failed to parse date ["
            java.lang.String r0 = "]: "
            java.lang.String r2 = X.AnonymousClass00U.A0d(r1, r3, r0, r2)
            int r1 = r17.getIndex()
            java.text.ParseException r0 = new java.text.ParseException
            r0.<init>(r2, r1)
            r0.initCause(r4)
            throw r0
        L_0x01bd:
            java.lang.String r1 = "\""
            r0 = 34
            java.lang.String r3 = X.AnonymousClass00U.A0M(r1, r3, r0)
            goto L_0x0190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62453a1.A01(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean A02(String str, char c, int i) {
        if (i >= str.length() || str.charAt(i) != c) {
            return false;
        }
        return true;
    }
}
