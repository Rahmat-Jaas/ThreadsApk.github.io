package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;

public enum VideoMemoryState implements Parcelable {
    GREEN(1);
    
    public static final SparseArray A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (VideoMemoryState videoMemoryState : values()) {
            A01.put(videoMemoryState.A00, videoMemoryState);
        }
        CREATOR = new PCreatorCreatorShape2S0000000_I2_2(45);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    /* access modifiers changed from: public */
    VideoMemoryState(int i) {
        this.A00 = i;
    }
}
