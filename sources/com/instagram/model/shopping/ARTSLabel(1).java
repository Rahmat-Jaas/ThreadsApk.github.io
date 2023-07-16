package com.instagram.model.shopping;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C18210wN;
import X.C86104wH;
import X.C972468n;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;

public final class ARTSLabel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(38);
    public C972468n A00;
    public String A01;
    public String A02;

    public ARTSLabel(C972468n r2, String str, String str2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ARTSLabel) {
                ARTSLabel aRTSLabel = (ARTSLabel) obj;
                if (this.A00 != aRTSLabel.A00 || !C04220Ms.A0I(this.A01, aRTSLabel.A01) || !C04220Ms.A0I(this.A02, aRTSLabel.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A00) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02);
    }

    public ARTSLabel() {
        this(C972468n.NONE, (String) null, (String) null);
    }
}
