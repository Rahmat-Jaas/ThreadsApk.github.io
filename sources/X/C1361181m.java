package X;

/* renamed from: X.81m  reason: invalid class name and case insensitive filesystem */
public final class C1361181m implements Runnable {
    public final /* synthetic */ C1203279s A00;
    public final /* synthetic */ Exception A01;

    public C1361181m(C1203279s r1, Exception exc) {
        this.A00 = r1;
        this.A01 = exc;
    }

    public final void run() {
        C1203279s r3 = this.A00;
        C144858jP r2 = r3.A01;
        if (r2 != null) {
            r2.onPredictionResult(String.valueOf(this.A01.getMessage()), r3.A07);
        }
    }
}
