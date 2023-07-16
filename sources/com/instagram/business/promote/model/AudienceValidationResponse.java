package com.instagram.business.promote.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.BoostedComponentMessageType;
import java.util.Iterator;
import java.util.List;

public final class AudienceValidationResponse extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(17);
    public final AudienceValidationResponseStatus A00;
    public final BoostedComponentMessageType A01;
    public final String A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationResponse) {
                AudienceValidationResponse audienceValidationResponse = (AudienceValidationResponse) obj;
                if (!C04220Ms.A0I(this.A03, audienceValidationResponse.A03) || !C04220Ms.A0I(this.A02, audienceValidationResponse.A02) || this.A01 != audienceValidationResponse.A01 || this.A00 != audienceValidationResponse.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                ((AudienceValidationAction) A0v.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A03(this.A03) * 31)));
    }

    public AudienceValidationResponse(AudienceValidationResponseStatus audienceValidationResponseStatus, BoostedComponentMessageType boostedComponentMessageType, String str, List list) {
        AnonymousClass0wJ.A1Q(str, boostedComponentMessageType);
        C04220Ms.A0B(audienceValidationResponseStatus, 4);
        this.A03 = list;
        this.A02 = str;
        this.A01 = boostedComponentMessageType;
        this.A00 = audienceValidationResponseStatus;
    }
}
