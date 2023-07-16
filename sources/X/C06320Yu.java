package X;

/* renamed from: X.0Yu  reason: invalid class name and case insensitive filesystem */
public final class C06320Yu implements AnonymousClass0M5 {
    public final void CYW(String str, String str2) {
        AnonymousClass0X7.A00().A02(str, str2);
    }

    public final void CYX(String str, C04560Oe r6) {
        AnonymousClass0X7 A00 = AnonymousClass0X7.A00();
        AnonymousClass0X1 r2 = new AnonymousClass0X1(A00, r6);
        if (AnonymousClass0X7.A04.containsKey(str) && !str.equals("mobileconfig_canary")) {
            synchronized (A00.A00) {
                A00.A01.put(str, r2);
            }
        }
    }

    public final void Cbc(String str) {
        AnonymousClass0X7 A00 = AnonymousClass0X7.A00();
        synchronized (A00.A00) {
            A00.A02.remove(str);
        }
    }
}
