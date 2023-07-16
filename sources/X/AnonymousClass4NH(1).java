package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4NH  reason: invalid class name */
public final class AnonymousClass4NH implements C39800L0r {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ C109326jp A04;
    public final /* synthetic */ String A05;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public AnonymousClass4NH(FragmentActivity fragmentActivity, C13330nS r2, AnonymousClass601 r3, C109326jp r4, C109326jp r5, String str) {
        this.A01 = r2;
        this.A05 = str;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final void Bxw(Integer num) {
        C63893iY.A0G(this.A02, this.A03);
    }

    public final void onSuccess() {
        C13330nS r1 = this.A01;
        C04220Ms.A05(r1);
        C63773iK.A07(r1, this.A05);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity.getSupportFragmentManager().A0I() <= 1) {
            fragmentActivity.finish();
        }
        C63893iY.A0G(this.A02, this.A04);
    }
}
