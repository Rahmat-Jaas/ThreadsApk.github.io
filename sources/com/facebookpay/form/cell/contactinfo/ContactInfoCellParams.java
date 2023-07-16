package com.facebookpay.form.cell.contactinfo;

import X.C04220Ms;
import X.C110616lz;
import X.C86124wJ;
import X.C91855gx;
import android.os.Parcel;
import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;
import com.facebookpay.form.cell.CellParams;

public final class ContactInfoCellParams extends CellParams {
    public static final PCreatorCreatorShape3S0000000_I2_3 CREATOR = C86124wJ.A0X(46);
    public int A00;
    public FBPayFormFieldImpl A01;
    public FBPayFormFieldImpl A02;
    public FBPayFormFieldImpl A03;
    public boolean A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }

    public ContactInfoCellParams(C91855gx r2) {
        super((C110616lz) r2);
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A03 = r2.A03;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
    }

    public ContactInfoCellParams(Parcel parcel) {
        super(parcel);
    }
}
