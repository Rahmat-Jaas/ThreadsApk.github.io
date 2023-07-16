package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BO  reason: invalid class name */
public final class AnonymousClass4BO implements C84824tv {
    public final UserSession A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(C18250wR.A0e(this, 23));

    public AnonymousClass4BO(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Fragment fragment, Fragment fragment2, FragmentActivity fragmentActivity, C25786Drz drz) {
        C21735BzM bzM;
        C303820v valueOf = C303820v.valueOf(C18210wN.A0b(fragment.requireArguments(), "BUNDLE_SURFACE", ""));
        C303820v r0 = C303820v.BOTTOM_SHEET;
        if (fragment2 == null) {
            if (valueOf == r0) {
                C18200wM.A12(fragmentActivity, C25745DrH.A00);
            } else {
                fragmentActivity.finish();
            }
        } else if (valueOf == r0) {
            if (fragment2 instanceof C21735BzM) {
                bzM = (C21735BzM) fragment2;
            } else {
                bzM = null;
            }
            C37383Jqm A02 = C37383Jqm.A02(C18220wO.A0b(fragmentActivity));
            if (A02 != null) {
                C37032Jj9 A0L = C18210wN.A0L(this.A00);
                A0L.A0j = true;
                A0L.A0c = true;
                A0L.A0c = true;
                A0L.A0I = bzM;
                Resources resources = fragmentActivity.getResources();
                C04220Ms.A06(resources);
                A0L.A0O = AnonymousClass3MA.A01(resources, fragment2);
                A0L.A0F = new AnonymousClass17a((View.OnClickListener) null, (CharSequence) null, 0, 0, 4095, false).A01();
                A02.A0A(fragment2, A0L, true);
            }
        } else {
            drz.A03 = fragment2;
            drz.A05();
        }
    }

    public final void BhL(Bundle bundle, Fragment fragment, Integer num) {
        Bundle bundle2 = fragment.mArguments;
        if (bundle2 == null) {
            bundle2 = C18180wK.A06();
        }
        bundle2.putAll(bundle);
        UserSession userSession = this.A00;
        A00(fragment, AnonymousClass3MA.A00(bundle2, userSession, num), fragment.requireActivity(), C18180wK.A0Q(fragment.requireActivity(), userSession));
    }

    public final void AIB(Fragment fragment) {
        if (C303820v.valueOf(C18210wN.A0b(fragment.requireArguments(), "BUNDLE_SURFACE", "")) == C303820v.BOTTOM_SHEET) {
            C18180wK.A13(fragment);
        } else {
            C18190wL.A1A(fragment);
        }
    }
}
