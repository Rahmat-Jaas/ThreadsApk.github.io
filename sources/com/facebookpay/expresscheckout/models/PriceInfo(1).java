package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass23V;
import X.C04220Ms;
import X.C18180wK;
import X.C86104wH;
import X.C86124wJ;
import X.C973068v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;

public final class PriceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(36);
    @SerializedName("amount")
    public final CurrencyAmount A00;
    @SerializedName("type")
    public final C973068v A01;
    @SerializedName("quantity")
    public final Integer A02;
    @SerializedName("iconUrl")
    public final String A03;
    @SerializedName("primaryLabel")
    public final String A04;
    @SerializedName("secondaryLabel")
    public final String A05;
    @SerializedName("status")
    public final AnonymousClass23V A06;
    @SerializedName("metadata")
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        C973068v r0 = this.A01;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        AnonymousClass23V r02 = this.A06;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r02);
        }
        C18180wK.A0y(parcel, this.A02, 0, 1);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public PriceInfo(CurrencyAmount currencyAmount, AnonymousClass23V r2, C973068v r3, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(currencyAmount, str);
        this.A00 = currencyAmount;
        this.A04 = str;
        this.A01 = r3;
        this.A06 = r2;
        this.A02 = num;
        this.A07 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }
}
