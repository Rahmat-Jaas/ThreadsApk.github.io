package com.instagram.direct.wellbeing.common.upsell;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C171209wF;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class DirectWellBeingUpsellBottomSheetData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(15);
    public final int A00;
    public final C171209wF A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public DirectWellBeingUpsellBottomSheetData(C171209wF r2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        C04220Ms.A0B(num, 1);
        this.A07 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = r2;
        this.A00 = i;
        this.A02 = str5;
        this.A03 = str6;
        this.A08 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectWellBeingUpsellBottomSheetData) {
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) obj;
                if (!C04220Ms.A0I(this.A07, directWellBeingUpsellBottomSheetData.A07) || !C04220Ms.A0I(this.A04, directWellBeingUpsellBottomSheetData.A04) || !C04220Ms.A0I(this.A05, directWellBeingUpsellBottomSheetData.A05) || !C04220Ms.A0I(this.A06, directWellBeingUpsellBottomSheetData.A06) || this.A01 != directWellBeingUpsellBottomSheetData.A01 || this.A00 != directWellBeingUpsellBottomSheetData.A00 || !C04220Ms.A0I(this.A02, directWellBeingUpsellBottomSheetData.A02) || !C04220Ms.A0I(this.A03, directWellBeingUpsellBottomSheetData.A03) || this.A08 != directWellBeingUpsellBottomSheetData.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString("HIDDEN_WORDS");
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C171209wF r1 = this.A01;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r1.name());
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DirectWellBeingUpsellBottomSheetData(surface=");
        A0s.append("HIDDEN_WORDS");
        A0s.append(", title=");
        A0s.append(this.A07);
        A0s.append(", subtitle=");
        A0s.append(this.A04);
        A0s.append(", subtitleSpanText=");
        A0s.append(this.A05);
        A0s.append(", subtitleSpanUrl=");
        A0s.append(this.A06);
        A0s.append(", subtitleSpanUrlSource=");
        A0s.append(this.A01);
        A0s.append(", imageRes=");
        A0s.append(this.A00);
        A0s.append(", primaryButtonText=");
        A0s.append(this.A02);
        A0s.append(", secondaryButtonText=");
        A0s.append(this.A03);
        A0s.append(", dismissOnSecondaryButtonClick=");
        A0s.append(this.A08);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final int hashCode() {
        int A062 = (((((((((((((((-1909045556 + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A03)) * 31;
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        return A062 + (z ? 1 : 0);
    }
}
