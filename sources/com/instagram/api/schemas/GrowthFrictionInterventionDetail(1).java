package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.Iterator;
import java.util.List;

public final class GrowthFrictionInterventionDetail extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(93);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionDetail) {
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) obj;
                if (!C04220Ms.A0I(this.A00, growthFrictionInterventionDetail.A00) || !C04220Ms.A0I(this.A05, growthFrictionInterventionDetail.A05) || !C04220Ms.A0I(this.A01, growthFrictionInterventionDetail.A01) || !C04220Ms.A0I(this.A02, growthFrictionInterventionDetail.A02) || !C04220Ms.A0I(this.A03, growthFrictionInterventionDetail.A03) || !C04220Ms.A0I(this.A04, growthFrictionInterventionDetail.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0v = C18200wM.A0v(parcel, this.A05);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A05(this.A05, C18180wK.A03(this.A00))))) + AnonymousClass0wJ.A06(this.A04);
    }

    public GrowthFrictionInterventionDetail(String str, String str2, String str3, String str4, String str5, List list) {
        AnonymousClass0wJ.A1O(str, list);
        AnonymousClass0wJ.A1R(str2, str3);
        C04220Ms.A0B(str4, 5);
        this.A00 = str;
        this.A05 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
