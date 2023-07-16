package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.85Q  reason: invalid class name */
public final class AnonymousClass85Q implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new C135447zV(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A0s = C86114wI.A0s("GAC_Executor".length() + 13);
        A0s.append("GAC_Executor");
        A0s.append("[");
        A0s.append(andIncrement);
        newThread.setName(C18180wK.A0i("]", A0s));
        return newThread;
    }
}
