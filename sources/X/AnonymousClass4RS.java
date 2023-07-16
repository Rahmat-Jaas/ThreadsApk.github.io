package X;

/* renamed from: X.4RS  reason: invalid class name */
public final class AnonymousClass4RS implements Runnable {
    public final /* synthetic */ C63873iU A00;
    public final /* synthetic */ AnonymousClass5z0 A01;

    public AnonymousClass4RS(C63873iU r1, AnonymousClass5z0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass5z0 r2 = this.A01;
        boolean isOk = r2.isOk();
        C63873iU r1 = this.A00;
        if (!isOk) {
            r1.onFail(new AnonymousClass3XX((Object) r2));
        } else {
            r1.onSuccess(r2);
        }
        r1.onFinish();
    }
}
