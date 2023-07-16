package X;

/* renamed from: X.81B  reason: invalid class name */
public final class AnonymousClass81B implements Runnable {
    public final /* synthetic */ AnonymousClass7mN A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81B(AnonymousClass7mN r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass7HU r1 = this.A01;
        if (r1.A05) {
            this.A00.A01.A06();
            return;
        }
        try {
            AnonymousClass7mN r2 = this.A00;
            r2.A01.A0B(r2.A00.Cx8(r1));
        } catch (AnonymousClass88O e) {
            e = e;
            boolean z = e.getCause() instanceof Exception;
            AnonymousClass7HU r12 = this.A00.A01;
            if (z) {
                e = (Exception) e.getCause();
            }
            r12.A0A(e);
        } catch (Exception e2) {
            this.A00.A01.A0A(e2);
        }
    }
}
