package com.instagram.direct.fragment.thread.poll.view;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C41882MfV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import java.util.Iterator;
import java.util.List;

public final class PollMessageOptionViewModel extends AnonymousClass0Sf implements Parcelable, C41882MfV {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(63);
    public final String A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageOptionViewModel) {
                PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) obj;
                if (this.A02 != pollMessageOptionViewModel.A02 || !C04220Ms.A0I(this.A04, pollMessageOptionViewModel.A04) || !C04220Ms.A0I(this.A00, pollMessageOptionViewModel.A00) || !C04220Ms.A0I(this.A03, pollMessageOptionViewModel.A03) || this.A06 != pollMessageOptionViewModel.A06 || !C04220Ms.A0I(this.A05, pollMessageOptionViewModel.A05) || this.A01 != pollMessageOptionViewModel.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A05);
        while (A0v.hasNext()) {
            ((PollMessageVoterInfoViewModel) A0v.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A00, AnonymousClass0wJ.A07(this.A04, C18190wL.A02(this.A02) * 31)));
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return AnonymousClass0wJ.A05(this.A05, (A07 + (z ? 1 : 0)) * 31) + this.A01;
    }

    public PollMessageOptionViewModel(String str, String str2, String str3, List list, int i, long j, boolean z) {
        AnonymousClass0wJ.A1Q(str, str2);
        C04220Ms.A0B(str3, 4);
        this.A02 = j;
        this.A04 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A06 = z;
        this.A05 = list;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
