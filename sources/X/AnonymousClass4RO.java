package X;

/* renamed from: X.4RO  reason: invalid class name */
public final class AnonymousClass4RO implements Runnable {
    public final /* synthetic */ AnonymousClass1dN A00;
    public final /* synthetic */ Integer A01;

    public AnonymousClass4RO(AnonymousClass1dN r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public final void run() {
        Integer num = this.A01;
        if (num.equals(AnonymousClass006.A01) || num.equals(AnonymousClass006.A00)) {
            throw null;
        }
    }
}
