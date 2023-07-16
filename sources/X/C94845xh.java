package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.5xh  reason: invalid class name and case insensitive filesystem */
public final class C94845xh extends AnonymousClass1eT {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C130667qT A01;
    public final /* synthetic */ C34627Ic2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94845xh(Fragment fragment, C130667qT r3, C34627Ic2 ic2) {
        super(false);
        this.A02 = ic2;
        this.A00 = fragment;
        this.A01 = r3;
    }

    public final void A02() {
        C13950oZ.A00(this.A02.A07);
    }

    public final void A03(AnonymousClass3XX r4) {
        if (this.A00.isResumed()) {
            C34627Ic2 ic2 = this.A02;
            C63813iO.A00(ic2.requireContext(), 2131836068);
            ic2.A07.dismiss();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C61323St r2 = (C61323St) obj;
        C04220Ms.A0B(r2, 0);
        if (this.A00.isResumed()) {
            this.A02.A07.dismiss();
            C33492Fx.A00(this.A01, r2);
        }
    }
}
