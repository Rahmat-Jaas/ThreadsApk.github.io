package com.instagram.direct.fragment.thread.poll.view;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;
import X.C41882MfV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import com.instagram.common.typedurl.ImageUrl;

public final class PollMessageVoterInfoViewModel extends AnonymousClass0Sf implements Parcelable, C41882MfV {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(64);
    public final String A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;

    public PollMessageVoterInfoViewModel(ImageUrl imageUrl, String str, String str2, String str3) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(str3, imageUrl);
        this.A00 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = imageUrl;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageVoterInfoViewModel) {
                PollMessageVoterInfoViewModel pollMessageVoterInfoViewModel = (PollMessageVoterInfoViewModel) obj;
                if (!C04220Ms.A0I(this.A00, pollMessageVoterInfoViewModel.A00) || !C04220Ms.A0I(this.A02, pollMessageVoterInfoViewModel.A02) || !C04220Ms.A0I(this.A03, pollMessageVoterInfoViewModel.A03) || !C04220Ms.A0I(this.A01, pollMessageVoterInfoViewModel.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A07(this.A03, (C18180wK.A03(this.A00) + AnonymousClass0wJ.A06(this.A02)) * 31));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
