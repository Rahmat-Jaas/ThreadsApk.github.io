package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18230wP;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.expresscheckout.models.APMConfiguration;

public final class APMButtonsItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(63);
    public final APMBloksNativeProps A00;
    public final APMConfiguration A01;
    public final Integer A02;
    public final AnonymousClass69U A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(C18230wP.A02(parcel, this.A02));
        parcel.writeParcelable(this.A01, i);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }

    public APMButtonsItem(APMBloksNativeProps aPMBloksNativeProps, AnonymousClass69U r2, APMConfiguration aPMConfiguration, Integer num) {
        AnonymousClass0wJ.A1O(r2, aPMBloksNativeProps);
        this.A03 = r2;
        this.A00 = aPMBloksNativeProps;
        this.A02 = num;
        this.A01 = aPMConfiguration;
    }
}
