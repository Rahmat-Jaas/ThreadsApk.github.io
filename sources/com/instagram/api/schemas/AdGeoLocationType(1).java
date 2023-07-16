package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AdGeoLocationType implements Parcelable {
    UNRECOGNIZED("AdGeoLocationType_unspecified"),
    COUNTRY_GROUP("COUNTRY_GROUP"),
    COUNTRY("COUNTRY"),
    REGION("REGION"),
    CITY("CITY"),
    ZIP("ZIP"),
    MARKET("MARKET"),
    ELECTORAL_DISTRICT("ELECTORAL_DISTRICT"),
    PLACE("PLACE"),
    CUSTOM_LOCATION("CUSTOM_LOCATION"),
    LARGE_GEO_AREA("LARGE_GEO_AREA"),
    MEDIUM_GEO_AREA("MEDIUM_GEO_AREA"),
    SMALL_GEO_AREA("SMALL_GEO_AREA"),
    METRO_AREA("METRO_AREA"),
    NEIGHBORHOOD("NEIGHBORHOOD"),
    SUBNEIGHBORHOOD("SUBNEIGHBORHOOD"),
    SUBCITY("SUBCITY"),
    LOCATION_CLUSTER_IDS("LOCATION_CLUSTER_IDS");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0M(r3));
        for (AdGeoLocationType adGeoLocationType : values()) {
            A0v.put(adGeoLocationType.A00, adGeoLocationType);
        }
        A01 = A0v;
        CREATOR = C86134wK.A0R(83);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AdGeoLocationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}
