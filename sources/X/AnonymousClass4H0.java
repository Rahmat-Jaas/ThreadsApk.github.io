package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.4H0  reason: invalid class name */
public final class AnonymousClass4H0 implements C82924qU {
    public final Fragment A00;

    public AnonymousClass4H0(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C62883b4.A01();
        Fragment fragment = this.A00;
        Intent A08 = C18210wN.A08(fragment);
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putString("entry_point", "megaphone");
        requireArguments.putString("target_page_id", (String) null);
        C18250wR.A0o(A08, 7, requireArguments);
        C10650ih.A0E(A08, fragment, 12);
    }
}
