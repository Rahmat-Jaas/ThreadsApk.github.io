package X;

import android.os.Parcel;

/* renamed from: X.72E  reason: invalid class name */
public final class AnonymousClass72E {
    public static int A00(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static void A01(Parcel parcel, int i, int i2) {
        int A00 = A00(parcel, i);
        if (A00 != i2) {
            StringBuilder A0s = C18190wL.A0s("Expected size ");
            A0s.append(i2);
            A0s.append(" got ");
            A0s.append(A00);
            A0s.append(" (0x");
            A0s.append(Integer.toHexString(A00));
            throw new AnonymousClass88T(C18180wK.A0i(")", A0s));
        }
    }
}
