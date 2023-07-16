package com.instagram.brandedcontent.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C01;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class BrandedContentGatingInfo extends AnonymousClass0Sf implements Parcelable, C01 {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(91);
    public final Integer A00;
    public final String A01;
    public final HashMap A02;
    public final List A03;

    public final BrandedContentGatingInfo D39() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentGatingInfo) {
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) obj;
                if (!C04220Ms.A0I(this.A02, brandedContentGatingInfo.A02) || !C04220Ms.A0I(this.A03, brandedContentGatingInfo.A03) || !C04220Ms.A0I(this.A00, brandedContentGatingInfo.A00) || !C04220Ms.A0I(this.A01, brandedContentGatingInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        HashMap hashMap = this.A02;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                parcel.writeString(C18200wM.A0p(A0o));
                parcel.writeInt(AnonymousClass0wJ.A04(A0o.getValue()));
            }
        }
        parcel.writeStringList(this.A03);
        C18180wK.A0y(parcel, this.A00, 0, 1);
        parcel.writeString(this.A01);
    }

    public final /* bridge */ /* synthetic */ Map Aa8() {
        return this.A02;
    }

    public final List Aa9() {
        return this.A03;
    }

    public final Integer AcW() {
        return this.A00;
    }

    public final String B9o() {
        return this.A01;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A03(this.A02) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A01);
    }

    public BrandedContentGatingInfo(Integer num, String str, HashMap hashMap, List list) {
        this.A02 = hashMap;
        this.A03 = list;
        this.A00 = num;
        this.A01 = str;
    }
}
