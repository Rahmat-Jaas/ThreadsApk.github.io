package X;

/* renamed from: X.2RT  reason: invalid class name */
public final class AnonymousClass2RT {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "business_account_banhammered";
            case 2:
                return "business_account_banhammered_and_business_verification_required";
            case 3:
                return "business_account_banhammered_by_ace";
            case 4:
                return "business_account_banhammered_by_commerce_dnr";
            case 5:
                return "ad_account_disabled_for_payment_risk";
            case 6:
                return "ad_account_disabled_for_ads_integrity_policy";
            case 7:
                return I17.A00(320);
            default:
                return "payments_ad_account_unsettled";
        }
    }
}
