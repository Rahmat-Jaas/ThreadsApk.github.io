package X;

/* renamed from: X.7zE  reason: invalid class name and case insensitive filesystem */
public final class C135317zE implements Runnable {
    public final /* synthetic */ AnonymousClass82J A00;

    public C135317zE(AnonymousClass82J r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass82J r2 = this.A00;
        r2.run();
        synchronized (AnonymousClass7GP.class) {
            AnonymousClass7GP.A01.remove(r2);
        }
    }
}
