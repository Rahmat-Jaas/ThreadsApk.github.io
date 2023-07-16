package X;

import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.42q  reason: invalid class name and case insensitive filesystem */
public final class C681842q implements C83414rL {
    public final /* synthetic */ IDxSListenerShape58S0100000_1_I2 A00;

    public C681842q(IDxSListenerShape58S0100000_1_I2 iDxSListenerShape58S0100000_1_I2) {
        this.A00 = iDxSListenerShape58S0100000_1_I2;
    }

    public final void CNj() {
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcB(new C37408JrQ("pro_account_suggestions", suggestBusinessFragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (suggestBusinessFragment.getContext() != null) {
            C63813iO.A00(suggestBusinessFragment.getContext(), 2131826864);
            SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
            if (!(spinnerImageView == null || suggestBusinessFragment.mBusinessNavBar == null)) {
                spinnerImageView.setVisibility(8);
            }
        }
        AnonymousClass1fT A002 = SuggestBusinessFragment.A00(suggestBusinessFragment);
        A002.A00.A00 = false;
        A002.notifyDataSetChanged();
    }

    public final void CNk(C22001Sz r4) {
        List list;
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A00;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcA(C18240wQ.A0M(suggestBusinessFragment));
        }
        List list2 = suggestBusinessFragment.A07;
        if (!(list2 == null || (list = r4.A01) == null)) {
            list2.addAll(list);
        }
        SuggestBusinessFragment.A01(suggestBusinessFragment);
        if (!suggestBusinessFragment.A03.A03) {
            AnonymousClass1fT A002 = SuggestBusinessFragment.A00(suggestBusinessFragment);
            A002.A00.A00 = false;
            A002.notifyDataSetChanged();
        }
    }
}
