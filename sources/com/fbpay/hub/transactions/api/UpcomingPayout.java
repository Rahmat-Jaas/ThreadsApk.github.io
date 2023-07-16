package com.fbpay.hub.transactions.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class UpcomingPayout implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(10);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingPayout) {
                UpcomingPayout upcomingPayout = (UpcomingPayout) obj;
                if (!AnonymousClass3ZT.A03(this.A00, upcomingPayout.A00) || !AnonymousClass3ZT.A03(this.A01, upcomingPayout.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UpcomingPayout(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
