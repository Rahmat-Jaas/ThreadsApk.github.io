package com.instagram.model.mediasize;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144758jE;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class AdditionalCandidates extends AnonymousClass0Sf implements Parcelable, C144758jE {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(82);
    public final ExtendedImageUrl A00;
    public final ExtendedImageUrl A01;
    public final ExtendedImageUrl A02;

    public final AdditionalCandidates D4r() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdditionalCandidates) {
                AdditionalCandidates additionalCandidates = (AdditionalCandidates) obj;
                if (!C04220Ms.A0I(this.A00, additionalCandidates.A00) || !C04220Ms.A0I(this.A01, additionalCandidates.A01) || !C04220Ms.A0I(this.A02, additionalCandidates.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        ExtendedImageUrl extendedImageUrl = this.A00;
        if (extendedImageUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedImageUrl.writeToParcel(parcel, i);
        }
        ExtendedImageUrl extendedImageUrl2 = this.A01;
        if (extendedImageUrl2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedImageUrl2.writeToParcel(parcel, i);
        }
        ExtendedImageUrl extendedImageUrl3 = this.A02;
        if (extendedImageUrl3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        extendedImageUrl3.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A02);
    }

    public AdditionalCandidates(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, ExtendedImageUrl extendedImageUrl3) {
        this.A00 = extendedImageUrl;
        this.A01 = extendedImageUrl2;
        this.A02 = extendedImageUrl3;
    }
}
