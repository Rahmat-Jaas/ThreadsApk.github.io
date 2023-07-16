package X;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1Xc  reason: invalid class name */
public abstract class AnonymousClass1Xc extends C34640IcN {
    public static final String __redex_internal_original_name = "IgThemedFragment";

    public void onResume() {
        Window window;
        int A02 = C14030oh.A02(1672790109);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(C121907Is.A00(window.getContext(), 16842801)));
        }
        C14030oh.A09(1850724313, A02);
    }
}
