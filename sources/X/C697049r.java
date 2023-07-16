package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.49r  reason: invalid class name and case insensitive filesystem */
public abstract class C697049r implements AnonymousClass0i1 {
    public AnonymousClass2AC A00;
    public C67263zF A01;
    public C67233zC A02;
    public C83844s5 A03;
    public C83004qd A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;

    public C697049r(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A08 = userSession;
    }

    public final void A06(Activity activity) {
        UserSession userSession;
        AnonymousClass2AD A002;
        AnonymousClass2AC A032;
        long A042;
        SharedPreferences.Editor A022;
        String str;
        if (!this.A07) {
            this.A07 = true;
            C25745DrH A0b = C18220wO.A0b(activity);
            if (A0b == null || !((C35189Ipf) A0b).A0M) {
                AnonymousClass0wJ.A0F().post(new C73294Rv(activity, this));
            } else {
                Bundle A023 = A02();
                A023.putString("bottom_sheet_content_fragment", "crossposting_upsell_bottom_sheet");
                C63863iT A024 = C63863iT.A02(activity, A023, this.A08, TransparentBackgroundModalActivity.class, "bottom_sheet");
                A024.A04 = 0;
                A024.A0I(activity.getApplicationContext());
            }
            if (this instanceof AnonymousClass1v4) {
                AnonymousClass1v4 r3 = (AnonymousClass1v4) this;
                userSession = r3.A08;
                C28161tl A012 = AnonymousClass3WS.A01(userSession);
                boolean z = r3.A09;
                boolean z2 = r3.A08;
                boolean A043 = C63363hM.A04(r3.A03(), userSession);
                if (z) {
                    if (z2) {
                        if (!A043) {
                            AnonymousClass0wJ.A14(A012.A00, "story_xpost_user_migration_upsell_display_count", 0);
                        }
                        A042 = C18180wK.A04();
                        A022 = C28161tl.A02(A012);
                        str = "story_xpost_user_migration_upsell_last_seen_sec";
                    } else {
                        if (!A043) {
                            AnonymousClass0wJ.A14(A012.A00, "story_xpost_user_migration_upsell_second_wave_display_count", 0);
                        }
                        A042 = C18180wK.A04();
                        A022 = C28161tl.A02(A012);
                        str = "story_xpost_user_migration_upsell_second_wave_last_seen_sec";
                    }
                } else if (z2) {
                    if (!A043) {
                        AnonymousClass0wJ.A14(A012.A00, "feed_xpost_user_migration_upsell_display_count", 0);
                    }
                    A042 = C18180wK.A04();
                    A022 = C28161tl.A02(A012);
                    str = "feed_xpost_user_migration_upsell_last_seen_sec";
                } else {
                    if (!A043) {
                        AnonymousClass0wJ.A14(A012.A00, "feed_xpost_user_migration_upsell_second_wave_display_count", 0);
                    }
                    A042 = C18180wK.A04();
                    A022 = C28161tl.A02(A012);
                    str = "feed_xpost_user_migration_upsell_second_wave_last_seen_sec";
                }
                AnonymousClass0wJ.A12(A022, str, A042);
                A002 = AnonymousClass3P0.A00(r3.A09, r3.A08);
                A032 = r3.A03();
            } else if (!this.A06) {
                userSession = this.A08;
                C28161tl A013 = AnonymousClass3WS.A01(userSession);
                if (A03() != AnonymousClass2AC.A02 && A03() != AnonymousClass2AC.A04) {
                    if (!C63363hM.A04(A03(), userSession)) {
                        AnonymousClass0wJ.A14(A013.A00, "xpost_unified_onboarding_upsell_display_count", 0);
                    }
                    AnonymousClass0wJ.A12(C28161tl.A02(A013), "xpost_unified_onboarding_upsell_last_seen_sec", C18180wK.A04());
                    A002 = C49352rF.A00(A03(), userSession, this.A06);
                    A032 = A03();
                } else {
                    return;
                }
            } else {
                return;
            }
            C63423hS.A01(A032, A002, userSession);
        }
    }

    public final Bundle A02() {
        if (this instanceof AnonymousClass1v4) {
            AnonymousClass1v4 r2 = (AnonymousClass1v4) this;
            UserSession userSession = r2.A08;
            boolean A002 = C61453Tm.A00(userSession);
            boolean A003 = C62183Xq.A00(userSession);
            boolean z = r2.A09;
            AnonymousClass2AC A032 = r2.A03();
            boolean z2 = r2.A08;
            int A072 = r2.A07();
            Bundle A062 = C18180wK.A06();
            A062.putBoolean("args_is_story_enabled", A002);
            A062.putBoolean("args_is_post_enabled", A003);
            A062.putBoolean("args_is_showing_from_story", z);
            A062.putString("args_entrypoint", A032.toString());
            A062.putBoolean("args_is_first_wave", z2);
            A062.putInt("args_num_of_views", A072);
            return A062;
        }
        AnonymousClass2AC A033 = A03();
        boolean z3 = this.A06;
        Bundle A063 = C18180wK.A06();
        A063.putString("args_entrypoint", A033.toString());
        A063.putInt("args_num_of_views", C18190wL.A04(C28161tl.A04(this.A08), "xpost_unified_onboarding_upsell_display_count") + 1);
        A063.putBoolean("args_is_after_fbc", z3);
        return A063;
    }

    public final AnonymousClass2AC A03() {
        AnonymousClass2AC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("entrypoint");
        throw null;
    }

    public final C83844s5 A04() {
        if (this instanceof AnonymousClass1v4) {
            return new AnonymousClass4L8((AnonymousClass1v4) this);
        }
        return new AnonymousClass4L7((AnonymousClass1v3) this);
    }

    public final void A05() {
        UserSession userSession = this.A08;
        if (!C28161tl.A04(userSession).getBoolean("auto_cross_post_to_facebook_feed", false)) {
            C67263zF.A03.A02(userSession, "upsell", true, true);
            C67263zF r1 = this.A01;
            if (r1 == null) {
                r1 = C60303Om.A00(userSession);
                this.A01 = r1;
            }
            C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.share.facebook.FeedShareToFBController");
            r1.A04(userSession, "upsell", true);
        }
        if (!C28161tl.A04(userSession).getBoolean("auto_cross_post_to_facebook_story", false)) {
            C61453Tm r2 = C67233zC.A08;
            Integer num = AnonymousClass006.A00;
            r2.A01(userSession, num, "upsell", true, true);
            C67233zC r12 = this.A02;
            if (r12 == null) {
                r12 = C60303Om.A01(userSession, (C83824s3) null);
                this.A02 = r12;
            }
            C04220Ms.A0C(r12, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
            r12.A04(num, "upsell", true);
        }
    }

    public static void A01(Activity activity, AnonymousClass2AC r2, UserSession userSession, C83004qd r4, boolean z) {
        AnonymousClass1v3 A002 = AnonymousClass3ZC.A00(userSession);
        A002.A00 = r2;
        A002.A06 = z;
        A002.A04 = r4;
        A002.A06(activity);
    }
}
