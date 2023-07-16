package com.facebook.interstitial.triggers;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18170wI;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;

public final class InterstitialTriggerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(88);
    public final ImmutableMap A00;
    public final boolean A01;

    public InterstitialTriggerContext(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        C04220Ms.A0C(readHashMap, C18170wI.A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION));
        ImmutableMap copyOf = ImmutableMap.copyOf(readHashMap);
        C04220Ms.A06(copyOf);
        this.A00 = copyOf;
        this.A01 = parcel.readInt() != 1 ? false : true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeMap(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        ImmutableMap immutableMap;
        if ((obj instanceof InterstitialTriggerContext) && (immutableMap = this.A00) != null) {
            InterstitialTriggerContext interstitialTriggerContext = (InterstitialTriggerContext) obj;
            if (!immutableMap.equals(interstitialTriggerContext.A00) || this.A01 != interstitialTriggerContext.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ImmutableMap immutableMap = this.A00;
        Boolean valueOf = Boolean.valueOf(this.A01);
        return ((AnonymousClass0wJ.A03(immutableMap) + 31) * 31) + C18200wM.A07(valueOf);
    }

    public final String toString() {
        return C18190wL.A0n(this.A00);
    }

    public InterstitialTriggerContext() {
        ImmutableMap immutableMap = RegularImmutableMap.A02;
        C04220Ms.A06(immutableMap);
        this.A00 = immutableMap;
        this.A01 = false;
    }
}
