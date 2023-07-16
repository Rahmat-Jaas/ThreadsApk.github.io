package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4L5  reason: invalid class name */
public final class AnonymousClass4L5 implements C84514tG {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass0ZU A01;

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public AnonymousClass4L5(UserSession userSession, AnonymousClass0ZU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void Bj1() {
        UserSession userSession = this.A00;
        C62713aZ.A01(userSession, "auto_crossposting");
        AnonymousClass0wJ.A0F().post(new C72644Pd(this.A01));
        C67263zF.A03.A02(userSession, "upsell", true, true);
        C67233zC.A08.A01(userSession, AnonymousClass006.A00, "upsell", true, true);
    }

    public final void Bmk() {
        AnonymousClass3YT.A00(this.A00, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "auto_crossposting", (String) null);
    }

    public final void BtD() {
        C62713aZ.A01(this.A00, "auto_crossposting");
        AnonymousClass0wJ.A0F().post(new C72664Pf(this.A01));
    }

    public final void Bmj() {
        AnonymousClass0wJ.A0F().post(new C72654Pe(this.A01));
    }
}
