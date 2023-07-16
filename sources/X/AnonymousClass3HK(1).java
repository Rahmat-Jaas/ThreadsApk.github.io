package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccountLinkageInfo;
import java.util.List;

/* renamed from: X.3HK  reason: invalid class name */
public final class AnonymousClass3HK {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C29691z7 A01;
    public final /* synthetic */ C83954sG A02;
    public final /* synthetic */ String A03;

    public AnonymousClass3HK(CallerContext callerContext, C29691z7 r2, C83954sG r3, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = callerContext;
        this.A02 = r3;
    }

    public final void A00(FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        C29691z7 r6 = this.A01;
        AnonymousClass49V r5 = r6.A03;
        String str = this.A03;
        CallerContext callerContext = this.A00;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r5.A04("manual_fetch_success", str, (List) null, C63203gz.A03("caller_class", str2));
        r6.A07(callerContext, fxCalAccountLinkageInfo, str);
        C83954sG r0 = this.A02;
        if (r0 != null) {
            r0.onSuccess();
        }
    }

    public final void A01(Throwable th) {
        AnonymousClass49V r4 = this.A01.A03;
        String str = this.A03;
        String str2 = this.A00.A02;
        C04220Ms.A06(str2);
        r4.A04("manual_fetch_failure", str, (List) null, AnonymousClass4WJ.A08(C18180wK.A0p("caller_class", str2), C18180wK.A0p("error_message", th.getMessage())));
        C83954sG r0 = this.A02;
        if (r0 != null) {
            r0.onFailure();
        }
    }
}
