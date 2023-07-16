package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2CE  reason: invalid class name */
public final class AnonymousClass2CE {
    public static void A00(String str, StringBuilder sb, Set set) {
        sb.append("\n\n");
        sb.append(str);
        sb.append(" Boosters:");
        ArrayList A0s = C18200wM.A0s(set);
        Collections.sort(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            sb.append("\n");
            sb.append("\t- ");
            sb.append(A0k);
        }
        if (A0s.isEmpty()) {
            sb.append("\n(None)");
        }
    }
}
