package X;

/* renamed from: X.79x  reason: invalid class name and case insensitive filesystem */
public abstract class C1203779x {
    public static final C1203779x A00 = new AnonymousClass52V(new C1201979e((C115056uQ) null, (C114076se) null, (C114866u1) null, (C114446tJ) null));

    public final C1203779x A00(C1203779x r6) {
        C1201979e r1 = ((AnonymousClass52V) this).A00;
        C114076se r4 = r1.A01;
        if (r4 == null) {
            r4 = ((AnonymousClass52V) r6).A00.A01;
        }
        C114446tJ r3 = r1.A03;
        if (r3 == null) {
            r3 = ((AnonymousClass52V) r6).A00.A03;
        }
        C115056uQ r2 = r1.A00;
        if (r2 == null) {
            r2 = ((AnonymousClass52V) r6).A00.A00;
        }
        C114866u1 r0 = r1.A02;
        if (r0 == null) {
            r0 = ((AnonymousClass52V) r6).A00.A02;
        }
        return new AnonymousClass52V(new C1201979e(r2, r4, r0, r3));
    }

    public final int hashCode() {
        return ((AnonymousClass52V) this).A00.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1203779x) || !C04220Ms.A0I(((AnonymousClass52V) ((C1203779x) obj)).A00, ((AnonymousClass52V) this).A00)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(A00)) {
            return "ExitTransition.None";
        }
        C1201979e r1 = ((AnonymousClass52V) this).A00;
        C114076se r0 = r1.A01;
        String str4 = null;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        C114446tJ r02 = r1.A03;
        if (r02 != null) {
            str2 = r02.toString();
        } else {
            str2 = null;
        }
        C115056uQ r03 = r1.A00;
        if (r03 != null) {
            str3 = r03.toString();
        } else {
            str3 = null;
        }
        C114866u1 r04 = r1.A02;
        if (r04 != null) {
            str4 = r04.toString();
        }
        return AnonymousClass00U.A0k("ExitTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - ", str3, ",\nScale - ", str4);
    }
}
