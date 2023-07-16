package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.react.delegate.IgReactDelegate;

/* renamed from: X.71u  reason: invalid class name and case insensitive filesystem */
public final class C1186671u {
    public static final C34640IcN A00(Activity activity) {
        FragmentActivity fragmentActivity;
        if (!(activity instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) activity;
        }
        if (fragmentActivity == null) {
            return null;
        }
        Fragment A0L = fragmentActivity.getSupportFragmentManager().A0L(R.id.layout_container_main);
        if (A0L instanceof C34640IcN) {
            return (C34640IcN) A0L;
        }
        return null;
    }

    public static final boolean A01(Activity activity, int i) {
        C34611Ibh ibh;
        int i2;
        C34640IcN A00 = A00(activity);
        if (!(A00 == null || !(A00 instanceof C34611Ibh) || (ibh = (C34611Ibh) A00) == null)) {
            C34147I4b i4b = ((IgReactDelegate) ibh.A00).A03;
            if (i4b != null) {
                i2 = i4b.A02;
            } else {
                i2 = 0;
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }
}
