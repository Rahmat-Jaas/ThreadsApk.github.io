package com.instagram.clips.model.metadata;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass23Z;
import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class ClipsFanClubMetadata extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(80);
    public final AnonymousClass23Z A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsFanClubMetadata) {
                ClipsFanClubMetadata clipsFanClubMetadata = (ClipsFanClubMetadata) obj;
                if (!C04220Ms.A0I(this.A01, clipsFanClubMetadata.A01) || this.A00 != clipsFanClubMetadata.A00) {
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
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public ClipsFanClubMetadata(AnonymousClass23Z r1, String str) {
        AnonymousClass0wJ.A1O(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }
}
