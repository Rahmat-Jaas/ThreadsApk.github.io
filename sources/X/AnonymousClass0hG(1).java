package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0hG  reason: invalid class name */
public final class AnonymousClass0hG {
    public static String A00(List list) {
        StringWriter stringWriter = new StringWriter();
        MMp A04 = C18987Aon.A00.A04(stringWriter);
        A04.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A04.A0Y((String) it.next());
        }
        A04.A0F();
        A04.close();
        return stringWriter.toString();
    }
}
