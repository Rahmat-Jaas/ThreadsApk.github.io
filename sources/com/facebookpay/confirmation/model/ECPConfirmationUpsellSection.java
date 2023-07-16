package com.facebookpay.confirmation.model;

import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ECPConfirmationUpsellSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(0);
    public final String A00;
    public final List A01;

    public ECPConfirmationUpsellSection(String str, List list) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellSection) {
                ECPConfirmationUpsellSection eCPConfirmationUpsellSection = (ECPConfirmationUpsellSection) obj;
                if (!C04220Ms.A0I(this.A00, eCPConfirmationUpsellSection.A00) || !C04220Ms.A0I(this.A01, eCPConfirmationUpsellSection.A01)) {
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
        Iterator A0v = C18200wM.A0v(parcel, this.A01);
        while (A0v.hasNext()) {
            ((ECPConfirmationUpsellAction) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPConfirmationUpsellSection(upsellSectionTitle=");
        A0s.append(this.A00);
        A0s.append(", upsellActions=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
