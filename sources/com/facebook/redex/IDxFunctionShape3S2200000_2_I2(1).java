package com.facebook.redex;

import X.AnonymousClass6BW;
import X.AnonymousClass79P;
import X.C108226i1;
import X.C113806sA;
import X.C116376ws;
import X.C120977Dl;
import X.C121157Ek;
import X.C122037Js;
import X.C126507fM;
import X.C1370385p;
import X.C142618fJ;
import X.C63233h2;
import X.C67463zb;
import X.C86114wI;
import X.C86164wN;
import android.text.TextUtils;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.auth.graphql.IGResetPINWithPasswordMutationResponseImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

public class IDxFunctionShape3S2200000_2_I2 implements C142618fJ {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxFunctionShape3S2200000_2_I2(C121157Ek r1, C120977Dl r2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = r1;
        if (i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i = this.A04;
        AnonymousClass79P r4 = (AnonymousClass79P) obj;
        C121157Ek r0 = (C121157Ek) this.A00;
        if (i != 0) {
            C108226i1 r1 = r0.A02;
            C113806sA r5 = (C113806sA) r4.A01;
            String str = this.A03;
            Object obj2 = r4.A00;
            obj2.getClass();
            String str2 = (String) obj2;
            String str3 = this.A02;
            Map unmodifiableMap = Collections.unmodifiableMap(((C120977Dl) this.A01).A07);
            String userId = r1.A01.getUserId();
            try {
                C126507fM r2 = (C126507fM) C86114wI.A0g((Object) null, C116376ws.class, "create");
                GQLCallInputCInputShape1S0000000 A0L = C86114wI.A0L(userId, str2);
                A0L.A0D(str3, "authentication_ticket_id");
                C122037Js.A07(A0L, str, "payment_type", unmodifiableMap);
                C67463zb.A01(A0L, r2.A00);
                r2.A02 = true;
                return AnonymousClass6BW.A00(r5, C1370385p.A00(), r2.AB4(), C86164wN.A0N(5));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C86114wI.A0k(e);
            }
        } else {
            C108226i1 r3 = r0.A02;
            C113806sA r22 = (C113806sA) r4.A01;
            Object obj3 = r4.A00;
            obj3.getClass();
            String str4 = (String) obj3;
            String str5 = this.A02;
            String str6 = this.A03;
            Collections.unmodifiableMap(((C120977Dl) this.A01).A07);
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            GQLCallInputCInputShape1S0000000 A0K = C86114wI.A0K();
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            String str7 = "";
            String str8 = str7;
            if (!TextUtils.isEmpty(str6)) {
                str8 = str6;
            }
            A004.A0F(str8, "sensitive_string_value");
            A0K.A0B(A004, "new_pin");
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            if (!TextUtils.isEmpty(str5)) {
                str7 = str5;
            }
            A005.A0F(str7, "sensitive_string_value");
            A0K.A0B(A005, "password");
            A0K.A0D(str4, "platform_trust_token");
            A002.A02(A0K, "input");
            return AnonymousClass6BW.A00(r22, r3.A00, new PandoGraphQLRequest(C63233h2.A01(), "IGResetPINWithPasswordMutation", A002.getParamsCopy(), A003.getParamsCopy(), IGResetPINWithPasswordMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "payment_pin_update"), new IDxFunctionShape362S0100000_2_I2(r3, 6));
        }
    }
}
