package com.facebookpay.otc.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass67P;
import X.AnonymousClass69P;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

public final class OtcOptionState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(85);
    public final AnonymousClass67P A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public OtcOptionState(AnonymousClass67P r5, String str, String str2, Map map) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0wJ.A1R(r5, str2);
        this.A01 = str;
        this.A03 = map;
        this.A00 = r5;
        this.A02 = str2;
        AnonymousClass67P r3 = AnonymousClass67P.NON_OTC;
        boolean z = true;
        if (r5 == r3) {
            if (!map.isEmpty()) {
                Iterator A0z = AnonymousClass0wJ.A0z(map);
                while (true) {
                    if (A0z.hasNext()) {
                        if (C18180wK.A0o(A0z).getValue() != r3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
        }
        this.A04 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcOptionState) {
                OtcOptionState otcOptionState = (OtcOptionState) obj;
                if (!C04220Ms.A0I(this.A01, otcOptionState.A01) || !C04220Ms.A0I(this.A03, otcOptionState.A03) || this.A00 != otcOptionState.A00 || !C04220Ms.A0I(this.A02, otcOptionState.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        Map map = this.A03;
        parcel.writeInt(map.size());
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            C86104wH.A1B(parcel, (AnonymousClass69P) A0o.getKey());
            C86104wH.A1B(parcel, (AnonymousClass67P) A0o.getValue());
        }
        C86104wH.A1B(parcel, this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A03, C18180wK.A03(this.A01))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OtcOptionState(otcSessionId=");
        A0s.append(this.A01);
        A0s.append(", componentOtcStates=");
        A0s.append(this.A03);
        A0s.append(", defaultComponentOtcState=");
        A0s.append(this.A00);
        A0s.append(", otcType=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
