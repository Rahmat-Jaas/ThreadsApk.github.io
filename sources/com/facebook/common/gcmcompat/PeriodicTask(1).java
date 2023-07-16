package com.facebook.common.gcmcompat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(51);
    public long A00;
    public long A01;

    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = Math.min(parcel.readLong(), this.A01);
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.putLong("period", this.A01);
        bundle.putLong("period_flex", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
