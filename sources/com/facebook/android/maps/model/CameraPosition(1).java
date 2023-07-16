package com.facebook.android.maps.model;

import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(87);
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.A00 == cameraPosition.A00) {
            LatLng latLng = this.A03;
            LatLng latLng2 = cameraPosition.A03;
            if (latLng != null) {
                return latLng.equals(latLng2) && this.A01 == cameraPosition.A01 && this.A02 == cameraPosition.A02;
            }
            if (latLng2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        float f;
        LatLng latLng = this.A03;
        if (latLng != null) {
            f = 527.0f + ((float) latLng.hashCode());
        } else {
            f = 17.0f;
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public CameraPosition(Parcel parcel) {
        this.A03 = (LatLng) C18180wK.A0A(parcel, LatLng.class);
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C18210wN.A0e(this));
        A0r.append("{target=");
        A0r.append(this.A03);
        A0r.append(", zoom=");
        A0r.append(this.A02);
        A0r.append(", tilt=");
        A0r.append(this.A01);
        A0r.append(", bearing=");
        A0r.append(this.A00);
        return C18180wK.A0i("}", A0r);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.A03 = latLng;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
