package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;

/* renamed from: X.3Vs  reason: invalid class name and case insensitive filesystem */
public abstract class C61813Vs {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        if (X.C18190wL.A1Z(r12.A04, true) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (X.C18190wL.A1Z(r12.A04, false) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (X.C63803iN.A0E(r12, r7, 36317607799820130L) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        if (X.C18190wL.A1Z(r12.A01, false) != false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass2AC r18, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2 r19, com.instagram.service.session.UserSession r20, X.AnonymousClass3VY r21, java.lang.String r22) {
        /*
            r17 = this;
            r4 = 0
            r5 = r22
            r7 = r20
            boolean r16 = X.AnonymousClass0wJ.A1Z(r7, r5)
            r0 = 3
            r8 = r18
            X.C04220Ms.A0B(r8, r0)
            r9 = r17
            boolean r0 = r9.A04()
            java.lang.String r3 = "failure_reason"
            java.lang.String r2 = "NoticeVariantConfig"
            r6 = r21
            if (r0 == 0) goto L_0x0231
            r1 = r9
            boolean r0 = r9 instanceof X.C28881vi
            if (r0 == 0) goto L_0x01d1
            X.1vi r1 = (X.C28881vi) r1
            java.util.List r0 = r1.A00
        L_0x0026:
            java.util.Iterator r15 = r0.iterator()
        L_0x002a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r11 = r15.next()
            X.24s r11 = (X.C312124s) r11
            boolean r0 = r11 instanceof X.AnonymousClass1vM
            r12 = r19
            if (r0 == 0) goto L_0x00ad
            if (r19 == 0) goto L_0x01ce
            java.lang.Object r1 = r12.A05
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            boolean r10 = X.C04220Ms.A0I(r1, r0)
        L_0x0048:
            java.lang.String r14 = X.C61843Wa.A01(r8)
            java.lang.String r13 = r9.A02()
            X.0nS r1 = X.C13330nS.A02(r7)
            java.lang.String r0 = "cxp_notice_client_rule"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 507(0x1fb, float:7.1E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r12)
            if (r0 == 0) goto L_0x008f
            if (r14 == 0) goto L_0x008f
            if (r13 == 0) goto L_0x008f
            X.231 r1 = r11.A00
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "client_session_id"
            r12.A0T(r0, r5)
            java.lang.String r0 = "entrypoint"
            r12.A0T(r0, r14)
            java.lang.String r0 = "variant"
            r12.A0T(r0, r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "rule"
            java.lang.Boolean r1 = X.C18190wL.A0Z(r12, r0, r1, r10)
            java.lang.String r0 = "rule_result"
            r12.A0Q(r0, r1)
            r12.Bb4()
        L_0x008f:
            if (r10 != 0) goto L_0x002a
            java.lang.String r0 = "Failed Eligibility Rule: "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r11)
            X.AnonymousClass0LU.A0B(r2, r0)
            if (r21 == 0) goto L_0x00ac
            java.lang.String r1 = X.C18210wN.A0e(r11)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "failed_eligibility_rule:"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
        L_0x00a9:
            r6.A02(r3, r0)
        L_0x00ac:
            return r4
        L_0x00ad:
            boolean r0 = r11 instanceof X.AnonymousClass1vL
            if (r0 == 0) goto L_0x00cb
            X.C04220Ms.A0B(r7, r4)
            X.3ZL r0 = X.AnonymousClass3Zu.A03(r7)
            boolean r0 = r0.A08()
            r10 = 1
            if (r0 == 0) goto L_0x01ce
            if (r19 == 0) goto L_0x01ce
            java.lang.Object r0 = r12.A04
            boolean r0 = X.C18190wL.A1Z(r0, r10)
            if (r0 == 0) goto L_0x01ce
            goto L_0x0048
        L_0x00cb:
            boolean r0 = r11 instanceof X.AnonymousClass1vK
            if (r0 == 0) goto L_0x00dd
            if (r19 == 0) goto L_0x01ce
            java.lang.Object r1 = r12.A03
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            boolean r10 = X.C04220Ms.A0I(r1, r0)
            goto L_0x0048
        L_0x00dd:
            boolean r0 = r11 instanceof X.AnonymousClass1vJ
            if (r0 == 0) goto L_0x00fc
            X.C04220Ms.A0B(r7, r4)
            X.3ZL r0 = X.AnonymousClass3Zu.A03(r7)
            boolean r0 = r0.A08()
            r10 = 0
            if (r0 != 0) goto L_0x0048
            if (r19 == 0) goto L_0x0048
            java.lang.Object r0 = r12.A04
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x0048
        L_0x00f9:
            r10 = 1
            goto L_0x0048
        L_0x00fc:
            boolean r0 = r11 instanceof X.AnonymousClass1vI
            if (r0 == 0) goto L_0x0113
            X.C04220Ms.A0B(r7, r4)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r7)
            X.9tz r1 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            boolean r10 = X.C18180wK.A1Z(r1, r0)
            goto L_0x0048
        L_0x0113:
            boolean r0 = r11 instanceof X.AnonymousClass1vH
            if (r0 == 0) goto L_0x0120
            X.C04220Ms.A0B(r7, r4)
            boolean r10 = X.C61453Tm.A00(r7)
            goto L_0x0048
        L_0x0120:
            boolean r0 = r11 instanceof X.AnonymousClass1vG
            if (r0 == 0) goto L_0x012f
            X.C04220Ms.A0B(r7, r4)
            boolean r0 = X.C61453Tm.A00(r7)
            r10 = r0 ^ 1
            goto L_0x0048
        L_0x012f:
            boolean r0 = r11 instanceof X.AnonymousClass1vF
            if (r0 != 0) goto L_0x01ce
            boolean r0 = r11 instanceof X.AnonymousClass1vE
            if (r0 == 0) goto L_0x0141
            X.C04220Ms.A0B(r7, r4)
            r0 = 1
            boolean r10 = X.C34732Kr.A00(r7, r0)
            goto L_0x0048
        L_0x0141:
            boolean r0 = r11 instanceof X.AnonymousClass1vD
            if (r0 == 0) goto L_0x0163
            X.C04220Ms.A0B(r7, r4)
            r10 = 0
            X.0TJ r12 = X.AnonymousClass0TJ.A05
            r0 = 36319656499615018(0x8108890006152a, double:3.032035245650063E-306)
            boolean r0 = X.C63803iN.A0E(r12, r7, r0)
            if (r0 != 0) goto L_0x0048
            r0 = 36317607799820130(0x8106ac00000f62, double:3.030739639650324E-306)
            boolean r0 = X.C63803iN.A0E(r12, r7, r0)
            if (r0 != 0) goto L_0x00f9
            goto L_0x0048
        L_0x0163:
            boolean r0 = r11 instanceof X.AnonymousClass1vC
            if (r0 == 0) goto L_0x0170
            X.C04220Ms.A0B(r7, r4)
            boolean r10 = X.C62183Xq.A00(r7)
            goto L_0x0048
        L_0x0170:
            boolean r0 = r11 instanceof X.AnonymousClass1vB
            if (r0 == 0) goto L_0x017f
            X.C04220Ms.A0B(r7, r4)
            boolean r0 = X.C62183Xq.A00(r7)
            r10 = r0 ^ 1
            goto L_0x0048
        L_0x017f:
            boolean r0 = r11 instanceof X.AnonymousClass1vA
            if (r0 == 0) goto L_0x018c
            X.C04220Ms.A0B(r7, r4)
            boolean r10 = X.C67373zR.A08(r7)
            goto L_0x0048
        L_0x018c:
            boolean r0 = r11 instanceof X.AnonymousClass1v9
            if (r0 == 0) goto L_0x019e
            if (r19 == 0) goto L_0x01ce
            java.lang.Object r1 = r12.A02
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            boolean r10 = X.C04220Ms.A0I(r1, r0)
            goto L_0x0048
        L_0x019e:
            boolean r0 = r11 instanceof X.AnonymousClass1v8
            if (r0 == 0) goto L_0x01b0
            if (r19 == 0) goto L_0x01ce
            java.lang.Object r1 = r12.A00
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            boolean r10 = X.C04220Ms.A0I(r1, r0)
            goto L_0x0048
        L_0x01b0:
            X.C04220Ms.A0B(r7, r4)
            X.3ZL r0 = X.AnonymousClass3Zu.A03(r7)
            android.content.SharedPreferences r1 = r0.A04
            java.lang.String r0 = "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"
            boolean r0 = X.C18190wL.A1X(r1, r0)
            r10 = 0
            if (r0 != 0) goto L_0x0048
            if (r19 == 0) goto L_0x0048
            java.lang.Object r0 = r12.A01
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x0048
            goto L_0x00f9
        L_0x01ce:
            r10 = 0
            goto L_0x0048
        L_0x01d1:
            boolean r0 = r9 instanceof X.C28871vh
            if (r0 == 0) goto L_0x01db
            X.1vh r1 = (X.C28871vh) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x01db:
            boolean r0 = r9 instanceof X.C28861vg
            if (r0 == 0) goto L_0x01e5
            X.1vg r1 = (X.C28861vg) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x01e5:
            boolean r0 = r9 instanceof X.C28851vf
            if (r0 == 0) goto L_0x01ef
            X.1vf r1 = (X.C28851vf) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x01ef:
            boolean r0 = r9 instanceof X.C28841ve
            if (r0 == 0) goto L_0x01f9
            X.1ve r1 = (X.C28841ve) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x01f9:
            boolean r0 = r9 instanceof X.C28831vd
            if (r0 == 0) goto L_0x0203
            X.1vd r1 = (X.C28831vd) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x0203:
            boolean r0 = r9 instanceof X.C28821vc
            if (r0 == 0) goto L_0x020d
            X.1vc r1 = (X.C28821vc) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x020d:
            boolean r0 = r9 instanceof X.C28811vb
            if (r0 == 0) goto L_0x0217
            X.1vb r1 = (X.C28811vb) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x0217:
            boolean r0 = r9 instanceof X.C28801va
            if (r0 == 0) goto L_0x0221
            X.1va r1 = (X.C28801va) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x0221:
            boolean r0 = r9 instanceof X.AnonymousClass1vZ
            if (r0 == 0) goto L_0x022b
            X.1vZ r1 = (X.AnonymousClass1vZ) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x022b:
            X.1vY r1 = (X.AnonymousClass1vY) r1
            java.util.List r0 = r1.A00
            goto L_0x0026
        L_0x0231:
            X.2AD r0 = r9.A01()
            boolean r0 = X.C63423hS.A03(r8, r0, r7)
            if (r0 != 0) goto L_0x0246
            java.lang.String r0 = "Failed Eligibility: Shared Config Checks"
            X.AnonymousClass0LU.A0B(r2, r0)
            if (r21 == 0) goto L_0x00ac
            java.lang.String r0 = "impression_cooldown"
            goto L_0x00a9
        L_0x0246:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61813Vs.A05(X.2AC, com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0600000_I2, com.instagram.service.session.UserSession, X.3VY, java.lang.String):boolean");
    }

    public static C207916c A00(CXPNoticeStateRepository cXPNoticeStateRepository, String str) {
        C313425p r0 = (C313425p) EnumHelper.A00(str, C313425p.A0O);
        C04220Ms.A06(r0);
        return cXPNoticeStateRepository.A00(r0);
    }

    public final AnonymousClass2AD A01() {
        if (this instanceof C28881vi) {
            return AnonymousClass2AD.A0C;
        }
        if (this instanceof C28871vh) {
            return AnonymousClass2AD.A0F;
        }
        if (this instanceof C28861vg) {
            return AnonymousClass2AD.A03;
        }
        if (this instanceof C28851vf) {
            return AnonymousClass2AD.A0A;
        }
        if (this instanceof C28841ve) {
            return AnonymousClass2AD.A09;
        }
        if (this instanceof C28831vd) {
            return AnonymousClass2AD.A08;
        }
        if (this instanceof C28821vc) {
            return AnonymousClass2AD.A07;
        }
        if (this instanceof C28811vb) {
            return AnonymousClass2AD.A0Q;
        }
        if (this instanceof C28801va) {
            return AnonymousClass2AD.A0P;
        }
        if (this instanceof AnonymousClass1vZ) {
            return AnonymousClass2AD.A0M;
        }
        return AnonymousClass2AD.A0L;
    }

    public final String A02() {
        if (this instanceof C28881vi) {
            return "BOTTOMSHEET_UNIFIED_STORIES_FEED";
        }
        if (this instanceof C28871vh) {
            return "BOTTOMSHEET_XAR_REELS";
        }
        if (this instanceof C28861vg) {
            return "BOTTOMSHEET_CCP_REELS";
        }
        if (this instanceof C28851vf) {
            return "BOTTOMSHEET_MIGRATION_STORIES_WAVE2";
        }
        if (this instanceof C28841ve) {
            return "BOTTOMSHEET_MIGRATION_STORIES_WAVE1";
        }
        if (this instanceof C28831vd) {
            return "BOTTOMSHEET_MIGRATION_FEED_WAVE2";
        }
        if (this instanceof C28821vc) {
            return "BOTTOMSHEET_MIGRATION_FEED_WAVE1";
        }
        if (this instanceof C28811vb) {
            return "DIALOG_STORY";
        }
        if (this instanceof C28801va) {
            return "DIALOG_FEED";
        }
        if (this instanceof AnonymousClass1vZ) {
            return "DIALOG_AFTERSHARE_STORY";
        }
        return "DIALOG_AFTERSHARE_FEED";
    }

    public final void A03(Fragment fragment, UserSession userSession, AnonymousClass3TG r7) {
        if (this instanceof C28871vh) {
            C04220Ms.A0B(r7, 2);
            C63783iL.A06(fragment, userSession, r7);
        } else if (this instanceof C28861vg) {
            boolean A1X = C18240wQ.A1X(r7);
            C22661Yy A002 = C49372rH.A00(r7);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C37032Jj9 A0L = C18210wN.A0L(userSession);
                A0L.A0d = A1X;
                C18200wM.A16(activity, A002, A0L);
            }
        }
    }

    public final boolean A06(AnonymousClass3CX r18) {
        boolean z;
        C83004qd r14;
        UserSession userSession;
        AnonymousClass2AC r12;
        Activity activity;
        C62753ae r10;
        AnonymousClass3CX r0 = r18;
        if (this instanceof C28881vi) {
            C04220Ms.A0B(r0, 0);
            C83004qd r7 = r0.A04;
            if (r7 == null) {
                r7 = AnonymousClass4LO.A00;
            }
            boolean A04 = A04();
            AnonymousClass3ZC r2 = AnonymousClass1v3.A06;
            Activity activity2 = r0.A00;
            UserSession userSession2 = r0.A03;
            AnonymousClass2AC r5 = r0.A02;
            if (!A04) {
                return r2.A03(activity2, activity2.getApplicationContext(), r5, userSession2, r7, false);
            }
            AnonymousClass0wJ.A1Q(r5, r7);
            C697049r.A01(activity2, r5, userSession2, r7, false);
        } else if (this instanceof C28851vf) {
            C04220Ms.A0B(r0, 0);
            C83004qd r72 = r0.A04;
            if (r72 == null) {
                r72 = AnonymousClass4LN.A00;
            }
            C62753ae r3 = AnonymousClass1v4.A0A;
            Activity activity3 = r0.A00;
            UserSession userSession3 = r0.A03;
            int A042 = C18230wP.A04(AnonymousClass2AD.A0A, 0);
            boolean z2 = true;
            if (!(A042 == 16 || A042 == 17)) {
                z2 = false;
            }
            r3.A03(activity3, r0.A02, userSession3, r72, z2, false);
        } else if (this instanceof C28841ve) {
            C04220Ms.A0B(r0, 0);
            C83004qd r73 = r0.A04;
            if (r73 == null) {
                r73 = AnonymousClass4LM.A00;
            }
            C62753ae r32 = AnonymousClass1v4.A0A;
            Activity activity4 = r0.A00;
            UserSession userSession4 = r0.A03;
            int A043 = C18230wP.A04(AnonymousClass2AD.A09, 0);
            boolean z3 = true;
            if (!(A043 == 16 || A043 == 17)) {
                z3 = false;
            }
            r32.A03(activity4, r0.A02, userSession4, r73, z3, true);
            return true;
        } else {
            if (this instanceof C28831vd) {
                C04220Ms.A0B(r0, 0);
                r14 = r0.A04;
                if (r14 == null) {
                    r14 = AnonymousClass4LL.A00;
                }
                boolean A044 = A04();
                r10 = AnonymousClass1v4.A0A;
                activity = r0.A00;
                userSession = r0.A03;
                int A045 = C18230wP.A04(AnonymousClass2AD.A08, 0);
                z = true;
                if (!(A045 == 16 || A045 == 17)) {
                    z = false;
                }
                r12 = r0.A02;
                if (A044) {
                    r10.A03(activity, r12, userSession, r14, z, false);
                }
            } else if (this instanceof C28821vc) {
                C04220Ms.A0B(r0, 0);
                C83004qd r142 = r0.A04;
                if (r142 == null) {
                    r142 = AnonymousClass4LK.A00;
                }
                boolean A046 = A04();
                r10 = AnonymousClass1v4.A0A;
                activity = r0.A00;
                userSession = r0.A03;
                int A047 = C18230wP.A04(AnonymousClass2AD.A07, 0);
                boolean z4 = true;
                if (!(A047 == 16 || A047 == 17)) {
                    z4 = false;
                }
                r12 = r0.A02;
                if (A046) {
                    r10.A03(activity, r12, userSession, r14, z, true);
                    return true;
                }
            } else {
                if (!(this instanceof C28811vb)) {
                    if (this instanceof C28801va) {
                        C04220Ms.A0B(r0, 0);
                        Context context = r0.A01;
                        if (context == null) {
                            return false;
                        }
                        UserSession userSession5 = r0.A03;
                        C04220Ms.A0C(context, "null cannot be cast to non-null type android.content.Context");
                        C67213zA.A00(context, userSession5);
                    } else if (!(this instanceof AnonymousClass1vZ) && !(this instanceof AnonymousClass1vY)) {
                        return false;
                    }
                }
                C04220Ms.A0B(r0, 0);
                return false;
            }
            return r10.A04(activity, r12, userSession, r14, z);
        }
        return true;
    }

    public C61813Vs(UserSession userSession) {
        this.A00 = userSession;
    }

    public final boolean A04() {
        int ordinal = A01().ordinal();
        if (ordinal != 20 && ordinal != 12 && ordinal != 13 && ordinal != 16 && ordinal != 17) {
            return true;
        }
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36325720994751707L);
    }
}
