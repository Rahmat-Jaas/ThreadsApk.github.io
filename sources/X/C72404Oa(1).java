package X;

import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.4Oa  reason: invalid class name and case insensitive filesystem */
public final class C72404Oa implements Runnable {
    public final /* synthetic */ AnonymousClass1cU A00;

    public C72404Oa(AnonymousClass1cU r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1cU r3 = this.A00;
        C84654td r2 = r3.A08;
        String str = "controller";
        if (r2 != null) {
            r2.ClA(C311924p.CONVERSION_FLOW);
            C84654td r0 = r3.A08;
            if (r0 != null) {
                ((BusinessConversionActivity) r0).Bel((Bundle) null);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r3.A07;
                if (businessFlowAnalyticsLogger == null) {
                    str = "logger";
                } else {
                    businessFlowAnalyticsLogger.BcE(new C37408JrQ("renew", r3.A0B, (String) null, (String) null, (String) null, r3.A03(), (Map) null, (Map) null));
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
