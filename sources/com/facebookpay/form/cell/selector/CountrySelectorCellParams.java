package com.facebookpay.form.cell.selector;

import X.C110616lz;
import X.C1366783w;
import X.C86124wJ;
import X.C86134wK;
import X.C91845gw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.FormCountry;
import com.google.common.collect.ImmutableList;

public class CountrySelectorCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(55);
    public final int A00;
    public final Country A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public CountrySelectorCellParams(C91845gw r2) {
        super((C110616lz) r2);
        this.A03 = r2.A02;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A02 = r2.A04;
        this.A04 = r2.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        C1366783w A0U = C86134wK.A0U(parcel, this.A02);
        while (A0U.hasNext()) {
            parcel.writeParcelable((FormCountry) A0U.next(), i);
        }
        parcel.writeInt(0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
