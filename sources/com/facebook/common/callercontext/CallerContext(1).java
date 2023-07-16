package com.facebook.common.callercontext;

import X.AnonymousClass6GW;
import X.C03800Ku;
import X.C1199577u;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CallerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(48);
    public final ContextChain A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerContext)) {
            return false;
        }
        CallerContext callerContext = (CallerContext) obj;
        return AnonymousClass6GW.A00(this.A02, callerContext.A02) && AnonymousClass6GW.A00(this.A01, callerContext.A01) && AnonymousClass6GW.A00(this.A03, callerContext.A03) && AnonymousClass6GW.A00(this.A04, callerContext.A04) && AnonymousClass6GW.A00(this.A00, callerContext.A00) && AnonymousClass6GW.A00(this.A05, callerContext.A05);
    }

    public static CallerContext A00(Class cls) {
        return new CallerContext(cls);
    }

    public static CallerContext A01(String str) {
        if (str != null && !str.isEmpty()) {
            return new CallerContext(str);
        }
        throw C18190wL.A0a("callingClassName for the CallerContext cannot be null nor empty.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A03, this.A04, this.A00, this.A05});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeMap(this.A05);
    }

    public CallerContext(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (ContextChain) C18180wK.A0A(parcel, ContextChain.class);
        this.A05 = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public final String toString() {
        C1199577u r2 = new C1199577u(C18210wN.A0e(this));
        C1199577u.A00(r2, this.A02, "Calling Class Name");
        C1199577u.A00(r2, this.A01, "Analytics Tag");
        C1199577u.A00(r2, this.A03, "Feature tag");
        C1199577u.A00(r2, this.A04, "Module Analytics Tag");
        C1199577u.A00(r2, this.A00, "Context Chain");
        C1199577u.A00(r2, this.A05, "Request Tags");
        return r2.toString();
    }

    public CallerContext(Class cls) {
        cls.getClass();
        this.A02 = C03800Ku.A00(cls);
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public CallerContext(String str) {
        this.A02 = str;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public CallerContext() {
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
