package com.instagram.model.rtc;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C170109uS;
import X.C18190wL;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class ClipsTogetherDeepLinkArgs extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(24);
    public final C170109uS A00;
    public final String A01;

    public ClipsTogetherDeepLinkArgs(C170109uS r2, String str) {
        C04220Ms.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTogetherDeepLinkArgs) {
                ClipsTogetherDeepLinkArgs clipsTogetherDeepLinkArgs = (ClipsTogetherDeepLinkArgs) obj;
                if (!C04220Ms.A0I(this.A01, clipsTogetherDeepLinkArgs.A01) || this.A00 != clipsTogetherDeepLinkArgs.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00.name());
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A06(this.A01) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ClipsTogetherDeepLinkArgs(mediaId=");
        A0s.append(this.A01);
        A0s.append(", entryPoint=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
