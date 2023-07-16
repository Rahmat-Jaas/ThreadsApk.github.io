package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ActionType implements Parcelable {
    UNRECOGNIZED("ActionType_unspecified"),
    OPEN_REEL_CREATION("open_reel_creation"),
    OPEN_LINK("open_link"),
    REFRESH_TIPS("refresh_tips");
    
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
        for (ActionType actionType : values()) {
            A0v.put(actionType.A00, actionType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape6S0000000_I2_6(82);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ActionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
