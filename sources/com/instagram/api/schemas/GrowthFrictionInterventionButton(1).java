package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C86114wI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class GrowthFrictionInterventionButton extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(92);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionButton) {
                GrowthFrictionInterventionButton growthFrictionInterventionButton = (GrowthFrictionInterventionButton) obj;
                if (!C04220Ms.A0I(this.A01, growthFrictionInterventionButton.A01) || !C04220Ms.A0I(this.A00, growthFrictionInterventionButton.A00) || !C04220Ms.A0I(this.A02, growthFrictionInterventionButton.A02) || !C04220Ms.A0I(this.A03, growthFrictionInterventionButton.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(C86114wI.A1W(parcel, this.A00) ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A03);
    }

    public GrowthFrictionInterventionButton(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = str3;
    }
}
