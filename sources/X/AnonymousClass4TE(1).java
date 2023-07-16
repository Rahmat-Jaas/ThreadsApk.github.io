package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4TE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4TE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass099 A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C84814tu A03;
    public final /* synthetic */ C121997Jj A04;
    public final /* synthetic */ C81364nf A05;
    public final /* synthetic */ C82374pW A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass4TE(AnonymousClass099 r1, FragmentActivity fragmentActivity, C84814tu r3, C121997Jj r4, C81364nf r5, C82374pW r6, String str, int i) {
        this.A02 = fragmentActivity;
        this.A01 = r1;
        this.A07 = str;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = i;
        this.A06 = r6;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A02;
        AnonymousClass099 r1 = this.A01;
        String str = this.A07;
        C84814tu r2 = this.A03;
        C81364nf r4 = this.A05;
        C121997Jj r3 = this.A04;
        int i = this.A00;
        C82374pW r6 = this.A06;
        C84864tz A012 = C63123bZ.A01(fragmentActivity, r1, r2, r3, r4, str);
        AnonymousClass1Xb r12 = (AnonymousClass1Xb) r1;
        C62823ao.A01(r12.requireContext(), AnonymousClass1Xb.A00(r12), A012, r6, AnonymousClass006.A00, i);
    }
}
