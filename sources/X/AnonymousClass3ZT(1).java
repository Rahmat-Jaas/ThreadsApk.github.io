package X;

/* renamed from: X.3ZT  reason: invalid class name */
public final class AnonymousClass3ZT {
    public static int A00(int i, boolean z) {
        int i2 = i * 31;
        int i3 = 1237;
        if (z) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public static void A02(Object obj, String str) {
        if (obj == null) {
            throw C18210wN.A0W(AnonymousClass00U.A0L(str, " is null"));
        }
    }

    public static boolean A03(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static int A01(Object obj) {
        return AnonymousClass0wJ.A03(obj) + 31;
    }
}
