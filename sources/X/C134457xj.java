package X;

import android.os.MessageQueue;

/* renamed from: X.7xj  reason: invalid class name and case insensitive filesystem */
public final class C134457xj implements L04 {
    public static C134457xj A04;
    public static final C1199277q A05 = new C1199277q("feed_failed", true);
    public String A00;
    public final MessageQueue A01;
    public final C35074ImR A02;
    public final KJ8 A03;

    public final void A01(String str) {
        C04220Ms.A0B(str, 0);
        C35073ImQ imQ = this.A02.A02;
        C35071ImO imO = imQ.A02;
        if (C18190wL.A1Z(imQ.A00, true)) {
            imO.A00 = AnonymousClass006.A0C;
            String A002 = I17.A00(393);
            KJ8 kj8 = this.A03;
            kj8.A0J(this, A002);
            if (C37121Jkx.A00(imQ).isEmpty()) {
                kj8.A0H(C1199277q.A02);
                return;
            }
            return;
        }
        this.A00 = str;
    }

    public final String Ad0() {
        return "ig_text_feed_timeline";
    }

    public final void BlN() {
    }

    public final void Btf() {
    }

    public final void A00() {
        C35073ImQ imQ = this.A02.A02;
        C35070ImN imN = imQ.A01;
        if (imN.A00 == AnonymousClass006.A01) {
            imN.A00 = AnonymousClass006.A0C;
            String A002 = C28174Ezk.A00(140);
            KJ8 kj8 = this.A03;
            kj8.A0J(this, A002);
            if (C37121Jkx.A00(imQ).isEmpty()) {
                kj8.A0H(C1199277q.A02);
            }
        }
    }

    public C134457xj(MessageQueue messageQueue, KJ8 kj8) {
        this.A03 = kj8;
        this.A01 = messageQueue;
        this.A02 = new C35074ImR(kj8.A08, kj8.A09);
    }
}
