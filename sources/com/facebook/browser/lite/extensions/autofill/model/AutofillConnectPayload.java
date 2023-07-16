package com.facebook.browser.lite.extensions.autofill.model;

import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AutofillConnectPayload implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(94);
    public final AutofillData A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A0v = C18200wM.A0v(parcel, this.A03);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
        parcel.writeParcelable(this.A00, i);
    }

    public AutofillConnectPayload(AutofillData autofillData, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = autofillData;
    }
}
