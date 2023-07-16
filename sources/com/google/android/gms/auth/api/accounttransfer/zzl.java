package com.google.android.gms.auth.api.accounttransfer;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzcc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class zzl extends zzcc {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(59);
    public zzp A00;
    public ArrayList A01;
    public int A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A05 = A0y;
        A0y.put("authenticatorData", new FastJsonResponse$Field(zzs.class, "authenticatorData", 11, 11, 2, true, true));
        A0y.put(ReactProgressBarViewManager.PROP_PROGRESS, new FastJsonResponse$Field(zzp.class, ReactProgressBarViewManager.PROP_PROGRESS, 11, 11, 4, false, false));
    }

    public zzl(zzp zzp, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A01 = arrayList;
        this.A02 = i2;
        this.A00 = zzp;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        Set set = this.A04;
        if (C86114wI.A1Z(set, 1)) {
            C122167Ky.A08(parcel, 1, this.A03);
        }
        if (C86114wI.A1Z(set, 2)) {
            C122167Ky.A0K(parcel, this.A01, 2, true);
        }
        if (C86114wI.A1Z(set, 3)) {
            C122167Ky.A08(parcel, 3, this.A02);
        }
        if (C86114wI.A1Z(set, 4)) {
            C122167Ky.A0D(parcel, this.A00, 4, i, true);
        }
        C122167Ky.A05(parcel, A002);
    }

    public zzl() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }
}
