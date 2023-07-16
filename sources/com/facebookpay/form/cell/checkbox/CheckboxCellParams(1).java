package com.facebookpay.form.cell.checkbox;

import X.AnonymousClass3JE;
import X.C04220Ms;
import X.C110616lz;
import X.C18180wK;
import X.C91805gs;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;
import com.instagram.barcelona.R;

public final class CheckboxCellParams extends CellParams {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public CheckboxCellParams(Parcel parcel) {
        super(parcel);
        this.A02 = C18180wK.A1V(parcel.readByte());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = AnonymousClass3JE.A00(parcel);
    }

    public CheckboxCellParams(C91805gs r2) {
        super((C110616lz) r2);
        this.A02 = r2.A00;
        this.A01 = R.string.f0nameremoved;
        this.A00 = 2131823187;
        this.A03 = r2.A01;
    }
}
