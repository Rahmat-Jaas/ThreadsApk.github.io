package com.instagram.business.insights.model;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import java.util.Iterator;
import java.util.List;

public final class FollowersGrowthData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(2);
    public final int A00;
    public final String A01;
    public final List A02;

    public FollowersGrowthData(List list, int i, String str) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowersGrowthData) {
                FollowersGrowthData followersGrowthData = (FollowersGrowthData) obj;
                if (!C04220Ms.A0I(this.A01, followersGrowthData.A01) || this.A00 != followersGrowthData.A00 || !C04220Ms.A0I(this.A02, followersGrowthData.A02)) {
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
        parcel.writeInt(this.A00);
        Iterator A0v = C18200wM.A0v(parcel, this.A02);
        while (A0v.hasNext()) {
            ((GrowthDataPoint) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (C18180wK.A03(this.A01) + this.A00) * 31);
    }
}
