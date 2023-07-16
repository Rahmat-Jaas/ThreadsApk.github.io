package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccountLinkageInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3VF  reason: invalid class name */
public final class AnonymousClass3VF {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ AnonymousClass49R A01;
    public final /* synthetic */ C83954sG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public AnonymousClass3VF(CallerContext callerContext, AnonymousClass49R r2, C83954sG r3, String str, List list) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = callerContext;
        this.A04 = list;
        this.A02 = r3;
    }

    public static void A00(AnonymousClass3VF r1, String str) {
        r1.A02(new Throwable(str));
    }

    public final void A01(FxCalAccountLinkageInfo fxCalAccountLinkageInfo, Map map, Map map2) {
        AnonymousClass49R r5 = this.A01;
        AnonymousClass49V r3 = r5.A04;
        String str = this.A03;
        CallerContext callerContext = this.A00;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r3.A04("service_manual_fetch_success", str, AnonymousClass00J.A0N(map.keySet()), C63203gz.A03("caller_class", str2));
        C35702Om.A00(r5.A05).A07(callerContext, fxCalAccountLinkageInfo, str);
        List list = this.A04;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(list, 10)));
        for (Object next : list) {
            A0v.put(next, map.get(next));
        }
        r5.A04(callerContext, str, A0v);
        r5.A00 = new LinkedHashMap(map2);
        C83954sG r0 = this.A02;
        if (r0 != null) {
            r0.onSuccess();
        }
    }

    public final void A02(Throwable th) {
        AnonymousClass49V r5 = this.A01.A04;
        String str = this.A03;
        String str2 = this.A00.A02;
        C04220Ms.A06(str2);
        r5.A04("service_manual_fetch_failure", str, this.A04, AnonymousClass4WJ.A08(C18180wK.A0p("caller_class", str2), C18180wK.A0p("error_message", th.getMessage())));
        C83954sG r0 = this.A02;
        if (r0 != null) {
            r0.onFailure();
        }
    }
}
