package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.42p  reason: invalid class name and case insensitive filesystem */
public final class C681742p implements C83414rL {
    public final /* synthetic */ SuggestBusinessFragment A00;

    public C681742p(SuggestBusinessFragment suggestBusinessFragment) {
        this.A00 = suggestBusinessFragment;
    }

    public final void CNj() {
        SuggestBusinessFragment suggestBusinessFragment = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcB(new C37408JrQ("pro_account_suggestions", suggestBusinessFragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (suggestBusinessFragment.getContext() != null) {
            C63813iO.A00(suggestBusinessFragment.getContext(), 2131826864);
            SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
            if (spinnerImageView != null && suggestBusinessFragment.mBusinessNavBar != null) {
                spinnerImageView.setVisibility(8);
            }
        }
    }

    public final void CNk(C22001Sz r4) {
        SuggestBusinessFragment suggestBusinessFragment = this.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcA(C18240wQ.A0M(suggestBusinessFragment));
        }
        suggestBusinessFragment.A07 = r4.A01;
        SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
        if (!(spinnerImageView == null || suggestBusinessFragment.mBusinessNavBar == null)) {
            spinnerImageView.setVisibility(8);
        }
        SuggestBusinessFragment.A01(suggestBusinessFragment);
    }
}
