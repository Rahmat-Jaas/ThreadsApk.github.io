package com.google.android.gms.auth.api.accounttransfer;

import X.C013306f;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzcc;
import java.util.List;

public class zzp extends zzcc {
    public static final C013306f A06;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(60);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        C013306f r2 = new C013306f();
        A06 = r2;
        r2.put("registered", FastJsonResponse$Field.A00("registered", 2));
        r2.put("in_progress", FastJsonResponse$Field.A00("in_progress", 3));
        r2.put("success", FastJsonResponse$Field.A00("success", 4));
        r2.put("failed", FastJsonResponse$Field.A00("failed", 5));
        r2.put("escrowed", FastJsonResponse$Field.A00("escrowed", 6));
    }

    public zzp(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A05);
        C122167Ky.A0I(parcel, this.A00, 2);
        C122167Ky.A0I(parcel, this.A01, 3);
        C122167Ky.A0I(parcel, this.A02, 4);
        C122167Ky.A0I(parcel, this.A03, 5);
        C122167Ky.A0I(parcel, this.A04, 6);
        C122167Ky.A05(parcel, A002);
    }

    public zzp() {
        this.A05 = 1;
    }
}
