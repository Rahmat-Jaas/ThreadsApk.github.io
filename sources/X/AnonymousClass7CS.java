package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: X.7CS  reason: invalid class name */
public final class AnonymousClass7CS {
    public static final ClassLoader A00 = AnonymousClass7CS.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AnonymousClass00U.A0J("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
