package X;

/* renamed from: X.81S  reason: invalid class name */
public final class AnonymousClass81S implements Runnable {
    public final /* synthetic */ C105446dR A00;
    public final /* synthetic */ String A01;

    public AnonymousClass81S(C105446dR r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass5xQ r3 = this.A00.A00;
        r3.A04.setVisibility(8);
        C41026Luf luf = new C41026Luf(r3.requireContext());
        luf.A02(2131822668);
        C40877Lpc lpc = luf.A01;
        lpc.A0C = lpc.A0L.getText(2131822667);
        luf.A05(C86154wM.A0N(this, 40), "dismiss");
        C13950oZ.A00(luf.A00());
        E2V.A03(r3.requireActivity()).AJh(0, true);
        StringBuilder A0s = C18190wL.A0s("FAILED_SAVE");
        A0s.append(this.A01);
        AnonymousClass5xQ.A02(r3, C18200wM.A0m(C121007Dp.A00(r3.A02), A0s));
    }
}
