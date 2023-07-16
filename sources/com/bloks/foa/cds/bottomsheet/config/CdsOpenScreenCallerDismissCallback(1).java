package com.bloks.foa.cds.bottomsheet.config;

import X.C62533aC;
import X.C81824oS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape0S0000000_I2;

public class CdsOpenScreenCallerDismissCallback implements CdsOpenScreenDismissCallback {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape0S0000000_I2(64);
    public final C81824oS A00;

    public final int describeContents() {
        return 0;
    }

    public final void Bu6(int i) {
        this.A00.CfP(i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(C62533aC.A00(this.A00));
    }

    public CdsOpenScreenCallerDismissCallback(C81824oS r1) {
        this.A00 = r1;
    }
}
