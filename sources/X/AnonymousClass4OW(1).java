package X;

import com.instagram.model.business.BusinessInfo;

/* renamed from: X.4OW  reason: invalid class name */
public final class AnonymousClass4OW implements Runnable {
    public final /* synthetic */ AnonymousClass1cS A00;

    public AnonymousClass4OW(AnonymousClass1cS r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1cS r3 = this.A00;
        C62163Xl r1 = new C62163Xl(r3.A05);
        r1.A0B = AnonymousClass0wJ.A0n(r3.A03.A00);
        r1.A01 = r3.A03.getSubmitPublicPhoneContact();
        BusinessInfo businessInfo = new BusinessInfo(r1);
        r3.A05 = businessInfo;
        AnonymousClass2KT.A00(C63873iU.A06(this, 12), r3, businessInfo, r3.A06);
    }
}
