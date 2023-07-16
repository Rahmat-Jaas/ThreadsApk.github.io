package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1mm  reason: invalid class name and case insensitive filesystem */
public final class C25251mm extends AnonymousClass0gG {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ USLEBaseShape0S0000000 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25251mm(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, double d, int i, int i2, int i3, long j) {
        super(2015553371);
        this.A05 = uSLEBaseShape0S0000000;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A00 = d;
    }

    public final void run() {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = this.A05;
        uSLEBaseShape0S0000000.A0S("number_of_signals_to_write", C18230wP.A0f(this.A02));
        uSLEBaseShape0S0000000.A0S("number_of_signals_write_success", C18230wP.A0f(this.A03));
        uSLEBaseShape0S0000000.A0S("number_of_signals_in_cache", C18230wP.A0f(this.A01));
        uSLEBaseShape0S0000000.A0S("cache_size_in_bytes", Long.valueOf(this.A04));
        uSLEBaseShape0S0000000.A0R("time_spent_in_ms", Double.valueOf(this.A00));
        uSLEBaseShape0S0000000.Bb4();
    }
}
