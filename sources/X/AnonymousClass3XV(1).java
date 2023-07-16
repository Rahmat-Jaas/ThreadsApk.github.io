package X;

import java.util.Set;

/* renamed from: X.3XV  reason: invalid class name */
public final class AnonymousClass3XV {
    public static final Set A01 = C18200wM.A0w(new String[]{"resolveAdAccount"});
    public final Integer A00;

    public AnonymousClass3XV(Integer num) {
        this.A00 = num;
    }

    public static Integer A00(String str) {
        switch (str.hashCode()) {
            case -1871442027:
                if (str.equals("banhammer")) {
                    return AnonymousClass006.A01;
                }
                break;
            case 3500751:
                if (str.equals("risk")) {
                    return AnonymousClass006.A0j;
                }
                break;
            case 492830541:
                if (str.equals("integrity")) {
                    return AnonymousClass006.A0u;
                }
                break;
        }
        C10450iM.A03("PromoteErrorNativeUri", "Server sending unsupported type");
        return AnonymousClass006.A15;
    }
}
