package X;

import com.instagram.user.model.User;

/* renamed from: X.4Rk  reason: invalid class name */
public final class AnonymousClass4Rk implements Runnable {
    public final /* synthetic */ C28441uH A00;
    public final /* synthetic */ User A01;

    public AnonymousClass4Rk(C28441uH r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void run() {
        C28441uH r4 = this.A00;
        AnonymousClass01V r3 = r4.A03;
        r3.markerPoint(4197923, "navigate_to_next_screen");
        C34640IcN icN = r4.A01;
        String id = this.A01.getId();
        C313625r r6 = r4.A07;
        Integer A02 = r4.A05.A02();
        C67283zI.A04(icN.requireActivity(), r4.A02, r6, A02, AnonymousClass006.A00, id);
        r3.markerEnd(4197923, 2);
    }
}
