package com.instagram.contentmanagement.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGContentManagementTool implements Parcelable {
    UNRECOGNIZED("IGContentManagementTool_unspecified"),
    DRAFTS("drafts");
    
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
        for (IGContentManagementTool iGContentManagementTool : values()) {
            A0v.put(iGContentManagementTool.A00, iGContentManagementTool);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape11S0000000_I2_11(5);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGContentManagementTool(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
