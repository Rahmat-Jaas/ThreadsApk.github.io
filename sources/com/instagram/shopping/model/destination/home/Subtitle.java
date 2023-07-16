package com.instagram.shopping.model.destination.home;

import X.AnonymousClass000;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C19187As6;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class Subtitle extends AnonymousClass0Sf implements Parcelable {
    public static final PCreatorCreatorShape17S0000000_I2_17 CREATOR = new PCreatorCreatorShape17S0000000_I2_17(11);
    public C19187As6 A00;
    public String A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Subtitle) {
                Subtitle subtitle = (Subtitle) obj;
                if (this.A02 != subtitle.A02 || !C04220Ms.A0I(this.A01, subtitle.A01) || !C04220Ms.A0I(this.A00, subtitle.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A07(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Subtitle(shouldShowCheckoutSignaling=");
        A0s.append(this.A02);
        A0s.append(", text=");
        A0s.append(this.A01);
        A0s.append(AnonymousClass000.A00(87));
        return C86104wH.A0y(this.A00, A0s);
    }

    public Subtitle(Parcel parcel) {
        boolean A1V = C18180wK.A1V(parcel.readByte());
        String readString = parcel.readString();
        this.A02 = A1V;
        this.A01 = readString;
        this.A00 = null;
    }

    public Subtitle() {
        this.A02 = false;
        this.A01 = null;
        this.A00 = null;
    }
}
