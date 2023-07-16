package com.facebook.common.gcmcompat;

import X.C115566vU;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(50);
    public long A00;
    public long A01;

    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.putLong("window_start", this.A01);
        bundle.putLong("window_end", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public OneoffTask(C115566vU r3) {
        super(r3);
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }
}
