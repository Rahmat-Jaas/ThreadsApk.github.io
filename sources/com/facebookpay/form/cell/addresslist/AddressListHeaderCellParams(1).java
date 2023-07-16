package com.facebookpay.form.cell.addresslist;

import X.C04220Ms;
import X.C110616lz;
import X.C18180wK;
import X.C86114wI;
import X.C91835gv;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;
import com.instagram.barcelona.R;

public final class AddressListHeaderCellParams extends CellParams {
    public int A00;
    public int A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public AddressListHeaderCellParams(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.A03 = C18180wK.A1V(parcel.readByte());
        this.A04 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = C86114wI.A0b(parcel);
    }

    public AddressListHeaderCellParams(C91835gv r2) {
        super((C110616lz) r2);
        this.A03 = r2.A02;
        this.A04 = r2.A03;
        this.A01 = R.string.f0nameremoved;
        this.A00 = r2.A00;
        this.A02 = r2.A01;
    }
}
