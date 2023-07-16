package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape6S1500000_1_I2;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.service.session.UserSession;

/* renamed from: X.4L1  reason: invalid class name */
public final class AnonymousClass4L1 implements C84504tF, C27682ErY {
    public final FragmentActivity A00;
    public final C28493FOg A01;
    public final UserSession A02;
    public final ArchivePendingUpload A03;
    public final AnonymousClass433 A04;
    public final IngestSessionShim A05;
    public final IngestSessionShim A06;
    public final C67233zC A07;
    public final boolean A08;

    public AnonymousClass4L1(FragmentActivity fragmentActivity, ArchivePendingUpload archivePendingUpload, AnonymousClass433 r4, IngestSessionShim ingestSessionShim, IngestSessionShim ingestSessionShim2, C28493FOg fOg, UserSession userSession, C67233zC r9, boolean z) {
        C18190wL.A1S(userSession, 1, archivePendingUpload);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = ingestSessionShim;
        this.A06 = ingestSessionShim2;
        this.A03 = archivePendingUpload;
        this.A08 = z;
        this.A01 = fOg;
        this.A07 = r9;
        this.A04 = r4;
    }

    private final void A00(AnonymousClass29W r6, String str) {
        AnonymousClass2AD r3;
        UserSession userSession = this.A02;
        boolean A002 = C61453Tm.A00(userSession);
        if (this.A07.A06()) {
            if (A002) {
                r3 = AnonymousClass2AD.A0K;
            } else {
                r3 = AnonymousClass2AD.A0N;
            }
        } else if (A002) {
            r3 = AnonymousClass2AD.A0O;
        } else {
            r3 = AnonymousClass2AD.A0J;
        }
        C04220Ms.A06(r3);
        AnonymousClass2AC r2 = AnonymousClass2AC.IG_STORY_SHARE_SHEET_SHARING_OPTIONS;
        AnonymousClass14U A003 = AnonymousClass14U.A00();
        A003.A0A("ig_media_id", str);
        C49322rC.A00(r2, r6, r3, A003, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C67373zR.A0H(r7.A02) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r7 = this;
            X.433 r1 = r7.A04
            X.FOg r2 = r7.A01
            X.24t r3 = X.C312224t.STORY_SHARE_SHEET
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0013
            com.instagram.service.session.UserSession r0 = r7.A02
            boolean r0 = X.C67373zR.A0H(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            X.3zC r0 = r7.A07
            boolean r6 = r0.A07()
            r4 = 2002(0x7d2, float:2.805E-42)
            r1.A00(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4L1.A01():void");
    }

    public final void A02() {
        UserSession userSession = this.A02;
        boolean z = this.A08;
        if (!C67373zR.A08(userSession) && z && !C67253zE.A02(userSession)) {
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, userSession, 36328096109963542L)) {
                FragmentActivity fragmentActivity = this.A00;
                C28493FOg fOg = this.A01;
                AnonymousClass2AC r4 = AnonymousClass2AC.IG_STORY_SHARE_SHEET_SHARING_OPTIONS;
                String A002 = AnonymousClass264.A0b.A00();
                C67233zC r8 = this.A07;
                C04220Ms.A0B(A002, 4);
                if (C63803iN.A0E(r2, userSession, 36328096110094616L)) {
                    C72204Na r10 = new C72204Na(fragmentActivity, r4, fOg, userSession, r8);
                    C58173Ej A003 = C35762Os.A00();
                    C04220Ms.A0C(fOg, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                    A003.A00(fOg, userSession, r10).A06(A002);
                    return;
                }
                C25828Dsm A0V = AnonymousClass0wJ.A0V(fOg);
                A0V.A0L(2131827040);
                A0V.A0q(true);
                A0V.A0r(true);
                A0V.A0P(new IDxCListenerShape6S1500000_1_I2(r4, fOg, fragmentActivity, userSession, r8, A002, 0), 2131824397);
                C18230wP.A1M(A0V, r4, userSession, 71, 2131823054);
                A0V.A0K(2131826985);
                AnonymousClass0wJ.A1K(A0V);
                C49322rC.A00(r4, AnonymousClass29W.VIEW, AnonymousClass2AD.A0R, AnonymousClass14U.A00(), userSession);
                return;
            }
        }
        C28493FOg fOg2 = this.A01;
        Integer num = AnonymousClass006.A0C;
        boolean A004 = C61453Tm.A00(userSession);
        C67233zC r3 = this.A07;
        new C67273zH(fOg2, userSession, this, num, AnonymousClass006.A00, A004, r3.A06()).A06((BKH) null);
        r3.A04 = C18190wL.A1X(C28161tl.A04(userSession), "auto_cross_post_to_facebook_story");
        A00(AnonymousClass29W.VIEW, (String) null);
    }

    public final void Blu(BKH bkh) {
        String str;
        BKU bku;
        AnonymousClass29W r1 = AnonymousClass29W.ACCEPT;
        if (bkh == null || (bku = bkh.A0M) == null) {
            str = null;
        } else {
            str = bku.A0f.A4Y;
        }
        A00(r1, str);
        this.A07.A04(AnonymousClass006.A00, "ig_story_composer", true);
    }

    public final void BtE(BKH bkh) {
        String str;
        BKU bku;
        AnonymousClass29W r1 = AnonymousClass29W.DECLINE;
        if (bkh == null || (bku = bkh.A0M) == null) {
            str = null;
        } else {
            str = bku.A0f.A4Y;
        }
        A00(r1, str);
    }

    public final void C0x(PendingRecipient pendingRecipient) {
        C28493FOg fOg = this.A01;
        fOg.A02 = pendingRecipient;
        fOg.A08(AnonymousClass006.A0j);
    }

    public final void CKr(BKH bkh) {
        String str;
        BKU bku;
        AnonymousClass29W r1 = AnonymousClass29W.OTHER;
        if (bkh == null || (bku = bkh.A0M) == null) {
            str = null;
        } else {
            str = bku.A0f.A4Y;
        }
        A00(r1, str);
        this.A07.A05(AnonymousClass006.A00, true);
        C17323A5r.A00(this.A02).A03.set(false);
    }

    public final void CMW() {
        A00(AnonymousClass29W.OTHER, (String) null);
        this.A07.A04(AnonymousClass006.A00, "ig_story_composer", false);
    }

    public final void CMa() {
        A00(AnonymousClass29W.ACCEPT, (String) null);
        this.A07.A05(AnonymousClass006.A00, false);
        C17323A5r.A00(this.A02).A03.set(true);
    }
}
