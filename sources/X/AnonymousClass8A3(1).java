package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.8A3  reason: invalid class name */
public final class AnonymousClass8A3 extends CancellationException {
    public final transient C148838sG A00;

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass8A3)) {
            return false;
        }
        AnonymousClass8A3 r3 = (AnonymousClass8A3) obj;
        if (!C04220Ms.A0I(r3.getMessage(), getMessage()) || !C04220Ms.A0I(r3.A00, this.A00) || !C04220Ms.A0I(r3.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public AnonymousClass8A3(String str, Throwable th, C148838sG r3) {
        super(str);
        this.A00 = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public final int hashCode() {
        String message = getMessage();
        C04220Ms.A0A(message);
        return AnonymousClass0wJ.A05(this.A00, C18180wK.A03(message)) + C18230wP.A05(getCause());
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(super.toString());
        A0r.append("; job=");
        return C18200wM.A0m(this.A00, A0r);
    }
}
