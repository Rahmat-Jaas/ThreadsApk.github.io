package X;

import android.os.Bundle;

/* renamed from: X.1w0  reason: invalid class name */
public final class AnonymousClass1w0 extends AnonymousClass1XX {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1652593314);
        super.onCreate(bundle);
        this.A00 = requireArguments().getBoolean("isDeleting", false);
        this.A02 = requireArguments().getBoolean(AnonymousClass000.A00(950), false);
        this.A01 = requireArguments().getBoolean("isUpdating", false);
        this.A01 = requireArguments().getBoolean("isArchiving", true);
        if (bundle != null) {
            this.A03 = bundle.getBoolean("shouldDismissOnResume", false);
        }
        C14030oh.A09(-17512269, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1347008938);
        if (this.A00) {
            this.A03 = true;
        }
        super.onPause();
        C14030oh.A09(-137015598, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-154022537);
        super.onResume();
        if (this.A03) {
            this.mFragmentManager.A0d();
            A06();
        }
        C14030oh.A09(1481201873, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldDismissOnResume", this.A03);
    }
}
