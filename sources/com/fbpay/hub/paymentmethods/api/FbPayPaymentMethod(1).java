package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(7);
    public final int A00;
    public final Uri A01;
    public final FbPayBankAccount A02;
    public final FbPayCreditCard A03;
    public final FbPayPayPal A04;
    public final FbPayShopPay A05;
    public final String A06;
    public final String A07;
    public final FbPayNewCreditCardOption A08;
    public final FbPayNewPayPalOption A09;

    public FbPayPaymentMethod(Uri uri, FbPayBankAccount fbPayBankAccount, FbPayCreditCard fbPayCreditCard, FbPayPayPal fbPayPayPal, FbPayShopPay fbPayShopPay, String str, String str2, int i) {
        this.A02 = fbPayBankAccount;
        this.A03 = fbPayCreditCard;
        this.A04 = fbPayPayPal;
        this.A05 = fbPayShopPay;
        this.A01 = uri;
        this.A08 = null;
        this.A09 = null;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentMethod) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) obj;
                if (!AnonymousClass3ZT.A03(this.A02, fbPayPaymentMethod.A02) || !AnonymousClass3ZT.A03(this.A03, fbPayPaymentMethod.A03) || !AnonymousClass3ZT.A03(this.A04, fbPayPaymentMethod.A04) || !AnonymousClass3ZT.A03(this.A05, fbPayPaymentMethod.A05) || !AnonymousClass3ZT.A03(this.A01, fbPayPaymentMethod.A01) || !AnonymousClass3ZT.A03(this.A08, fbPayPaymentMethod.A08) || !AnonymousClass3ZT.A03(this.A09, fbPayPaymentMethod.A09) || !AnonymousClass3ZT.A03(this.A06, fbPayPaymentMethod.A06) || !AnonymousClass3ZT.A03(this.A07, fbPayPaymentMethod.A07) || this.A00 != fbPayPaymentMethod.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((C86124wJ.A0E(this.A02) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C86114wI.A13(parcel, this.A02, i);
        C86114wI.A13(parcel, this.A03, i);
        C86114wI.A13(parcel, this.A04, i);
        C86114wI.A13(parcel, this.A05, i);
        Uri uri = this.A01;
        if (uri == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uri.writeToParcel(parcel, i);
        }
        C86114wI.A13(parcel, this.A08, i);
        C86114wI.A13(parcel, this.A09, i);
        C18190wL.A16(parcel, this.A06, 0, 1);
        C18190wL.A16(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A00);
    }

    public FbPayPaymentMethod(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FbPayBankAccount) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (FbPayCreditCard) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FbPayPayPal) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbPayShopPay) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) Uri.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (FbPayNewCreditCardOption) parcel.readParcelable(A0Z);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FbPayNewPayPalOption) parcel.readParcelable(A0Z);
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C86114wI.A0l(parcel);
        this.A00 = parcel.readInt();
    }
}
