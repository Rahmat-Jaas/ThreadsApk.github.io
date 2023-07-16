package X;

import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import go.Seq;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.0q7  reason: invalid class name and case insensitive filesystem */
public final class C14770q7 {
    public int A00;
    public char[] A01;
    public final int A02;
    public final String A03;

    public static char A00(C14770q7 r9) {
        int i;
        int i2 = r9.A00 + 1;
        r9.A00 = i2;
        int i3 = r9.A02;
        if (i2 != i3) {
            char[] cArr = r9.A01;
            char c = cArr[i2];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case Seq.RefTracker.REF_OFFSET /*42*/:
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                            case '=':
                            case '>':
                                break;
                            default:
                                int A012 = A01(r9, i2);
                                int i4 = i2 + 1;
                                r9.A00 = i4;
                                if (A012 >= 128) {
                                    if (A012 < 192 || A012 > 247) {
                                        return '?';
                                    }
                                    if (A012 <= 223) {
                                        A012 &= 31;
                                        i = 1;
                                    } else if (A012 <= 239) {
                                        i = 2;
                                        A012 &= 15;
                                    } else {
                                        i = 3;
                                        A012 &= 7;
                                    }
                                    int i5 = 0;
                                    do {
                                        int i6 = i4 + 1;
                                        r9.A00 = i6;
                                        if (i6 == i3 || cArr[i6] != '\\') {
                                            return '?';
                                        }
                                        int i7 = i6 + 1;
                                        r9.A00 = i7;
                                        int A013 = A01(r9, i7);
                                        i4 = i7 + 1;
                                        r9.A00 = i4;
                                        if ((A013 & 192) != 128) {
                                            return '?';
                                        }
                                        A012 = (A012 << 6) + (A013 & 63);
                                        i5++;
                                    } while (i5 < i);
                                }
                                return (char) A012;
                        }
                }
            }
            return c;
        }
        throw new IllegalStateException(AnonymousClass00U.A0L("Unexpected end of DN: ", r9.A03));
    }

    public static int A01(C14770q7 r10, int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < r10.A02) {
            char[] cArr = r10.A01;
            char c = cArr[i];
            if (c >= '0') {
                if (c <= '9') {
                    i2 = c - '0';
                } else if (c >= 'a') {
                    if (c <= 'f') {
                        i2 = c - 'W';
                    }
                } else if (c >= 'A' && c <= 'F') {
                    i2 = c - '7';
                }
                char c2 = cArr[i4];
                if (c2 >= '0') {
                    if (c2 <= '9') {
                        i3 = c2 - '0';
                    } else if (c2 >= 'a') {
                        if (c2 <= 'f') {
                            i3 = c2 - 'W';
                        }
                    } else if (c2 >= 'A' && c2 <= 'F') {
                        i3 = c2 - '7';
                    }
                    return (i2 << 4) + i3;
                }
                throw new IllegalStateException(AnonymousClass00U.A0L("Malformed DN: ", r10.A03));
            }
            throw new IllegalStateException(AnonymousClass00U.A0L("Malformed DN: ", r10.A03));
        }
        throw new IllegalStateException(AnonymousClass00U.A0L("Malformed DN: ", r10.A03));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C14770q7 r9) {
        /*
        L_0x0000:
            int r4 = r9.A00
            int r8 = r9.A02
            r7 = 32
            if (r4 >= r8) goto L_0x0013
            char[] r0 = r9.A01
            char r0 = r0[r4]
            if (r0 != r7) goto L_0x0013
            int r0 = r4 + 1
            r9.A00 = r0
            goto L_0x0000
        L_0x0013:
            if (r4 != r8) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            int r3 = r4 + 1
        L_0x0019:
            r9.A00 = r3
            r1 = r3
            r6 = 61
            if (r3 >= r8) goto L_0x002b
            char[] r0 = r9.A01
            char r0 = r0[r3]
            if (r0 == r6) goto L_0x002b
            if (r0 == r7) goto L_0x002b
            int r3 = r3 + 1
            goto L_0x0019
        L_0x002b:
            java.lang.String r5 = "Unexpected end of DN: "
            if (r3 >= r8) goto L_0x0097
            char[] r2 = r9.A01
            char r0 = r2[r3]
            if (r0 != r7) goto L_0x0048
        L_0x0035:
            if (r1 >= r8) goto L_0x0042
            char r0 = r2[r1]
            if (r0 == r6) goto L_0x0042
            if (r0 != r7) goto L_0x0042
            int r1 = r1 + 1
            r9.A00 = r1
            goto L_0x0035
        L_0x0042:
            char r0 = r2[r1]
            if (r0 != r6) goto L_0x008b
            if (r1 == r8) goto L_0x008b
        L_0x0048:
            int r1 = r1 + 1
            r9.A00 = r1
            if (r1 >= r8) goto L_0x0053
            char r0 = r2[r1]
            if (r0 != r7) goto L_0x0053
            goto L_0x0048
        L_0x0053:
            int r1 = r3 - r4
            r0 = 4
            if (r1 <= r0) goto L_0x0084
            int r0 = r4 + 3
            char r1 = r2[r0]
            r0 = 46
            if (r1 != r0) goto L_0x0084
            char r1 = r2[r4]
            r0 = 79
            if (r1 == r0) goto L_0x006a
            r0 = 111(0x6f, float:1.56E-43)
            if (r1 != r0) goto L_0x0084
        L_0x006a:
            int r0 = r4 + 1
            char r1 = r2[r0]
            r0 = 73
            if (r1 == r0) goto L_0x0076
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto L_0x0084
        L_0x0076:
            int r0 = r4 + 2
            char r1 = r2[r0]
            r0 = 68
            if (r1 == r0) goto L_0x0082
            r0 = 100
            if (r1 != r0) goto L_0x0084
        L_0x0082:
            int r4 = r4 + 4
        L_0x0084:
            int r3 = r3 - r4
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r4, r3)
            return r0
        L_0x008b:
            java.lang.String r0 = r9.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r5, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0097:
            java.lang.String r0 = r9.A03
            java.lang.String r1 = X.AnonymousClass00U.A0L(r5, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14770q7.A02(X.0q7):java.lang.String");
    }

    public C14770q7(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.A03 = name;
        this.A02 = name.length();
        this.A01 = name.toCharArray();
    }
}
