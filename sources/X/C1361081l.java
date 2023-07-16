package X;

/* renamed from: X.81l  reason: invalid class name and case insensitive filesystem */
public final class C1361081l implements Runnable {
    public final /* synthetic */ AnonymousClass6CN A00;
    public final /* synthetic */ C1203279s A01;

    public C1361081l(AnonymousClass6CN r1, C1203279s r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C1203279s r3 = this.A01;
        C144858jP r2 = r3.A01;
        if (r2 != null) {
            r2.onPredictionResult(String.valueOf(this.A00.getMessage()), r3.A07);
        }
    }
}
