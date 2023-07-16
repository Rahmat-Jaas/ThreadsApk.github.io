package X;

import java.util.concurrent.Executor;

/* renamed from: X.81C  reason: invalid class name */
public final class AnonymousClass81C implements Runnable {
    public final /* synthetic */ C129637mE A00;
    public final /* synthetic */ AnonymousClass7HU A01;

    public AnonymousClass81C(C129637mE r1, AnonymousClass7HU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            C129637mE r2 = this.A00;
            AnonymousClass7HU r1 = (AnonymousClass7HU) r2.A00.Cx8(this.A01);
            if (r1 == null) {
                r2.ByD(C18210wN.A0W("Continuation returned null"));
                return;
            }
            Executor executor = C103456Zg.A01;
            r1.A09(r2, executor);
            r1.A08(r2, executor);
            AnonymousClass7HU.A01(r2, r1, executor);
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
