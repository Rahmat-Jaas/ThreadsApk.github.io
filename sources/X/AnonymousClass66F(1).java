package X;

import java.io.OutputStream;

/* renamed from: X.66F  reason: invalid class name */
public final class AnonymousClass66F extends OutputStream {
    public final C111536nq A00;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Funnels.asOutputStream(");
        A0s.append(this.A00);
        return C18180wK.A0i(")", A0s);
    }

    public final void write(byte[] bArr, int i, int i2) {
        AnonymousClass7Ko.A03(i, i + i2, bArr.length);
        AnonymousClass7Ko.A06((C93815rj) this.A00, bArr, i, i2);
    }

    public AnonymousClass66F(C111536nq r1) {
        this.A00 = r1;
    }

    public final void write(int i) {
        C93815rj r3 = (C93815rj) this.A00;
        AnonymousClass7Ko.A0E(!r3.A00, "Cannot re-use a Hasher after calling hash() on it");
        r3.A03.update((byte) i);
    }

    public final void write(byte[] bArr) {
        bArr.getClass();
        AnonymousClass7Ko.A06((C93815rj) this.A00, bArr, 0, bArr.length);
    }
}
