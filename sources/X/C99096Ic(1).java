package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.6Ic  reason: invalid class name and case insensitive filesystem */
public final class C99096Ic {
    public static final GQLCallInputCInputShape0S0000000 A00(SparseArray sparseArray, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj = sparseArray.get(4);
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str9 = "";
        if (str == null) {
            str = str9;
        }
        Object obj2 = sparseArray.get(2);
        if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
            str2 = str9;
        }
        Object obj3 = sparseArray.get(5);
        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
            str3 = str9;
        }
        Object obj4 = sparseArray.get(6);
        if (!(obj4 instanceof String) || (str4 = (String) obj4) == null) {
            str4 = str9;
        }
        Object obj5 = sparseArray.get(7);
        if (!(obj5 instanceof String) || (str5 = (String) obj5) == null) {
            str5 = str9;
        }
        Object obj6 = sparseArray.get(8);
        if (!(obj6 instanceof String) || (str6 = (String) obj6) == null) {
            str6 = str9;
        }
        Object obj7 = sparseArray.get(9);
        if ((obj7 instanceof String) && (str8 = (String) obj7) != null) {
            str9 = str8;
        }
        boolean z2 = sparseArray.get(10) instanceof Country;
        Object obj8 = sparseArray.get(10);
        if (z2) {
            C04220Ms.A0C(obj8, "null cannot be cast to non-null type com.facebook.common.locale.Country");
            str7 = C86164wN.A0f((LocaleMember) obj8);
            C04220Ms.A06(str7);
        } else {
            C18240wQ.A1I(obj8);
            str7 = (String) obj8;
        }
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        A00.A0F(str, "label");
        A00.A0F(str2, "care_of");
        A00.A0F(str3, "street_1");
        A00.A0F(str4, "street_2");
        A00.A0F(str5, ServerW3CShippingAddressConstants.CITY);
        A00.A0F(str6, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        A00.A0F(str9, "postal_code");
        A00.A0F(str7, "country_code");
        A00.A0D("is_default", Boolean.valueOf(z));
        A00.A0D("provide_suggestion", C18180wK.A0Y());
        return A00;
    }
}
