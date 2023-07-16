package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.0k6  reason: invalid class name */
public final class AnonymousClass0k6 extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass0k2 A00;
    public final /* synthetic */ Long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0k6(AnonymousClass0k2 r5, Long l) {
        super(673, 5, false, true);
        this.A00 = r5;
        this.A01 = l;
    }

    public final void run() {
        USLEBaseShape0S0000000 A002 = C32392Bq.A00(new C10680ik(C10260hz.A00).A00());
        if (A002.A00.isSampled()) {
            A002.A0S("task_id", this.A01);
            A002.A0T("stack_trace", "");
            A002.Bb4();
        }
    }
}
