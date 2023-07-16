package X;

/* renamed from: X.7bu  reason: invalid class name and case insensitive filesystem */
public final class C124887bu implements C147138nS {
    public final Integer A00;
    public final boolean A01;

    public C124887bu(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public C124887bu() {
        this((Integer) null, false);
    }

    public final C62793ak create(Class cls) {
        AnonymousClass6IA r1;
        C04220Ms.A0B(cls, 0);
        if (cls.equals(AnonymousClass58G.class)) {
            Integer num = this.A00;
            if (num != null) {
                boolean z = this.A01;
                int intValue = num.intValue();
                if (intValue == 0) {
                    r1 = new C92265ht(z);
                } else if (intValue == 1) {
                    r1 = new C92255hs();
                }
                return new AnonymousClass58G(r1);
            }
            r1 = null;
            return new AnonymousClass58G(r1);
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unknown ViewModel class: ", cls));
    }
}
