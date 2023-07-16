package X;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
public final class C61293Sq {
    public final int A00;
    public final AnonymousClass3FI A01;
    public final List A02;
    public final Random A03 = new Random();

    public static final C306922n A00(String str, List list) {
        if (str != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C306922n r0 = (C306922n) ((AnonymousClass0YY) it.next()).invoke(str);
                if (r0 != null) {
                    return r0;
                }
            }
        }
        return null;
    }

    public C61293Sq(AnonymousClass3FI r2, List list, int i) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = i;
    }
}
