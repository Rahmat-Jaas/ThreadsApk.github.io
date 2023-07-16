package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import X.C86154wM;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(76);
    public final PendingIntent A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final int A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.A03;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.A03;
        if (size != list2.size() || !list.containsAll(list2) || !C117046y2.A01(this.A00, saveAccountLinkingTokenRequest.A00) || !C117046y2.A01(this.A01, saveAccountLinkingTokenRequest.A01) || !C117046y2.A01(this.A02, saveAccountLinkingTokenRequest.A02) || !C117046y2.A01(this.A05, saveAccountLinkingTokenRequest.A05) || this.A04 != saveAccountLinkingTokenRequest.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(this.A00, this.A01, this.A02, this.A03, this.A05);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, String str3, List list, int i) {
        this.A00 = pendingIntent;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A05 = str3;
        this.A04 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0P = C122167Ky.A0P(parcel, this.A00, i);
        C122167Ky.A0H(parcel, this.A01, 2, A0P);
        C122167Ky.A0H(parcel, this.A02, 3, A0P);
        C122167Ky.A0I(parcel, this.A03, 4);
        C122167Ky.A0H(parcel, this.A05, 5, A0P);
        C122167Ky.A08(parcel, 6, this.A04);
        C122167Ky.A05(parcel, A002);
    }
}
