package fxcache.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;

public final class FxCalAccount implements Parcelable {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxCalAccount) {
                FxCalAccount fxCalAccount = (FxCalAccount) obj;
                if (!C04220Ms.A0I(this.A01, fxCalAccount.A01) || !C04220Ms.A0I(this.A03, fxCalAccount.A03) || !C04220Ms.A0I(this.A02, fxCalAccount.A02) || !C04220Ms.A0I(this.A04, fxCalAccount.A04) || !C04220Ms.A0I(this.A06, fxCalAccount.A06) || !C04220Ms.A0I(this.A07, fxCalAccount.A07) || !C04220Ms.A0I(this.A05, fxCalAccount.A05) || this.A00 != fxCalAccount.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
    }

    public FxCalAccount() {
        this(0, "", "", "", "", "", "", "");
    }

    public final int hashCode() {
        return ((((((((AnonymousClass0wJ.A07(this.A02, (C18180wK.A03(this.A01) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + C18200wM.A09(this.A05)) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxCalAccount(accountId=");
        A0s.append(this.A01);
        A0s.append(", instagramId=");
        A0s.append(this.A03);
        A0s.append(", accountType=");
        A0s.append(this.A02);
        A0s.append(", name=");
        A0s.append(this.A04);
        A0s.append(", profilePictureUrl=");
        A0s.append(this.A06);
        A0s.append(", username=");
        A0s.append(this.A07);
        A0s.append(", obfuscatedId=");
        A0s.append(this.A05);
        A0s.append(", badgeCount=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public FxCalAccount(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass0wJ.A1P(str, str3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A05 = str7;
        this.A00 = i;
    }
}
