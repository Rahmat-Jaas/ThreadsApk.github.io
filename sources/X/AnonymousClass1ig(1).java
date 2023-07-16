package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ig  reason: invalid class name */
public class AnonymousClass1ig extends C63873iU {
    public BusinessFlowAnalyticsLogger A00;
    public C84654td A01;
    public AnonymousClass3IK A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public Context A07;
    public C10300i6 A08;

    private void A00(String str, String str2) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcB(new C37408JrQ(this.A06, this.A05, "page", str, str2, (Map) null, (Map) null, (Map) null));
        }
    }

    public AnonymousClass1ig(Context context, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C84654td r3, AnonymousClass3IK r4, C10300i6 r5, String str, String str2, String str3, String str4) {
        this.A08 = r5;
        this.A07 = context;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = businessFlowAnalyticsLogger;
    }

    public void A01(C24481is r14) {
        C556934f r0;
        C556834e r02;
        Integer num;
        int A032 = C14030oh.A03(140379926);
        if (r14 == null || (r0 = r14.A00) == null || (r02 = r0.A00) == null) {
            A00((String) null, "EMPTY_PAGE_RESPONSE");
        } else {
            List list = r02.A00;
            String str = this.A03;
            String str2 = this.A04;
            if (list != null && !list.isEmpty() && str == null && str2 != null) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (!str2.equals(((AnonymousClass3DO) list.get(i)).A09)) {
                        i++;
                    } else if (i > 0) {
                        Object obj = list.get(i);
                        list.remove(i);
                        list.add(0, obj);
                    }
                }
            }
            C84654td r03 = this.A01;
            if (r03 != null) {
                C67133yv A0R = AnonymousClass0wJ.A0R(r03);
                ConversionStep Abh = r03.Abh();
                A0R.A05 = r14;
                A0R.A01 = Abh;
                if (A0R.A01()) {
                    num = AnonymousClass006.A00;
                } else {
                    num = AnonymousClass006.A01;
                }
                A0R.A09 = num;
                C67223zB.A01(A0R.A04);
                String A002 = C34452Jp.A00(A0R.A09);
                Bundle A062 = C18180wK.A06();
                A062.putString("is_page_admin", A002);
                if (C67223zB.A03 == null) {
                    C67223zB.A03 = new AnonymousClass32J();
                }
                Iterator<String> it = A062.keySet().iterator();
                while (it.hasNext()) {
                    String A0k = C18180wK.A0k(it);
                    AnonymousClass32J r04 = C67223zB.A03;
                    A062.getString(A0k);
                    synchronized (r04) {
                    }
                }
            }
            List<AnonymousClass3DO> list2 = r14.A00.A00.A00;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            if (list2 != null && !list2.isEmpty()) {
                for (AnonymousClass3DO r05 : list2) {
                    A0v.add(r05.A09);
                }
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
            if (businessFlowAnalyticsLogger != null) {
                HashMap hashMap = null;
                AnonymousClass3IK r06 = this.A02;
                if (r06 != null) {
                    hashMap = AnonymousClass0wJ.A0y();
                    hashMap.put("page_id", r06.A08);
                }
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("page_id", A0v.toString());
                businessFlowAnalyticsLogger.BcA(new C37408JrQ(this.A06, this.A05, "page", (String) null, (String) null, hashMap, (Map) null, A0y));
            }
        }
        C14030oh.A0A(1260149780, A032);
    }

    public void onFail(AnonymousClass3XX r4) {
        int A032 = C14030oh.A03(-1370256330);
        super.onFail(r4);
        A00(C63483hZ.A03(r4, this.A07.getString(2131826864)), (String) null);
        C14030oh.A0A(-1324801110, A032);
    }

    public void onFinish() {
        int A032 = C14030oh.A03(1296197281);
        super.onFinish();
        C14030oh.A0A(1871787679, A032);
    }

    public void onStart() {
        int A032 = C14030oh.A03(1843962128);
        super.onStart();
        C14030oh.A0A(1504369481, A032);
    }
}
