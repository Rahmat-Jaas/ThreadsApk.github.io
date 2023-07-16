package X;

import java.util.Locale;

/* renamed from: X.8MD  reason: invalid class name */
public final class AnonymousClass8MD extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8MD A00 = new AnonymousClass8MD();

    public AnonymousClass8MD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        String str = (String) obj;
        C04220Ms.A0B(str, 1);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C04220Ms.A06(forLanguageTag);
        return new AnonymousClass79B(new AnonymousClass7ZA(forLanguageTag));
    }
}
