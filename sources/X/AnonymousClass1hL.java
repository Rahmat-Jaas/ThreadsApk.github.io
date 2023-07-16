package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.1hL  reason: invalid class name */
public class AnonymousClass1hL extends C63873iU {
    public final Fragment A00;
    public final C10300i6 A01;
    public final AnonymousClass265 A02;

    public AnonymousClass1hL(Fragment fragment, C10300i6 r2, AnonymousClass265 r3) {
        this.A01 = r2;
        this.A00 = fragment;
        this.A02 = r3;
    }

    public void A00(AnonymousClass1U5 r5) {
        int A03 = C14030oh.A03(-803962001);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            C25828Dsm A0W = C18190wL.A0W(fragment.getContext());
            A0W.A02 = r5.A07;
            A0W.A0p(r5.A03);
            C18180wK.A1O(A0W, this, 77, 2131831976);
            AnonymousClass0wJ.A1K(A0W);
        }
        C14030oh.A0A(1754676117, A03);
    }

    public void onFail(AnonymousClass3XX r5) {
        int A03 = C14030oh.A03(242582616);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            Object obj = r5.A00;
            if (obj != null) {
                AnonymousClass1U5 r0 = (AnonymousClass1U5) obj;
                C62973bE.A04(fragment.getContext(), r0.A06, r0.mErrorTitle);
            } else {
                C62973bE.A01(fragment.getContext());
            }
        }
        C14030oh.A0A(996842, A03);
    }
}
