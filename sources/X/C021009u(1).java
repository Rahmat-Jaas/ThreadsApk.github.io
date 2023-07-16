package X;

import java.io.InputStream;

/* renamed from: X.09u  reason: invalid class name and case insensitive filesystem */
public final class C021009u implements C02620Cd, AnonymousClass0VI {
    public final int A00;

    public C021009u() {
    }

    public final boolean ACb() {
        return false;
    }

    public final InputStream Ap9(InputStream inputStream) {
        return new AnonymousClass0D4(inputStream, this.A00);
    }

    public final int AvE() {
        return 1;
    }

    public final boolean BaJ() {
        return false;
    }

    public final boolean Bhw() {
        return true;
    }

    public C021009u(byte[] bArr) {
        if (bArr.length == 1) {
            this.A00 = (bArr[0] & 255) + 1;
            return;
        }
        throw new AnonymousClass0V8("Unsupported Delta filter properties");
    }
}
