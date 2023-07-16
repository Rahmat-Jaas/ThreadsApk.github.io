package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.69P  reason: invalid class name */
public enum AnonymousClass69P {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    ANON_CHECKOUT_BACK_BUTTON,
    APM,
    BANNER,
    CONTACT_INFORMATION,
    EMAIL_OPTIN,
    FULFILLMENT_OPTIONS,
    INCENTIVES,
    ITEM_LIST,
    META_BRANDING_FOOTER,
    ONE_TIME_CHECKOUT_OPTION,
    ORDER_SUMMARY,
    PAYMENT_METHOD,
    PAYMENT_RECEIVER,
    PAY_BUTTON,
    PICKUP_CONTACT_INFO,
    PRICE_TABLE,
    PROMO_CODE,
    SHIPPING_ADDRESS,
    SHIPPING_OPTIONS,
    TERMS;

    public static ImmutableList A00(TreeJNI treeJNI) {
        return treeJNI.getEnumList("optional_fields", UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }
}
