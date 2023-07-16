package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxCallableShape274S0100000_5_I2;
import com.facebook.redex.IDxContinuationShape149S0000000_2_I2;
import com.facebook.redex.IDxContinuationShape526S0100000_5_I2;
import com.facebook.redex.IDxFCallbackShape79S0300000_2_I2;
import com.facebook.redex.IDxObserverShape8S1300000_2_I2;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.common.api.base.IDxACallbackShape0S0310000_2_I2;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayAddCreditCardResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayDisableCreditCardResponseImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.7kW  reason: invalid class name and case insensitive filesystem */
public final class C128877kW implements C145368kO {
    public final C121577Gw A00;
    public final C31580Grx A01;
    public final String A02;

    public final C145388kQ Cc3(SparseArray sparseArray, C113806sA r17) {
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(this.A02, "payment_type");
        A0L.A0D(C18180wK.A0e(), "client_mutation_id");
        A0L.A0D(A02(sparseArray, 12), "credit_card_id");
        A002.A02(A0L, "input");
        return AnonymousClass6BW.A00(r17, this.A01, new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayDisableCreditCard", A002.getParamsCopy(), A003.getParamsCopy(), IGFBPayDisableCreditCardResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "disable_credit_card"), AnonymousClass6aS.A01);
    }

    public static GQLCallInputCInputShape0S0000000 A00(SparseArray sparseArray, C128877kW r5, String str) {
        boolean z = !r5.A02.equals("IAB_AUTOFILL");
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        if (sparseArray.get(7) != null || z) {
            A002.A0F(A02(sparseArray, 7), ServerW3CShippingAddressConstants.CITY);
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (str2.trim().isEmpty()) {
            str = Locale.getDefault().getCountry();
        }
        A002.A0F(str, "country_code");
        if (sparseArray.get(8) != null || z) {
            A002.A0F(A02(sparseArray, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        }
        if (sparseArray.get(5) != null || z) {
            A002.A0F(A02(sparseArray, 5), "street1");
        }
        if (sparseArray.get(6) != null || z) {
            A002.A0F(A02(sparseArray, 6), "street2");
        }
        if (sparseArray.get(9) != null || z) {
            A002.A0F(A02(sparseArray, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
        }
        return A002;
    }

    public static C32165H8c A01(String str, String str2, String str3) {
        GXN gxn = new GXN();
        if (str != null) {
            gxn.A05("creditCardNumber", str);
        }
        gxn.A05("csc", str2);
        if (str3 != null) {
            gxn.A05("payment_dev_cycle", str3);
        }
        return new C32165H8c(C28601FTx.A00(new IDxCallableShape274S0100000_5_I2((Object) gxn, 51), 658, 2).A02(new IDxContinuationShape526S0100000_5_I2((Object) null, 3), 747, 2, true, false).A02(new IDxContinuationShape149S0000000_2_I2(2), 748, 2, false, false), "FetchPaymentToken", C28174Ezk.A00(21));
    }

    public static void A04(SparseArray sparseArray, C129017kq r17, C128877kW r18, String str, String str2, String str3, String str4) {
        String A0m;
        String str5 = str4;
        String str6 = str3;
        SparseArray sparseArray2 = sparseArray;
        if (sparseArray2.get(10) instanceof Country) {
            A0m = C86164wN.A0f((LocaleMember) sparseArray2.get(10));
        } else {
            A0m = C86114wI.A0m(sparseArray2, 21);
        }
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        C128877kW r3 = r18;
        A0L.A0B(A00(sparseArray2, r3, A0m), "billing_address");
        A03(sparseArray2, A0L, r3, A02(sparseArray2, 2), "cardholder_name");
        String str7 = str2;
        if (str2 != null) {
            A0L.A0D(str7, "platform_trust_token");
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            A002.A0F("$e2ee", "sensitive_string_value");
            A0L.A0B(A002, "credit_card_number");
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0F("$e2ee", "sensitive_string_value");
            A0L.A0B(A003, "csc");
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            if (str3 == null) {
                str6 = "";
            }
            A004.A0F(str6, "sensitive_string_value");
            A0L.A0B(A004, "credit_card_first_6");
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            if (str4 == null) {
                str5 = "";
            }
            A005.A0F(str5, "sensitive_string_value");
            A0L.A0B(A005, "credit_card_last_4");
        } else {
            A0L.A0D(str, "credit_card_token");
        }
        C67463zb A006 = C67463zb.A00();
        C67463zb A007 = C67463zb.A00();
        A006.A02(A0L, "input");
        r3.A01.AMA(new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayAddCreditCard", A006.getParamsCopy(), A007.getParamsCopy(), IGFBPayAddCreditCardResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "add_credit_card"), new IDxFCallbackShape79S0300000_2_I2(3, sparseArray2, r17, r3));
    }

    public final C145388kQ Ch4(SparseArray sparseArray, C113806sA r17) {
        String A0m;
        SparseArray sparseArray2 = sparseArray;
        boolean A1W = AnonymousClass0wJ.A1W(sparseArray2.get(12));
        C129017kq r7 = new C129017kq();
        if (!C63803iN.A0E(AnonymousClass0TJ.A06, AnonymousClass7HK.A00(), 36310512516726905L) || A1W) {
            if (A1W) {
                A0m = null;
            } else {
                A0m = C86114wI.A0m(sparseArray2, 13);
            }
            C32165H8c A012 = A01(A0m, (String) C86124wJ.A0k(sparseArray2, 15), (String) null);
            A012.A00 = new IDxACallbackShape0S0310000_2_I2(1, this, sparseArray2, r7, A1W);
            C31155GhB.A03(A012);
            return r7;
        }
        String substring = C86124wJ.A0k(sparseArray2, 14).toString().substring(0, 2);
        int parseInt = Integer.parseInt(C86124wJ.A0k(sparseArray2, 14).toString().substring(2, 4));
        int i = Calendar.getInstance().get(1);
        int i2 = ((i / 100) * 100) + parseInt;
        if (i2 < i) {
            i2 += 100;
        }
        String valueOf = String.valueOf(i2);
        String A022 = A02(sparseArray2, 15);
        String A023 = A02(sparseArray2, 13);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("expiry_month", substring);
        A0y.put("expiry_year", valueOf);
        String packageName = AnonymousClass7Kz.A0E().A00.getPackageName();
        C04220Ms.A06(packageName);
        A0y.put("app_id", packageName);
        A0y.put(C61953Wm.A01(43, 9, 14), C1198677j.A00());
        A0y.put("credit_card", A023);
        A0y.put("csc", A022);
        HashSet A0u = C18200wM.A0u();
        A0u.add("credit_card");
        A0u.add("csc");
        AnonymousClass7Kx.A0H(C92975kL.A00(C120977Dl.A01(AnonymousClass76O.A00(), new C107406gh(A0y, A0u), "ADD_CARD", AnonymousClass0wJ.A0y(), (Set) null)), new IDxObserverShape8S1300000_2_I2(sparseArray2, r7, this, A023, 2));
        return r7;
    }

    public C128877kW(UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = new C121577Gw(userSession);
        this.A01 = AnonymousClass3WK.A01(userSession);
    }

    public static String A02(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj == null) {
            return "";
        }
        String obj2 = obj.toString();
        if (!obj2.equals("null")) {
            return obj2;
        }
        return "";
    }

    public static void A03(SparseArray sparseArray, GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, C128877kW r6, String str, String str2) {
        gQLCallInputCInputShape1S0000000.A0D(str, str2);
        Object obj = sparseArray.get(14);
        obj.getClass();
        gQLCallInputCInputShape1S0000000.A0D(obj.toString().substring(0, 2), "expiry_month");
        Object obj2 = sparseArray.get(14);
        obj2.getClass();
        int parseInt = Integer.parseInt(obj2.toString().substring(2, 4));
        int i = Calendar.getInstance().get(1);
        int i2 = ((i / 100) * 100) + parseInt;
        if (i2 < i) {
            i2 += 100;
        }
        gQLCallInputCInputShape1S0000000.A0D(String.valueOf(i2), "expiry_year");
        gQLCallInputCInputShape1S0000000.A0D(r6.A02, "payment_type");
        gQLCallInputCInputShape1S0000000.A0D(UUID.randomUUID().toString(), "client_mutation_id");
    }
}
