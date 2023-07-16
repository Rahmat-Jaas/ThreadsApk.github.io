package com.facebook.cameracore.ardelivery.model;

import X.C18180wK;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.List;

public class ARRequestEffect implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(9);
    public Integer A00;
    public String A01;
    public final ARRequestAsset A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.intValue());
    }

    public ARRequestEffect(Parcel parcel) {
        this.A02 = (ARRequestAsset) C18180wK.A0A(parcel, ARRequestAsset.class);
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(ARRequestAsset.CREATOR);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = C18210wN.A0U(parcel, 2);
    }
}
