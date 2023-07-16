package com.facebook.android.maps;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass6GK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.maps.model.LatLng;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StaticMapView$StaticMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(86);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C = Collections.EMPTY_LIST;

    public final void A00() {
        this.A0B = null;
        this.A02 = null;
        this.A0A = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0C.clear();
        this.A09 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticMapView$StaticMapOptions)) {
            return false;
        }
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = (StaticMapView$StaticMapOptions) obj;
        return AnonymousClass6GK.A00(this.A04, staticMapView$StaticMapOptions.A04) && AnonymousClass6GK.A00(this.A08, staticMapView$StaticMapOptions.A08) && AnonymousClass6GK.A00(this.A0B, staticMapView$StaticMapOptions.A0B) && AnonymousClass6GK.A00(this.A02, staticMapView$StaticMapOptions.A02) && AnonymousClass6GK.A00(this.A0A, staticMapView$StaticMapOptions.A0A) && AnonymousClass6GK.A00(this.A03, staticMapView$StaticMapOptions.A03) && AnonymousClass6GK.A00(this.A05, staticMapView$StaticMapOptions.A05) && AnonymousClass6GK.A00(this.A06, staticMapView$StaticMapOptions.A06) && AnonymousClass6GK.A00(this.A07, staticMapView$StaticMapOptions.A07) && this.A00 == staticMapView$StaticMapOptions.A00 && this.A01 == staticMapView$StaticMapOptions.A01 && this.A0C.equals(staticMapView$StaticMapOptions.A0C) && AnonymousClass6GK.A00(this.A09, staticMapView$StaticMapOptions.A09);
    }

    public final void A02(double d, double d2) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(AnonymousClass00U.A0V("color:", "red", "|"));
        A0r.append(d);
        C86144wL.A1T(A0r);
        A0r.append(d2);
        this.A06 = A0r.toString();
    }

    public final void A04(LatLng latLng, int i, int i2) {
        StringBuilder A0s = C18190wL.A0s("color:0x");
        Locale locale = Locale.US;
        A0s.append(String.format(locale, "%08X", C18210wN.A1X((i >>> 24) | (i << 8))).toUpperCase(locale));
        C86134wK.A1H(latLng, A0s);
        A0s.append('|');
        A0s.append(i2);
        this.A03 = C86114wI.A0q(A0s, 'm');
    }

    public final void A05(List list) {
        String substring;
        if (list.isEmpty()) {
            substring = null;
        } else {
            StringBuilder A0r = C18200wM.A0r();
            if (!TextUtils.isEmpty("red")) {
                A0r.append("|color:");
                A0r.append("red");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C86134wK.A1H((LatLng) it.next(), A0r);
            }
            substring = A0r.toString().substring(1);
        }
        this.A06 = substring;
    }

    public final int hashCode() {
        return ((C86104wH.A05(C86104wH.A05((((((((((((((((C18210wN.A00(AnonymousClass0wJ.A06(this.A04)) + AnonymousClass0wJ.A06(this.A08)) * 31) + AnonymousClass0wJ.A06(this.A0B)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A0A)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31, this.A00), this.A01) + this.A0C.hashCode()) * 31) + C18200wM.A09(this.A09);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }

    public StaticMapView$StaticMapOptions(String str) {
        this.A08 = str;
    }

    public final void A01(double d, double d2) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(d);
        A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0r.append(d2);
        this.A02 = A0r.toString();
    }

    public final void A03(int i) {
        this.A0B = String.valueOf(i);
    }
}
