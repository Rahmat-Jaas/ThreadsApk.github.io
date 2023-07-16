package com.google.android.gms.auth.blockstore;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C18210wN;
import X.C86124wJ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(92);
    public final Map A00;
    public final Bundle A01;
    public final List A02;

    public class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(89);
        public final String A00;
        public final byte[] A01;

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.A01, ((BlockstoreData) obj).A01);
        }

        public final int hashCode() {
            return Arrays.hashCode(C18210wN.A1X(Arrays.hashCode(this.A01)));
        }

        public BlockstoreData(byte[] bArr, String str) {
            this.A01 = bArr;
            this.A00 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C122167Ky.A00(parcel);
            C122167Ky.A0L(parcel, this.A01, 1, false);
            C122167Ky.A0H(parcel, this.A00, 2, false);
            C122167Ky.A05(parcel, A002);
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.A01 = bundle;
        this.A02 = list;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            A0y.put(blockstoreData.A00, blockstoreData);
        }
        this.A00 = A0y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A02(this.A01, parcel, 1);
        C122167Ky.A0K(parcel, this.A02, 2, false);
        C122167Ky.A05(parcel, A002);
    }
}
