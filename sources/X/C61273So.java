package X;

/* renamed from: X.3So  reason: invalid class name and case insensitive filesystem */
public final class C61273So {
    public static int A03 = 2;
    public C25271mo A00;
    public final C34640IcN A01;
    public final C10300i6 A02;

    public C61273So(C34640IcN icN, C10300i6 r2) {
        this.A01 = icN;
        this.A02 = r2;
    }

    public static void A00(C61273So r5) {
        if (!C120647Bw.A00()) {
            C09140ev r1 = C09140ev.A02;
            C34640IcN icN = r5.A01;
            String replaceAll = r1.A05(icN.getContext()).replaceAll("-", "");
            H1T A0O = C18180wK.A0O(r5.A02);
            A0O.A0J("si/fetch_headers/");
            A0O.A0O(I17.A00(545), "signup");
            A0O.A0O("guid", replaceAll);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C22071Tg.class, AnonymousClass3O6.class);
            A0T.A00 = new AnonymousClass1hC(r5);
            icN.schedule(A0T);
        }
    }
}
