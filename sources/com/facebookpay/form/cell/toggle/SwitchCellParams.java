package com.facebookpay.form.cell.toggle;

import X.C110616lz;
import X.C18180wK;
import X.C86124wJ;
import X.C91795gr;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

public class SwitchCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(65);
    public final int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public SwitchCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = C18180wK.A1V(parcel.readByte());
        this.A00 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
    }

    public SwitchCellParams(C91795gr r2) {
        super((C110616lz) r2);
        this.A01 = r2.A00;
        this.A00 = 2131823188;
    }
}
