package com.instagram.music.common.constants;

import X.C04220Ms;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;

public enum AudioTrackType implements Parcelable {
    DEFAULT,
    REACTIVE,
    ORIGINAL;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorCreatorShape15S0000000_I2_15(65);
    }
}
