package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.instagram.attribution.ReportAdvertiserIDMutationResponseImpl;
import java.util.List;

/* renamed from: X.4QV  reason: invalid class name */
public final class AnonymousClass4QV implements Runnable {
    public final /* synthetic */ AnonymousClass3YH A00;

    public AnonymousClass4QV(AnonymousClass3YH r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3YH r5 = this.A00;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63173fJ.A05(r4, 2324146373123051493L)) {
            AnonymousClass3Y2 r6 = r5.A05;
            AnonymousClass3Y2.A01(AnonymousClass28H.INFO, AnonymousClass3Y2.A00("flush", "server_side", (Throwable) null, (List) null), r6);
            AnonymousClass37R r1 = r5.A01;
            AnonymousClass33N r8 = r5.A03;
            String A0h = C18200wM.A0h(C18200wM.A0C(), "google_ad_id");
            if (A0h == null) {
                C61383Sz A002 = C61383Sz.A00(r8.A00);
                if (A002 == null) {
                    A0h = null;
                } else {
                    A0h = A002.A01;
                    if (A0h != null) {
                        C08360dF.A00().A00(A0h);
                    }
                }
            }
            AnonymousClass4VJ r62 = new AnonymousClass4VJ(r5);
            C67463zb A003 = C67463zb.A00();
            C67463zb A004 = C67463zb.A00();
            GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, A0h, "adid");
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, C18180wK.A0e(), "client_mutation_id");
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, r1.A01.getUserId(), "actor_id");
            C67463zb.A01(gQLCallInputCInputShape1S0000000, A003);
            r1.A00.AMA(new PandoGraphQLRequest(C63233h2.A04(true), "ReportAdvertiserIDMutation", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), ReportAdvertiserIDMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "report_advertiser_id"), new IDxFCallbackShape113S0200000_1_I2(2, r1, r62));
        }
        if (C63173fJ.A05(r4, 18303363909423078L)) {
            List list = AnonymousClass3YH.A06;
            C04220Ms.A06(list);
            if (C18190wL.A1a(list)) {
                r5.A05.A02("flush", "client_side", list);
                AnonymousClass3YH.A00(C18200wM.A0s(list), r5, false);
                list.clear();
            }
        }
    }
}
