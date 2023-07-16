package X;

import android.content.Context;

/* renamed from: X.4Kn  reason: invalid class name and case insensitive filesystem */
public final class C71854Kn implements C84214sk {
    public final /* synthetic */ AnonymousClass1c3 A00;

    public C71854Kn(AnonymousClass1c3 r1) {
        this.A00 = r1;
    }

    public final void BrC(String str, String str2) {
        AnonymousClass1c3 r2 = this.A00;
        C32165H8c A0C = C63883iV.A0C(r2.A07, str, r2.A09);
        Context requireContext = r2.requireContext();
        C07530bf r9 = r2.A07;
        A0C.A00 = new C26701r4(requireContext, r2.A01, r2.requireActivity(), r2.getParentFragmentManager(), this, r9);
        r2.schedule(A0C);
    }

    public final void BwY() {
    }

    public final void onCancel() {
    }
}
