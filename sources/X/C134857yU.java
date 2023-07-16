package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.7yU  reason: invalid class name and case insensitive filesystem */
public final class C134857yU implements Comparable, Serializable {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] A00;
    public transient int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r5 = ((X.C134857yU) r8).A00;
        r0 = r5.length;
        r4 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x0026
            boolean r0 = r8 instanceof X.C134857yU
            if (r0 == 0) goto L_0x0025
            X.7yU r8 = (X.C134857yU) r8
            byte[] r5 = r8.A00
            int r0 = r5.length
            byte[] r4 = r7.A00
            int r3 = r4.length
            if (r0 != r3) goto L_0x0025
            r1 = 0
            int r0 = r0 - r3
            if (r1 > r0) goto L_0x0025
            int r0 = r3 - r3
            if (r1 > r0) goto L_0x0025
            r2 = 0
        L_0x001a:
            if (r2 >= r3) goto L_0x0026
            byte r1 = r5[r2]
            byte r0 = r4[r2]
            if (r1 != r0) goto L_0x0025
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0025:
            r6 = 0
        L_0x0026:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134857yU.equals(java.lang.Object):boolean");
    }

    public static C134857yU A00(byte... bArr) {
        if (bArr != null) {
            return new C134857yU((byte[]) bArr.clone());
        }
        throw C18190wL.A0a("data == null");
    }

    public final byte[] A01() {
        return (byte[]) this.A00.clone();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = ((C134857yU) obj).A00;
        int length2 = bArr2.length;
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min) {
            byte b = bArr[i] & 255;
            byte b2 = bArr2[i] & 255;
            if (b == b2) {
                i++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        int i = this.A01;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A00);
        this.A01 = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.A00;
        if (r6 == 0) {
            return "ByteString[size=0]";
        }
        Object[] A1X = C18220wO.A1X();
        C86164wN.A1O(A1X, r6, 0);
        if (r6 <= 16) {
            char[] cArr = new char[(r6 << 1)];
            int i = 0;
            for (byte A0B : bArr) {
                i = C86134wK.A0B(A02, cArr, A0B, i, i + 1);
            }
            A1X[1] = new String(cArr);
            str = "ByteString[size=%s data=%s]";
        } else {
            try {
                char[] cArr2 = new char[(r6 << 1)];
                int i2 = 0;
                for (byte A0B2 : A00(MessageDigest.getInstance("MD5").digest(bArr)).A00) {
                    i2 = C86134wK.A0B(A02, cArr2, A0B2, i2, i2 + 1);
                }
                A1X[1] = new String(cArr2);
                str = "ByteString[size=%s md5=%s]";
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        }
        return String.format(str, A1X);
    }

    public C134857yU(byte[] bArr) {
        this.A00 = bArr;
    }
}
