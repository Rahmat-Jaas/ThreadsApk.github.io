package kotlin.jvm.internal;

import X.AnonymousClass00J;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5CW;
import X.AnonymousClass5Cn;
import X.AnonymousClass5DC;
import X.AnonymousClass6Aw;
import X.AnonymousClass6XO;
import X.AnonymousClass7DP;
import X.AnonymousClass7Hr;
import X.AnonymousClass7Kr;
import X.AnonymousClass7Kx;
import X.C02220Ah;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C89345Dg;
import X.C967966s;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.EmailResponseImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape1S1310000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1310000_I2(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(1);
        this.A05 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A02 = obj2;
        this.A00 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C967966s r4;
        AnonymousClass7DP r5;
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.EmailResponse A003;
        TreeJNI reinterpret;
        C967966s r42;
        AnonymousClass7DP r52;
        ComponentDataMutationResponseImpl.FbpayAccountMutation A004;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.PhoneResponse A012;
        TreeJNI reinterpret2;
        List list;
        switch (this.A05) {
            case 0:
                AnonymousClass7Kx A0S = C86104wH.A0S(obj);
                AnonymousClass7Kr r3 = AnonymousClass6XO.A00;
                LoggingContext loggingContext = (LoggingContext) this.A01;
                String str = this.A03;
                boolean z = !this.A04;
                List A0n = C18180wK.A0n(this.A00);
                ComponentDataMutationResponseImpl componentDataMutationResponseImpl = (ComponentDataMutationResponseImpl) A0S.A01;
                if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null || (A003 = A002.A00()) == null || (reinterpret = A003.reinterpret(EmailResponseImpl.class)) == null) {
                    r4 = null;
                } else {
                    r4 = (C967966s) C86104wH.A0a(reinterpret, C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "error_step");
                }
                OtcInput otcInput = (OtcInput) this.A02;
                if (otcInput != null) {
                    r5 = AnonymousClass7DP.A00(otcInput);
                } else {
                    r5 = null;
                }
                r3.A0G(r4, r5, loggingContext, A0S, str, (String) null, A0n, z);
                return Unit.A00;
            case 1:
                AnonymousClass7Kx A0S2 = C86104wH.A0S(obj);
                AnonymousClass7Kr r32 = AnonymousClass6XO.A00;
                LoggingContext loggingContext2 = (LoggingContext) this.A00;
                String str2 = this.A03;
                boolean z2 = !this.A04;
                List A0n2 = C18180wK.A0n(this.A02);
                ComponentDataMutationResponseImpl componentDataMutationResponseImpl2 = (ComponentDataMutationResponseImpl) A0S2.A01;
                if (componentDataMutationResponseImpl2 == null || (A004 = componentDataMutationResponseImpl2.A00()) == null || (A012 = A004.A01()) == null || (reinterpret2 = A012.reinterpret(PhoneResponseImpl.class)) == null) {
                    r42 = null;
                } else {
                    r42 = (C967966s) C86104wH.A0a(reinterpret2, C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "error_step");
                }
                OtcInput otcInput2 = (OtcInput) this.A01;
                if (otcInput2 != null) {
                    r52 = AnonymousClass7DP.A00(otcInput2);
                } else {
                    r52 = null;
                }
                r32.A0G(r42, r52, loggingContext2, A0S2, str2, (String) null, A0n2, z2);
                return Unit.A00;
            case 2:
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
                AnonymousClass5Cn r6 = new AnonymousClass5Cn();
                C86104wH.A1K(r6, (LoggingContext) this.A01);
                String str3 = this.A03;
                if (str3 == null) {
                    str3 = "";
                }
                r6.A0A("receiver_id", str3);
                r6.A07("create_order", Boolean.valueOf(this.A04));
                C86124wJ.A1K(r6, "checkout_setup_mutation");
                Iterable<CheckoutSetupKeyValue> iterable = (Iterable) this.A02;
                if (iterable != null) {
                    ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
                    for (CheckoutSetupKeyValue checkoutSetupKeyValue : iterable) {
                        AnonymousClass5CW r2 = new AnonymousClass5CW();
                        r2.A04(AnonymousClass6Aw.valueOf(checkoutSetupKeyValue.A00), "key");
                        r2.A0A(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, checkoutSetupKeyValue.A01);
                        A0w.add(r2);
                    }
                    list = AnonymousClass00J.A0N(A0w);
                } else {
                    list = AnonymousClass0wJ.A0v();
                }
                r6.A0B("product_data", list);
                C86114wI.A1C(uSLEBaseShape0S0000000, r6);
                C86114wI.A1G(uSLEBaseShape0S0000000, this.A00);
                return uSLEBaseShape0S0000000;
            default:
                USLEBaseShape0S0000000 uSLEBaseShape0S00000002 = (USLEBaseShape0S0000000) obj;
                AnonymousClass5DC r33 = new AnonymousClass5DC();
                LoggingContext loggingContext3 = (LoggingContext) this.A02;
                C86104wH.A1K(r33, loggingContext3);
                r33.A07("perform_validation", Boolean.valueOf(this.A04));
                r33.A0B("account_mutation_data_list", (List) this.A00);
                AnonymousClass7Hr.A03(r33, loggingContext3);
                C86124wJ.A1K(r33, this.A03);
                C86114wI.A1C(uSLEBaseShape0S00000002, r33);
                C86114wI.A1G(uSLEBaseShape0S00000002, this.A01);
                return uSLEBaseShape0S00000002;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1310000_I2(C89345Dg r3, OtcInput otcInput, LoggingContext loggingContext, int i) {
        super(1);
        this.A05 = i;
        if (i != 0) {
            this.A00 = loggingContext;
            this.A03 = "DELETE";
            this.A04 = true;
            this.A02 = r3;
            this.A01 = otcInput;
        } else {
            this.A01 = loggingContext;
            this.A03 = "DELETE";
            this.A04 = true;
            this.A00 = r3;
            this.A02 = otcInput;
        }
    }
}
