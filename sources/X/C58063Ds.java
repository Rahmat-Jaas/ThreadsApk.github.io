package X;

import android.app.Activity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1601000_I2;

/* renamed from: X.3Ds  reason: invalid class name and case insensitive filesystem */
public final class C58063Ds {
    public final void A00(AnonymousClass3CX r14, C83014qe r15) {
        AnonymousClass0TJ r2;
        long j;
        AnonymousClass3CX r7 = r14;
        Activity activity = r14.A00;
        UserSession userSession = r14.A03;
        AnonymousClass2AC r9 = r14.A02;
        C83014qe r6 = r15;
        if (C67373zR.A08(userSession)) {
            switch (C18230wP.A04(r9, 1)) {
                case 11:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993768656L;
                    break;
                case 13:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993375435L;
                    break;
                case 14:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993506509L;
                    break;
                case 18:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993637582L;
                    break;
                case 27:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993834193L;
                    break;
                case 35:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993309898L;
                    break;
                case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993440972L;
                    break;
                case 43:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993113288L;
                    break;
                case 47:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993703119L;
                    break;
                case 52:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993178825L;
                    break;
                case 55:
                    r2 = AnonymousClass0TJ.A05;
                    j = 36325720993899730L;
                    break;
            }
            if (C63803iN.A0E(r2, userSession, j)) {
                AnonymousClass3VY r8 = new AnonymousClass3VY(userSession, 479857365);
                AnonymousClass3VY.A00(r8, r9.toString(), (String) null, (String) null, 6);
                String A01 = C61843Wa.A01(r9);
                if (A01 == null) {
                    r8.A02(TraceFieldType.FailureReason, "unmapped_entrypoint");
                    r8.A03(3);
                } else {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1601000_I2(activity, userSession, r6, r7, r8, r9, A01, (C146958n9) null, 4), C84874u0.A00(C18250wR.A0J((AnonymousClass0gW) null, 3), 664689487, 3), 3);
                    return;
                }
            }
        }
        r15.CGw(false);
    }
}
