package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1im  reason: invalid class name */
public abstract class AnonymousClass1im extends C63873iU {
    public Long A00;
    public String A01;
    public C37741K2b A02;

    public abstract boolean A02(C85814vo r1);

    public AnonymousClass1im(C37741K2b k2b) {
        this.A01 = "";
        this.A00 = C18200wM.A0c();
        this.A02 = k2b;
    }

    private void A00(AnonymousClass291 r6, C37741K2b k2b) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A00.longValue());
        String str = this.A01;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(k2b.A05, "ig_boost_platform_api_call"), 819);
        A0I.A0T("flow_id", k2b.A03);
        A0I.A0T("api_path", str);
        A0I.A0S("latency_ms", valueOf);
        A0I.A0O(r6, "result_type");
        A0I.Bb4();
    }

    public final void A01(C85814vo r4) {
        AnonymousClass291 r1;
        int A03 = C14030oh.A03(361431094);
        super.onSuccess(r4);
        if (A02(r4)) {
            r1 = AnonymousClass291.SUCCESS;
        } else {
            r1 = AnonymousClass291.ERROR;
        }
        A00(r1, this.A02);
        C14030oh.A0A(-1209523514, A03);
    }

    public void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-1308673131);
        super.onFail(r4);
        A00(AnonymousClass291.FAILURE, this.A02);
        C14030oh.A0A(-505811846, A03);
    }

    public void onStart() {
        int A03 = C14030oh.A03(-1479099202);
        super.onStart();
        this.A00 = C18200wM.A0c();
        C14030oh.A0A(-1076988579, A03);
    }

    public AnonymousClass1im(C37741K2b k2b, String str) {
        this.A01 = str;
        this.A00 = C18200wM.A0c();
        this.A02 = k2b;
    }
}
