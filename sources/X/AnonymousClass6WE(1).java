package X;

import android.os.Parcel;

/* renamed from: X.6WE  reason: invalid class name */
public final class AnonymousClass6WE {
    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(65535);
        return parcel.dataPosition();
    }
}
