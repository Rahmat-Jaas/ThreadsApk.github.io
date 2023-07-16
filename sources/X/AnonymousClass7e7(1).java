package X;

import java.util.List;

/* renamed from: X.7e7  reason: invalid class name */
public final class AnonymousClass7e7 implements C145788l5 {
    public final C147128nR A00;
    public final C03700Kj A01;
    public final C111736oI A02;
    public final AnonymousClass68S A03;

    public final void CbR() {
    }

    public final void CwH(List list) {
        C111736oI r2 = this.A02;
        C147128nR r0 = this.A00;
        String BJq = r0.BJq();
        String BJs = r0.BJs();
        AnonymousClass68S r3 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        C04220Ms.A0B(BJq, 0);
        AnonymousClass0wJ.A1O(BJs, r3);
        C04220Ms.A06(r2.A00(r3, BJq, BJs, list, currentTimeMillis).get());
    }

    public final List AQA() {
        return AnonymousClass0ZV.A00;
    }

    public AnonymousClass7e7(C03700Kj r2, C111736oI r3, AnonymousClass68S r4, C147128nR r5) {
        AnonymousClass0wJ.A1O(r3, r5);
        C04220Ms.A0B(r2, 3);
        this.A02 = r3;
        this.A00 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }
}
