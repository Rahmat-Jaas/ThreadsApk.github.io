package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.1hz  reason: invalid class name and case insensitive filesystem */
public final class C24371hz extends C63873iU {
    public final /* synthetic */ AnonymousClass1cT A00;

    public C24371hz(AnonymousClass1cT r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int A03 = C14030oh.A03(1791082571);
        AnonymousClass1cT r1 = this.A00;
        String A09 = C63873iU.A09(r13, r1.getString(2131826865));
        C63813iO.A0F(A09);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r1.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("business_contact_info", r1.A09, (String) null, A09, (String) null, (Map) null, AnonymousClass1cT.A01(r1), (Map) null));
        }
        C14030oh.A0A(-1549902680, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1890940640);
        AnonymousClass1cT r1 = this.A00;
        r1.A0C = false;
        C18180wK.A11(r1);
        C14030oh.A0A(1745158325, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1147531691);
        AnonymousClass1cT r1 = this.A00;
        r1.A0C = true;
        C18180wK.A11(r1);
        C14030oh.A0A(-1693893026, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1135510658);
        int A032 = C14030oh.A03(-366053818);
        AnonymousClass1cT r2 = this.A00;
        r2.A0F = true;
        r2.A0I.post(new AnonymousClass4OQ(this));
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r2.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ("business_contact_info", r2.A09, "contact_option", (String) null, (String) null, (Map) null, AnonymousClass1cT.A01(r2), (Map) null));
        }
        C14030oh.A0A(987570797, A032);
        C14030oh.A0A(1120817697, A03);
    }
}
