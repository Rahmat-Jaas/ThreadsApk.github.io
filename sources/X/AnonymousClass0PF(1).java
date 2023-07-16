package X;

/* renamed from: X.0PF  reason: invalid class name */
public final class AnonymousClass0PF extends C63873iU {
    public final C63873iU A00;
    public final C04850Pk A01;

    public AnonymousClass0PF(C63873iU r2, C04850Pk r3) {
        C04220Ms.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-2026228243);
        C04220Ms.A0B(r4, 0);
        this.A00.onFail(r4);
        this.A01.ADn((AnonymousClass0PT) null);
        C14030oh.A0A(1681508995, A03);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A03 = C14030oh.A03(810089751);
        C04220Ms.A0B(eUq, 0);
        this.A00.onFailInBackground(eUq);
        C14030oh.A0A(1987708532, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1005619434);
        this.A00.onFinish();
        C14030oh.A0A(-1310615216, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(2111469717);
        this.A00.onStart();
        C14030oh.A0A(1644563582, A03);
    }

    public final void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-43882817);
        this.A00.onSuccess(obj);
        this.A01.ADn((AnonymousClass0PT) null);
        C14030oh.A0A(-851116108, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int A03 = C14030oh.A03(35559448);
        this.A00.onSuccessInBackground(obj);
        C14030oh.A0A(-1080661143, A03);
    }
}
