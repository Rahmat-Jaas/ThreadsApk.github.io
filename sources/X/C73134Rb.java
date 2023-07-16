package X;

/* renamed from: X.4Rb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73134Rb implements Runnable {
    public final /* synthetic */ C63873iU A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C73134Rb(C63873iU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        this.A00.onSuccess(this.A01);
    }
}
