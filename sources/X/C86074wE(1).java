package X;

/* renamed from: X.4wE  reason: invalid class name and case insensitive filesystem */
public interface C86074wE extends C86094wG, C86084wF {
    boolean ADi(Object obj, Object obj2);

    void CrC(Object obj);

    Object getValue();

    static void A00(C86074wE r1, int i) {
        r1.CrC(new Integer(i));
    }

    static void A01(C86074wE r1, boolean z) {
        r1.CrC(Boolean.valueOf(z));
    }
}
