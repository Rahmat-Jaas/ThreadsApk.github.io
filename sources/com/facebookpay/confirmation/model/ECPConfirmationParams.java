package com.facebookpay.confirmation.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPConfirmationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(98);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ECPConfirmationParams(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str, String str2, String str3, String str4, String str5, String str6) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(str3, str4);
        C04220Ms.A0B(str6, 7);
        this.A03 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationParams) {
                ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
                if (!C04220Ms.A0I(this.A03, eCPConfirmationParams.A03) || !C04220Ms.A0I(this.A02, eCPConfirmationParams.A02) || !C04220Ms.A0I(this.A05, eCPConfirmationParams.A05) || !C04220Ms.A0I(this.A04, eCPConfirmationParams.A04) || !C04220Ms.A0I(this.A06, eCPConfirmationParams.A06) || !C04220Ms.A0I(this.A00, eCPConfirmationParams.A00) || !C04220Ms.A0I(this.A01, eCPConfirmationParams.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        ECPConfirmationUpsellSection eCPConfirmationUpsellSection = this.A00;
        if (eCPConfirmationUpsellSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPConfirmationUpsellSection.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A05, (C18180wK.A03(this.A03) + AnonymousClass0wJ.A06(this.A02)) * 31);
        return C18210wN.A05(this.A01, (((AnonymousClass0wJ.A07(this.A04, A07) + AnonymousClass0wJ.A06(this.A06)) * 31) + C18200wM.A07(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPConfirmationParams(paymentSectionTitle=");
        A0s.append(this.A03);
        A0s.append(", paymentSectionSubtitle=");
        A0s.append(this.A02);
        A0s.append(", seeReceiptTitle=");
        A0s.append(this.A05);
        A0s.append(", seeReceiptLinkUrl=");
        A0s.append(this.A04);
        A0s.append(", upsellPINTitle=");
        A0s.append(this.A06);
        A0s.append(", upsellSection=");
        A0s.append(this.A00);
        A0s.append(", ctaType=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
