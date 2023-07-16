package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3yW  reason: invalid class name */
public final class AnonymousClass3yW implements C83984sK {
    public final /* synthetic */ C24751jz A00;

    public AnonymousClass3yW(C24751jz r1) {
        this.A00 = r1;
    }

    public final void onCancel() {
        C24751jz r0 = this.A00;
        C54072yr.A00(r0.A08, r0.A0A.A01, "facebook_login_helper");
    }

    public final void onError(String str) {
        C24751jz r9 = this.A00;
        C07530bf r8 = r9.A08;
        String str2 = r9.A0A.A01;
        AnonymousClass0wJ.A1N(r8, str2);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "facebook_auth_error"), 604);
        C63443hU.A03(A0I, "facebook_login_helper");
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        A0I.A0T("exception", str);
        AnonymousClass269.A05(A0I);
        AnonymousClass0wJ.A1D(A0I, A003, A002);
        C18210wN.A17(A0I);
        C18190wL.A1I(A0I, str2);
        C63683i7.A09(A0I, r8);
        C63683i7.A08(A0I);
        A0I.Bb4();
        C24751jz.A04(r9);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        AnonymousClass39Q r7 = (AnonymousClass39Q) obj;
        if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310802792522733L)) {
            C67363zQ.A09(r7.A00, this.A00.A08, AnonymousClass006.A05);
        }
        C24751jz r5 = this.A00;
        C07530bf r4 = r5.A08;
        C54102yu.A00(r4, C313625r.A03, "facebook_login_helper", r5.A0A.A01);
        CallerContext callerContext = C24751jz.A0B;
        if (C62433Zv.A02(callerContext, r4, "ig_android_growth_sdk_token_fbig_sign_up")) {
            str = C62433Zv.A01(callerContext, r4, "ig_android_growth_sdk_token_fbig_sign_up");
        } else {
            str = null;
        }
        if (C62433Zv.A02(callerContext, r4, "ig_android_growth_sdk_token_fbig_sign_up")) {
            str2 = C62433Zv.A00(callerContext, r4, "ig_android_growth_sdk_token_fbig_sign_up");
        } else {
            str2 = null;
        }
        r5.A0C(r4, str, str2, false);
    }
}
