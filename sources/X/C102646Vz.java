package X;

/* renamed from: X.6Vz  reason: invalid class name and case insensitive filesystem */
public final class C102646Vz {
    public static final String A00(C146958n9 r3) {
        Object obj;
        if (r3 instanceof C27419EnB) {
            return r3.toString();
        }
        try {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(r3);
            A0r.append('@');
            obj = C18180wK.A0i(C86144wL.A0u(r3), A0r);
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
        if (AnonymousClass0OV.A00(obj) != null) {
            obj = AnonymousClass00U.A0N(C18220wO.A0q(r3), C86144wL.A0u(r3), '@');
        }
        return (String) obj;
    }
}
