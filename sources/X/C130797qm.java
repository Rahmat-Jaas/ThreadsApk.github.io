package X;

import java.util.LinkedList;

/* renamed from: X.7qm  reason: invalid class name and case insensitive filesystem */
public final class C130797qm implements C144568ii {
    public C109326jp A00;
    public final String A01;

    public final boolean DAZ(C127397h3 r5) {
        LinkedList<C110016kz> linkedList = r5.A06;
        if (linkedList == null) {
            return false;
        }
        for (C110016kz r2 : linkedList) {
            String str = this.A01;
            String str2 = r2.A03;
            if (str2 != null && str2.equals(str)) {
                this.A00 = r2.A02;
                return true;
            }
        }
        return false;
    }

    public C130797qm(String str) {
        this.A01 = str;
    }
}
