package com.facebookpay.connect.models;

import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ConnectPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(8);
    public final ConnectAddressDetails A00;
    public final ConnectContactDetails A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A0v = C18200wM.A0v(parcel, this.A04);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
        ConnectContactDetails connectContactDetails = this.A01;
        if (connectContactDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connectContactDetails.writeToParcel(parcel, i);
        }
        ConnectAddressDetails connectAddressDetails = this.A00;
        if (connectAddressDetails == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        connectAddressDetails.writeToParcel(parcel, i);
    }

    public ConnectPayload(ConnectAddressDetails connectAddressDetails, ConnectContactDetails connectContactDetails, String str, String str2, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = list;
        this.A01 = connectContactDetails;
        this.A00 = connectAddressDetails;
    }
}
