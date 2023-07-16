package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.4Mk  reason: invalid class name */
public final class AnonymousClass4Mk implements C84394t4 {
    public final /* synthetic */ AnonymousClass44T A00;

    public final void Bxq() {
    }

    public AnonymousClass4Mk(AnonymousClass44T r1) {
        this.A00 = r1;
    }

    public final void BrW() {
        AnonymousClass44T r0 = this.A00;
        C13330nS r1 = r0.A05;
        String id = r0.A09.getId();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "remove_follower_dialog_confirmed"), 2631);
        A0I.A0T("target_id", id);
        A0I.Bb4();
    }

    public final void onCancel() {
        AnonymousClass44T r0 = this.A00;
        C13330nS r1 = r0.A05;
        String id = r0.A09.getId();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "remove_follower_dialog_cancelled"), 2630);
        A0I.A0T("target_id", id);
        A0I.Bb4();
    }

    public final void onSuccess() {
        AnonymousClass44T r2 = this.A00;
        C63813iO.A00(r2.A00, 2131834761);
        C689646e.A00(r2.A06, r2.A09);
    }
}
