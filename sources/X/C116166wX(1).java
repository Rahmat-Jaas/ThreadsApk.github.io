package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6wX  reason: invalid class name and case insensitive filesystem */
public final class C116166wX {
    public static void A01(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            C86114wI.A12(parcel, parcelable, i);
        } else {
            parcel.writeInt(0);
        }
    }

    public static Object A00(Parcel parcel, Parcelable.Creator creator) {
        return C86114wI.A0d(parcel, creator);
    }
}
