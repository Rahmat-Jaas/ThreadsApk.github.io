package X;

import java.io.OutputStream;
import java.io.Writer;

/* renamed from: X.0An  reason: invalid class name and case insensitive filesystem */
public abstract class C02280An {
    public int A00;
    public final AnonymousClass0AV A01;
    public final C02150Aa A02;
    public final Writer A03;
    public final /* synthetic */ C02290Ao A04;

    public C02280An(AnonymousClass0AV r4, C02290Ao r5, OutputStream outputStream) {
        this.A04 = r5;
        this.A01 = r4;
        AnonymousClass0Bh r1 = new AnonymousClass0Bh(new C02440Bj(outputStream, r5.A05), r5.A08);
        this.A03 = r1;
        this.A02 = new C02150Aa(r1);
    }
}
