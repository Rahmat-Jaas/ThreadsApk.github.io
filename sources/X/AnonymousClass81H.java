package X;

import java.util.concurrent.Callable;

/* renamed from: X.81H  reason: invalid class name */
public final class AnonymousClass81H implements Runnable {
    public final /* synthetic */ AnonymousClass7HU A00;
    public final /* synthetic */ Callable A01;

    public AnonymousClass81H(AnonymousClass7HU r1, Callable callable) {
        this.A00 = r1;
        this.A01 = callable;
    }

    public final void run() {
        try {
            this.A00.A0B(this.A01.call());
        } catch (Exception e) {
            this.A00.A0A(e);
        } catch (Throwable th) {
            this.A00.A0A(C86114wI.A0k(th));
        }
    }
}
