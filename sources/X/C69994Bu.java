package X;

/* renamed from: X.4Bu  reason: invalid class name and case insensitive filesystem */
public final class C69994Bu implements C83564rc {
    public final /* synthetic */ C22871as A00;

    public C69994Bu(C22871as r1) {
        this.A00 = r1;
    }

    public final void onFailure() {
        C63813iO.A07(this.A00.requireContext());
    }

    public final void onSuccess() {
        C22871as r1 = this.A00;
        r1.A06 = true;
        C22871as.A01(r1);
    }
}
