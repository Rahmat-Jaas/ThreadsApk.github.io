package com.mapbox.mapboxsdk.geometry;

import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(85);
    public final LatLng bottomLeft;
    public final LatLng bottomRight;
    public final LatLng topLeft;
    public final LatLng topRight;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int hashCode = this.topLeft.hashCode();
        int A06 = C18220wO.A06(this.topRight, hashCode ^ (hashCode >>> 31));
        int A062 = C18220wO.A06(this.bottomRight, A06 ^ (A06 >>> 31));
        return C18220wO.A06(this.bottomLeft, A062 ^ (A062 >>> 31));
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }

    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }
}
