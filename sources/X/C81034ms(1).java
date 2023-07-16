package X;

/* renamed from: X.4ms  reason: invalid class name and case insensitive filesystem */
public final class C81034ms extends C02220Ah implements AnonymousClass0YP {
    public static final C81034ms A00 = new C81034ms();

    public C81034ms() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        AnonymousClass0wJ.A1N(str, obj2);
        if (str.length() == 0) {
            return obj2.toString();
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(str);
        A0r.append(", ");
        return C18200wM.A0m(obj2, A0r);
    }
}
