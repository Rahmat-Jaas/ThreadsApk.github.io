package X;

/* renamed from: X.82x  reason: invalid class name and case insensitive filesystem */
public final class C1364882x implements Runnable {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ String A03;

    public C1364882x(AnonymousClass601 r1, C109326jp r2, C109326jp r3, String str) {
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        try {
            AnonymousClass7J1.A02(new AnonymousClass81Z(this, C1194175f.A00(this.A00, this.A03)));
        } catch (IllegalArgumentException unused) {
            AnonymousClass7J1.A02(new C135637zo(this));
        }
    }
}
