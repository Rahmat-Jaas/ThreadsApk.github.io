package com.instagram.model.upcomingeventsmetadata;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;
import com.instagram.api.schemas.MusicDropType;
import java.util.Iterator;
import java.util.List;

public final class UpcomingEventMusicDropMetadata extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape15S0000000_I2_15(60);
    public final MusicDropType A00;
    public final MusicDropState A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public UpcomingEventMusicDropMetadata(MusicDropType musicDropType, MusicDropState musicDropState, Long l, String str, String str2, String str3, List list, boolean z, boolean z2) {
        C18190wL.A1S(str2, 4, musicDropState);
        C86114wI.A1I(musicDropType, 6, list);
        this.A03 = str;
        this.A02 = l;
        this.A07 = z;
        this.A04 = str2;
        this.A01 = musicDropState;
        this.A00 = musicDropType;
        this.A08 = z2;
        this.A05 = str3;
        this.A06 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventMusicDropMetadata) {
                UpcomingEventMusicDropMetadata upcomingEventMusicDropMetadata = (UpcomingEventMusicDropMetadata) obj;
                if (!C04220Ms.A0I(this.A03, upcomingEventMusicDropMetadata.A03) || !C04220Ms.A0I(this.A02, upcomingEventMusicDropMetadata.A02) || this.A07 != upcomingEventMusicDropMetadata.A07 || !C04220Ms.A0I(this.A04, upcomingEventMusicDropMetadata.A04) || this.A01 != upcomingEventMusicDropMetadata.A01 || this.A00 != upcomingEventMusicDropMetadata.A00 || this.A08 != upcomingEventMusicDropMetadata.A08 || !C04220Ms.A0I(this.A05, upcomingEventMusicDropMetadata.A05) || !C04220Ms.A0I(this.A06, upcomingEventMusicDropMetadata.A06)) {
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
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C86134wK.A18(parcel, l, 1);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A04);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A05);
        Iterator A0v = C18200wM.A0v(parcel, this.A06);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
    }

    public final int hashCode() {
        int A062 = ((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A07(this.A04, (A062 + (z ? 1 : 0)) * 31)));
        if (!this.A08) {
            i = 0;
        }
        return C18220wO.A06(this.A06, (((A052 + i) * 31) + C18200wM.A09(this.A05)) * 31);
    }
}
