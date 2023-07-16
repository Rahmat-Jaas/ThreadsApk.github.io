package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
public final class C26831rI extends AnonymousClass1hL {
    public final /* synthetic */ AnonymousClass1c3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26831rI(Fragment fragment, C10300i6 r2, AnonymousClass1c3 r3, AnonymousClass265 r4) {
        super(fragment, r2, r4);
        this.A00 = r3;
    }

    public final void A00(AnonymousClass1U5 r4) {
        int A03 = C14030oh.A03(-1191432474);
        super.A00(r4);
        AnonymousClass1c3.A03(this.A00, "whatsapp");
        C14030oh.A0A(-1618874520, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1061612563);
        C18230wP.A0R(this.A00).setIsLoading(false);
        C14030oh.A0A(1070455319, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-838059298);
        C18230wP.A0R(this.A00).setIsLoading(true);
        C14030oh.A0A(-111883348, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1644875805);
        A00((AnonymousClass1U5) obj);
        C14030oh.A0A(1000531776, A03);
    }
}
