package com.facebook.xapp.messaging.capability.vector;

import X.C04220Ms;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;

public final class Capabilities implements Parcelable {
    public static final Capabilities A01 = new Capabilities(new BitSet());
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(58);
    public final BitSet A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C04220Ms.A0B(parcel, 0);
        BitSet bitSet = this.A00;
        byte[] bArr = new byte[((bitSet.length() + 7) >> 3)];
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit >= 0) {
                int i3 = nextSetBit >> 3;
                bArr[i3] = (byte) (bArr[i3] | (1 << (nextSetBit % 8)));
                i2 = nextSetBit + 1;
            } else {
                parcel.writeByteArray(bArr);
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Capabilities)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((Capabilities) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("Capabilities("));
    }

    public Capabilities(BitSet bitSet) {
        this.A00 = bitSet;
    }
}
