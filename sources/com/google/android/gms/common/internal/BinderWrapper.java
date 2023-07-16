package com.google.android.gms.common.internal;

import X.C86124wJ;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(13);
    public IBinder A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.A00 = parcel.readStrongBinder();
    }
}
