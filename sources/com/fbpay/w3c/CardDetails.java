package com.fbpay.w3c;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class CardDetails implements Parcelable, CardDetailsSpec {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(18);
    public final Address A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public CardDetails(Address address, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = address;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = null;
        this.A09 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardDetails) {
                CardDetails cardDetails = (CardDetails) obj;
                if (!AnonymousClass3ZT.A03(this.A00, cardDetails.A00) || !AnonymousClass3ZT.A03(this.A04, cardDetails.A04) || !AnonymousClass3ZT.A03(this.A05, cardDetails.A05) || !AnonymousClass3ZT.A03(this.A06, cardDetails.A06) || !AnonymousClass3ZT.A03(this.A07, cardDetails.A07) || !AnonymousClass3ZT.A03(this.A08, cardDetails.A08) || !AnonymousClass3ZT.A03(this.A02, cardDetails.A02) || !AnonymousClass3ZT.A03(this.A03, cardDetails.A03) || !AnonymousClass3ZT.A03(this.A01, cardDetails.A01) || !AnonymousClass3ZT.A03(this.A09, cardDetails.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A09);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C86114wI.A13(parcel, this.A00, i);
        C18190wL.A16(parcel, this.A04, 0, 1);
        C18190wL.A16(parcel, this.A05, 0, 1);
        C18190wL.A16(parcel, this.A06, 0, 1);
        C18190wL.A16(parcel, this.A07, 0, 1);
        C18190wL.A16(parcel, this.A08, 0, 1);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        C18180wK.A0y(parcel, this.A03, 0, 1);
        C18190wL.A14(parcel, this.A01);
        C18190wL.A16(parcel, this.A09, 0, 1);
    }

    public CardDetails(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Address) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = C86114wI.A0b(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = C86114wI.A0b(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? Boolean.valueOf(C86114wI.A1V(parcel)) : bool;
        this.A09 = C86114wI.A0l(parcel);
    }
}
