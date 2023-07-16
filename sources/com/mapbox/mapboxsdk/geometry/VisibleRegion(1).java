package com.mapbox.mapboxsdk.geometry;

import X.C18180wK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public class VisibleRegion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(88);
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.A00.equals(visibleRegion.A00) || !this.A01.equals(visibleRegion.A01) || !this.A02.equals(visibleRegion.A02) || !this.A03.equals(visibleRegion.A03) || !this.A04.equals(visibleRegion.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 90 + ((this.A01.hashCode() + 90) * 1000) + ((this.A02.hashCode() + 180) * DexStore.MS_IN_NS) + ((this.A03.hashCode() + 180) * 1000000000);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("[farLeft [");
        A0s.append(this.A00);
        A0s.append("], farRight [");
        A0s.append(this.A01);
        A0s.append("], nearLeft [");
        A0s.append(this.A02);
        A0s.append("], nearRight [");
        A0s.append(this.A03);
        A0s.append("], latLngBounds [");
        A0s.append(this.A04);
        return C18180wK.A0i("]]", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
    }

    public VisibleRegion(Parcel parcel) {
        Class<LatLng> cls = LatLng.class;
        this.A00 = (LatLng) C18180wK.A0A(parcel, cls);
        this.A01 = (LatLng) C18180wK.A0A(parcel, cls);
        this.A02 = (LatLng) C18180wK.A0A(parcel, cls);
        this.A03 = (LatLng) C18180wK.A0A(parcel, cls);
        this.A04 = (LatLngBounds) C18180wK.A0A(parcel, LatLngBounds.class);
    }
}
