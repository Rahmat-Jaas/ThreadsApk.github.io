package com.facebookpay.form.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C116906xk;
import X.C18200wM;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

public final class FormField implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(75);
    @SerializedName("valueType")
    public final Integer A00;
    @SerializedName("fieldId")
    public final String A01;
    @SerializedName("label")
    public final String A02;
    @SerializedName("validationRules")
    public final List<TextValidatorParams> A03;
    @SerializedName("isOptional")
    public final boolean A04;
    @SerializedName("errorMessage")
    public final String A05;
    @SerializedName("placeHolder")
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04 ? 1 : 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A03);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
        parcel.writeString(C116906xk.A01(this.A00));
    }

    public FormField(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AnonymousClass0wJ.A1O(str, str2);
        C86104wH.A1P(str3, 3, num);
        this.A01 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A04 = z;
        this.A03 = list;
        this.A00 = num;
    }
}
