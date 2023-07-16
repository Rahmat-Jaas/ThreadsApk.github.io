package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.facebookpay.cardptt.CardPttPayload;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Du  reason: invalid class name and case insensitive filesystem */
public final class C121037Du {
    public final C114996uJ A02(Context context, SparseArray sparseArray, OtcInput otcInput, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        BaseCheckoutItem baseCheckoutItem;
        String A00;
        String str8;
        C120977Dl r3;
        C120967Dk r0;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        SparseArray sparseArray2 = sparseArray;
        String A002 = AnonymousClass6I4.A00(sparseArray2, 12);
        OtcInput otcInput2 = otcInput;
        if (A002 == null || A002.length() == 0 || otcInput != null) {
            str2 = "CREATE";
        } else {
            str2 = "UPDATE";
        }
        String A01 = A01(sparseArray2);
        Object obj = sparseArray2.get(39);
        AnonymousClass69W r1 = null;
        if (obj instanceof AnonymousClass69W) {
            r1 = obj;
        }
        Object obj2 = sparseArray2.get(15);
        if (obj2 instanceof String) {
            str3 = (String) obj2;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            if (r1 == AnonymousClass69W.AMERICAN_EXPRESS) {
                str4 = "••••";
            } else {
                str4 = "•••";
            }
            if (C18180wK.A1V(str3.equals(str4) ? 1 : 0)) {
                str3 = "";
            }
            int A003 = AnonymousClass2C6.A00(A01);
            if (A003 >= 6) {
                str5 = C18230wP.A0s(A01, 0, 6);
            } else {
                str5 = "";
            }
            if (A003 >= 4) {
                str6 = C86134wK.A0q(A01, A003 - 4);
            } else {
                str6 = "";
            }
            Object obj3 = sparseArray2.get(14);
            if (!(obj3 instanceof String) || (str7 = (String) obj3) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            String A0S = AnonymousClass8bP.A0S(C18230wP.A0s(str7, 0, 2));
            String A0L = AnonymousClass00U.A0L("20", AnonymousClass8bP.A0S(C86134wK.A0q(str7, 2)));
            Object obj4 = sparseArray2.get(33);
            if (obj4 instanceof BaseCheckoutItem) {
                baseCheckoutItem = (BaseCheckoutItem) obj4;
            } else {
                baseCheckoutItem = null;
            }
            boolean z = baseCheckoutItem instanceof SelectionShippingAddressItem;
            if (z) {
                A00 = ((SelectionShippingAddressItem) baseCheckoutItem).A03;
                if (A00 == null) {
                    A00 = "";
                }
            } else {
                A00 = AnonymousClass6I4.A00(sparseArray2, 2);
            }
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            if (z) {
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) baseCheckoutItem;
                A004.A0F(selectionShippingAddressItem.A0E, "street1");
                A004.A0F(selectionShippingAddressItem.A0F, "street2");
                A004.A0F(selectionShippingAddressItem.A07, ServerW3CShippingAddressConstants.CITY);
                A004.A0F(selectionShippingAddressItem.A0D, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                A004.A0F(selectionShippingAddressItem.A0C, ServerW3CShippingAddressConstants.POSTAL_CODE);
                str8 = selectionShippingAddressItem.A08;
            } else {
                A004.A0F(AnonymousClass6I4.A00(sparseArray2, 5), "street1");
                A004.A0F(AnonymousClass6I4.A00(sparseArray2, 6), "street2");
                A004.A0F(AnonymousClass6I4.A00(sparseArray2, 7), ServerW3CShippingAddressConstants.CITY);
                A004.A0F(AnonymousClass6I4.A00(sparseArray2, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                A004.A0F(AnonymousClass6I4.A00(sparseArray2, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
                boolean z2 = sparseArray2.get(10) instanceof Country;
                Object obj5 = sparseArray2.get(10);
                if (z2) {
                    C04220Ms.A0C(obj5, "null cannot be cast to non-null type com.facebook.common.locale.Country");
                    str8 = C86164wN.A0f((LocaleMember) obj5);
                    C04220Ms.A06(str8);
                } else {
                    C18240wQ.A1I(obj5);
                    str8 = (String) obj5;
                }
            }
            A004.A0F(str8, "country_code");
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
            String str15 = "$e2ee";
            A006.A0F(str15, "sensitive_string_value");
            A005.A0B(A006, "credit_card_number");
            GQLCallInputCInputShape0S0000000 A007 = GraphQlCallInput.A00();
            if (str3 == "") {
                str15 = str3;
            }
            A007.A0F(str15, "sensitive_string_value");
            A005.A0B(A007, "csc");
            GQLCallInputCInputShape0S0000000 A008 = GraphQlCallInput.A00();
            A008.A0F(str5, "sensitive_string_value");
            A005.A0B(A008, "credit_card_first_6");
            GQLCallInputCInputShape0S0000000 A009 = GraphQlCallInput.A00();
            A009.A0F(str6, "sensitive_string_value");
            A005.A0B(A009, "credit_card_last_4");
            A005.A0F(A0S, "expiry_month");
            A005.A0F(A0L, "expiry_year");
            A005.A0F(A00, "cardholder_name");
            A005.A0B(A004, "billing_address");
            A005.A0F("", I17.A00(839));
            String str16 = str;
            if (C04220Ms.A0I(str2, "CREATE")) {
                Map A0A = AnonymousClass4WJ.A0A();
                C04220Ms.A0B(A0S, 5);
                C04220Ms.A0B(A0L, 6);
                List A17 = C06750aI.A17("CHARGE", "SEND_MONEY", "CREATE_CONTAINER");
                try {
                    r0 = AnonymousClass76O.A00().A05("PAN", A17);
                } catch (Exception e) {
                    AnonymousClass0LU.A0E("DefaultAuthTicketManager", "create AT Safe", e);
                    r0 = null;
                }
                AnonymousClass7HL A0010 = AnonymousClass76O.A00();
                String A0011 = C1198677j.A00();
                String packageName = context.getPackageName();
                C04220Ms.A06(packageName);
                if (r0 != null) {
                    str11 = r0.A07;
                    str12 = r0.A03;
                } else {
                    str11 = null;
                    str12 = null;
                }
                CardPttPayload cardPttPayload = new CardPttPayload(A0011, packageName, A00, (String) null, A01, str3, A0S, A0L, str11, (String) null, str12, A17);
                if (r0 != null) {
                    HashSet A0u = C18200wM.A0u();
                    Collections.addAll(A0u, new C120967Dk[]{r0});
                    if (otcInput != null) {
                        str13 = otcInput2.A00;
                        str14 = otcInput2.A01;
                    } else {
                        str13 = null;
                        str14 = null;
                    }
                    r3 = C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A0010, 1), cardPttPayload, "ADD_CARD", (String) null, str13, str14, str16, A0A, A0u);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else if (C04220Ms.A0I(str2, "UPDATE")) {
                r0 = null;
                Map A0A2 = AnonymousClass4WJ.A0A();
                C04220Ms.A0B(A002, 1);
                C86104wH.A1P(A0S, 6, A0L);
                AnonymousClass7HL A0012 = AnonymousClass76O.A00();
                String A0013 = C1198677j.A00();
                String packageName2 = context.getPackageName();
                C04220Ms.A06(packageName2);
                CardPttPayload cardPttPayload2 = new CardPttPayload(A0013, packageName2, A00, (String) null, A01, str3, A0S, A0L, (String) null, A002, (String) null, (List) null);
                AnonymousClass84Y r15 = AnonymousClass84Y.A00;
                if (otcInput != null) {
                    str9 = otcInput2.A00;
                    str10 = otcInput2.A01;
                } else {
                    str9 = null;
                    str10 = null;
                }
                r3 = C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A0012, 1), cardPttPayload2, "EDIT_CARD", (String) null, str9, str10, str16, A0A2, r15);
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0L("MutationType is not yet supported + ", str2));
            }
            return new C114996uJ(A005, r0, r3);
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final String A01(SparseArray sparseArray) {
        String obj = sparseArray.get(13).toString();
        if (obj != null) {
            return AnonymousClass8bQ.A0l(obj, "\\s+", "", false);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final FBPayAuthTicketFragmentImpl A00(ComponentDataMutationResponseImpl componentDataMutationResponseImpl) {
        TreeJNI treeValue;
        TreeJNI reinterpret;
        CredentialResponseImpl.Credential credential;
        CreditCardCredentialImpl A00;
        ImmutableList treeList;
        TreeJNI treeJNI;
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002 = componentDataMutationResponseImpl.A00();
        if (A002 == null || (treeValue = A002.getTreeValue("credential_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class)) == null || (reinterpret = treeValue.reinterpret(CredentialResponseImpl.class)) == null || (credential = (CredentialResponseImpl.Credential) reinterpret.getTreeValue("credential", CredentialResponseImpl.Credential.class)) == null || (A00 = credential.A00()) == null || (treeList = A00.getTreeList("authentication_tickets_with_ptt_kid_filtering", CreditCardCredentialImpl.AuthenticationTicketsWithPttKidFiltering.class)) == null || (treeJNI = (TreeJNI) AnonymousClass00J.A0D(treeList)) == null) {
            return null;
        }
        return (FBPayAuthTicketFragmentImpl) treeJNI.reinterpret(FBPayAuthTicketFragmentImpl.class);
    }
}
