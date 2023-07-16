package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGCreatorIncentiveProgramFetchEntryPoint implements Parcelable {
    INCENTIVE_NOTIFICATION_ELIGIBLE_FOR_XAR_PARAM("INCENTIVE_NOTIFICATION_ELIGIBLE_FOR_XAR_PARAM"),
    QP_COMMS_NOTIF_RPF_ONBOARDING_REMINDER("QP_COMMS_NOTIF_RPF_ONBOARDING_REMINDER"),
    QP_COMMS_NOTIF_REELS_WELCOME_NEXT_BONUS("QP_COMMS_NOTIF_REELS_WELCOME_NEXT_BONUS"),
    QP_COMMS_NOTIF_REELS_WELCOME_ONBOARDING_INVITE("QP_COMMS_NOTIF_REELS_WELCOME_ONBOARDING_INVITE"),
    QP_COMMS_REELS_ON_THE_RISE_COMMS_HELPER("QP_COMMS_REELS_ON_THE_RISE_COMMS_HELPER"),
    QP_COMMS_INCENTIVE_PLATFORM_COMMS_HELPER("QP_COMMS_INCENTIVE_PLATFORM_COMMS_HELPER"),
    QP_COMMS_ELIGIBLE_FOR_XAR_PARAM("QP_COMMS_ELIGIBLE_FOR_XAR_PARAM"),
    QP_COMMS_RPF_INVITE_BODY_WITH_EXPIRATION_AND_CONTRACT_STRING("QP_COMMS_RPF_INVITE_BODY_WITH_EXPIRATION_AND_CONTRACT_STRING"),
    QP_COMMS_RPF_INVITE_REMINDER_EXPIRATION_STRING("QP_COMMS_RPF_INVITE_REMINDER_EXPIRATION_STRING"),
    QP_COMMS_RPF_INVITE_REMINDER_BODY_STRING("QP_COMMS_RPF_INVITE_REMINDER_BODY_STRING"),
    QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_CONTRACT("QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_CONTRACT"),
    QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_CONTRACT_AND_USERNAME("QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_CONTRACT_AND_USERNAME"),
    QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_EXPIRATION("QP_COMMS_RPF_INVITE_REMINDER_HEADER_STRING_WITH_EXPIRATION"),
    QP_COMMS_ROTR_CLAIM_BODY_WITH_EXPIRATION("QP_COMMS_ROTR_CLAIM_BODY_WITH_EXPIRATION"),
    QP_COMMS_ROTR_CLAIM_REMINDER_BODY_WITH_EXPIRATION("QP_COMMS_ROTR_CLAIM_REMINDER_BODY_WITH_EXPIRATION"),
    QP_COMMS_TAG_REMINDER_HEADER_WITH_CONTRACT("QP_COMMS_TAG_REMINDER_HEADER_WITH_CONTRACT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0M(r5));
        for (IGCreatorIncentiveProgramFetchEntryPoint iGCreatorIncentiveProgramFetchEntryPoint : values()) {
            A0v.put(iGCreatorIncentiveProgramFetchEntryPoint.A00, iGCreatorIncentiveProgramFetchEntryPoint);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(0);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGCreatorIncentiveProgramFetchEntryPoint(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
