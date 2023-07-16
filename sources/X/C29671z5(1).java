package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.1z5  reason: invalid class name and case insensitive filesystem */
public final class C29671z5 extends AnonymousClass4NE {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ boolean A01;

    public C29671z5(UserDetailFragment userDetailFragment, boolean z) {
        this.A00 = userDetailFragment;
        this.A01 = z;
    }

    public final void CGA() {
        C63813iO.A03(this.A00.requireActivity(), "report_failed_to_load", 2131834837, 0);
    }

    public final void CMu(String str) {
        boolean z = this.A01;
        UserDetailFragment userDetailFragment = this.A00;
        if (z) {
            UserDetailFragment.A04(userDetailFragment, 1);
            C25667Dpo.A00(userDetailFragment.A0Y).A00 = true;
            return;
        }
        C63813iO.A01(userDetailFragment.getContext(), userDetailFragment.getString(2131836701));
    }
}
