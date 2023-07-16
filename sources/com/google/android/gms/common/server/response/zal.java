package com.google.android.gms.common.server.response;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C18180wK;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(23);
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public zal(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0K(parcel, this.A02, 3, C122167Ky.A0S(parcel, this.A01));
        C122167Ky.A05(parcel, A002);
    }

    public zal(String str, Map map) {
        ArrayList A0v;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            A0v = null;
        } else {
            A0v = AnonymousClass0wJ.A0v();
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                String A0k = C18180wK.A0k(A0x);
                A0v.add(new zam((FastJsonResponse$Field) map.get(A0k), A0k));
            }
        }
        this.A02 = A0v;
    }
}
