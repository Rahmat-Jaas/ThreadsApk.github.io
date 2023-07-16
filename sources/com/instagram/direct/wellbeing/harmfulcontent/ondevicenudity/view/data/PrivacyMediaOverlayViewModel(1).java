package com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data;

import X.AnonymousClass006;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class PrivacyMediaOverlayViewModel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(16);
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PrivacyMediaOverlayViewModel() {
        this((Integer) null, AnonymousClass006.A00, (String) null, (String) null, (String) null, (String) null, 0, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrivacyMediaOverlayViewModel) {
                PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = (PrivacyMediaOverlayViewModel) obj;
                if (!C04220Ms.A0I(this.A06, privacyMediaOverlayViewModel.A06) || !C04220Ms.A0I(this.A04, privacyMediaOverlayViewModel.A04) || !C04220Ms.A0I(this.A01, privacyMediaOverlayViewModel.A01) || !C04220Ms.A0I(this.A05, privacyMediaOverlayViewModel.A05) || !C04220Ms.A0I(this.A03, privacyMediaOverlayViewModel.A03) || this.A02 != privacyMediaOverlayViewModel.A02 || this.A07 != privacyMediaOverlayViewModel.A07 || this.A00 != privacyMediaOverlayViewModel.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeInt(C18230wP.A02(parcel, this.A01));
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        if (this.A02.intValue() != 0) {
            str = "NO_OP";
        } else {
            str = "OPEN_MEDIA";
        }
        parcel.writeString(str);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        String str;
        int A062 = ((((((((AnonymousClass0wJ.A06(this.A06) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A09(this.A03)) * 31;
        Integer num = this.A02;
        if (num.intValue() != 0) {
            str = "NO_OP";
        } else {
            str = "OPEN_MEDIA";
        }
        int A052 = C18220wO.A05(num, str, A062);
        boolean z = this.A07;
        if (z) {
            z = true;
        }
        return ((A052 + (z ? 1 : 0)) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("PrivacyMediaOverlayViewModel(titleConcealedState=");
        A0s.append(this.A06);
        A0s.append(", subtitleConcealedState=");
        A0s.append(this.A04);
        A0s.append(", iconBlurredStateResource=");
        A0s.append(this.A01);
        A0s.append(", titleBlurredState=");
        A0s.append(this.A05);
        A0s.append(", subtitleBlurredState=");
        A0s.append(this.A03);
        A0s.append(", inThreadTapBehavior=");
        if (this.A02.intValue() != 0) {
            str = "NO_OP";
        } else {
            str = "OPEN_MEDIA";
        }
        A0s.append(str);
        A0s.append(", isInThreadReply=");
        A0s.append(this.A07);
        A0s.append(", interventionType=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public PrivacyMediaOverlayViewModel(Integer num, Integer num2, String str, String str2, String str3, String str4, int i, boolean z) {
        C04220Ms.A0B(num2, 6);
        this.A06 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A03 = str4;
        this.A02 = num2;
        this.A07 = z;
        this.A00 = i;
    }
}
