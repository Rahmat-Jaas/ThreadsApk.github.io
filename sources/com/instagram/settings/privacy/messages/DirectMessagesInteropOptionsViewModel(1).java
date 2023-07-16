package com.instagram.settings.privacy.messages;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;

public final class DirectMessagesInteropOptionsViewModel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(50);
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessageInteropReachabilityOptions A01;
    public DirectMessageInteropReachabilityOptions A02;
    public DirectMessageInteropReachabilityOptions A03;
    public DirectMessageInteropReachabilityOptions A04;
    public DirectMessageInteropReachabilityOptions A05;
    public DirectMessageInteropReachabilityOptions A06;
    public DirectMessageInteropReachabilityOptions A07;
    public DirectMessageInteropReachabilityOptions A08;
    public DirectMessageInteropReachabilityOptions A09;

    public DirectMessagesInteropOptionsViewModel() {
        this((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null);
    }

    public final DirectMessageInteropReachabilityOptions A00(String str) {
        C04220Ms.A0B(str, 0);
        switch (str.hashCode()) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return this.A00;
                }
                break;
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return this.A01;
                }
                break;
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return this.A09;
                }
                break;
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return this.A03;
                }
                break;
            case -737267292:
                if (str.equals("eligible_for_bc_partnership")) {
                    return null;
                }
                break;
            case -456614348:
                if (str.equals("ig_followers")) {
                    return this.A05;
                }
                break;
            case -371252023:
                if (str.equals("ig_verified")) {
                    return this.A06;
                }
                break;
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return this.A02;
                }
                break;
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return this.A07;
                }
                break;
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return this.A08;
                }
                break;
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return this.A04;
                }
                break;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0V("DirectConstants.MessageInteropOption ", str, " not implemented"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessagesInteropOptionsViewModel) {
                DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = (DirectMessagesInteropOptionsViewModel) obj;
                if (!(this.A05 == directMessagesInteropOptionsViewModel.A05 && this.A00 == directMessagesInteropOptionsViewModel.A00 && this.A01 == directMessagesInteropOptionsViewModel.A01 && this.A09 == directMessagesInteropOptionsViewModel.A09 && this.A08 == directMessagesInteropOptionsViewModel.A08 && this.A07 == directMessagesInteropOptionsViewModel.A07 && this.A03 == directMessagesInteropOptionsViewModel.A03 && this.A02 == directMessagesInteropOptionsViewModel.A02 && this.A04 == directMessagesInteropOptionsViewModel.A04 && this.A06 == directMessagesInteropOptionsViewModel.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C18200wM.A1B(parcel, this.A05, i);
        C18200wM.A1B(parcel, this.A00, i);
        C18200wM.A1B(parcel, this.A01, i);
        C18200wM.A1B(parcel, this.A09, i);
        C18200wM.A1B(parcel, this.A08, i);
        C18200wM.A1B(parcel, this.A07, i);
        C18200wM.A1B(parcel, this.A03, i);
        C18200wM.A1B(parcel, this.A02, i);
        C18200wM.A1B(parcel, this.A04, i);
        C18200wM.A1B(parcel, this.A06, i);
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass0wJ.A03(this.A05) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + C18200wM.A07(this.A06);
    }

    public DirectMessagesInteropOptionsViewModel(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10) {
        this.A05 = directMessageInteropReachabilityOptions;
        this.A00 = directMessageInteropReachabilityOptions2;
        this.A01 = directMessageInteropReachabilityOptions3;
        this.A09 = directMessageInteropReachabilityOptions4;
        this.A08 = directMessageInteropReachabilityOptions5;
        this.A07 = directMessageInteropReachabilityOptions6;
        this.A03 = directMessageInteropReachabilityOptions7;
        this.A02 = directMessageInteropReachabilityOptions8;
        this.A04 = directMessageInteropReachabilityOptions9;
        this.A06 = directMessageInteropReachabilityOptions10;
    }
}
