package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BonusPromoDialogAudienceType implements Parcelable {
    UNRECOGNIZED("BonusPromoDialogAudienceType_unspecified"),
    FIRST_TIME_ONBOARDER("first_time_onboarder"),
    RESURRECTION("resurrection");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (BonusPromoDialogAudienceType bonusPromoDialogAudienceType : values()) {
            A0v.put(bonusPromoDialogAudienceType.A00, bonusPromoDialogAudienceType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BonusPromoDialogAudienceType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
