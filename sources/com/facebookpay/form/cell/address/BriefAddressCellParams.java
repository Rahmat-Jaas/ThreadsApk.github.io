package com.facebookpay.form.cell.address;

import X.C110616lz;
import X.C18180wK;
import X.C86124wJ;
import X.C91815gt;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;

public class BriefAddressCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(42);
    public final Country A00;
    public final AddressFormFieldsConfig A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public BriefAddressCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = (Country) C18180wK.A0A(parcel, Country.class);
        this.A02 = parcel.readString();
        Parcelable A0A = C18180wK.A0A(parcel, AddressFormFieldsConfig.class);
        A0A.getClass();
        this.A01 = (AddressFormFieldsConfig) A0A;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public BriefAddressCellParams(C91815gt r2) {
        super((C110616lz) r2);
        this.A00 = r2.A00;
        this.A02 = r2.A01;
        this.A01 = r2.A02;
    }
}
