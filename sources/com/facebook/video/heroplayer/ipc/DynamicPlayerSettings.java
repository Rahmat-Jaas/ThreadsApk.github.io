package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass00U;
import X.C86114wI;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public class DynamicPlayerSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(25);
    public final boolean A00;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass00U.A0o(", isDebugHeadersEnabled", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public DynamicPlayerSettings(Parcel parcel) {
        this.A00 = C86114wI.A1V(parcel);
    }

    public DynamicPlayerSettings(boolean z) {
        this.A00 = z;
    }

    public DynamicPlayerSettings() {
        this.A00 = false;
    }
}
