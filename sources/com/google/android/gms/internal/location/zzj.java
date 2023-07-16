package com.google.android.gms.internal.location;

import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzo;
import java.util.Collections;
import java.util.List;

public final class zzj extends AbstractSafeParcelable {
    public static final zzo A03 = new zzo();
    public static final List A04 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(98);
    public zzo A00;
    public String A01;
    public List A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        if (!C117046y2.A01(this.A00, zzj.A00) || !C117046y2.A01(this.A02, zzj.A02)) {
            return false;
        }
        return C117046y2.A00(this.A01, zzj.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(this.A02);
        String str = this.A01;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 77 + C86104wH.A0A(valueOf2) + C86104wH.A0A(str));
        A0s.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        A0s.append(valueOf);
        A0s.append(", clients=");
        A0s.append(valueOf2);
        A0s.append(", tag='");
        A0s.append(str);
        return C18180wK.A0i("'}", A0s);
    }

    public zzj(zzo zzo, String str, List list) {
        this.A00 = zzo;
        this.A02 = list;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0P = C122167Ky.A0P(parcel, this.A00, i);
        C122167Ky.A0K(parcel, this.A02, 2, A0P);
        C122167Ky.A0F(parcel, this.A01, A002, A0P);
    }
}
