package com.fbpay.logging;

import X.AnonymousClass0wJ;
import X.AnonymousClass67J;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C40304LcA;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClientSuppressionPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(11);
    public final AnonymousClass67J A00;
    public final C40304LcA A01;
    public final String A02;

    public ClientSuppressionPolicy(AnonymousClass67J r2, C40304LcA lcA, String str) {
        C04220Ms.A0B(r2, 3);
        this.A02 = str;
        this.A01 = lcA;
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientSuppressionPolicy) {
                ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) obj;
                if (!(C04220Ms.A0I(this.A02, clientSuppressionPolicy.A02) && this.A01 == clientSuppressionPolicy.A01 && this.A00 == clientSuppressionPolicy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        C40304LcA lcA = this.A01;
        if (lcA == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, lcA);
        }
        C86104wH.A1B(parcel, this.A00);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, ((AnonymousClass0wJ.A06(this.A02) * 31) + C18200wM.A07(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ClientSuppressionPolicy(eventName=");
        A0s.append(this.A02);
        A0s.append(", payloadField=");
        A0s.append(this.A01);
        A0s.append(", suppressionMode=");
        return C86104wH.A0y(this.A00, A0s);
    }
}
