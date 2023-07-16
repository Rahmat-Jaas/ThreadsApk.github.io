package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;

/* renamed from: X.7zf  reason: invalid class name and case insensitive filesystem */
public final class C135547zf implements Runnable {
    public final /* synthetic */ IDxACallbackShape36S0200000_2_I2 A00;

    public C135547zf(IDxACallbackShape36S0200000_2_I2 iDxACallbackShape36S0200000_2_I2) {
        this.A00 = iDxACallbackShape36S0200000_2_I2;
    }

    public final void run() {
        Fragment fragment = (Fragment) this.A00.A00;
        String string = fragment.requireContext().getString(2131834614);
        if (!TextUtils.isEmpty(string)) {
            C63813iO.A01(fragment.requireContext(), string);
        }
        C12560m7 r2 = fragment.mFragmentManager;
        if (r2 != null) {
            r2.A11(SupportLinksFragment.A06, 1);
        }
    }
}
