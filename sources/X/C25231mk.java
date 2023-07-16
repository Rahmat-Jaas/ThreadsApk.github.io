package X;

import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1mk  reason: invalid class name and case insensitive filesystem */
public final class C25231mk extends AnonymousClass0gG {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ C28451uI A01;
    public final /* synthetic */ RegFlowExtras A02;
    public final /* synthetic */ C07530bf A03;
    public final /* synthetic */ Integer A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25231mk(C34640IcN icN, C28451uI r3, RegFlowExtras regFlowExtras, C07530bf r5, Integer num) {
        super(707);
        this.A00 = icN;
        this.A03 = r5;
        this.A02 = regFlowExtras;
        this.A04 = num;
        this.A01 = r3;
    }

    public final void run() {
        C34640IcN icN = this.A00;
        C07530bf r5 = this.A03;
        RegFlowExtras regFlowExtras = this.A02;
        Integer num = this.A04;
        C28451uI r1 = this.A01;
        C32165H8c A002 = AnonymousClass2TR.A00(icN.requireContext(), regFlowExtras, r5, num, (String) null, (String) null);
        A002.A00 = r1;
        icN.schedule(A002);
    }
}
