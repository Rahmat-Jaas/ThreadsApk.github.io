package X;

/* renamed from: X.0tn  reason: invalid class name and case insensitive filesystem */
public final class C16820tn implements C16240si {
    public C16240si A00;

    public final void Ccv(String str) {
        C16240si r0;
        synchronized (this) {
            r0 = this.A00;
        }
        r0.Ccv(str);
    }

    public final void Ccw(String str, String str2, Throwable th) {
        C16240si r0;
        synchronized (this) {
            r0 = this.A00;
        }
        r0.Ccw(str, str2, th);
    }

    public C16820tn() {
        C16390sy r0 = new C16390sy();
        synchronized (this) {
            this.A00 = r0;
        }
    }
}
