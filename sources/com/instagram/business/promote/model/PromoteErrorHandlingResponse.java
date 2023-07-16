package com.instagram.business.promote.model;

import X.C04220Ms;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class PromoteErrorHandlingResponse implements Parcelable {
    public static final PCreatorCreatorShape10S0000000_I2_10 CREATOR = new PCreatorCreatorShape10S0000000_I2_10(40);
    public ErrorHandlingResponseType A00;
    public PromoteErrorLevel A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }

    public PromoteErrorHandlingResponse(Parcel parcel) {
        this.A00 = (ErrorHandlingResponseType) C18180wK.A0A(parcel, ErrorHandlingResponseType.class);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = (PromoteErrorLevel) C18180wK.A0A(parcel, PromoteErrorLevel.class);
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public PromoteErrorHandlingResponse() {
    }
}
