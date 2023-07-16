package com.instagram.business.promote.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import java.util.Iterator;
import java.util.Map;

public final class PromoteAudiencePotentialReachStore implements Parcelable {
    public static final PCreatorCreatorShape10S0000000_I2_10 CREATOR = new PCreatorCreatorShape10S0000000_I2_10(31);
    public Map A00 = AnonymousClass0wJ.A0y();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00.size());
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            parcel.writeParcelable((Parcelable) A0o.getKey(), i);
            parcel.writeParcelable((Parcelable) A0o.getValue(), i);
        }
    }
}
