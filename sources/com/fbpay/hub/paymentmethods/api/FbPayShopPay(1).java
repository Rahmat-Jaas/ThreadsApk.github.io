package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayShopPay implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(8);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final long A03;
    public final String A04;

    public FbPayShopPay(long j, String str, String str2, String str3, boolean z) {
        this.A03 = j;
        AnonymousClass3ZT.A02(str, "id");
        this.A00 = str;
        this.A02 = z;
        AnonymousClass3ZT.A02(str2, "shopPayUserId");
        this.A04 = str2;
        AnonymousClass3ZT.A02(str3, "shopPayUsername");
        this.A01 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayShopPay) {
                FbPayShopPay fbPayShopPay = (FbPayShopPay) obj;
                if (this.A03 != fbPayShopPay.A03 || !AnonymousClass3ZT.A03(this.A00, fbPayShopPay.A00) || this.A02 != fbPayShopPay.A02 || !AnonymousClass3ZT.A03(this.A04, fbPayShopPay.A04) || !AnonymousClass3ZT.A03(this.A01, fbPayShopPay.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass3ZT.A00(((C18190wL.A02(this.A03) + 31) * 31) + AnonymousClass0wJ.A03(this.A00), this.A02) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
    }

    public FbPayShopPay(Parcel parcel) {
        getClass().getClassLoader();
        this.A03 = parcel.readLong();
        this.A00 = parcel.readString();
        this.A02 = C86114wI.A1V(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
