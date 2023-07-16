package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.8A2  reason: invalid class name */
public final class AnonymousClass8A2 extends CancellationException {
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AnonymousClass8A2() {
        super("Child of the scoped flow was cancelled");
    }
}
