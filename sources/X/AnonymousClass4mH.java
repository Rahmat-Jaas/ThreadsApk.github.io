package X;

/* renamed from: X.4mH  reason: invalid class name */
public final class AnonymousClass4mH extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass4mH A00 = new AnonymousClass4mH();

    public AnonymousClass4mH() {
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
