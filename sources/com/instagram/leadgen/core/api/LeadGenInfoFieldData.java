package com.instagram.leadgen.core.api;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.List;

public final class LeadGenInfoFieldData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(4);
    public final String A00;
    public final List A01;
    public final boolean A02;

    public LeadGenInfoFieldData(String str, List list, boolean z) {
        C04220Ms.A0B(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenInfoFieldData) {
                LeadGenInfoFieldData leadGenInfoFieldData = (LeadGenInfoFieldData) obj;
                if (this.A02 != leadGenInfoFieldData.A02 || !C04220Ms.A0I(this.A00, leadGenInfoFieldData.A00) || !C04220Ms.A0I(this.A01, leadGenInfoFieldData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A00, (C86164wN.A1S(this.A02) ? 1 : 0) * true) + AnonymousClass0wJ.A03(this.A01);
    }
}
