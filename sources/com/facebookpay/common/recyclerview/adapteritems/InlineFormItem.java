package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.fragment.model.FormParams;

public final class InlineFormItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(71);
    public final FormParams A00;
    public final String A01;
    public final AnonymousClass69U A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final AnonymousClass69U AqR() {
        return this.A02;
    }

    public InlineFormItem(AnonymousClass69U r2, FormParams formParams, String str) {
        AnonymousClass0wJ.A1O(r2, formParams);
        C04220Ms.A0B(str, 3);
        this.A02 = r2;
        this.A00 = formParams;
        this.A01 = str;
    }
}
