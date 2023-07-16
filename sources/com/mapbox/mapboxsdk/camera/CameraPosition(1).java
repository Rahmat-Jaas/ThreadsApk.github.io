package com.mapbox.mapboxsdk.camera;

import X.C18190wL;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(82);
    public static final CameraPosition DEFAULT = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
    public final double bearing;
    public final LatLng target;
    public final double tilt;
    public final double zoom;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                LatLng latLng = this.target;
                return (latLng == null || latLng.equals(cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing;
            }
            return false;
        }
    }

    public int hashCode() {
        return C18230wP.A05(this.target) + 31;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("Target: ");
        A0s.append(this.target);
        A0s.append(", Zoom:");
        A0s.append(this.zoom);
        A0s.append(", Bearing:");
        A0s.append(this.bearing);
        A0s.append(", Tilt:");
        A0s.append(this.tilt);
        return A0s.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }

    public CameraPosition(LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }
}
