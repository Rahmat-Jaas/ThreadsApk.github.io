package X;

/* renamed from: X.8pE  reason: invalid class name and case insensitive filesystem */
public interface C147368pE extends C81784oM {
    void CrC(Object obj);

    Object getValue();

    static C121457Gf A00(C113196qu r0) {
        return (C121457Gf) r0.A0A.getValue();
    }

    static void A01(AnonymousClass7VE r2, AnonymousClass03Y r3) {
        AnonymousClass01T A05 = r3.A00.A05(8);
        C04220Ms.A06(A05);
        r2.A00.CrC(C97926Dm.A00(A05));
    }

    static void A05(C1197176o r2) {
        r2.A00.CrC(r2.A02.A01());
    }

    static void A06(Object obj) {
        AnonymousClass7F8 r2 = (AnonymousClass7F8) obj;
        r2.A07();
        r2.A0C.CrC((Object) null);
        r2.A09.CrC((Object) null);
    }

    static void A02(C147368pE r1, float f) {
        r1.CrC(Float.valueOf(f));
    }

    static void A03(C147368pE r1, int i) {
        r1.CrC(Integer.valueOf(i));
    }

    static void A04(C147368pE r1, boolean z) {
        r1.CrC(Boolean.valueOf(z));
    }
}
