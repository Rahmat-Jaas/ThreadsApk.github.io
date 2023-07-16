package com.google.android.gms.auth.api.accounttransfer;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzcc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class zzs extends zzcc {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(61);
    public zzt A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A06 = A0y;
        A0y.put("authenticatorInfo", new FastJsonResponse$Field(zzt.class, "authenticatorInfo", 11, 11, 2, false, false));
        A0y.put("signature", new FastJsonResponse$Field((Class) null, "signature", 7, 7, 3, false, false));
        A0y.put("package", new FastJsonResponse$Field((Class) null, "package", 7, 7, 4, false, false));
    }

    public zzs(zzt zzt, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = zzt;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        Set set = this.A05;
        if (C86114wI.A1Z(set, 1)) {
            C122167Ky.A08(parcel, 1, this.A04);
        }
        if (C86114wI.A1Z(set, 2)) {
            C122167Ky.A0D(parcel, this.A00, 2, i, true);
        }
        if (C86114wI.A1Z(set, 3)) {
            C122167Ky.A0H(parcel, this.A01, 3, true);
        }
        if (C86114wI.A1Z(set, 4)) {
            C122167Ky.A0H(parcel, this.A02, 4, true);
        }
        if (C86114wI.A1Z(set, 5)) {
            C122167Ky.A0H(parcel, this.A03, 5, true);
        }
        C122167Ky.A05(parcel, A002);
    }

    public zzs() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
