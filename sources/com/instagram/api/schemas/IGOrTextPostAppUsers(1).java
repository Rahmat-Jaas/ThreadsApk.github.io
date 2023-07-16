package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGOrTextPostAppUsers implements Parcelable {
    UNRECOGNIZED("IGOrTextPostAppUsers_unspecified"),
    ALL_USERS("all"),
    TEXT_POST_APP_USERS("text_post_app_users");
    
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
        for (IGOrTextPostAppUsers iGOrTextPostAppUsers : values()) {
            A0v.put(iGOrTextPostAppUsers.A00, iGOrTextPostAppUsers);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(8);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGOrTextPostAppUsers(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
