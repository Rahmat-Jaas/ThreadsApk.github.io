package com.instagram.model.reels;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryWedgingType implements Parcelable {
    UNRECOGNIZED("StoryWedgingType_unspecified"),
    OFF("off"),
    SHOW_ALL("show_all"),
    SHOW_ALL_REINSERT("show_all_reinsert"),
    SHOW_ALL_RANKING("show_all_ranking");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (StoryWedgingType storyWedgingType : values()) {
            A0v.put(storyWedgingType.A00, storyWedgingType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape14S0000000_I2_14(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryWedgingType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
