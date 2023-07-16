package com.facebook.privacy.zone.api;

import X.C04220Ms;
import X.C18220wO;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;

public class ZonedValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(5);
    public final ZonePolicy A00;
    public final Object A01;

    public ZonedValue(ZonePolicy zonePolicy, Object obj) {
        C04220Ms.A0B(zonePolicy, 2);
        this.A01 = obj;
        this.A00 = zonePolicy;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String A0q;
        C04220Ms.A0B(parcel, 0);
        Object obj = this.A01;
        if (obj == null) {
            A0q = FXPFLinkageCacheDebugFragment.nullString;
        } else {
            A0q = C18220wO.A0q(obj);
        }
        parcel.writeString(A0q);
        parcel.writeValue(obj);
        parcel.writeParcelable(this.A00, i);
    }
}
