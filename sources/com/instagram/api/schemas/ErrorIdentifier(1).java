package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ErrorIdentifier implements Parcelable {
    UNRECOGNIZED("ErrorIdentifier_unspecified"),
    ALREADY_PROMOTED("already_promoted"),
    ACCOUNT_SPEND_LIMIT_REACHED("account_spend_limit_reached"),
    BUSINESS_ACCOUNT_BANHAMMERED("business_account_banhammered"),
    BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED("business_account_banhammered_and_business_verification_required"),
    BUSINESS_ACCOUNT_BANHAMMERED_BY_ACE("business_account_banhammered_by_ace"),
    BUSINESS_ACCOUNT_BANHAMMERED_BY_COMMERCE_DNR("business_account_banhammered_by_commerce_dnr"),
    BUSINESS_TWO_FAC_ENABLED("business_two_fac_enabled"),
    NO_DEFAULT_AD_ACCOUNT("no_default_ad_account"),
    NOT_PAGE_ADVERTISER("not_page_advertiser"),
    NO_ACCESS_TO_AD_ACCOUNT("no_access_to_ad_account"),
    NO_LINKED_PAGE("no_linked_page"),
    AD_ACCOUNT_NOT_ACTIVE("ad_account_not_active"),
    AD_ACCOUNT_DISABLED_FOR_PAYMENT_RISK("ad_account_disabled_for_payment_risk"),
    AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY("ad_account_disabled_for_ads_integrity_policy"),
    AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION("ad_account_disabled_eligible_for_self_resolution"),
    AD_ACCOUNT_UNSETTLED("ad_account_unsettled"),
    PAGE_NOT_CONNECTED("page_not_connected"),
    PAGE_NOT_OWNED("page_not_owned"),
    PAGE_NOT_CREATED("page_not_created"),
    PAGE_NOT_PUBLISHED("page_not_published"),
    CURRENT_USER_NOT_MEDIA_OWNER("current_user_not_media_owner"),
    CURRENT_USER_NO_PERMISSION_TO_BOOST_MEDIA("current_user_no_permission_to_boost_media");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v2 = C18190wL.A0v(AnonymousClass4WK.A0M(r4));
        for (ErrorIdentifier errorIdentifier : values()) {
            A0v2.put(errorIdentifier.A00, errorIdentifier);
        }
        A01 = A0v2;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(73);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ErrorIdentifier(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
