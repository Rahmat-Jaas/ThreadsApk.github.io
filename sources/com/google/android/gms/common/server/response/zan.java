package com.google.android.gms.common.server.response;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C13320nQ;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C86124wJ;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(22);
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public zan(ArrayList arrayList, int i, String str) {
        this.A00 = i;
        HashMap A0y = AnonymousClass0wJ.A0y();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.A01;
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            ArrayList arrayList2 = zal.A02;
            C13320nQ.A01(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.A02.get(i3);
                A0y2.put(zam.A02, zam.A01);
            }
            A0y.put(str2, A0y2);
        }
        this.A02 = A0y;
        C13320nQ.A01(str);
        this.A01 = str;
        Iterator A0r = C86154wM.A0r(A0y);
        while (A0r.hasNext()) {
            Map map = (Map) A0y.get(A0r.next());
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                ((FastJsonResponse$Field) map.get(A0x.next())).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        HashMap hashMap = this.A02;
        Iterator A0r2 = C86154wM.A0r(hashMap);
        while (A0r2.hasNext()) {
            String A0k = C18180wK.A0k(A0r2);
            A0r.append(A0k);
            A0r.append(":\n");
            Map map = (Map) hashMap.get(A0k);
            Iterator A0x = C18220wO.A0x(map);
            while (A0x.hasNext()) {
                String A0k2 = C18180wK.A0k(A0x);
                C86154wM.A1V("  ", A0k2, A0r);
                A0r.append(map.get(A0k2));
            }
        }
        return A0r.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        HashMap hashMap = this.A02;
        Iterator A0r = C86154wM.A0r(hashMap);
        while (A0r.hasNext()) {
            String A0k = C18180wK.A0k(A0r);
            A0v.add(new zal(A0k, (Map) hashMap.get(A0k)));
        }
        C122167Ky.A0K(parcel, A0v, 2, false);
        C122167Ky.A0H(parcel, this.A01, 3, false);
        C122167Ky.A05(parcel, A002);
    }
}
