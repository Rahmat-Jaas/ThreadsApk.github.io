package X;

import android.content.SharedPreferences;

/* renamed from: X.1eJ  reason: invalid class name */
public final class AnonymousClass1eJ extends AnonymousClass1eT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C130667qT A01;
    public final /* synthetic */ AnonymousClass3AT A02;

    public final void A03(AnonymousClass3XX r7) {
        C04220Ms.A0B(r7, 0);
        Throwable th = r7.A01;
        AnonymousClass3AT r3 = this.A02;
        C14100oo ABJ = C10770iu.A00().ABJ("ig_ndx_show_flows_error", 817895070);
        ABJ.Ciu(th);
        ABJ.report();
        r3.A01.A00(AnonymousClass006.A04, Long.valueOf(System.currentTimeMillis() - this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1eJ(C130667qT r2, AnonymousClass3AT r3, long j) {
        super(false);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C33492Fx.A00(this.A01, C61733Vd.A00(obj));
        AnonymousClass3AT r4 = this.A02;
        SharedPreferences.Editor A002 = C696949q.A00(AnonymousClass3Zs.A03(r4.A02), D2R.A1a);
        A002.putLong("ndx_impression_timestamp", System.currentTimeMillis());
        A002.apply();
        r4.A01.A00(AnonymousClass006.A03, Long.valueOf(System.currentTimeMillis() - this.A00));
    }
}
