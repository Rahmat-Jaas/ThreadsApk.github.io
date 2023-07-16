package X;

import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2SJ  reason: invalid class name */
public final class AnonymousClass2SJ {
    public static final String A00(List list) {
        int i;
        if (!list.isEmpty()) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C30726GSc gSc = (C30726GSc) it.next();
                if (gSc.A03 == AnonymousClass006.A0C) {
                    Pair A0H = C18220wO.A0H(gSc.A04, gSc.A01);
                    if (A0y.containsKey(A0H)) {
                        Object obj = A0y.get(A0H);
                        if (obj != null) {
                            i = Integer.valueOf(AnonymousClass0wJ.A04(obj) + 1);
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    } else {
                        i = 1;
                    }
                    A0y.put(A0H, i);
                }
            }
            StringWriter A0d = C18230wP.A0d();
            if (!A0y.isEmpty()) {
                MMp A04 = C18987Aon.A00.A04(A0d);
                A04.A0I();
                Iterator A0u = C18190wL.A0u(A0y);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    Pair pair = (Pair) A0o.getKey();
                    int A042 = AnonymousClass0wJ.A04(A0o.getValue());
                    A04.A0J();
                    A04.A0d("brush_type", (String) pair.first);
                    Object obj2 = pair.second;
                    C04220Ms.A05(obj2);
                    A04.A0d("brush_color", StringFormatUtil.formatStrLocaleSafe("#%06x", (Object) Integer.valueOf(AnonymousClass0wJ.A04(obj2) & 16777215)));
                    A04.A0b("count", A042);
                    A04.A0G();
                }
                A04.A0F();
                A04.close();
            }
            return C18190wL.A0n(A0d);
        }
        throw C18180wK.A0a("Check failed.");
    }
}
