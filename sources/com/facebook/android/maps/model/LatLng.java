package com.facebook.android.maps.model;

import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(88);
    public final double A00;
    public final double A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Math.abs(this.A00 - latLng.A00) < 0.002d && Math.abs(this.A01 - latLng.A01) < 2.0E-4d;
    }

    public final int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public LatLng(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C18210wN.A0e(this));
        A0r.append("{latitude=");
        A0r.append(this.A00);
        A0r.append(", longitude=");
        A0r.append(this.A01);
        return C18180wK.A0i("}", A0r);
    }

    public LatLng(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }
}
