package com.facebook.common.callercontext;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass6GW;
import X.C18180wK;
import X.C18210wN;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.Map;

public class ContextChain implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(49);
    public String A00;
    public Map A01;
    public String A02;
    public final ContextChain A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ContextChain contextChain = (ContextChain) obj;
            if (!AnonymousClass6GW.A00(this.A00, contextChain.A00) || !AnonymousClass6GW.A00(this.A03, contextChain.A03)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String str2 = this.A00;
        this.A02 = str2;
        ContextChain contextChain = this.A03;
        if (contextChain == null) {
            return str2;
        }
        String A0N = AnonymousClass00U.A0N(contextChain.toString(), this.A02, '/');
        this.A02 = A0N;
        return A0N;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }

    public ContextChain(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (ContextChain) C18180wK.A0A(parcel, ContextChain.class);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, super.hashCode() * 31);
    }

    public ContextChain(ContextChain contextChain, String str, String str2, Map map) {
        Map map2;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = AnonymousClass00U.A0V(str, ":", str2);
        this.A03 = contextChain;
        if (!(contextChain == null || (map2 = contextChain.A01) == null)) {
            this.A01 = C86164wN.A0j(map2);
        }
        if (map != null) {
            Map map3 = this.A01;
            if (map3 == null) {
                map3 = AnonymousClass0wJ.A0y();
                this.A01 = map3;
            }
            map3.putAll(map);
        }
    }
}
