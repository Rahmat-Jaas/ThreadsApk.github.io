package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.25v  reason: invalid class name and case insensitive filesystem */
public enum C313825v {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C313825v[] values = values();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C313825v r1 : values) {
            if (r1 != A0f) {
                A0v.add(r1);
            }
        }
        LinkedHashMap A0v2 = C18190wL.A0v(AnonymousClass4WK.A0M(C02260Al.A0z(A0v, 10)));
        for (Object next : A0v) {
            A0v2.put(((C313825v) next).A00, next);
        }
        A01 = A0v2;
    }

    public static C313825v A00(String str, String str2, int i) {
        return new C313825v(str, i, str2);
    }

    /* access modifiers changed from: public */
    C313825v(String str) {
        this.A00 = str;
    }
}
