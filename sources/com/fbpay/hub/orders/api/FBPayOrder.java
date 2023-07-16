package com.fbpay.hub.orders.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FBPayOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(99);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayOrder) {
                FBPayOrder fBPayOrder = (FBPayOrder) obj;
                if (!AnonymousClass3ZT.A03(this.A01, fBPayOrder.A01) || !AnonymousClass3ZT.A03(this.A02, fBPayOrder.A02) || !AnonymousClass3ZT.A03(this.A03, fBPayOrder.A03) || !AnonymousClass3ZT.A03(this.A04, fBPayOrder.A04) || !AnonymousClass3ZT.A03(this.A00, fBPayOrder.A00) || !AnonymousClass3ZT.A03(this.A05, fBPayOrder.A05) || this.A07 != fBPayOrder.A07 || !AnonymousClass3ZT.A03(this.A06, fBPayOrder.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C86124wJ.A0E(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + this.A07) * 31) + AnonymousClass0wJ.A03(this.A06);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A01, 0, 1);
        C18190wL.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C18180wK.A0y(parcel, this.A00, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07);
        C18190wL.A16(parcel, this.A06, 0, 1);
    }

    public FBPayOrder(Parcel parcel) {
        Integer num = null;
        if (C86114wI.A08(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? C86114wI.A0b(parcel) : num;
        this.A05 = parcel.readString();
        this.A07 = parcel.readInt();
        this.A06 = C86114wI.A0l(parcel);
    }

    public FBPayOrder(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A01 = str;
        this.A02 = str2;
        AnonymousClass3ZT.A02(str3, "orderId");
        this.A03 = str3;
        AnonymousClass3ZT.A02(str4, "orderStatus");
        this.A04 = str4;
        this.A00 = num;
        this.A05 = str5;
        this.A07 = i;
        this.A06 = str6;
    }
}
