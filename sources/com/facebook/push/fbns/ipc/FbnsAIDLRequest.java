package com.facebook.push.fbns.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;

public class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(12);
    public int A00;

    public FbnsAIDLRequest(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public final void A00(Parcel parcel, int i) {
        super.A00(parcel, i);
        parcel.writeInt(this.A00);
    }

    public FbnsAIDLRequest(int i, Bundle bundle) {
        super(bundle);
        this.A00 = i;
    }
}
