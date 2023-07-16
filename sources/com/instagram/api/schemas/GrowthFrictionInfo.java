package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C21672ByJ;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class GrowthFrictionInfo extends AnonymousClass0Sf implements Parcelable, C21672ByJ {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(91);
    public final HashMap A00;
    public final boolean A01;

    public final GrowthFrictionInfo Cyq() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInfo) {
                GrowthFrictionInfo growthFrictionInfo = (GrowthFrictionInfo) obj;
                if (this.A01 != growthFrictionInfo.A01 || !C04220Ms.A0I(this.A00, growthFrictionInfo.A00)) {
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
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(hashMap.size());
        Iterator A0u = C18190wL.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            parcel.writeString(C18200wM.A0p(A0o));
            parcel.writeParcelable((Parcelable) A0o.getValue(), i);
        }
    }

    public final boolean AlQ() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Map Apd() {
        return this.A00;
    }

    public final int hashCode() {
        return ((C86164wN.A1S(this.A01) ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A00);
    }

    public GrowthFrictionInfo(HashMap hashMap, boolean z) {
        this.A01 = z;
        this.A00 = hashMap;
    }
}
