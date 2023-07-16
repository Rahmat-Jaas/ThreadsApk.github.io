package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;

/* renamed from: X.0gm  reason: invalid class name and case insensitive filesystem */
public final class C09840gm {
    public static final byte[] A00(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i3 > i) {
            throw new IllegalArgumentException(AnonymousClass00U.A0F("outputW>inputW: ", BasicHeaderValueParser.ELEM_DELIMITER, i3, i));
        } else if (i4 <= i2) {
            int i5 = ((i3 * i4) * 3) >> 1;
            byte[] bArr2 = new byte[i5];
            int i6 = ((i2 >> 1) - (i4 >> 1)) * i;
            int i7 = (i5 / 3) << 1;
            for (int i8 = 0; i8 < i7; i8++) {
                bArr2[i8] = bArr[i8 + i6];
            }
            int length = (bArr.length / 3) << 1;
            int i9 = i6 >> 1;
            int i10 = i5 - i7;
            for (int i11 = 0; i11 < i10; i11++) {
                bArr2[i11 + i7] = bArr[i11 + length + i9];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException(AnonymousClass00U.A0F("outputH>inputH: ", BasicHeaderValueParser.ELEM_DELIMITER, i4, i2));
        }
    }
}
