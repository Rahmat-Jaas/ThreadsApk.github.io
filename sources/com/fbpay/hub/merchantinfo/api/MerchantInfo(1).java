package com.fbpay.hub.merchantinfo.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class MerchantInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(98);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MerchantInfo) {
                MerchantInfo merchantInfo = (MerchantInfo) obj;
                if (!AnonymousClass3ZT.A03(this.A00, merchantInfo.A00) || !AnonymousClass3ZT.A03(this.A01, merchantInfo.A01) || !AnonymousClass3ZT.A03(this.A02, merchantInfo.A02) || !AnonymousClass3ZT.A03(this.A04, merchantInfo.A04) || !AnonymousClass3ZT.A03(this.A03, merchantInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public MerchantInfo(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
