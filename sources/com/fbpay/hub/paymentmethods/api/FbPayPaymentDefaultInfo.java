package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayPaymentDefaultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(6);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentDefaultInfo) {
                FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = (FbPayPaymentDefaultInfo) obj;
                if (!(this.A00 == fbPayPaymentDefaultInfo.A00 && this.A01 == fbPayPaymentDefaultInfo.A01 && this.A02 == fbPayPaymentDefaultInfo.A02 && this.A03 == fbPayPaymentDefaultInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AnonymousClass3ZT.A00(AnonymousClass3ZT.A00(AnonymousClass3ZT.A00(i + 31, this.A01), this.A02), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public FbPayPaymentDefaultInfo(Parcel parcel) {
        boolean z = false;
        this.A00 = AnonymousClass0wJ.A1T(C86114wI.A08(parcel, this), 1);
        this.A01 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A02 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A03 = parcel.readInt() == 1 ? true : z;
    }
}
