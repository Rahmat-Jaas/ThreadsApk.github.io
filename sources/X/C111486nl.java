package X;

import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.barcelona.R;

/* renamed from: X.6nl  reason: invalid class name and case insensitive filesystem */
public abstract class C111486nl {
    public final void A00() {
        if (this instanceof C92595iu) {
            View view = ((BrowserLiteFragment) ((C92595iu) this).A02).A0D;
            if (view != null) {
                C86154wM.A1H(view.findViewById(R.id.metacheckout_disclosure_footer));
                return;
            }
            return;
        }
        View view2 = ((BrowserLiteFragment) ((C92585it) this).A01).A0D;
        if (view2 != null) {
            C86154wM.A1H(view2.findViewById(R.id.metapay_disclosure_footer));
        }
    }
}
