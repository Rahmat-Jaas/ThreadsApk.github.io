package com.instagram.business.promote.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import com.instagram.api.schemas.AudienceValidationActionType;

public final class AudienceValidationAction extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(16);
    public final AudienceValidationActionType A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationAction) {
                AudienceValidationAction audienceValidationAction = (AudienceValidationAction) obj;
                if (this.A00 != audienceValidationAction.A00 || !C04220Ms.A0I(this.A01, audienceValidationAction.A01) || !C04220Ms.A0I(this.A02, audienceValidationAction.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, C18210wN.A04(this.A00)) + AnonymousClass0wJ.A06(this.A02);
    }

    public AudienceValidationAction(AudienceValidationActionType audienceValidationActionType, String str, String str2) {
        AnonymousClass0wJ.A1O(audienceValidationActionType, str);
        this.A00 = audienceValidationActionType;
        this.A01 = str;
        this.A02 = str2;
    }
}
