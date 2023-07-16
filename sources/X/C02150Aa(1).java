package X;

import java.io.Writer;

/* renamed from: X.0Aa  reason: invalid class name and case insensitive filesystem */
public final class C02150Aa {
    public boolean A00;
    public boolean A01;
    public final Writer A02;

    public static void A00(C02150Aa r1) {
        Writer writer;
        int i;
        if (!r1.A00) {
            r1.A00 = true;
            writer = r1.A02;
            i = 123;
        } else {
            writer = r1.A02;
            i = 44;
        }
        writer.write(i);
    }

    public final void A01(AnonymousClass0LH r4) {
        Writer writer;
        if (!this.A01) {
            A00(this);
            writer = this.A02;
            writer.write("\"data\":[");
            this.A01 = true;
        } else {
            writer = this.A02;
            writer.write(44);
        }
        AnonymousClass0SJ.A01(writer, "Writer is null!");
        AnonymousClass0SJ.A01(r4.A02, "No encoder set, please call setEncoder() first!");
        r4.A02.A04(r4, writer);
    }

    public C02150Aa(Writer writer) {
        this.A02 = writer;
    }
}
