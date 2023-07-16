package X;

/* renamed from: X.80O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass80O implements Runnable {
    public final /* synthetic */ C112626pv A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ AnonymousClass80O(C112626pv r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        C112626pv r2 = this.A00;
        if (r2.A03.offer(this.A01)) {
            r2.A00();
            return;
        }
        throw C18180wK.A0a("cannot enqueue any more runnables");
    }
}
