package com.google.android.gms.common.server.response;

import X.AnonymousClass8eM;
import X.C113596rm;
import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final PCreatorCreatorShape5S0000000_I2_5 CREATOR = C86124wJ.A0Z(20);
    public AnonymousClass8eM A00;
    public zan A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final Class A08;
    public final String A09;
    public final boolean A0A;

    public static FastJsonResponse$Field A00(String str, int i) {
        return new FastJsonResponse$Field((Class) null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        r2.A00(Integer.valueOf(this.A06), "versionCode");
        r2.A00(Integer.valueOf(this.A02), "typeIn");
        r2.A00(Boolean.valueOf(this.A05), "typeInArray");
        r2.A00(Integer.valueOf(this.A07), "typeOut");
        r2.A00(Boolean.valueOf(this.A0A), "typeOutArray");
        r2.A00(this.A09, "outputFieldName");
        r2.A00(Integer.valueOf(this.A03), "safeParcelFieldId");
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        r2.A00(str, "concreteTypeName");
        Class cls = this.A08;
        if (cls != null) {
            r2.A00(cls.getCanonicalName(), "concreteType.class");
        }
        AnonymousClass8eM r0 = this.A00;
        if (r0 != null) {
            r2.A00(r0.getClass().getCanonicalName(), "converterName");
        }
        return r2.toString();
    }

    public FastJsonResponse$Field(zaa zaa, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A06 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A07 = i3;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i4;
        StringToIntConverter stringToIntConverter = null;
        if (str2 == null) {
            this.A08 = null;
            this.A04 = null;
        } else {
            this.A08 = SafeParcelResponse.class;
            this.A04 = str2;
        }
        if (zaa == null || (stringToIntConverter = zaa.A01) != null) {
            this.A00 = stringToIntConverter;
            return;
        }
        throw C18180wK.A0a("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zaa zaa;
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A06);
        C122167Ky.A08(parcel, 2, this.A02);
        C122167Ky.A0B(parcel, 3, this.A05);
        C122167Ky.A08(parcel, 4, this.A07);
        C122167Ky.A0B(parcel, 5, this.A0A);
        C122167Ky.A0H(parcel, this.A09, 6, false);
        C122167Ky.A08(parcel, 7, this.A03);
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        C122167Ky.A0H(parcel, str, 8, false);
        AnonymousClass8eM r1 = this.A00;
        if (r1 == null) {
            zaa = null;
        } else if (r1 instanceof StringToIntConverter) {
            zaa = new zaa((StringToIntConverter) r1);
        } else {
            throw C18190wL.A0a("Unsupported safe parcelable field converter class.");
        }
        C122167Ky.A0D(parcel, zaa, 9, i, false);
        C122167Ky.A05(parcel, A002);
    }

    public FastJsonResponse$Field(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A06 = 1;
        this.A02 = i;
        this.A05 = z;
        this.A07 = i2;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i3;
        this.A08 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A04 = canonicalName;
        this.A00 = null;
    }
}
