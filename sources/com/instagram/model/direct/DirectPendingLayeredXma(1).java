package com.instagram.model.direct;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class DirectPendingLayeredXma extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(53);
    public final ExtendedImageUrl A00;
    public final ExtendedImageUrl A01;
    public final String A02;
    public final String A03;

    public DirectPendingLayeredXma() {
        this((ExtendedImageUrl) null, (ExtendedImageUrl) null, (String) null, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectPendingLayeredXma) {
                DirectPendingLayeredXma directPendingLayeredXma = (DirectPendingLayeredXma) obj;
                if (!C04220Ms.A0I(this.A03, directPendingLayeredXma.A03) || !C04220Ms.A0I(this.A02, directPendingLayeredXma.A02) || !C04220Ms.A0I(this.A01, directPendingLayeredXma.A01) || !C04220Ms.A0I(this.A00, directPendingLayeredXma.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A00);
    }

    public DirectPendingLayeredXma(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = extendedImageUrl;
        this.A00 = extendedImageUrl2;
    }
}
