package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.85N  reason: invalid class name */
public final class AnonymousClass85N implements ThreadFactory {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;

    public AnonymousClass85N(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.A01);
        thread.setPriority(this.A00);
        return thread;
    }
}
