package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0wJ;
import X.C18190wL;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public class HeroScrollSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(28);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("mEnableExoPlayerThreadScrollAware=");
        A0s.append(this.A02);
        A0s.append(",mEnableLoaderChunkTaskQueueExecutorThreadScrollAware=");
        A0s.append(this.A03);
        A0s.append(",mScrollAwareThreadDowngradePriority=");
        A0s.append(this.A00);
        A0s.append(",mDisableExoPlayerBornScrollAware=");
        A0s.append(this.A01);
        return A0s.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public HeroScrollSetting(Parcel parcel) {
        boolean z = false;
        this.A02 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A03 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() == 1 ? true : z;
    }

    public HeroScrollSetting(int i, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = z3;
    }

    public HeroScrollSetting() {
        this.A02 = false;
        this.A03 = false;
        this.A00 = 19;
        this.A01 = false;
    }
}
