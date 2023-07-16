package com.facebook.android.maps.model;

import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class LatLngBounds implements Parcelable {
    public static final LatLngBounds A02 = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(89);
    public final LatLng A00;
    public final LatLng A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.A00.equals(latLngBounds.A00) && this.A01.equals(latLngBounds.A01);
    }

    public final boolean A00(LatLng latLng) {
        double d = latLng.A00;
        LatLng latLng2 = this.A00;
        if (d > latLng2.A00) {
            return false;
        }
        LatLng latLng3 = this.A01;
        if (d < latLng3.A00) {
            return false;
        }
        double d2 = latLng3.A01;
        double d3 = latLng2.A01;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        double d4 = latLng.A01;
        int i2 = (d4 > d2 ? 1 : (d4 == d2 ? 0 : -1));
        if (i < 0) {
            if (i2 < 0) {
                return false;
            }
        } else if (i2 >= 0) {
            return true;
        }
        if (d4 <= d3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A00(this.A00.hashCode()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        double d = latLng.A00;
        double d2 = latLng2.A00;
        if (d <= d2) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        StringBuilder A0s = C18190wL.A0s("Southern latitude (");
        A0s.append(d);
        A0s.append(") exceeds Northern latitude (");
        A0s.append(d2);
        throw C18190wL.A0a(C18180wK.A0i(").", A0s));
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C18210wN.A0e(this));
        A0r.append("{northeast=");
        A0r.append(this.A00);
        A0r.append(", southwest=");
        A0r.append(this.A01);
        return C18180wK.A0i("}", A0r);
    }

    public LatLngBounds(Parcel parcel) {
        Class<LatLng> cls = LatLng.class;
        this.A00 = (LatLng) C18180wK.A0A(parcel, cls);
        this.A01 = (LatLng) C18180wK.A0A(parcel, cls);
    }
}
