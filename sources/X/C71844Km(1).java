package X;

import android.content.Context;

/* renamed from: X.4Km  reason: invalid class name and case insensitive filesystem */
public final class C71844Km implements C84214sk {
    public final /* synthetic */ AnonymousClass1c9 A00;

    public C71844Km(AnonymousClass1c9 r1) {
        this.A00 = r1;
    }

    public final void BrC(String str, String str2) {
        AnonymousClass1c9 r6 = this.A00;
        C32165H8c A0C = C63883iV.A0C(r6.A0C, str, (String) null);
        Context requireContext = r6.requireContext();
        C07530bf r7 = r6.A0C;
        A0C.A00 = new C26691r3(requireContext, r6.A0M, r6.requireActivity(), r6.getParentFragmentManager(), r6, r7);
        r6.schedule(A0C);
    }

    public final void BwY() {
    }

    public final void onCancel() {
    }
}
