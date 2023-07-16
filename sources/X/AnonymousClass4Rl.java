package X;

import com.instagram.user.model.User;

/* renamed from: X.4Rl  reason: invalid class name */
public final class AnonymousClass4Rl implements Runnable {
    public final /* synthetic */ C24341hw A00;
    public final /* synthetic */ User A01;

    public AnonymousClass4Rl(C24341hw r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void run() {
        C24341hw r2 = this.A00;
        C34640IcN icN = r2.A00;
        String id = this.A01.getId();
        C313625r A012 = r2.A03.A01();
        C67283zI.A04(icN.requireActivity(), r2.A01, A012, (Integer) null, AnonymousClass006.A00, id);
    }
}
