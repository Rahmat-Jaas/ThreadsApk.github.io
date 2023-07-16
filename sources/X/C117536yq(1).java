package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.6yq  reason: invalid class name and case insensitive filesystem */
public final class C117536yq {
    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, C37383Jqm jqm) {
        C25745DrH A0b = C18220wO.A0b(fragmentActivity);
        if (A0b != null) {
            C35189Ipf ipf = (C35189Ipf) A0b;
            if (ipf.A0M) {
                ipf.A0B = new C134317xS(fragment, fragmentActivity, jqm);
                A0b.A0C();
                return;
            }
            C37383Jqm.A00(fragmentActivity, fragment, jqm);
        }
    }
}
