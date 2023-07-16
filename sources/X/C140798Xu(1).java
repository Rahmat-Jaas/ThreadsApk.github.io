package X;

/* renamed from: X.8Xu  reason: invalid class name and case insensitive filesystem */
public final class C140798Xu extends C02220Ah implements AnonymousClass0YP {
    public static final C140798Xu A00 = new C140798Xu();

    public C140798Xu() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Number number;
        if (!(obj2 instanceof C148778sA)) {
            return obj;
        }
        if (!(obj instanceof Integer) || (number = (Number) obj) == null) {
            i = 1;
        } else {
            i = number.intValue();
            if (i == 0) {
                return obj2;
            }
        }
        return Integer.valueOf(i + 1);
    }
}
