package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.3Zi  reason: invalid class name */
public final class AnonymousClass3Zi {
    public static final void A01(ViewGroup viewGroup, Fragment fragment) {
        C04220Ms.A0B(viewGroup, 1);
        if (A02(fragment)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = (int) (((double) AnonymousClass0wJ.A0B(fragment).getDisplayMetrics().heightPixels) * 0.75d);
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public static final Integer A00(Fragment fragment) {
        String A0b = C18210wN.A0b(fragment.requireArguments(), "BUNDLE_ENTRY_POINT", "");
        if (A0b.equals("DIRECT_INBOX_NUX")) {
            return AnonymousClass006.A00;
        }
        if (A0b.equals("THREAD_BANNER")) {
            return AnonymousClass006.A01;
        }
        if (A0b.equals("SETTINGS")) {
            return AnonymousClass006.A0C;
        }
        if (A0b.equals("FISHFOODING")) {
            return AnonymousClass006.A0N;
        }
        if (A0b.equals("OTC_NOTIFICATION")) {
            return AnonymousClass006.A0Y;
        }
        if (A0b.equals("SETTINGS_RESET_PIN")) {
            return AnonymousClass006.A0j;
        }
        throw C18190wL.A0a(A0b);
    }

    public static final boolean A02(Fragment fragment) {
        return C04220Ms.A0I(fragment.requireArguments().getString("BUNDLE_SURFACE", ""), C303820v.BOTTOM_SHEET.toString());
    }

    public static final boolean A03(Fragment fragment) {
        return C04220Ms.A0I(fragment.requireArguments().getString("BUNDLE_SURFACE", ""), C303820v.FULLSCREEN_MODAL.toString());
    }
}
