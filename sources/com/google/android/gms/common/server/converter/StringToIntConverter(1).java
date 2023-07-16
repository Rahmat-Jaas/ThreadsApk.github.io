package com.google.android.gms.common.server.converter;

import X.AnonymousClass0wJ;
import X.AnonymousClass8eM;
import X.C122167Ky;
import X.C18180wK;
import X.C86124wJ;
import X.C86134wK;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter extends AbstractSafeParcelable implements AnonymousClass8eM {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(18);
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A02 = AnonymousClass0wJ.A0y();
        this.A01 = C86154wM.A0D();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            String str = zac.A02;
            int i3 = zac.A01;
            C86134wK.A1P(str, this.A02, i3);
            this.A01.put(i3, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        HashMap hashMap = this.A02;
        Iterator A0r = C86154wM.A0r(hashMap);
        while (A0r.hasNext()) {
            String A0k = C18180wK.A0k(A0r);
            A0v.add(new zac(A0k, AnonymousClass0wJ.A04(hashMap.get(A0k))));
        }
        C122167Ky.A0J(parcel, A0v, 2, A002);
    }

    public StringToIntConverter() {
        this.A00 = 1;
        this.A02 = AnonymousClass0wJ.A0y();
        this.A01 = C86154wM.A0D();
    }
}
