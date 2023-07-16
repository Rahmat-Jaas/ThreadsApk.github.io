package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;

/* renamed from: X.81U  reason: invalid class name */
public final class AnonymousClass81U implements Runnable {
    public final /* synthetic */ C94135to A00;
    public final /* synthetic */ IDxACallbackShape36S0200000_2_I2 A01;

    public AnonymousClass81U(C94135to r1, IDxACallbackShape36S0200000_2_I2 iDxACallbackShape36S0200000_2_I2) {
        this.A01 = iDxACallbackShape36S0200000_2_I2;
        this.A00 = r1;
    }

    public final void run() {
        String str = this.A00.A00.A05;
        Fragment fragment = (Fragment) this.A01.A00;
        String A0l = AnonymousClass0wJ.A0l(fragment.requireContext(), str, 2131821018);
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A01(A0E, new StyleSpan(1), str);
        if (!TextUtils.isEmpty(A0E)) {
            C63813iO.A01(fragment.requireContext(), A0E);
        }
        C12560m7 r1 = fragment.mFragmentManager;
        if (r1 != null) {
            r1.A11(SupportLinksFragment.A06, 1);
        }
    }
}
