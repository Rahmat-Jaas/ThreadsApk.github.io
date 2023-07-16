package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Kz  reason: invalid class name and case insensitive filesystem */
public final class C71924Kz implements C84504tF {
    public final /* synthetic */ C62703aY A00;

    public final void CMW() {
    }

    public final void CMa() {
    }

    public C71924Kz(C62703aY r1) {
        this.A00 = r1;
    }

    public final void Blu(BKH bkh) {
        AnonymousClass2AC r8;
        String str;
        BKU bku;
        C62703aY r6 = this.A00;
        r6.A01 = false;
        String A0n = C18190wL.A0n(C03480Iw.A00());
        UserSession userSession = r6.A06;
        if (r6.A00) {
            r8 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
        } else {
            r8 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
        }
        AnonymousClass2AD r7 = AnonymousClass2AD.A0J;
        AnonymousClass29W r3 = AnonymousClass29W.ACCEPT;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        if (bkh == null || (bku = bkh.A0M) == null) {
            str = null;
        } else {
            str = bku.A0f.A4Y;
        }
        A002.A0A("ig_media_id", str);
        A002.A0A("waterfall_id", A0n);
        C49322rC.A00(r8, r3, r7, A002, userSession);
        ((C67233zC) r6.A09.getValue()).A04(AnonymousClass006.A00, "ig_self_story", true);
        if (bkh != null) {
            AnonymousClass2SK.A00(userSession, "primary_click", "self_story", C25567Do3.A02(userSession).A0K, A0n);
            C62703aY.A02(bkh, r6, A0n);
        }
        r6.A05.CeG();
    }

    public final void BtE(BKH bkh) {
        AnonymousClass2AC r5;
        String str;
        BKU bku;
        C62703aY r0 = this.A00;
        UserSession userSession = r0.A06;
        if (r0.A00) {
            r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
        } else {
            r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
        }
        AnonymousClass2AD r4 = AnonymousClass2AD.A0J;
        AnonymousClass29W r3 = AnonymousClass29W.DECLINE;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        if (bkh == null || (bku = bkh.A0M) == null) {
            str = null;
        } else {
            str = bku.A0f.A4Y;
        }
        A002.A0A("ig_media_id", str);
        C49322rC.A00(r5, r3, r4, A002, userSession);
    }

    public final void CKr(BKH bkh) {
        AnonymousClass2AC r5;
        String str;
        C62703aY r8 = this.A00;
        r8.A01 = false;
        if (bkh != null) {
            String A0n = C18190wL.A0n(C03480Iw.A00());
            UserSession userSession = r8.A06;
            AnonymousClass2SK.A00(userSession, "primary_click", "self_story", C25567Do3.A02(userSession).A0K, A0n);
            if (r8.A00) {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
            } else {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
            }
            AnonymousClass2AD r4 = AnonymousClass2AD.A0J;
            AnonymousClass29W r3 = AnonymousClass29W.OTHER;
            AnonymousClass14U A002 = AnonymousClass14U.A00();
            BKU bku = bkh.A0M;
            if (bku != null) {
                str = bku.A0f.A4Y;
            } else {
                str = null;
            }
            A002.A0A("ig_media_id", str);
            A002.A0A("waterfall_id", A0n);
            C49322rC.A00(r5, r3, r4, A002, userSession);
            C62703aY.A02(bkh, r8, A0n);
        }
        r8.A05.CeG();
    }
}
