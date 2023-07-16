package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.4H1  reason: invalid class name */
public final class AnonymousClass4H1 implements C82924qU {
    public final Fragment A00;

    public AnonymousClass4H1(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C34502Ju.A00();
        C62883b4.A01();
        Fragment fragment = this.A00;
        Intent A08 = C18210wN.A08(fragment);
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString("entry_point", "interstitial");
        C18250wR.A0o(A08, 2, requireArguments);
        C10650ih.A0E(A08, fragment, 11);
    }
}
