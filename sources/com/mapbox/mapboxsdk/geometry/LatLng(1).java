package com.mapbox.mapboxsdk.geometry;

import X.C18180wK;
import X.C18190wL;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(83);
    public double altitude;
    public double latitude;
    public double longitude;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LatLng latLng = (LatLng) obj;
            if (!(Double.compare(latLng.altitude, this.altitude) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int A06 = C86134wK.A06(((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31, Double.doubleToLongBits(this.longitude));
        return C86134wK.A06(A06 * 31, Double.doubleToLongBits(this.altitude));
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("LatLng [latitude=");
        A0s.append(this.latitude);
        A0s.append(", longitude=");
        A0s.append(this.longitude);
        A0s.append(", altitude=");
        A0s.append(this.altitude);
        return C18180wK.A0i("]", A0s);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
    }

    public LatLng(double d, double d2) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
    }

    public void setLatitude(double d) {
        if (Double.isNaN(d)) {
            throw C18190wL.A0a("latitude must not be NaN");
        } else if (Math.abs(d) <= 90.0d) {
            this.latitude = d;
        } else {
            throw C18190wL.A0a("latitude must be between -90 and 90");
        }
    }

    public void setLongitude(double d) {
        if (Double.isNaN(d)) {
            throw C18190wL.A0a("longitude must not be NaN");
        } else if (!Double.isInfinite(d)) {
            this.longitude = d;
        } else {
            throw C18190wL.A0a("longitude must not be infinite");
        }
    }

    public LatLng(Parcel parcel) {
        this.altitude = 0.0d;
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
        this.altitude = parcel.readDouble();
    }

    public LatLng() {
        this.altitude = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }
}
