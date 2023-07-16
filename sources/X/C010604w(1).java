package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.04w  reason: invalid class name and case insensitive filesystem */
public final class C010604w {
    public static final void A00(Bundle bundle, Fragment fragment, String str) {
        C04220Ms.A0B(str, 1);
        fragment.getParentFragmentManager().A12(str, bundle);
    }

    public static final void A01(Fragment fragment, String str, AnonymousClass0YP r4) {
        C04220Ms.A0B(r4, 2);
        fragment.getParentFragmentManager().A0y(new AnonymousClass0P2(r4), fragment, str);
    }
}
