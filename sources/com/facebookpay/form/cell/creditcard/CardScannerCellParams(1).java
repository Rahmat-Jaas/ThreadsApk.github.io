package com.facebookpay.form.cell.creditcard;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

public final class CardScannerCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(47);
    public final boolean A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public CardScannerCellParams(int i, boolean z) {
        super(i);
        this.A01 = i;
        this.A00 = z;
    }

    public CardScannerCellParams() {
        this(0, false);
    }
}
