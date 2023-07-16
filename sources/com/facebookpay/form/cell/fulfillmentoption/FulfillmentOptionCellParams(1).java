package com.facebookpay.form.cell.fulfillmentoption;

import X.C04220Ms;
import X.C110616lz;
import X.C86124wJ;
import X.C91775gp;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;
import com.facebookpay.form.cell.CellParams;

public final class FulfillmentOptionCellParams extends CellParams {
    public static final PCreatorCreatorShape3S0000000_I2_3 CREATOR = C86124wJ.A0X(49);
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public FulfillmentOptionCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public FulfillmentOptionCellParams(C91775gp r2) {
        super((C110616lz) r2);
        this.A00 = r2.A00;
        this.A01 = 2131826583;
    }
}
