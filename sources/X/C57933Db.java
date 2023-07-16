package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.3Db  reason: invalid class name and case insensitive filesystem */
public final class C57933Db {
    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, C554433f r8, String str, boolean z) {
        List A04 = fragmentActivity.getSupportFragmentManager().A0T.A04();
        if (A04 == null || !A04.contains(fragment)) {
            if (fragment.mArguments == null) {
                fragment.setArguments(C18180wK.A06());
            }
            if (C18240wQ.A1T(fragment.requireArguments(), "IgSessionManager.SESSION_TOKEN_KEY")) {
                fragment.requireArguments().putString("IgSessionManager.SESSION_TOKEN_KEY", r8.A00.getToken());
            }
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, r8.A00);
            A0Q.A0B = true;
            if (z) {
                A0Q.A09(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
            }
            if (str != null) {
                A0Q.A07 = str;
            }
            A0Q.A03 = fragment;
            A0Q.A05();
        }
    }
}
