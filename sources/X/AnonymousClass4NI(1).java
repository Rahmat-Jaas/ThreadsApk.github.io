package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.4NI  reason: invalid class name */
public final class AnonymousClass4NI implements C39800L0r {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ C25828Dsm A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C84404t5 A04;
    public final /* synthetic */ C307722x A05;

    public final void onFinish() {
    }

    public AnonymousClass4NI(Context context, C13330nS r2, C25828Dsm dsm, User user, C84404t5 r5, C307722x r6) {
        this.A04 = r5;
        this.A00 = context;
        this.A02 = dsm;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = user;
    }

    public final void Bxw(Integer num) {
        C63813iO.A08(this.A00);
        C84404t5 r0 = this.A04;
        if (r0 != null) {
            r0.CH5();
        }
    }

    public final void onStart() {
        C84404t5 r0 = this.A04;
        if (r0 != null) {
            r0.CH7();
        }
    }

    public final void onSuccess() {
        AnonymousClass0wJ.A1K(this.A02);
        C63773iK.A06(this.A01, this.A05, "impression", "optimistic_restrict_alert", this.A03.getId());
        C84404t5 r0 = this.A04;
        if (r0 != null) {
            r0.CNf();
        }
    }
}
