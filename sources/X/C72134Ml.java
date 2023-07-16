package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

/* renamed from: X.4Ml  reason: invalid class name and case insensitive filesystem */
public final class C72134Ml implements C84394t4 {
    public final /* synthetic */ C20134BPz A00;
    public final /* synthetic */ User A01;

    public final void Bxq() {
    }

    public final void onCancel() {
    }

    public C72134Ml(C20134BPz bPz, User user) {
        this.A00 = bPz;
        this.A01 = user;
    }

    public final void BrW() {
        C20134BPz bPz = this.A00;
        User user = this.A01;
        C13330nS r1 = bPz.A05;
        String id = user.getId();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "remove_follower_dialog_confirmed"), 2631);
        A0I.A0T("target_id", id);
        A0I.Bb4();
    }

    public final void onSuccess() {
        C20134BPz bPz = this.A00;
        C63813iO.A0A(bPz.A04.getContext(), 2131834761, 0);
        C689646e.A00(bPz.A09, this.A01);
    }
}
