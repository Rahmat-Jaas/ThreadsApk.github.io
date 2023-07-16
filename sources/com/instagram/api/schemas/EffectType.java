package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;
import java.util.LinkedHashMap;
import java.util.Map;

public enum EffectType implements Parcelable {
    UNRECOGNIZED("EffectType_unspecified"),
    STICKER("STICKER");
    
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
        for (EffectType effectType : values()) {
            A0v.put(effectType.A00, effectType);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape7S0000000_I2_7(71);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EffectType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
