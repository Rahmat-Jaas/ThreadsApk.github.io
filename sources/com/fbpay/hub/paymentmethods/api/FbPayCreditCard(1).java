package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.AnonymousClass69W;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;

public class FbPayCreditCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(2);
    public final FBPayAddress A00;
    public final AnonymousClass69W A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final FbPayPaymentDefaultInfo A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public FbPayCreditCard(FBPayAddress fBPayAddress, AnonymousClass69W r4, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A00 = fBPayAddress;
        this.A0D = null;
        AnonymousClass3ZT.A02(r4, "cardType");
        this.A01 = r4;
        this.A03 = str;
        this.A04 = str2;
        AnonymousClass3ZT.A02(str3, "credentialId");
        this.A05 = str3;
        AnonymousClass3ZT.A02(str4, "expireMonth");
        this.A06 = str4;
        AnonymousClass3ZT.A02(str5, "expireYear");
        this.A07 = str5;
        AnonymousClass3ZT.A02(str6, "id");
        this.A08 = str6;
        this.A02 = bool;
        this.A0E = false;
        this.A0B = false;
        this.A0F = false;
        AnonymousClass3ZT.A02(str7, "lastFourDigits");
        this.A09 = str7;
        this.A0C = null;
        this.A0A = str8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayCreditCard) {
                FbPayCreditCard fbPayCreditCard = (FbPayCreditCard) obj;
                if (!AnonymousClass3ZT.A03(this.A00, fbPayCreditCard.A00) || !AnonymousClass3ZT.A03(this.A0D, fbPayCreditCard.A0D) || this.A01 != fbPayCreditCard.A01 || !AnonymousClass3ZT.A03(this.A03, fbPayCreditCard.A03) || !AnonymousClass3ZT.A03(this.A04, fbPayCreditCard.A04) || !AnonymousClass3ZT.A03(this.A05, fbPayCreditCard.A05) || !AnonymousClass3ZT.A03(this.A06, fbPayCreditCard.A06) || !AnonymousClass3ZT.A03(this.A07, fbPayCreditCard.A07) || !AnonymousClass3ZT.A03(this.A08, fbPayCreditCard.A08) || !AnonymousClass3ZT.A03(this.A02, fbPayCreditCard.A02) || this.A0E != fbPayCreditCard.A0E || this.A0B != fbPayCreditCard.A0B || this.A0F != fbPayCreditCard.A0F || !AnonymousClass3ZT.A03(this.A09, fbPayCreditCard.A09) || !AnonymousClass3ZT.A03(this.A0C, fbPayCreditCard.A0C) || !AnonymousClass3ZT.A03(this.A0A, fbPayCreditCard.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A0E2 = (C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A0D);
        AnonymousClass69W r0 = this.A01;
        if (r0 == null) {
            ordinal = -1;
        } else {
            ordinal = r0.ordinal();
        }
        return (((((AnonymousClass3ZT.A00(AnonymousClass3ZT.A00(AnonymousClass3ZT.A00((((((((((((((((A0E2 * 31) + ordinal) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A02), this.A0E), this.A0B), this.A0F) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A0C)) * 31) + AnonymousClass0wJ.A03(this.A0A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        FBPayAddress fBPayAddress = this.A00;
        if (fBPayAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fBPayAddress.writeToParcel(parcel, i);
        }
        C18190wL.A16(parcel, this.A0D, 0, 1);
        parcel.writeInt(this.A01.ordinal());
        C18190wL.A16(parcel, this.A03, 0, 1);
        C18190wL.A16(parcel, this.A04, 0, 1);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C18190wL.A14(parcel, this.A02);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A09);
        C86114wI.A13(parcel, this.A0C, i);
        C18190wL.A16(parcel, this.A0A, 0, 1);
    }

    public FbPayCreditCard(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FBPayAddress) FBPayAddress.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A01 = AnonymousClass69W.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        boolean z = false;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Boolean.valueOf(AnonymousClass0wJ.A1T(parcel.readInt(), 1));
        }
        this.A0E = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0B = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0F = parcel.readInt() == 1 ? true : z;
        this.A09 = parcel.readString();
        this.A0C = parcel.readInt() != 0 ? (FbPayPaymentDefaultInfo) parcel.readParcelable(A0Z) : fbPayPaymentDefaultInfo;
        this.A0A = C86114wI.A0l(parcel);
    }
}
