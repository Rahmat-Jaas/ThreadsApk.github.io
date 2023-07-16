package com.instagram.business.insights.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import java.util.Iterator;
import java.util.List;

public final class DaysHourlyFollowersData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(1);
    public final String A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DaysHourlyFollowersData) {
                DaysHourlyFollowersData daysHourlyFollowersData = (DaysHourlyFollowersData) obj;
                if (!C04220Ms.A0I(this.A00, daysHourlyFollowersData.A00) || !C04220Ms.A0I(this.A01, daysHourlyFollowersData.A01)) {
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
        Iterator A0v = C18200wM.A0v(parcel, this.A01);
        while (A0v.hasNext()) {
            ((DataPoint) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A06(this.A00) * 31);
    }

    public DaysHourlyFollowersData(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
