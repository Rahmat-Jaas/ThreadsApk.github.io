package X;

import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.4Kc  reason: invalid class name and case insensitive filesystem */
public final class C71754Kc implements C83764rx {
    public final /* synthetic */ C24471ir A00;
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A01;

    public final void Brd(AnonymousClass1U6 r14) {
        DirectMessagesInteropOptionsViewModel A012 = AnonymousClass1j3.A01(r14);
        C24471ir r4 = this.A00;
        String str = r4.A01;
        if (str != null) {
            C63083bT.A03(r4.A09, this.A01, A012, r4.A0E, str, r4.A03, r4.A0F, true);
        }
        r4.A00 = A012;
        r4.A02 = false;
        r4.A0D.A0C();
        AnonymousClass49K r5 = r4.A0C;
        r5.A00 = C63813iO.A03(r4.A05, (String) null, 2131830492, 1);
        String str2 = r4.A01;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = r4.A00;
        if (directMessagesInteropOptionsViewModel != null) {
            r5.A01(directMessagesInteropOptionsViewModel, str2);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public C71754Kc(C24471ir r1, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel) {
        this.A00 = r1;
        this.A01 = directMessagesInteropOptionsViewModel;
    }

    public final void Bnz() {
        C24471ir r0 = this.A00;
        C24471ir.A00(r0);
        C23411dm.A08(r0);
    }
}
