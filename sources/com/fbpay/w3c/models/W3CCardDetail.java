package com.fbpay.w3c.models;

import X.AnonymousClass3ZT;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.w3c.CardDetails;

public class W3CCardDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(22);
    public final CardDetails A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W3CCardDetail) {
                W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
                if (!AnonymousClass3ZT.A03(this.A00, w3CCardDetail.A00) || this.A01 != w3CCardDetail.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass3ZT.A00(C86124wJ.A0E(this.A00), this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public W3CCardDetail(CardDetails cardDetails, boolean z) {
        this.A00 = cardDetails;
        this.A01 = z;
    }

    public W3CCardDetail(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = (CardDetails) CardDetails.CREATOR.createFromParcel(parcel);
        this.A01 = C86114wI.A1V(parcel);
    }
}
