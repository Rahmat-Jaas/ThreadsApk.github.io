package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import java.util.Map;

/* renamed from: X.4OT  reason: invalid class name */
public final class AnonymousClass4OT implements Runnable {
    public final /* synthetic */ IDxACallbackShape5S0400000_1_I2 A00;

    public AnonymousClass4OT(IDxACallbackShape5S0400000_1_I2 iDxACallbackShape5S0400000_1_I2) {
        this.A00 = iDxACallbackShape5S0400000_1_I2;
    }

    public final void run() {
        IDxACallbackShape5S0400000_1_I2 iDxACallbackShape5S0400000_1_I2 = this.A00;
        CategorySearchFragment categorySearchFragment = (CategorySearchFragment) iDxACallbackShape5S0400000_1_I2.A02;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, "save_info", (String) null, (String) null, (Map) null, (Map) iDxACallbackShape5S0400000_1_I2.A03, (Map) null));
        }
        C18210wN.A14(categorySearchFragment);
    }
}
