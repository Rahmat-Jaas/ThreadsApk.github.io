package X;

/* renamed from: X.6JE  reason: invalid class name */
public final class AnonymousClass6JE {
    public static C1202579k A00(Exception exc) {
        C1202579k r3 = new C1202579k();
        synchronized (r3.A03) {
            if (!r3.A01) {
                r3.A01 = true;
                r3.A00 = exc;
            } else {
                throw C18180wK.A0a(String.valueOf("Task is already complete"));
            }
        }
        r3.A02.A01(r3);
        return r3;
    }
}
