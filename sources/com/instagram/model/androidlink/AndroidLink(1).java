package com.instagram.model.androidlink;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C2T;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class AndroidLink extends AnonymousClass0Sf implements Parcelable, C2T {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(41);
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;

    public final AndroidLink D4l() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AndroidLink) {
                AndroidLink androidLink = (AndroidLink) obj;
                if (!C04220Ms.A0I(this.A06, androidLink.A06) || !C04220Ms.A0I(this.A07, androidLink.A07) || !C04220Ms.A0I(this.A03, androidLink.A03) || !C04220Ms.A0I(this.A08, androidLink.A08) || !C04220Ms.A0I(this.A09, androidLink.A09) || !C04220Ms.A0I(this.A0A, androidLink.A0A) || !C04220Ms.A0I(this.A0B, androidLink.A0B) || !C04220Ms.A0I(this.A0C, androidLink.A0C) || !C04220Ms.A0I(this.A0D, androidLink.A0D) || !C04220Ms.A0I(this.A0E, androidLink.A0E) || !C04220Ms.A0I(this.A00, androidLink.A00) || !C04220Ms.A0I(this.A01, androidLink.A01) || !C04220Ms.A0I(this.A02, androidLink.A02) || !C04220Ms.A0I(this.A0F, androidLink.A0F) || !C04220Ms.A0I(this.A04, androidLink.A04) || !C04220Ms.A0I(this.A05, androidLink.A05) || !C04220Ms.A0I(this.A0G, androidLink.A0G) || !C04220Ms.A0I(this.A0H, androidLink.A0H) || !C04220Ms.A0I(this.A0I, androidLink.A0I) || !C04220Ms.A0I(this.A0J, androidLink.A0J) || !C04220Ms.A0I(this.A0K, androidLink.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        C18180wK.A0y(parcel, this.A03, 0, 1);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        C18190wL.A14(parcel, this.A00);
        C18190wL.A14(parcel, this.A01);
        C18190wL.A14(parcel, this.A02);
        parcel.writeString(this.A0F);
        C18180wK.A0y(parcel, this.A04, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
    }

    public final String AQi() {
        return this.A06;
    }

    public final String AQz() {
        return this.A07;
    }

    public final Integer AR1() {
        return this.A03;
    }

    public final String AV0() {
        return this.A08;
    }

    public final String AWJ() {
        return this.A09;
    }

    public final String AWK() {
        return this.A0A;
    }

    public final String AZY() {
        return this.A0B;
    }

    public final String AcV() {
        return this.A0C;
    }

    public final String Ad2() {
        return this.A0D;
    }

    public final String AoH() {
        return this.A0E;
    }

    public final String Arl() {
        return this.A0F;
    }

    public final Integer AsD() {
        return this.A04;
    }

    public final String B3w() {
        return this.A0G;
    }

    public final String B6B() {
        return this.A0H;
    }

    public final String B6c() {
        return this.A0I;
    }

    public final String BFa() {
        return this.A0J;
    }

    public final String BM2() {
        return this.A0K;
    }

    public final String BMt() {
        return this.A05;
    }

    public final Boolean BRJ() {
        return this.A00;
    }

    public final Boolean BZR() {
        return this.A01;
    }

    public final Boolean BZv() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((AnonymousClass0wJ.A06(this.A06) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A06(this.A0B)) * 31) + AnonymousClass0wJ.A06(this.A0C)) * 31) + AnonymousClass0wJ.A06(this.A0D)) * 31) + AnonymousClass0wJ.A06(this.A0E)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A0F)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A0G)) * 31) + AnonymousClass0wJ.A06(this.A0H)) * 31) + AnonymousClass0wJ.A06(this.A0I)) * 31) + AnonymousClass0wJ.A06(this.A0J)) * 31) + C18200wM.A09(this.A0K);
    }

    public AndroidLink(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.A06 = str;
        this.A07 = str2;
        this.A03 = num;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str9;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A0F = str10;
        this.A04 = num2;
        this.A05 = str11;
        this.A0G = str12;
        this.A0H = str13;
        this.A0I = str14;
        this.A0J = str15;
        this.A0K = str16;
    }
}
