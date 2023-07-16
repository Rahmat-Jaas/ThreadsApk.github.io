package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1mi  reason: invalid class name and case insensitive filesystem */
public final class C25211mi extends AnonymousClass0gG {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ USLEBaseShape0S0000000 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25211mi(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, double d, int i, int i2) {
        super(2015553371);
        this.A03 = uSLEBaseShape0S0000000;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = d;
    }

    public final void run() {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = this.A03;
        uSLEBaseShape0S0000000.A0S("number_of_signals_to_read", C18230wP.A0f(this.A02));
        uSLEBaseShape0S0000000.A0S("number_of_signals_read_succes", C18230wP.A0f(this.A01));
        uSLEBaseShape0S0000000.A0R("time_spent_in_ms", Double.valueOf(this.A00));
        uSLEBaseShape0S0000000.Bb4();
    }
}
