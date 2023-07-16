package com.google.android.gms.phenotype;

import X.AnonymousClass6JA;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C86104wH;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(27);
    public final int A00;
    public final Map A01 = new TreeMap();
    public final zzi[] A02;
    public final String[] A03;

    public Configuration(zzi[] zziArr, String[] strArr, int i) {
        this.A00 = i;
        this.A02 = zziArr;
        for (zzi zzi : zziArr) {
            this.A01.put(zzi.A01, zzi);
        }
        this.A03 = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((Configuration) obj).A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.A00 == configuration.A00 && AnonymousClass6JA.A00(this.A01, configuration.A01) && Arrays.equals(this.A03, configuration.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Configuration(");
        A0s.append(this.A00);
        A0s.append(", ");
        A0s.append("(");
        Iterator A14 = C86104wH.A14(this.A01);
        while (A14.hasNext()) {
            A0s.append(A14.next());
            A0s.append(", ");
        }
        C18230wP.A1S(")", ", ", "(", A0s);
        String[] strArr = this.A03;
        if (strArr != null) {
            for (String append : strArr) {
                A0s.append(append);
                A0s.append(", ");
            }
        } else {
            A0s.append("null");
        }
        A0s.append(")");
        return C18180wK.A0i(")", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0M(parcel, this.A02, 3, i);
        C122167Ky.A0N(parcel, this.A03, 4);
        C122167Ky.A05(parcel, A002);
    }
}
