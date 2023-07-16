package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.3HF  reason: invalid class name */
public final class AnonymousClass3HF {
    public boolean A00;
    public Fragment A01;
    public AnonymousClass1XX A02;

    public final void A00() {
        AnonymousClass1XX r2 = this.A02;
        C12560m7 r1 = r2.mFragmentManager;
        if (r1 != null) {
            AnonymousClass099 r0 = (AnonymousClass099) r1.A0O("ProgressDialog");
            if (r0 == null) {
                if (r2.isAdded()) {
                    r0 = r2;
                }
                this.A00 = false;
            }
            r0.A07();
            this.A00 = false;
        }
    }

    public final void A01() {
        Fragment fragment = this.A01;
        if (fragment.getChildFragmentManager().A0O("ProgressDialog") == null) {
            AnonymousClass1XX r2 = this.A02;
            if (!r2.isAdded()) {
                r2.A0D(new AnonymousClass01J(fragment.getChildFragmentManager()), "ProgressDialog", true);
                this.A00 = true;
            }
        }
    }

    public AnonymousClass3HF(Fragment fragment, AnonymousClass1XX r2) {
        this.A01 = fragment;
        this.A02 = r2;
    }
}
