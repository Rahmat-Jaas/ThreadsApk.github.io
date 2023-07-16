package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.fragment.ProfileDisplayOptionsFragment;

/* renamed from: X.4If  reason: invalid class name and case insensitive filesystem */
public final class C71284If implements C82924qU {
    public final FragmentActivity A00;
    public final C10300i6 A01;

    public C71284If(FragmentActivity fragmentActivity, C10300i6 r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C62883b4.A04();
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("entry_point", "megaphone");
        A06.putString("edit_profile_entry", "megaphone");
        ProfileDisplayOptionsFragment profileDisplayOptionsFragment = new ProfileDisplayOptionsFragment();
        profileDisplayOptionsFragment.setArguments(A06);
        AnonymousClass0wJ.A19(profileDisplayOptionsFragment, this.A00, this.A01);
    }
}
