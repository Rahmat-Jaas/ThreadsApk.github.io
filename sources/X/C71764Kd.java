package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.4Kd  reason: invalid class name and case insensitive filesystem */
public final class C71764Kd implements C83764rx {
    public final /* synthetic */ DirectMessagesInteropOptionsViewModel A00;
    public final /* synthetic */ C71774Ke A01;

    public final void Brd(AnonymousClass1U6 r13) {
        DirectMessagesInteropOptionsViewModel A012 = AnonymousClass1j3.A01(r13);
        C71774Ke r3 = this.A01;
        C63083bT r4 = r3.A05;
        String str = r3.A09;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = this.A00;
        AnonymousClass266 r7 = r3.A07;
        boolean z = r3.A0B;
        boolean z2 = r3.A0C;
        C04220Ms.A0B(str, 0);
        C63083bT.A03(r4, directMessagesInteropOptionsViewModel, A012, r7, str, z, z2, true);
        DirectMessageInteropReachabilityOptions A002 = A012.A00(str);
        if (A002 != null) {
            String str2 = A002.A03;
            C29171xR r1 = r3.A02;
            if (r1 != null) {
                C61353Sw r0 = r3.A03;
                if (r0 != null) {
                    r0.A00 = str2;
                }
                r1.A00();
            }
            r3.A06.A01(A012, str);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public C71764Kd(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, C71774Ke r2) {
        this.A01 = r2;
        this.A00 = directMessagesInteropOptionsViewModel;
    }

    public final void Bnz() {
        C71774Ke.A00(this.A01);
    }
}
