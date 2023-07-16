package com.instagram.phonenumber.model;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;
import java.util.Locale;

public final class CountryCodeData implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(0);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        return AnonymousClass00U.A0L("+", this.A01);
    }

    public final String A01() {
        String A0j = C18180wK.A0j("%s (+%s)", new Object[]{this.A02, this.A01});
        C04220Ms.A06(A0j);
        return A0j;
    }

    public final String A02() {
        String A0j = C18180wK.A0j("%s +%s", new Object[]{this.A00, this.A01});
        C04220Ms.A06(A0j);
        return A0j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        CountryCodeData countryCodeData = (CountryCodeData) obj;
        int i = 0;
        C04220Ms.A0B(countryCodeData, 0);
        String str = this.A02;
        if (str == null || countryCodeData.A02 == null) {
            String str2 = countryCodeData.A02;
            if (str2 == null || str == null) {
                return -1;
            }
            i = str.compareTo(str2);
            if (Integer.valueOf(i) == null) {
                return -1;
            }
        }
        return i;
    }

    public CountryCodeData(Parcel parcel) {
        String str = "";
        this.A01 = str;
        this.A00 = str;
        String readString = parcel.readString();
        this.A01 = readString == null ? str : readString;
        this.A02 = parcel.readString();
        String readString2 = parcel.readString();
        this.A00 = readString2 != null ? readString2 : str;
    }

    public CountryCodeData(String str, String str2, String str3) {
        AnonymousClass0wJ.A1P(str, str3);
        this.A01 = "";
        this.A00 = "";
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountryCodeData(int i, String str) {
        this(String.valueOf(i), new Locale("", str).getDisplayCountry(), str);
        C04220Ms.A0B(str, 2);
    }

    public CountryCodeData() {
        this.A01 = "";
        this.A00 = "";
    }
}
