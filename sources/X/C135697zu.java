package X;

/* renamed from: X.7zu  reason: invalid class name and case insensitive filesystem */
public final class C135697zu implements Runnable {
    public final /* synthetic */ C86794yH A00;

    public C135697zu(C86794yH r1) {
        this.A00 = r1;
    }

    public final void run() {
        C86794yH r1 = this.A00;
        r1.A00 = true;
        r1.invalidateSelf();
    }
}
