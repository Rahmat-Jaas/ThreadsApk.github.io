package X;

/* renamed from: X.4NG  reason: invalid class name */
public final class AnonymousClass4NG implements C39800L0r {
    public final /* synthetic */ AnonymousClass44T A00;
    public final /* synthetic */ String A01;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public AnonymousClass4NG(AnonymousClass44T r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void Bxw(Integer num) {
        C63813iO.A03(this.A00.A01, "unrestricted_user_failed", 2131836068, 0);
    }

    public final void onSuccess() {
        AnonymousClass44T r4 = this.A00;
        C63773iK.A09(r4.A05, "impression", "unrestrict_success_toast", this.A01);
        C63813iO.A00(r4.A01, 2131820896);
    }
}
