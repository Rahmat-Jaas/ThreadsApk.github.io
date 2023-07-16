package X;

/* renamed from: X.3YX  reason: invalid class name */
public final class AnonymousClass3YX {
    public static AnonymousClass3YX A01 = new AnonymousClass3YX();
    public volatile boolean A00;

    public final synchronized void A01() {
        this.A00 = true;
        notifyAll();
    }

    public final synchronized void A02() {
        while (!this.A00) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static AnonymousClass3YX A00() {
        return A01;
    }
}
