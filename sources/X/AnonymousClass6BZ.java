package X;

import java.util.concurrent.Executor;

/* renamed from: X.6BZ  reason: invalid class name */
public enum AnonymousClass6BZ implements Executor {
    ;

    public final String toString() {
        return "DirectExecutor";
    }

    /* access modifiers changed from: public */
    AnonymousClass6BZ() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
