package X;

import android.util.SparseArray;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.model.mediasize.VideoUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6OH  reason: invalid class name */
public final class AnonymousClass6OH {
    public static List A00(List list) {
        int i;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C127397h3 A0V = C86144wL.A0V(it);
            SparseArray sparseArray = A0V.A04;
            if (C86114wI.A0m(sparseArray, 38) == null) {
                C30967GcS.A02("BKVideoBinderUtils", "Received invalid null url while trying to create video version");
            } else {
                String A0O = A0V.A0O(36, "regular");
                if (!A0O.equals("hd")) {
                    boolean equals = A0O.equals("regular");
                    i = HttpStatus.SC_PROCESSING;
                    if (!equals) {
                        i = -1;
                    }
                } else {
                    i = HttpStatus.SC_SWITCHING_PROTOCOLS;
                }
                A0v.add(new VideoUrlImpl(C86114wI.A0m(sparseArray, 38), A0V.A0H(41, -1), A0V.A0H(35, -1), i, C127397h3.A0C(A0V)));
            }
        }
        return A0v;
    }
}
