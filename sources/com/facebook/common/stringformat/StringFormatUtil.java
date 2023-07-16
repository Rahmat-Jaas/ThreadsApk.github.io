package com.facebook.common.stringformat;

import X.AnonymousClass00U;
import java.util.Formatter;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

public class StringFormatUtil {
    public static final Object[] A00 = {null};

    public static int A00(Object obj, Object obj2, Object obj3, Object obj4, String str, StringBuilder sb, int i) {
        int A01;
        boolean z = false;
        if (sb == null) {
            z = true;
        }
        int i2 = 0;
        if (i == 0) {
            i2 = -1;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (i3 == -1) {
                A01 = A01((Object) null, str, sb, i4, false);
            } else if (i3 == 0) {
                A01 = A01(obj, str, sb, i4, true);
            } else if (i3 == 1) {
                A01 = A01(obj2, str, sb, i4, true);
            } else if (i3 == 2) {
                A01 = A01(obj3, str, sb, i4, true);
            } else if (i3 == 3) {
                A01 = A01(obj4, str, sb, i4, true);
            } else {
                throw new AssertionError();
            }
            if (A01 == -1) {
                return -1;
            }
            if (z) {
                i5 += A01;
            }
            i4 = A02(str, i4);
            if (i3 == i2 && i4 == -200) {
                if (!z) {
                    return -3;
                }
                return -2;
            } else if (i4 >= 0) {
                i3++;
            } else if (i4 == -200 || i4 == -201) {
                if (z) {
                    return i5;
                }
            }
        }
        return A03(str, sb, i4, i5, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r11 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(java.lang.String r12, java.lang.StringBuilder r13, java.lang.Object... r14) {
        /*
            r11 = 1
            r10 = 0
            r9 = 0
            if (r13 != 0) goto L_0x0006
            r9 = 1
        L_0x0006:
            if (r14 == 0) goto L_0x0030
            int r0 = r14.length
            if (r0 == 0) goto L_0x0030
            r8 = 0
        L_0x000c:
            int r7 = r14.length
            r6 = 0
            r5 = 0
            r4 = 0
        L_0x0010:
            r3 = -201(0xffffffffffffff37, float:NaN)
            r2 = -200(0xffffffffffffff38, float:NaN)
            if (r10 >= r7) goto L_0x0034
            r1 = r14[r10]
            r0 = r8 ^ 1
            int r1 = A01(r1, r12, r13, r6, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0048
            if (r9 == 0) goto L_0x0024
            int r5 = r5 + r1
        L_0x0024:
            int r6 = A02(r12, r6)
            if (r6 == r2) goto L_0x0034
            if (r6 == r3) goto L_0x0035
            int r10 = r10 + 1
            r4 = 1
            goto L_0x0010
        L_0x0030:
            java.lang.Object[] r14 = A00
            r8 = 1
            goto L_0x000c
        L_0x0034:
            r11 = r4
        L_0x0035:
            if (r9 == 0) goto L_0x003b
            if (r11 != 0) goto L_0x003b
            r0 = -2
            return r0
        L_0x003b:
            if (r6 == r2) goto L_0x0044
            if (r6 == r3) goto L_0x0044
            int r0 = A03(r12, r13, r6, r5, r9)
            return r0
        L_0x0044:
            if (r9 == 0) goto L_0x0047
            return r5
        L_0x0047:
            r0 = -3
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A04(java.lang.String, java.lang.StringBuilder, java.lang.Object[]):int");
    }

    public static String A05(String str, Object... objArr) {
        try {
            return String.format((Locale) null, str, objArr);
        } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
            throw new RuntimeException(AnonymousClass00U.A0V(e.getMessage(), ": ", str));
        }
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int A04 = A04(str, (StringBuilder) null, objArr);
        if (A04 == -1) {
            new Formatter(sb).format((Locale) null, str, objArr);
        } else if (A04 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(A04);
            A04(str, sb, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        String str2 = str;
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        int A002 = A00(obj4, obj5, obj6, (Object) null, str2, (StringBuilder) null, 3);
        if (A002 == -1) {
            return A05(str2, obj, obj2, obj3);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(A002);
        A00(obj4, obj5, obj6, (Object) null, str2, sb, 3);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00c6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.Object r7, java.lang.String r8, java.lang.StringBuilder r9, int r10, boolean r11) {
        /*
            int r3 = r8.length()
            r6 = 0
        L_0x0005:
            if (r10 >= r3) goto L_0x0046
            char r0 = r8.charAt(r10)
            r5 = 37
            if (r0 != r5) goto L_0x00c2
            int r0 = r10 + 1
            if (r3 <= r0) goto L_0x0043
            char r1 = r8.charAt(r0)
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x0021
            r0 = 100
            if (r1 == r0) goto L_0x0021
            if (r1 != r5) goto L_0x0043
        L_0x0021:
            r1 = -100
        L_0x0023:
            r0 = -100
            r2 = -1
            if (r1 != r0) goto L_0x0032
            int r4 = r10 + 1
            char r1 = r8.charAt(r4)
            if (r11 != 0) goto L_0x0033
            if (r1 == r5) goto L_0x00b4
        L_0x0032:
            return r2
        L_0x0033:
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x0049
            boolean r0 = r7 instanceof java.util.Formattable
            if (r0 == 0) goto L_0x0084
            if (r9 == 0) goto L_0x0032
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0043:
            r1 = -101(0xffffffffffffff9b, float:NaN)
            goto L_0x0023
        L_0x0046:
            if (r9 != 0) goto L_0x0057
            return r6
        L_0x0049:
            r0 = 100
            if (r1 != r0) goto L_0x00b2
            r1 = 4
            if (r7 != 0) goto L_0x0059
            if (r9 == 0) goto L_0x0095
            java.lang.String r0 = "null"
        L_0x0054:
            r9.append(r0)
        L_0x0057:
            r6 = -3
            return r6
        L_0x0059:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0062
            if (r9 != 0) goto L_0x0071
            r1 = 11
            goto L_0x0095
        L_0x0062:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L_0x006a
            if (r9 != 0) goto L_0x0071
            r1 = 6
            goto L_0x0095
        L_0x006a:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L_0x007b
            if (r9 != 0) goto L_0x0071
            goto L_0x0095
        L_0x0071:
            java.lang.Number r7 = (java.lang.Number) r7
            int r0 = r7.intValue()
            r9.append(r0)
            goto L_0x0057
        L_0x007b:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L_0x00aa
            if (r9 != 0) goto L_0x00a0
            r1 = 20
            goto L_0x0095
        L_0x0084:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x0099
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
        L_0x008b:
            if (r0 != 0) goto L_0x008f
        L_0x008d:
            java.lang.String r0 = "null"
        L_0x008f:
            if (r9 != 0) goto L_0x0054
            int r1 = r0.length()
        L_0x0095:
            r0 = 1
            if (r1 != r2) goto L_0x00be
            return r2
        L_0x0099:
            if (r7 == 0) goto L_0x008d
            java.lang.String r0 = r7.toString()
            goto L_0x008b
        L_0x00a0:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            r9.append(r0)
            goto L_0x0057
        L_0x00aa:
            if (r9 == 0) goto L_0x0032
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00b2:
            if (r1 != r5) goto L_0x0032
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.append(r5)
        L_0x00b9:
            r10 = r4
            r1 = 1
            r0 = 0
            if (r9 != 0) goto L_0x00c6
        L_0x00be:
            int r6 = r6 + r1
            if (r0 == 0) goto L_0x00c6
            return r6
        L_0x00c2:
            if (r9 != 0) goto L_0x00ca
            int r6 = r6 + 1
        L_0x00c6:
            int r10 = r10 + 1
            goto L_0x0005
        L_0x00ca:
            r9.append(r0)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A01(java.lang.Object, java.lang.String, java.lang.StringBuilder, int, boolean):int");
    }

    public static int A02(String str, int i) {
        int i2;
        char charAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && length > (i2 = i + 1) && ((charAt = str.charAt(i2)) == 's' || charAt == 'd' || charAt == '%')) {
                int i3 = i + 1;
                if (str.charAt(i3) != '%') {
                    return i + 2;
                }
                i = i3;
                z = true;
            }
            i++;
        }
        if (z) {
            return -201;
        }
        return -200;
    }

    public static int A03(String str, StringBuilder sb, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '%' || (length > (i = i + 1) && str.charAt(i) == '%')) {
                if (sb == null) {
                    i3++;
                } else {
                    sb.append(charAt);
                }
                i++;
            } else if (z) {
                return -1;
            } else {
                throw new AssertionError();
            }
        }
        if (z) {
            return i2 + i3;
        }
        return -3;
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        String str2 = str;
        Object obj3 = obj;
        Object obj4 = obj2;
        int A002 = A00(obj3, obj4, (Object) null, (Object) null, str2, (StringBuilder) null, 2);
        if (A002 == -1) {
            return A05(str2, obj, obj2);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(A002);
        A00(obj3, obj4, (Object) null, (Object) null, str2, sb, 2);
        return sb.toString();
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        int A002 = A00(obj2, (Object) null, (Object) null, (Object) null, str2, (StringBuilder) null, 1);
        if (A002 == -1) {
            return A05(str2, obj);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(A002);
        A00(obj2, (Object) null, (Object) null, (Object) null, str2, sb, 1);
        return sb.toString();
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        String str2 = str;
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object obj8 = obj4;
        int A002 = A00(obj5, obj6, obj7, obj8, str2, (StringBuilder) null, 4);
        if (A002 == -1) {
            return A05(str2, obj, obj2, obj3, obj4);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(A002);
        A00(obj5, obj6, obj7, obj8, str2, sb, 4);
        return sb.toString();
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        int A04 = A04(str, (StringBuilder) null, objArr);
        if (A04 == -1) {
            return A05(str, objArr);
        }
        if (A04 == -2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(A04);
        A04(str, sb, objArr);
        return sb.toString();
    }

    public static String formatStrLocaleSafe(String str) {
        String str2 = str;
        int A002 = A00((Object) null, (Object) null, (Object) null, (Object) null, str2, (StringBuilder) null, 0);
        if (A002 == -1) {
            return A05(str2, new Object[0]);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(A002);
        A00((Object) null, (Object) null, (Object) null, (Object) null, str2, sb, 0);
        return sb.toString();
    }
}
