package com.instagram.clips.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class ClipsTogetherData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(76);
    public final String A00;
    public final boolean A01;

    public ClipsTogetherData(String str, boolean z) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTogetherData) {
                ClipsTogetherData clipsTogetherData = (ClipsTogetherData) obj;
                if (!C04220Ms.A0I(this.A00, clipsTogetherData.A00) || this.A01 != clipsTogetherData.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        int A03 = C18180wK.A03(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A03 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ClipsTogetherData(threadId=");
        A0s.append(this.A00);
        A0s.append(", isInitiator=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
