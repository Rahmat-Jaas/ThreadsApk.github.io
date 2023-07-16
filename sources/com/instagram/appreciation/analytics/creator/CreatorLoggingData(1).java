package com.instagram.appreciation.analytics.creator;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.Iterator;
import java.util.Map;

public final class CreatorLoggingData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(79);
    public final Map A00;
    public final boolean A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorLoggingData) {
                CreatorLoggingData creatorLoggingData = (CreatorLoggingData) obj;
                if (!(this.A01 == creatorLoggingData.A01 && this.A02 == creatorLoggingData.A02 && C04220Ms.A0I(this.A00, creatorLoggingData.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Map map = this.A00;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            parcel.writeLong(C18190wL.A08(A0o.getKey()));
            parcel.writeLong(C18190wL.A08(A0o.getValue()));
        }
    }

    public final int hashCode() {
        boolean z = this.A01;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        if (!this.A02) {
            i = 0;
        }
        return ((i2 + i) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public CreatorLoggingData(boolean z, boolean z2, Map map) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = map;
    }
}
