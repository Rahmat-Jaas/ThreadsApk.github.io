package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdproRegulatedCategory implements Parcelable {
    UNRECOGNIZED("AdproRegulatedCategory_unspecified"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    EMPLOYMENT("EMPLOYMENT"),
    HOUSING("HOUSING"),
    CREDIT("CREDIT"),
    ISSUES_ELECTIONS_POLITICS("ISSUES_ELECTIONS_POLITICS"),
    EDUCATION("EDUCATION");
    
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
        for (AdproRegulatedCategory adproRegulatedCategory : values()) {
            A0v.put(adproRegulatedCategory.A00, adproRegulatedCategory);
        }
        A01 = A0v;
        CREATOR = C86134wK.A0R(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdproRegulatedCategory(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
