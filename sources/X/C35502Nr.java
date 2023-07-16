package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Nr  reason: invalid class name and case insensitive filesystem */
public abstract class C35502Nr {
    public static String A00(List list) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A04 = C18987Aon.A00.A04(A0d);
            A04.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A04.A0O(Long.parseLong(C18180wK.A0k(it)));
            }
            A04.A0F();
            A04.close();
            return A0d.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
