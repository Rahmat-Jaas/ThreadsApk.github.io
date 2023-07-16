package X;

import java.io.ByteArrayOutputStream;
import java.io.Writer;

/* renamed from: X.08h  reason: invalid class name and case insensitive filesystem */
public final class C017508h extends C04950Qa {
    public final ByteArrayOutputStream A00;

    public final void A03() {
    }

    public final int A00() {
        return this.A00.size();
    }

    public final void A04() {
        this.A00.reset();
    }

    public final void A05(Writer writer) {
        writer.write(this.A00.toString());
    }

    public C017508h(AnonymousClass0AT r1, ByteArrayOutputStream byteArrayOutputStream) {
        super(r1, byteArrayOutputStream);
        this.A00 = byteArrayOutputStream;
    }

    public final AnonymousClass0AV A01() {
        return AnonymousClass0M3.A01().A02(this.A00);
    }
}
