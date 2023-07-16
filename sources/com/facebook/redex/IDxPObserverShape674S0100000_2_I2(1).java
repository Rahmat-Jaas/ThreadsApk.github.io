package com.facebook.redex;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass56n;
import X.AnonymousClass69H;
import X.AnonymousClass79P;
import X.AnonymousClass7EC;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C111136mq;
import X.C129017kq;
import X.C1366783w;
import X.C143718hC;
import X.C18180wK;
import X.C18210wN;
import X.C18250wR;
import X.C61953Wm;
import X.C86104wH;
import X.M5J;
import com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayAuthenticationFlowImpl;
import com.facebook.pando.TreeJNI;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.HashMap;

public class IDxPObserverShape674S0100000_2_I2 implements C143718hC {
    public Object A00;
    public final int A01;

    public IDxPObserverShape674S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void CRe(Object obj) {
        String str;
        AnonymousClass7Kx A0C;
        C129017kq r0;
        switch (this.A01) {
            case 0:
                AnonymousClass7EC r9 = (AnonymousClass7EC) obj;
                AnonymousClass56n r2 = (AnonymousClass56n) this.A00;
                if (r9.A02 == null) {
                    TreeJNI treeJNI = (TreeJNI) r9.A01;
                    String str2 = r2.A01;
                    C1366783w A0G = C18250wR.A0G(treeJNI, FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.Actions.class, "actions");
                    while (true) {
                        if (A0G.hasNext()) {
                            TreeJNI reinterpret = C18210wN.A0G(A0G).reinterpret(FBPayAuthenticationFlowImpl.class);
                            AnonymousClass69H r3 = AnonymousClass69H.A01;
                            if (C86104wH.A0a(reinterpret, r3, "action_type") != null && ((AnonymousClass69H) C86104wH.A0a(reinterpret, r3, "action_type")).name().equals(str2)) {
                                A0C = AnonymousClass7Kx.A0A(new AnonymousClass79P(reinterpret, treeJNI));
                            }
                        } else {
                            A0C = AnonymousClass7Kx.A0C(C18250wR.A0V(AnonymousClass00U.A0L("No content found for the flow ", str2)));
                        }
                    }
                } else {
                    A0C = AnonymousClass7Kx.A0C(C18250wR.A0V(AnonymousClass00U.A0L("Failed to fetch the flows content for payment type: ", r2.A02)));
                }
                r2.A0G(A0C);
                return;
            case 1:
                ((M5J) this.A00).A0G(obj);
                return;
            case 2:
                r0 = ((IGPaymentMethodsAPI) this.A00).A01;
                break;
            case 3:
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put(C61953Wm.A00(), C18180wK.A0e());
                A0y.put("flow_name", "FBPAY_HUB");
                Throwable th = ((AnonymousClass7EC) obj).A02;
                if (th != null) {
                    A0y.put("throwable", th);
                    str = "fbpay_auth_ticket_query_fail";
                } else {
                    str = "fbpay_auth_ticket_query_success";
                }
                AnonymousClass7Kz.A09().A00.Bb8(str, A0y);
                return;
            default:
                r0 = ((C111136mq) this.A00).A08;
                break;
        }
        r0.A01(obj);
    }
}
