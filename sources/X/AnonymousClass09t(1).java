package X;

import java.io.InputStream;

/* renamed from: X.09t  reason: invalid class name */
public final class AnonymousClass09t implements C02620Cd, AnonymousClass0VI {
    public int A00;

    public AnonymousClass09t() {
    }

    public final boolean ACb() {
        return true;
    }

    public final InputStream Ap9(InputStream inputStream) {
        return new AnonymousClass0C2(inputStream, this.A00);
    }

    public final boolean BaJ() {
        return true;
    }

    public final boolean Bhw() {
        return false;
    }

    public final int AvE() {
        int i = this.A00;
        if (i >= 4096 && i <= 2147483632) {
            return (((i + 15) & -16) >> 10) + 104;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported dictionary size ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public AnonymousClass09t(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                byte b2 = (b & 1) | 2;
                this.A00 = b2;
                this.A00 = b2 << ((b >>> 1) + 11);
                return;
            }
        }
        throw new AnonymousClass0V8("Unsupported LZMA2 properties");
    }
}
