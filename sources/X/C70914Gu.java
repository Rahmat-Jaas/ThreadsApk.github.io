package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.4Gu  reason: invalid class name and case insensitive filesystem */
public final class C70914Gu implements C82924qU {
    public final Fragment A00;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter;
        if (TextUtils.isEmpty(uri.getQueryParameter("entry_point"))) {
            queryParameter = "megaphone";
        } else {
            queryParameter = uri.getQueryParameter("entry_point");
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("entry_point", queryParameter);
        A06.putString("edit_profile_entry", queryParameter);
        C63863iT.A0B(this.A00.requireContext(), A06, ModalActivity.class, "business_onboarding_check_list");
    }

    public C70914Gu(Fragment fragment) {
        this.A00 = fragment;
    }
}
