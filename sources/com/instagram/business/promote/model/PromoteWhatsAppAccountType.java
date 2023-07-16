package com.instagram.business.promote.model;

import X.C04220Ms;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import java.util.Locale;

public enum PromoteWhatsAppAccountType implements Parcelable {
    CONSUMER,
    SMB;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorCreatorShape10S0000000_I2_10(49);
    }

    public final String toString() {
        String name = name();
        Locale locale = Locale.ROOT;
        C04220Ms.A08(locale);
        return C18190wL.A0r(locale, name);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A15(parcel, this);
    }
}
