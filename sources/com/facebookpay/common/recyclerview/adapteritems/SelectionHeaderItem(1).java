package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass69U;
import X.C04220Ms;
import X.C18230wP;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(91);
    public Integer A00;
    public String A01;
    public final Integer A02;
    public final AnonymousClass69U A03;

    public SelectionHeaderItem(AnonymousClass69U r2, Integer num, Integer num2, String str) {
        C04220Ms.A0B(r2, 1);
        this.A03 = r2;
        this.A01 = str;
        this.A00 = num;
        this.A02 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(C18230wP.A02(parcel, this.A00));
        switch (this.A02.intValue()) {
            case 0:
                str = "CREDENTIAL_TYPE_HEADER";
                break;
            case 1:
                str = "SECTION_HEADER";
                break;
            case 2:
                str = "ACCORDION_HEADER";
                break;
            default:
                str = "ACCORDION_HEADER_NO_RIGHT_ADDON";
                break;
        }
        parcel.writeString(str);
    }

    public final AnonymousClass69U AqR() {
        return this.A03;
    }
}
