package X;

import java.io.PrintWriter;

/* renamed from: X.06F  reason: invalid class name */
public final class AnonymousClass06F implements C143158gC {
    public boolean A00 = false;
    public final AnonymousClass06D A01;
    public final AnonymousClass06K A02;

    public final void onChanged(Object obj) {
        this.A00 = true;
        this.A01.C55(this.A02, obj);
    }

    public final String toString() {
        return this.A01.toString();
    }

    public AnonymousClass06F(AnonymousClass06D r2, AnonymousClass06K r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00(PrintWriter printWriter, String str) {
        printWriter.print(str);
        printWriter.print("mDeliveredData=");
        printWriter.println(this.A00);
    }

    public final boolean A01() {
        return this.A00;
    }
}
