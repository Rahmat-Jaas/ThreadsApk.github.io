package com.facebook.redex;

import X.AnonymousClass6BW;
import X.AnonymousClass74P;
import X.AnonymousClass7f4;
import X.AnonymousClass7f5;
import X.AnonymousClass7nF;
import X.AnonymousClass7nH;
import X.AnonymousClass7nK;
import X.C04220Ms;
import X.C103226Yh;
import X.C108246i3;
import X.C112706q3;
import X.C112716q4;
import X.C113806sA;
import X.C116456x0;
import X.C116466x1;
import X.C116576xC;
import X.C126317ex;
import X.C128257jH;
import X.C128267jI;
import X.C128297jL;
import X.C1370385p;
import X.C142618fJ;
import X.C146418mD;
import X.C18180wK;
import X.C61953Wm;
import X.C63233h2;
import X.C67463zb;
import X.C83304rA;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import X.C92935kG;
import X.McB;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.fbpay.shoppay.graphql.IGFBPayAddShopPayQueryResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayRemoveShopPayMutationResponseImpl;
import java.lang.reflect.InvocationTargetException;

public class IDxFunctionShape0S2100000_2_I2 implements C142618fJ {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public IDxFunctionShape0S2100000_2_I2(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C146418mD r3;
        C83304rA r2;
        McB mcB;
        C113806sA r0;
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                r0 = (C113806sA) obj2;
                ((C128257jH) this.A00).A00.getValue();
                String str = this.A01;
                String str2 = this.A02;
                try {
                    AnonymousClass7f4 r32 = (AnonymousClass7f4) C86104wH.A0p("create", C116456x0.class);
                    C67463zb r22 = r32.A00;
                    r22.A05("id", str);
                    r32.A02 = true;
                    r22.A05("payoutRecordId", str2);
                    r32.A03 = true;
                    r3 = r32.build();
                    C04220Ms.A06(r3);
                    r2 = C1370385p.A00();
                    mcB = AnonymousClass7nF.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C86114wI.A0k(e);
                }
            case 1:
                r0 = (C113806sA) obj2;
                ((C128267jI) this.A00).A00.getValue();
                String str3 = this.A01;
                String str4 = this.A02;
                try {
                    AnonymousClass7f5 r4 = (AnonymousClass7f5) C86114wI.A0g((Object) null, C116466x1.class, "create");
                    C67463zb r33 = r4.A00;
                    r33.A05("id", str3);
                    r4.A02 = true;
                    r33.A05("interface_type", "IG_ANDROID");
                    r4.A03 = true;
                    r33.A04("first", 10);
                    r33.A05("batch_item_id", str4);
                    r3 = r4.build();
                    C04220Ms.A06(r3);
                    r2 = C1370385p.A00();
                    mcB = AnonymousClass7nH.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw C86114wI.A0k(e2);
                }
            case 2:
                C113806sA r02 = (C113806sA) obj2;
                ((C128297jL) this.A00).A00.getValue();
                String str5 = this.A01;
                String str6 = this.A02;
                try {
                    C126317ex r42 = (C126317ex) C86104wH.A0p("create", C116576xC.class);
                    C67463zb r23 = r42.A00;
                    r23.A05("interface_type", "IG_ANDROID");
                    r42.A02 = true;
                    r23.A05("page_id", str5);
                    r23.A05(C61953Wm.A00(), str6);
                    return AnonymousClass6BW.A00(r02, C1370385p.A00(), r42.build(), AnonymousClass7nK.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw C86114wI.A0k(e3);
                }
            case 3:
                r0 = (C113806sA) obj2;
                IGPaymentMethodsAPI iGPaymentMethodsAPI = ((C112706q3) this.A00).A01;
                String str7 = this.A01;
                String str8 = this.A02;
                C67463zb A002 = C67463zb.A00();
                C67463zb A003 = C67463zb.A00();
                GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
                C86154wM.A1M(A0L);
                A0L.A0D(C18180wK.A0e(), "client_mutation_id");
                A0L.A0D(iGPaymentMethodsAPI.A04.getUserId(), "actor_id");
                A0L.A0D(str8, "logging_id");
                A0L.A0D(str7, "shop_pay_account_id");
                A002.A02(A0L, "data");
                r3 = new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayRemoveShopPayMutation", A002.getParamsCopy(), A003.getParamsCopy(), IGFBPayRemoveShopPayMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "data", "remove_shop_pay_account");
                r2 = iGPaymentMethodsAPI.A03;
                mcB = AnonymousClass74P.A02;
                break;
            default:
                C108246i3 r43 = ((C112716q4) this.A00).A03;
                String str9 = this.A02;
                String str10 = this.A01;
                GQLCallInputCInputShape1S0000000 A0K = C86114wI.A0K();
                A0K.A0D(str9, "logging_id");
                A0K.A0D(str10, "payment_type");
                C67463zb A004 = C67463zb.A00();
                C67463zb A005 = C67463zb.A00();
                C67463zb.A01(A0K, A004);
                return C92935kG.A00((C113806sA) obj2, r43.A00, new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayAddShopPayQuery", A004.getParamsCopy(), A005.getParamsCopy(), IGFBPayAddShopPayQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 64, (String) null, (String) null), new IDxFunctionShape362S0100000_2_I2(r43, 10), C103226Yh.A00);
        }
        return AnonymousClass6BW.A00(r0, r2, r3, mcB);
    }
}
