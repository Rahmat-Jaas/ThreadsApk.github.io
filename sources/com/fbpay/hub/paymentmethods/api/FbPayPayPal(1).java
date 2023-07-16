package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayPayPal implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(5);
    public final String A00;
    public final String A01;
    public final String A02;
    public final FbPayPaymentDefaultInfo A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public FbPayPayPal(String str, String str2, String str3) {
        this.A04 = null;
        this.A05 = null;
        this.A08 = false;
        this.A06 = null;
        this.A07 = null;
        AnonymousClass3ZT.A02(str, "credentialId");
        this.A00 = str;
        AnonymousClass3ZT.A02(str2, "email");
        this.A01 = str2;
        AnonymousClass3ZT.A02(str3, "id");
        this.A02 = str3;
        this.A09 = false;
        this.A03 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPayPal) {
                FbPayPayPal fbPayPayPal = (FbPayPayPal) obj;
                if (!AnonymousClass3ZT.A03(this.A04, fbPayPayPal.A04) || !AnonymousClass3ZT.A03(this.A05, fbPayPayPal.A05) || this.A08 != fbPayPayPal.A08 || !AnonymousClass3ZT.A03(this.A06, fbPayPayPal.A06) || !AnonymousClass3ZT.A03(this.A07, fbPayPayPal.A07) || !AnonymousClass3ZT.A03(this.A00, fbPayPayPal.A00) || !AnonymousClass3ZT.A03(this.A01, fbPayPayPal.A01) || !AnonymousClass3ZT.A03(this.A02, fbPayPayPal.A02) || this.A09 != fbPayPayPal.A09 || !AnonymousClass3ZT.A03(this.A03, fbPayPayPal.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass3ZT.A00((((((((((AnonymousClass3ZT.A00((C86124wJ.A0E(this.A04) * 31) + AnonymousClass0wJ.A03(this.A05), this.A08) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02), this.A09) * 31) + AnonymousClass0wJ.A03(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A04, 0, 1);
        C18190wL.A16(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A08 ? 1 : 0);
        C18190wL.A16(parcel, this.A06, 0, 1);
        C18190wL.A16(parcel, this.A07, 0, 1);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A09 ? 1 : 0);
        C86114wI.A13(parcel, this.A03, i);
    }

    public FbPayPayPal(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
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
        boolean z = false;
        this.A08 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
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
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A09 = parcel.readInt() == 1 ? true : z;
        this.A03 = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0Z) : fbPayPaymentDefaultInfo;
    }
}
