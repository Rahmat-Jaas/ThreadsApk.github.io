package X;

import java.util.concurrent.Executor;

/* renamed from: X.6BY  reason: invalid class name */
public enum AnonymousClass6BY implements Executor {
    ;

    public final void execute(Runnable runnable) {
        C04220Ms.A0B(runnable, 0);
        runnable.run();
    }

    public final String toString() {
        return "DirectExecutor";
    }

    /* access modifiers changed from: public */
    AnonymousClass6BY() {
    }
}
