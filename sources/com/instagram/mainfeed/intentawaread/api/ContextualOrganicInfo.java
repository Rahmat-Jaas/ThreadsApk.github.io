package com.instagram.mainfeed.intentawaread.api;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class ContextualOrganicInfo extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(28);
    public String A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualOrganicInfo) {
                ContextualOrganicInfo contextualOrganicInfo = (ContextualOrganicInfo) obj;
                if (!C04220Ms.A0I(this.A01, contextualOrganicInfo.A01) || !C04220Ms.A0I(this.A00, contextualOrganicInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("ContextualOrganicInfo(seedMediaId=", this.A01, ", mediaAuthorIgid=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A01) * 31) + C18200wM.A09(this.A00);
    }

    public ContextualOrganicInfo(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public ContextualOrganicInfo() {
        this((String) null, (String) null);
    }
}
