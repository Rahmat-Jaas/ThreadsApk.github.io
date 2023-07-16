package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
public final class C61513Ts {
    public static final C61513Ts A00 = new C61513Ts();

    public final Object A00(C63893iY r13) {
        C127397h3 r1;
        Integer num;
        Integer num2;
        C04220Ms.A0B(r13, 0);
        Object A0B = C63893iY.A0B(r13, 0);
        A0B.getClass();
        String str = (String) A0B;
        if (!(str == null || (r1 = (C127397h3) C63893iY.A08(r13)) == null)) {
            C10300i6 A0E = C63913ic.A0E(C63893iY.A01(r13, 2));
            C18200wM.A1R(A0E);
            String A0N = r1.A0N(56);
            String A0N2 = r1.A0N(55);
            if (C04220Ms.A0I(A0N, "IMAGE")) {
                num = AnonymousClass006.A00;
            } else if (C04220Ms.A0I(A0N, "VIDEO")) {
                num = AnonymousClass006.A01;
            } else if (C04220Ms.A0I(A0N, "SHOWREELS")) {
                num = AnonymousClass006.A0u;
            } else if (C04220Ms.A0I(A0N2, "IGTV")) {
                num = AnonymousClass006.A0j;
            } else {
                num = AnonymousClass006.A15;
            }
            String A0N3 = r1.A0N(50);
            String A0N4 = r1.A0N(44);
            if (A0N4 != null) {
                int hashCode = A0N4.hashCode();
                if (hashCode != 3260) {
                    if (hashCode == 3358 && A0N4.equals("ig")) {
                        num2 = AnonymousClass006.A00;
                    }
                } else if (A0N4.equals("fb")) {
                    num2 = AnonymousClass006.A01;
                }
                AnonymousClass3LY.A00(A0E).CWx(new AnonymousClass62E(new RtcStartCoWatchPlaybackArguments(num2, num, AnonymousClass006.A1C, (Integer) null, str, (String) null), A0N3));
            }
        }
        return null;
    }
}
