package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1i8  reason: invalid class name */
public final class AnonymousClass1i8 extends C63873iU {
    public final String A00;
    public final /* synthetic */ C23371df A01;

    public AnonymousClass1i8(C23371df r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r15) {
        int A03 = C14030oh.A03(1559413476);
        super.onFail(r15);
        C23371df r3 = this.A01;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r3.A02;
        if (businessFlowAnalyticsLogger != null) {
            String str = r3.A05;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("query_string", r3.A04);
            businessFlowAnalyticsLogger.BcB(new C37408JrQ("page_import_info_city_town", str, ServerW3CShippingAddressConstants.CITY, C63483hZ.A03(r15, (String) null), C63483hZ.A00(r15), (Map) null, A0y, (Map) null));
        }
        if (this.A00.equals(r3.A04)) {
            AnonymousClass1fL r32 = r3.A01;
            r32.A03();
            r32.A05(r32.A01, r32.A00.getString(2131831772));
            r32.A04();
        }
        C14030oh.A0A(-1495122272, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1573861363);
        super.onFinish();
        C18190wL.A1B(this.A01);
        C14030oh.A0A(1137543786, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(585718026);
        super.onStart();
        C18190wL.A0M(this.A01).setIsLoading(true);
        C14030oh.A0A(665526257, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C557634m r0;
        List list;
        int A03 = C14030oh.A03(989789841);
        C24491it r15 = (C24491it) obj;
        int A032 = C14030oh.A03(2131385073);
        super.onSuccess(r15);
        String str = this.A00;
        C23371df r5 = this.A01;
        if (str.equals(r5.A04)) {
            if (r15 == null || (r0 = r15.A00) == null || (list = r0.A00) == null) {
                AnonymousClass1fL r2 = r5.A01;
                r2.A03();
                r2.A05(r2.A01, r2.A00.getString(2131831772));
                r2.A04();
            } else {
                AnonymousClass1fL r1 = r5.A01;
                List list2 = r1.A02;
                list2.clear();
                list2.addAll(list);
                AnonymousClass1fL.A00(r1);
            }
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r5.A02;
        if (businessFlowAnalyticsLogger != null) {
            String str2 = r5.A05;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("query_string", r5.A04);
            businessFlowAnalyticsLogger.BcA(new C37408JrQ("page_import_info_city_town", str2, ServerW3CShippingAddressConstants.CITY, (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
        C14030oh.A0A(1559339809, A032);
        C14030oh.A0A(1079472510, A03);
    }
}
