package X;

/* renamed from: X.0Oy  reason: invalid class name and case insensitive filesystem */
public final class C04750Oy {
    public final void A00(String str, String str2) {
        AnonymousClass0M5 r1 = AnonymousClass0M6.A00;
        if (r1 != null) {
            r1.CYW("ig-api-json-field", str);
        }
        AnonymousClass0M5 r12 = AnonymousClass0M6.A00;
        if (r12 != null) {
            r12.CYW("ig-api-json-class", str2);
        }
        String A0d = AnonymousClass00U.A0d("Unexpected Null: ", str2, "  -- ", str);
        C10450iM.A02("IgJsonCallback", AnonymousClass006.A01, A0d);
        AnonymousClass0LU.A0C("IgJsonCallback", A0d);
        throw new C23844CzG(A0d);
    }
}
