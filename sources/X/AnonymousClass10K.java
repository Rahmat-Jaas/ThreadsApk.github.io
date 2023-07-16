package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.10K  reason: invalid class name */
public final class AnonymousClass10K extends C62793ak {
    public final C880856r A00 = new C880856r();
    public final C880856r A01 = new C880856r();
    public final C880856r A02 = new C880856r();
    public final C880856r A03 = new C880856r();
    public final C880856r A04 = new C880856r();
    public final BusinessFlowAnalyticsLogger A05;
    public final C555133m A06;
    public final C10300i6 A07;
    public final String A08;

    public AnonymousClass10K(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C555133m r3, C10300i6 r4, String str) {
        C04220Ms.A0B(businessFlowAnalyticsLogger, 3);
        this.A07 = r4;
        this.A06 = r3;
        this.A05 = businessFlowAnalyticsLogger;
        this.A08 = str;
    }

    public final void A00(String str, int i) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("to_index", String.valueOf(i));
        this.A05.Be5(new C37408JrQ("intro", this.A08, str, (String) null, (String) null, (Map) null, A0y, (Map) null));
    }
}
