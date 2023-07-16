package com.facebook.smartcapture.resources.stringoverride.bloks;

import X.AnonymousClass8e2;
import X.C04220Ms;
import X.C122297Mh;
import X.C127927hz;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import java.util.Map;

public final class BloksStringOverrideFactory implements Parcelable, StringOverrideFactory {
    public static final C122297Mh CREATOR = new C122297Mh();
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeMap(this.A00);
    }

    public final AnonymousClass8e2 AEy() {
        return new C127927hz(this.A00);
    }

    public BloksStringOverrideFactory(Map map) {
        this.A00 = map;
    }
}
