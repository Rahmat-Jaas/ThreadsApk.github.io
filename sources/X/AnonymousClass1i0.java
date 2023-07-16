package X;

/* renamed from: X.1i0  reason: invalid class name */
public final class AnonymousClass1i0 extends C63873iU {
    public final /* synthetic */ C29211xV A00;

    public AnonymousClass1i0(C29211xV r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-467547566);
        super.onFail(r3);
        C62973bE.A01(this.A00.getContext());
        C14030oh.A0A(781825116, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(523113438);
        C29211xV r1 = this.A00;
        r1.A06 = false;
        C18180wK.A11(r1);
        C14030oh.A0A(-1510055510, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1576833148);
        this.A00.A06 = true;
        C14030oh.A0A(346729131, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1864025641);
        int A032 = C14030oh.A03(439635299);
        C29211xV.A0B((AnonymousClass1U1) obj, this.A00);
        C14030oh.A0A(1658957792, A032);
        C14030oh.A0A(628067210, A03);
    }
}
