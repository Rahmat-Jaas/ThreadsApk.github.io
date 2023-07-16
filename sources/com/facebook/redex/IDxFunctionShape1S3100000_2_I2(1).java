package com.facebook.redex;

import X.AnonymousClass6BW;
import X.AnonymousClass7Kz;
import X.AnonymousClass7f1;
import X.AnonymousClass7nJ;
import X.C103226Yh;
import X.C108246i3;
import X.C112716q4;
import X.C113806sA;
import X.C116656xK;
import X.C128287jK;
import X.C1370385p;
import X.C142618fJ;
import X.C18170wI;
import X.C61953Wm;
import X.C63233h2;
import X.C67463zb;
import X.C86104wH;
import X.C86114wI;
import X.C92935kG;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.shoppay.graphql.IGFBPayCompleteShopPayInitMutationResponseImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

public class IDxFunctionShape1S3100000_2_I2 implements C142618fJ {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxFunctionShape1S3100000_2_I2(Object obj, String str, String str2, String str3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A04 != 0) {
            C108246i3 r4 = ((C112716q4) this.A00).A03;
            String str = this.A03;
            String str2 = this.A02;
            String str3 = this.A01;
            GQLCallInputCInputShape1S0000000 A0K = C86114wI.A0K();
            A0K.A0D(r4.A01.getUserId(), "actor_id");
            A0K.A0D(str, "logging_id");
            A0K.A0D("FBPAY_HUB", "payment_type");
            A0K.A0D(str2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            A0K.A0D(str3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            A002.A02(A0K, "input");
            return C92935kG.A00((C113806sA) obj2, r4.A00, new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayCompleteShopPayInitMutation", A002.getParamsCopy(), A003.getParamsCopy(), IGFBPayCompleteShopPayInitMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "input", (String) null), new IDxFunctionShape362S0100000_2_I2(r4, 12), C103226Yh.A00);
        }
        C113806sA r3 = (C113806sA) obj2;
        ((C128287jK) this.A00).A00.getValue();
        String str4 = this.A02;
        String str5 = this.A01;
        String str6 = this.A03;
        AnonymousClass7Kz.A04();
        String A004 = C18170wI.A00(67);
        try {
            AnonymousClass7f1 r42 = (AnonymousClass7f1) C86104wH.A0p("create", C116656xK.class);
            C67463zb r2 = r42.A00;
            r2.A05("interface_type", "IG_ANDROID");
            r42.A02 = true;
            r2.A05("fe_id", str5);
            r2.A05("page_id", str4);
            r2.A05(C61953Wm.A00(), str6);
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            A005.A0F(A004, C18170wI.A00(142));
            C67463zb.A01(A005, r2);
            return AnonymousClass6BW.A00(r3, C1370385p.A00(), r42.build(), AnonymousClass7nJ.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
