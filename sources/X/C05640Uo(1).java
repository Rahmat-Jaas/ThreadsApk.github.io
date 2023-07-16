package X;

import java.util.zip.CRC32;

/* renamed from: X.0Uo  reason: invalid class name and case insensitive filesystem */
public final class C05640Uo extends AnonymousClass0AN {
    public final CRC32 A00 = new CRC32();

    public C05640Uo() {
        this.A00 = 4;
        this.A01 = "CRC32";
    }

    public final void A00(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    public final byte[] A01() {
        CRC32 crc32 = this.A00;
        long value = crc32.getValue();
        byte[] bArr = {(byte) ((int) value), (byte) ((int) (value >>> 8)), (byte) ((int) (value >>> 16)), (byte) ((int) (value >>> 24))};
        crc32.reset();
        return bArr;
    }
}
