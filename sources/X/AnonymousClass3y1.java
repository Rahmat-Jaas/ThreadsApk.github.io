package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

/* renamed from: X.3y1  reason: invalid class name */
public final class AnonymousClass3y1 implements AnonymousClass07L {
    public final /* synthetic */ AnonymousClass1d2 A00;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public AnonymousClass3y1(AnonymousClass1d2 r1) {
        this.A00 = r1;
    }

    public final void onPageSelected(int i) {
        AnonymousClass49E r5;
        USLEBaseShape0S0000000 A0I;
        AnonymousClass2AB r0;
        AnonymousClass1d2 r4 = this.A00;
        C19480zw r02 = (C19480zw) r4.A03.getValue();
        User A03 = r02.A00.A03(r02.A01);
        if (A03 != null) {
            int ordinal = AnonymousClass23Q.values()[i].ordinal();
            if (ordinal == 0) {
                r5 = (AnonymousClass49E) r4.A01.getValue();
                A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r5.A01, "instagram_ibc_profile_actions"), 1832);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    String A0e = C18180wK.A0e();
                    C04220Ms.A06(A0e);
                    r5.A00 = A0e;
                    AnonymousClass2AH.A02(A0I);
                    AnonymousClass2A3.A00(C40326Lcg.A05, A0I, "source");
                    r0 = AnonymousClass2AB.A04;
                } else {
                    return;
                }
            } else if (ordinal == 1) {
                r5 = (AnonymousClass49E) r4.A01.getValue();
                A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r5.A01, "instagram_ibc_profile_actions"), 1832);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    String A0e2 = C18180wK.A0e();
                    C04220Ms.A06(A0e2);
                    r5.A00 = A0e2;
                    AnonymousClass2AH.A02(A0I);
                    AnonymousClass2A3.A00(C40326Lcg.A05, A0I, "source");
                    r0 = AnonymousClass2AB.A0I;
                } else {
                    return;
                }
            } else {
                return;
            }
            String A002 = AnonymousClass49E.A00(r0, A0I, r5, A03);
            if (A002 == null) {
                C04220Ms.A0E("sessionId");
                throw null;
            }
            A0I.A0T(AnonymousClass3QF.A00(0, 10, 76), A002);
            A0I.Bb4();
        }
    }
}
