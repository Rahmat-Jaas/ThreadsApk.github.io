package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass68F;
import X.AnonymousClass68M;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C86104wH;
import X.C86124wJ;
import X.C969767l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

public final class CheckoutConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(12);
    @SerializedName("apmConfiguration")
    public final APMConfiguration A00;
    @SerializedName("nuxBannerType")
    public final C969767l A01;
    @SerializedName("puxBannerType")
    public final C969767l A02;
    @SerializedName("enableAnonCheckoutRedesign")
    public final Boolean A03;
    @SerializedName("enableCheckoutOptionality")
    public final Boolean A04;
    @SerializedName("enableRedesignPhase2")
    public final Boolean A05;
    @SerializedName("enableRedesignPhase4")
    public final Boolean A06;
    @SerializedName("pickupOptionSupport")
    public final Boolean A07;
    @SerializedName("checkoutCTAButtonText")
    public final String A08;
    @SerializedName("emailOptInUrl")
    public final String A09;
    @SerializedName("languageLocal")
    public final String A0A;
    @SerializedName("optionalFields")
    public final Set<AnonymousClass68M> A0B;
    @SerializedName("returnFields")
    public final Set<AnonymousClass68F> A0C;
    @SerializedName("fullBillingAddressRequired")
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutConfiguration) {
                CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) obj;
                if (!C04220Ms.A0I(this.A0A, checkoutConfiguration.A0A) || !C04220Ms.A0I(this.A0B, checkoutConfiguration.A0B) || !C04220Ms.A0I(this.A0C, checkoutConfiguration.A0C) || !C04220Ms.A0I(this.A08, checkoutConfiguration.A08) || this.A0D != checkoutConfiguration.A0D || this.A01 != checkoutConfiguration.A01 || this.A02 != checkoutConfiguration.A02 || !C04220Ms.A0I(this.A05, checkoutConfiguration.A05) || !C04220Ms.A0I(this.A06, checkoutConfiguration.A06) || !C04220Ms.A0I(this.A03, checkoutConfiguration.A03) || !C04220Ms.A0I(this.A07, checkoutConfiguration.A07) || !C04220Ms.A0I(this.A00, checkoutConfiguration.A00) || !C04220Ms.A0I(this.A09, checkoutConfiguration.A09) || !C04220Ms.A0I(this.A04, checkoutConfiguration.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        Iterator A11 = C86124wJ.A11(parcel, this.A0B);
        while (A11.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass68M) A11.next());
        }
        Iterator A112 = C86124wJ.A11(parcel, this.A0C);
        while (A112.hasNext()) {
            C86104wH.A1B(parcel, (AnonymousClass68F) A112.next());
        }
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0D ? 1 : 0);
        C969767l r0 = this.A01;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        C969767l r02 = this.A02;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r02);
        }
        C18190wL.A14(parcel, this.A05);
        C18190wL.A14(parcel, this.A06);
        C18190wL.A14(parcel, this.A03);
        C18190wL.A14(parcel, this.A07);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A09);
        C18190wL.A14(parcel, this.A04);
    }

    public final int hashCode() {
        int A052 = (AnonymousClass0wJ.A05(this.A0C, AnonymousClass0wJ.A05(this.A0B, AnonymousClass0wJ.A06(this.A0A) * 31)) + AnonymousClass0wJ.A06(this.A08)) * 31;
        boolean z = this.A0D;
        if (z) {
            z = true;
        }
        return ((((((((((((((((((A052 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + C18200wM.A07(this.A04);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CheckoutConfiguration(languageLocal=");
        A0s.append(this.A0A);
        A0s.append(", optionalFields=");
        A0s.append(this.A0B);
        A0s.append(", returnFields=");
        A0s.append(this.A0C);
        A0s.append(", checkoutCTAButtonText=");
        A0s.append(this.A08);
        A0s.append(", fullBillingAddressRequired=");
        A0s.append(this.A0D);
        A0s.append(", nuxBannerType=");
        A0s.append(this.A01);
        A0s.append(", puxBannerType=");
        A0s.append(this.A02);
        A0s.append(", enableRedesignPhase2=");
        A0s.append(this.A05);
        A0s.append(", enableRedesignPhase4=");
        A0s.append(this.A06);
        A0s.append(", enableAnonCheckoutRedesign=");
        A0s.append(this.A03);
        A0s.append(", pickupOptionSupport=");
        A0s.append(this.A07);
        A0s.append(", apmConfiguration=");
        A0s.append(this.A00);
        A0s.append(", emailOptInUrl=");
        A0s.append(this.A09);
        A0s.append(", enableCheckoutOptionality=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public CheckoutConfiguration(APMConfiguration aPMConfiguration, C969767l r2, C969767l r3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, String str3, Set set, Set set2, boolean z) {
        AnonymousClass0wJ.A1Q(set, set2);
        this.A0A = str;
        this.A0B = set;
        this.A0C = set2;
        this.A08 = str2;
        this.A0D = z;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = bool;
        this.A06 = bool2;
        this.A03 = bool3;
        this.A07 = bool4;
        this.A00 = aPMConfiguration;
        this.A09 = str3;
        this.A04 = bool5;
    }
}
