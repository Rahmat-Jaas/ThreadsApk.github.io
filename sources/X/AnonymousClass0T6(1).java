package X;

/* renamed from: X.0T6  reason: invalid class name */
public final class AnonymousClass0T6 implements Cloneable {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass0T5 A05;
    public AnonymousClass0T5 A06;
    public AnonymousClass0T5 A07;

    public AnonymousClass0T6() {
        AnonymousClass0T5 r0 = AnonymousClass0T5.GREEN;
        this.A06 = r0;
        this.A07 = r0;
        this.A05 = r0;
    }

    /* renamed from: A00 */
    public final AnonymousClass0T6 clone() {
        try {
            AnonymousClass0T6 r2 = (AnonymousClass0T6) super.clone();
            r2.A06 = this.A06;
            r2.A07 = this.A07;
            r2.A05 = this.A05;
            r2.A03 = this.A03;
            r2.A01 = this.A01;
            r2.A02 = this.A02;
            r2.A00 = this.A00;
            return r2;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
