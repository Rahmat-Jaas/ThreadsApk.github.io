package X;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.25w  reason: invalid class name and case insensitive filesystem */
public enum C313925w {
    ;
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public int A00;
    public final String A01;

    public static C313925w A00(String str, String str2, int i) {
        return new C313925w(i, i, str, str2);
    }

    /* access modifiers changed from: public */
    C313925w(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }

    /* access modifiers changed from: public */
    static {
        A03 = AnonymousClass0wJ.A0y();
        A02 = AnonymousClass0wJ.A0y();
        Iterator<E> it = EnumSet.allOf(C313925w.class).iterator();
        while (it.hasNext()) {
            C313925w r2 = (C313925w) it.next();
            C18250wR.A1F(r2, A03, r2.A00);
            A02.put(r2.A01, r2);
        }
    }
}
