package X;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Iterator;

/* renamed from: X.74i  reason: invalid class name and case insensitive filesystem */
public final class C1192774i {
    public final ITF A00 = ITF.A00();

    public static void A00(Bundle bundle, String str) {
        StringBuilder A0r = C18200wM.A0r();
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        A0r.append(str);
        A0r.append(" ");
        A0r.append(obtain.dataSize());
        A0r.append("\n");
        obtain.recycle();
        Iterator A0x = C86144wL.A0x(bundle);
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            C86154wM.A1V("  ", A0k, A0r);
            A0r.append(bundle.get(A0k));
            A0r.append("\n");
        }
        A0r.toString();
    }
}
