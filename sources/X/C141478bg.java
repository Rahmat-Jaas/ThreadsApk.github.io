package X;

/* renamed from: X.8bg  reason: invalid class name and case insensitive filesystem */
public abstract class C141478bg extends C27219EgD {
    public final C27219EgD A00(int i) {
        if (this instanceof C141448bd) {
            C141448bd.A02((C141448bd) this);
            throw null;
        }
        AnonymousClass6W5.A00(i);
        return this;
    }

    public final C141478bg A06() {
        C141478bg r1;
        C141478bg A06;
        if (this instanceof AnonymousClass8bc) {
            AnonymousClass8bc r2 = (AnonymousClass8bc) this;
            Object A00 = r2.A00.A00();
            if (!(A00 instanceof C141478bg) || (r1 = (C141478bg) A00) == null || (A06 = r1.A06()) == null) {
                return r2;
            }
            return A06;
        } else if (this instanceof C141448bd) {
            return this;
        } else {
            return ((C141458be) this).A01;
        }
    }

    public String toString() {
        String str;
        C141478bg r0;
        C141478bg r02 = AnonymousClass6ZB.A00;
        if (this == r02) {
            str = AnonymousClass000.A00(257);
        } else {
            str = null;
            try {
                r0 = r02.A06();
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str == null) {
            return AnonymousClass00U.A0N(C18210wN.A0e(this), C86144wL.A0u(this), '@');
        }
        return str;
    }
}
