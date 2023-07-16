package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.78L  reason: invalid class name */
public final class AnonymousClass78L {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public AnonymousClass78L(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C04220Ms.A0B(str8, 9);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A07 = "";
        this.A01 = str5;
        this.A05 = str6;
        this.A08 = str7;
        this.A00 = str8;
    }

    public final GQLCallInputCInputShape0S0000000 A00() {
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(this.A02, "first_name");
        A002.A0F(this.A04, "middle_name");
        A002.A0F(this.A03, "last_name");
        A002.A0F(this.A06, "street1");
        A002.A0F(this.A07, "street2");
        A002.A0F(this.A01, ServerW3CShippingAddressConstants.CITY);
        A002.A0F(this.A05, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        A002.A0F(this.A08, ServerW3CShippingAddressConstants.POSTAL_CODE);
        String str = this.A00;
        if (str != null) {
            A002.A0F(str, "country_code");
            return A002;
        }
        C04220Ms.A0E("countryCode");
        throw null;
    }

    public AnonymousClass78L() {
    }
}
