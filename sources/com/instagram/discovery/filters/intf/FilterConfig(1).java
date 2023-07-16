package com.instagram.discovery.filters.intf;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18230wP;
import X.C32572Cj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FilterConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(24);
    public final Map A00;
    public final Map A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return C32572Cj.A00(this.A00, filterConfig.A00) && C32572Cj.A00(this.A01, filterConfig.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
        parcel.writeMap(this.A01);
    }

    public FilterConfig(Map map) {
        Map map2;
        Object key;
        Object value;
        boolean z;
        this.A00 = AnonymousClass0wJ.A0y();
        this.A01 = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if ("true".equalsIgnoreCase(C18230wP.A0u(A0o))) {
                map2 = this.A01;
                key = A0o.getKey();
                z = true;
            } else if ("false".equalsIgnoreCase(C18230wP.A0u(A0o))) {
                map2 = this.A01;
                key = A0o.getKey();
                z = false;
            } else {
                map2 = this.A00;
                key = A0o.getKey();
                value = A0o.getValue();
                map2.put(key, value);
            }
            value = Boolean.valueOf(z);
            map2.put(key, value);
        }
    }

    public FilterConfig(Parcel parcel) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        this.A00 = A0y;
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        this.A01 = A0y2;
        Class<Map> cls = Map.class;
        parcel.readMap(A0y, cls.getClassLoader());
        parcel.readMap(A0y2, cls.getClassLoader());
    }
}
