package X;

/* renamed from: X.3U0  reason: invalid class name */
public final class AnonymousClass3U0 {
    public static final AnonymousClass3U0 A00 = new AnonymousClass3U0();

    public final Integer A00() {
        int i = C08340dC.A01("age_verification_settings_preferences").getInt("age_verification_settings_blocked_state", 0);
        if (i == 0) {
            return AnonymousClass006.A00;
        }
        if (i == 1) {
            return AnonymousClass006.A01;
        }
        if (i == 2) {
            return AnonymousClass006.A0C;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0J("Invalid state ", i));
    }
}
