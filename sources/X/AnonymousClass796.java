package X;

import com.google.common.base.Strings;

/* renamed from: X.796  reason: invalid class name */
public abstract class AnonymousClass796 {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final int hashCode() {
        byte[] bArr = ((C93825rk) this).A00;
        int length = bArr.length;
        if ((length << 3) < 32) {
            byte b = bArr[0] & 255;
            for (int i = 1; i < length; i++) {
                b |= (bArr[i] & 255) << (i << 3);
            }
            return b;
        } else if (C86114wI.A1U(length, 4)) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        } else {
            throw C18180wK.A0a(Strings.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", C18210wN.A1X(length)));
        }
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(r5 << 1);
        for (byte b : ((C93825rk) this).A00) {
            char[] cArr = A00;
            A0s.append(cArr[(b >> 4) & 15]);
            A0s.append(cArr[b & 15]);
        }
        return A0s.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass796)) {
            return false;
        }
        byte[] bArr = ((C93825rk) this).A00;
        int length = bArr.length;
        int i = length << 3;
        byte[] bArr2 = ((C93825rk) ((AnonymousClass796) obj)).A00;
        int length2 = bArr2.length;
        if (i != (length2 << 3) || length != length2) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < length; i2++) {
            z &= AnonymousClass0wJ.A1T(bArr[i2], bArr2[i2]);
        }
        if (z) {
            return true;
        }
        return false;
    }
}
