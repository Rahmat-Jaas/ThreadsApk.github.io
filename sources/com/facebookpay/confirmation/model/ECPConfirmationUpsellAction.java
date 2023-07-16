package com.facebookpay.confirmation.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPConfirmationUpsellAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(99);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellAction) {
                ECPConfirmationUpsellAction eCPConfirmationUpsellAction = (ECPConfirmationUpsellAction) obj;
                if (!C04220Ms.A0I(this.A04, eCPConfirmationUpsellAction.A04) || !C04220Ms.A0I(this.A00, eCPConfirmationUpsellAction.A00) || !C04220Ms.A0I(this.A01, eCPConfirmationUpsellAction.A01) || !C04220Ms.A0I(this.A03, eCPConfirmationUpsellAction.A03) || !C04220Ms.A0I(this.A02, eCPConfirmationUpsellAction.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A07(this.A00, C18180wK.A03(this.A04)))) + AnonymousClass0wJ.A06(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPConfirmationUpsellAction(type=");
        A0s.append(this.A04);
        A0s.append(", actionType=");
        A0s.append(this.A00);
        A0s.append(", iconName=");
        A0s.append(this.A01);
        A0s.append(", title=");
        A0s.append(this.A03);
        A0s.append(C18170wI.A00(240));
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public ECPConfirmationUpsellAction(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }
}
