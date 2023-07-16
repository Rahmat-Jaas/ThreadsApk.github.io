package X;

/* renamed from: X.6Ok  reason: invalid class name and case insensitive filesystem */
public final class C100726Ok {
    public static Object A00(C63893iY r6) {
        C169229sw r3;
        C21834C2j c2j;
        Object A0B = C63893iY.A0B(r6, 1);
        A0B.getClass();
        AnonymousClass9V6 A00 = AnonymousClass6OG.A00((C130667qT) ((AnonymousClass3HX) C63893iY.A07(r6)).A02);
        String A0o = C18220wO.A0o((C127397h3) A0B);
        A0o.getClass();
        C18479AgB A002 = A00.A00(A0o);
        if (A002 == null || (r3 = (C169229sw) A00.A03.get(A002)) == null || (c2j = r3.A02) == null) {
            return "unprepared";
        }
        int ordinal = ((C35241Iqy) c2j).A0J.ordinal();
        if (ordinal == 4) {
            return "paused";
        }
        if (ordinal == 3) {
            C18126AaG aaG = r3.A01;
            if ((aaG == null || !aaG.A02) && c2j.AbW() >= c2j.AeK()) {
                return AnonymousClass000.A00(1031);
            }
            return "playing";
        } else if (ordinal == 1) {
            return AnonymousClass000.A00(788);
        } else {
            if (ordinal == 2) {
                return "prepared";
            }
            return "unprepared";
        }
    }
}
