package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C28019Ex9;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class TrackData extends AnonymousClass0Sf implements Parcelable, C28019Ex9 {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(62);
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
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
    public final HashMap A0J;
    public final List A0K;
    public final boolean A0L;
    public final boolean A0M;

    public TrackData(ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, HashMap hashMap, List list, boolean z, boolean z2) {
        List list2 = list;
        C86124wJ.A1A(6, imageUrl2, list2, str8);
        this.A0L = z;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A03 = num;
        this.A0A = str7;
        this.A02 = bool;
        this.A0K = list2;
        this.A0B = str8;
        this.A0C = str9;
        this.A0M = z2;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A0J = hashMap;
        this.A0H = str14;
        this.A0I = str15;
    }

    public final TrackData D2u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackData) {
                TrackData trackData = (TrackData) obj;
                if (this.A0L != trackData.A0L || !C04220Ms.A0I(this.A04, trackData.A04) || !C04220Ms.A0I(this.A05, trackData.A05) || !C04220Ms.A0I(this.A06, trackData.A06) || !C04220Ms.A0I(this.A00, trackData.A00) || !C04220Ms.A0I(this.A01, trackData.A01) || !C04220Ms.A0I(this.A07, trackData.A07) || !C04220Ms.A0I(this.A08, trackData.A08) || !C04220Ms.A0I(this.A09, trackData.A09) || !C04220Ms.A0I(this.A03, trackData.A03) || !C04220Ms.A0I(this.A0A, trackData.A0A) || !C04220Ms.A0I(this.A02, trackData.A02) || !C04220Ms.A0I(this.A0K, trackData.A0K) || !C04220Ms.A0I(this.A0B, trackData.A0B) || !C04220Ms.A0I(this.A0C, trackData.A0C) || this.A0M != trackData.A0M || !C04220Ms.A0I(this.A0D, trackData.A0D) || !C04220Ms.A0I(this.A0E, trackData.A0E) || !C04220Ms.A0I(this.A0F, trackData.A0F) || !C04220Ms.A0I(this.A0G, trackData.A0G) || !C04220Ms.A0I(this.A0J, trackData.A0J) || !C04220Ms.A0I(this.A0H, trackData.A0H) || !C04220Ms.A0I(this.A0I, trackData.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        C18180wK.A0y(parcel, this.A03, 0, 1);
        parcel.writeString(this.A0A);
        C18190wL.A14(parcel, this.A02);
        Iterator A0v = C18200wM.A0v(parcel, this.A0K);
        while (A0v.hasNext()) {
            parcel.writeInt(AnonymousClass0wJ.A04(A0v.next()));
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        HashMap hashMap = this.A0J;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                parcel.writeString(C18200wM.A0p(A0o));
                parcel.writeLong(C18190wL.A08(A0o.getValue()));
            }
        }
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
    }

    public final boolean AQU() {
        return this.A0L;
    }

    public final String ARL() {
        return this.A04;
    }

    public final String AS1() {
        return this.A06;
    }

    public final ImageUrl AaD() {
        return this.A00;
    }

    public final ImageUrl AaE() {
        return this.A01;
    }

    public final String Ac2() {
        return this.A07;
    }

    public final String Ac4() {
        return this.A08;
    }

    public final String AdS() {
        return this.A09;
    }

    public final Integer AeI() {
        return this.A03;
    }

    public final Boolean Alw() {
        return this.A02;
    }

    public final List An8() {
        return this.A0K;
    }

    public final String B4j() {
        return this.A0D;
    }

    public final String BH2() {
        return this.A0H;
    }

    public final boolean BTh() {
        return this.A0M;
    }

    public final String getId() {
        return this.A0B;
    }

    public final int hashCode() {
        boolean z = this.A0L;
        int i = 1;
        if (z) {
            z = true;
        }
        ImageUrl imageUrl = this.A01;
        int A072 = (AnonymousClass0wJ.A07(this.A0B, AnonymousClass0wJ.A05(this.A0K, (((((((((((AnonymousClass0wJ.A05(imageUrl, (((((((((z ? 1 : 0) * true) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31)) + AnonymousClass0wJ.A06(this.A0C)) * 31;
        if (!this.A0M) {
            i = 0;
        }
        return ((((((((((((((A072 + i) * 31) + AnonymousClass0wJ.A06(this.A0D)) * 31) + AnonymousClass0wJ.A06(this.A0E)) * 31) + AnonymousClass0wJ.A06(this.A0F)) * 31) + AnonymousClass0wJ.A06(this.A0G)) * 31) + AnonymousClass0wJ.A03(this.A0J)) * 31) + AnonymousClass0wJ.A06(this.A0H)) * 31) + C18200wM.A09(this.A0I);
    }
}
