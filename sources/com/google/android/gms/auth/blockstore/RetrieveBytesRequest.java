package com.google.android.gms.auth.blockstore;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C13320nQ;
import X.C18180wK;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(91);
    public final List A00;
    public final boolean A01;

    public RetrieveBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            C13320nQ.A07(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.A01 = z;
        this.A00 = AnonymousClass0wJ.A0v();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                C13320nQ.A05(A0k, "Element in keys cannot be null or empty");
                this.A00.add(A0k);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0I(parcel, Collections.unmodifiableList(this.A00), 1);
        C122167Ky.A0B(parcel, 2, this.A01);
        C122167Ky.A05(parcel, A002);
    }
}
