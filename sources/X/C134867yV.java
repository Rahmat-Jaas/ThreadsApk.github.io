package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.7yV  reason: invalid class name and case insensitive filesystem */
public final class C134867yV implements Comparable, Serializable {
    public static final C134867yV A02 = A00(new byte[0]);
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r5 = ((X.C134867yV) r8).data;
        r0 = r5.length;
        r4 = r7.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x0026
            boolean r0 = r8 instanceof X.C134867yV
            if (r0 == 0) goto L_0x0025
            X.7yV r8 = (X.C134867yV) r8
            byte[] r5 = r8.data
            int r0 = r5.length
            byte[] r4 = r7.data
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
        throw new UnsupportedOperationException("Method not decompiled: X.C134867yV.equals(java.lang.Object):boolean");
    }

    public static C134867yV A00(byte... bArr) {
        if (bArr != null) {
            return new C134867yV((byte[]) bArr.clone());
        }
        throw C18190wL.A0a("data == null");
    }

    public final byte[] A01() {
        return (byte[]) this.data.clone();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        byte[] bArr = this.data;
        int length = bArr.length;
        byte[] bArr2 = ((C134867yV) obj).data;
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
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder A0s;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String str2 = this.A01;
        if (str2 == null) {
            str2 = new String(bArr, AnonymousClass6ZG.A00);
            this.A01 = str2;
        }
        int length = str2.length();
        int i = length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                if (i3 == 64) {
                    break;
                }
                int codePointAt = str2.codePointAt(i2);
                if (Character.isISOControl(codePointAt)) {
                    if (!(codePointAt == 10 || codePointAt == 13)) {
                        break;
                    }
                } else if (codePointAt == 65533) {
                    break;
                }
                i3++;
                i2 += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        length = -1;
        i2 = length;
        if (i2 == -1) {
            byte[] bArr2 = this.data;
            if (r8 <= 64) {
                A0s = C18190wL.A0s("[hex=");
                char[] cArr = new char[(r8 << 1)];
                int i4 = 0;
                for (byte A0B : bArr2) {
                    i4 = C86134wK.A0B(A03, cArr, A0B, i4, i4 + 1);
                }
                str = new String(cArr);
                sb.append(str);
                sb.append("]");
                return sb.toString();
            }
            sb = C18200wM.A0r();
            sb.append("[size=");
            sb.append(r8);
            sb.append(" hex=");
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr2, 0, bArr3, 0, 64);
            char[] cArr2 = new char[(r7 << 1)];
            int i5 = 0;
            for (byte A0B2 : new C134867yV(bArr3).data) {
                i5 = C86134wK.A0B(A03, cArr2, A0B2, i5, i5 + 1);
            }
            str = new String(cArr2);
        } else {
            str = str2.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 < i) {
                sb = C18200wM.A0r();
                sb.append("[size=");
                sb.append(this.data.length);
                sb.append(" text=");
            } else {
                A0s = C18190wL.A0s("[text=");
                sb.append(str);
                sb.append("]");
                return sb.toString();
            }
        }
        sb.append(str);
        sb.append("…]");
        return sb.toString();
    }

    public C134867yV(byte[] bArr) {
        this.data = bArr;
    }
}
