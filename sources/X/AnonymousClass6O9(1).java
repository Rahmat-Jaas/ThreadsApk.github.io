package X;

/* renamed from: X.6O9  reason: invalid class name */
public final class AnonymousClass6O9 {
    public static int A00(String str, int i) {
        if (str == null) {
            return AnonymousClass70L.A01(Integer.MAX_VALUE, i);
        }
        try {
            return AnonymousClass70L.A01((int) AnonymousClass7Kk.A01(str), i);
        } catch (C29721zB e) {
            int A01 = AnonymousClass70L.A01(Integer.MAX_VALUE, i);
            C30967GcS.A03("IgIconBinderUtils", e);
            return A01;
        }
    }
}
