package X;

/* renamed from: X.82T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass82T implements Runnable {
    public final /* synthetic */ AnonymousClass7A4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass82T(AnonymousClass7A4 r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final void run() {
        AnonymousClass7A4 r5 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        C34640IcN icN = r5.A09;
        H1T A0O = C18180wK.A0O(r5.A0A);
        A0O.A0J("nametag/nametag_lookup_by_name/{user_name}/");
        A0O.A0O("user_name", str);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass5u4.class, C117576yu.class);
        A0T.A00 = new C95075yo(r5, z);
        icN.schedule(A0T);
    }
}
