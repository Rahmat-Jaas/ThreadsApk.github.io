package com.instagram.clips.capture.sharesheet.advancedsettings.config;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;

public final class ClipsAdvancedSettingsFanClubConfig extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(68);
    public final ExclusiveContentToggleEnvironment A00;
    public final ClipsFanClubMetadata A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsAdvancedSettingsFanClubConfig) {
                ClipsAdvancedSettingsFanClubConfig clipsAdvancedSettingsFanClubConfig = (ClipsAdvancedSettingsFanClubConfig) obj;
                if (!(C04220Ms.A0I(this.A01, clipsAdvancedSettingsFanClubConfig.A01) && this.A04 == clipsAdvancedSettingsFanClubConfig.A04 && this.A02 == clipsAdvancedSettingsFanClubConfig.A02 && this.A03 == clipsAdvancedSettingsFanClubConfig.A03 && C04220Ms.A0I(this.A00, clipsAdvancedSettingsFanClubConfig.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        ExclusiveContentToggleEnvironment exclusiveContentToggleEnvironment = this.A00;
        if (exclusiveContentToggleEnvironment == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        exclusiveContentToggleEnvironment.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        int A032 = AnonymousClass0wJ.A03(this.A01) * 31;
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A032 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        if (!this.A03) {
            i = 0;
        }
        return ((i3 + i) * 31) + C18200wM.A07(this.A00);
    }

    public ClipsAdvancedSettingsFanClubConfig(ExclusiveContentToggleEnvironment exclusiveContentToggleEnvironment, ClipsFanClubMetadata clipsFanClubMetadata, boolean z, boolean z2, boolean z3) {
        this.A01 = clipsFanClubMetadata;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = exclusiveContentToggleEnvironment;
    }

    public ClipsAdvancedSettingsFanClubConfig() {
        this((ExclusiveContentToggleEnvironment) null, (ClipsFanClubMetadata) null, false, false, false);
    }
}
