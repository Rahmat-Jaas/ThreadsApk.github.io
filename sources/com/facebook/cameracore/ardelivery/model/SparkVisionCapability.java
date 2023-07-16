package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C32572Cj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SparkVisionCapability implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(10);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return C32572Cj.A00(C18210wN.A0J(this.A00), C18210wN.A0J(((SparkVisionCapability) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C18210wN.A0J(this.A00)});
    }

    public final String toString() {
        List list = this.A00;
        if (list == null || ImmutableList.copyOf((Collection) list) == null || C18210wN.A0J(list).isEmpty()) {
            return "";
        }
        StringBuilder A0r = C18200wM.A0r();
        Iterator it = C18210wN.A0J(list).iterator();
        while (it.hasNext()) {
            A0r.append(C18180wK.A0k(it));
            A0r.append(", ");
        }
        A0r.deleteCharAt(C18210wN.A0J(list).size() - 1);
        return A0r.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList;
        List list = this.A00;
        if (list == null || ImmutableList.copyOf((Collection) list) == null) {
            immutableList = null;
        } else {
            immutableList = C18210wN.A0J(list);
        }
        parcel.writeStringList(immutableList);
    }

    public SparkVisionCapability(Parcel parcel) {
        this.A00 = null;
        this.A00 = (List) parcel.readValue(List.class.getClassLoader());
    }

    public SparkVisionCapability() {
        this.A00 = null;
        this.A00 = AnonymousClass0wJ.A0v();
    }
}
