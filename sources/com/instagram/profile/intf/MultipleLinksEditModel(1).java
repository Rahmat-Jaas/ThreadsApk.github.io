package com.instagram.profile.intf;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;

public final class MultipleLinksEditModel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(11);
    public final Integer A00;
    public final String A01;

    public MultipleLinksEditModel(Integer num, String str) {
        C04220Ms.A0B(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultipleLinksEditModel) {
                MultipleLinksEditModel multipleLinksEditModel = (MultipleLinksEditModel) obj;
                if (this.A00 != multipleLinksEditModel.A00 || !C04220Ms.A0I(this.A01, multipleLinksEditModel.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        if (this.A00.intValue() != 0) {
            str = "EDIT";
        } else {
            str = "CREATE";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "EDIT";
        } else {
            str = "CREATE";
        }
        return (C86144wL.A0B(str, intValue) * 31) + AnonymousClass0wJ.A06(this.A01);
    }
}
