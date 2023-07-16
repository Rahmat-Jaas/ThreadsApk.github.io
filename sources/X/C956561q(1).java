package X;

import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.61q  reason: invalid class name and case insensitive filesystem */
public final class C956561q extends AnonymousClass5xI implements C82034oy {
    public static final String __redex_internal_original_name = "FBPayAuthIgContainerFragment";

    public final void configureActionBar(AnonymousClass4u2 r4) {
        Fragment A0L = getChildFragmentManager().A0L(R.id.container_fragment);
        if (A0L instanceof AnonymousClass561) {
            r4.CtO(true);
            r4.CtT(true);
            int i = 2131827252;
            if (AnonymousClass7HK.A01()) {
                i = 2131830510;
            }
            String string = A0L.getString(i);
            string.getClass();
            r4.setTitle(string);
            return;
        }
        r4.CtO(false);
    }
}
