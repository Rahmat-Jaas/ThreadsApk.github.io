package com.instagram.common.api.base;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1TX;
import X.AnonymousClass1cj;
import X.AnonymousClass36X;
import X.AnonymousClass3LY;
import X.AnonymousClass3WS;
import X.AnonymousClass3WY;
import X.AnonymousClass3XX;
import X.AnonymousClass3Y8;
import X.AnonymousClass3ZL;
import X.AnonymousClass3zG;
import X.AnonymousClass46P;
import X.C04180Mo;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C21891So;
import X.C22161Tp;
import X.C28161tl;
import X.C61453Tm;
import X.C62183Xq;
import X.C63873iU;
import X.C67233zC;
import X.C67263zF;
import X.C695949f;
import X.C83884s9;
import X.C86074wE;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape0S1300000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxACallbackShape0S1300000_1_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = str;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int i;
        int i2;
        switch (this.A04) {
            case 0:
                i = C14030oh.A03(-392018145);
                super.onFail(r6);
                AnonymousClass1cj.A05((AnonymousClass1cj) this.A01, (RegFlowExtras) this.A02, this.A03);
                i2 = -1501506091;
                break;
            case 1:
                i = AnonymousClass0wJ.A00(-478390949, r6);
                AnonymousClass3zG.A03((AnonymousClass3zG) this.A02, this.A03, ((C04180Mo) this.A00).A00, ((C04180Mo) this.A01).A00);
                super.onFail(r6);
                i2 = -138213999;
                break;
            case 2:
                i = C14030oh.A03(-487367605);
                C83884s9 r0 = (C83884s9) this.A01;
                if (r0 != null) {
                    r0.Bxr(r6);
                }
                i2 = -119294338;
                break;
            default:
                super.onFail(r6);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onFinish() {
        if (2 - this.A04 != 0) {
            super.onFinish();
            return;
        }
        int A032 = C14030oh.A03(-562159813);
        ((AnonymousClass3Y8) this.A00).A01.remove(this.A03);
        C14030oh.A0A(-603587886, A032);
    }

    public final void onStart() {
        if (this.A04 != 0) {
            super.onStart();
            return;
        }
        int A032 = C14030oh.A03(1598134867);
        super.onStart();
        ((AnonymousClass1cj) this.A01).A0K.A01();
        C14030oh.A0A(2076668558, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        boolean equalsIgnoreCase3;
        boolean equalsIgnoreCase4;
        String str;
        Object obj2 = obj;
        switch (this.A04) {
            case 0:
                i = C14030oh.A03(-382469146);
                AnonymousClass1TX r6 = (AnonymousClass1TX) obj2;
                int A032 = C14030oh.A03(-1551275834);
                int A033 = C14030oh.A03(-159289508);
                super.onSuccess(r6);
                RegFlowExtras regFlowExtras = (RegFlowExtras) this.A00;
                if (regFlowExtras != null) {
                    regFlowExtras.A0g = r6.A01;
                    regFlowExtras.A0m = r6.A02;
                    regFlowExtras.A0X = r6.A00;
                    regFlowExtras.A11 = r6.A03;
                }
                C14030oh.A0A(-1710448244, A033);
                AnonymousClass1cj.A05((AnonymousClass1cj) this.A01, (RegFlowExtras) this.A02, this.A03);
                C14030oh.A0A(532788274, A032);
                i2 = 200387740;
                break;
            case 1:
                i = C14030oh.A03(360062698);
                C22161Tp r62 = (C22161Tp) obj2;
                int A034 = C14030oh.A03(-494564636);
                C04220Ms.A0B(r62, 0);
                if (((C04180Mo) this.A00).A00) {
                    C67263zF r10 = ((AnonymousClass3zG) this.A02).A02;
                    String str2 = this.A03;
                    C67263zF.A00(r10, str2, r62.A02);
                    UserSession userSession = r10.A01;
                    C28161tl A012 = AnonymousClass3WS.A01(userSession);
                    AnonymousClass0wJ.A11(C28161tl.A02(A012), "xpost_to_facebook_feed_server_mtime_in_second", r62.A00);
                    if (!"UNSET_DEFAULT".equals(r62.A02)) {
                        C67263zF.A03.A02(userSession, str2, "ON".equals(r62.A02), false);
                    } else {
                        C67263zF.A03(r10, str2, C62183Xq.A00(userSession), false);
                    }
                }
                if (((C04180Mo) this.A01).A00) {
                    C67233zC r9 = ((AnonymousClass3zG) this.A02).A04;
                    String str3 = this.A03;
                    String str4 = r62.A04;
                    String str5 = "ON";
                    if (str4 == null) {
                        equalsIgnoreCase4 = false;
                    } else {
                        equalsIgnoreCase4 = str4.equalsIgnoreCase(str5);
                    }
                    C61453Tm r14 = C67233zC.A08;
                    UserSession userSession2 = r9.A06;
                    boolean A002 = C61453Tm.A00(userSession2);
                    r9.A00 = r62.A05;
                    boolean A003 = C61453Tm.A00(userSession2);
                    if (equalsIgnoreCase4) {
                        str = str5;
                    } else {
                        str = "OFF";
                    }
                    AnonymousClass3WY.A01(userSession2, str3, "server_setting_fetch_success", str, A003);
                    boolean A004 = C61453Tm.A00(userSession2);
                    String str6 = "OFF";
                    if (equalsIgnoreCase4) {
                        str6 = str5;
                    }
                    AnonymousClass3WY.A01(userSession2, str3, "server_setting_fetch_success", str6, A004);
                    String str7 = r62.A04;
                    if (str7 == null || (!str7.equalsIgnoreCase("UNSET_DEFAULT"))) {
                        C28161tl A013 = AnonymousClass3WS.A01(userSession2);
                        AnonymousClass0wJ.A11(C28161tl.A02(A013), "xpost_to_facebook_story_server_mtime_in_second", r62.A01);
                        if (equalsIgnoreCase4 == A002) {
                            boolean A005 = C61453Tm.A00(userSession2);
                            if (!equalsIgnoreCase4) {
                                str5 = "OFF";
                            }
                            AnonymousClass3WY.A01(userSession2, str3, "server_setting_fetch_result_unchanged", str5, A005);
                        } else {
                            r14.A01(userSession2, AnonymousClass006.A00, str3, equalsIgnoreCase4, false);
                            C67233zC.A00(r9);
                        }
                    } else {
                        C67233zC.A02(r9, AnonymousClass006.A00, str3, A002, false);
                    }
                }
                AnonymousClass3zG r7 = (AnonymousClass3zG) this.A02;
                C695949f r102 = r7.A03;
                String str8 = this.A03;
                String str9 = r62.A03;
                if (str9 == null) {
                    equalsIgnoreCase = false;
                } else {
                    equalsIgnoreCase = str9.equalsIgnoreCase("ON");
                }
                UserSession userSession3 = r102.A01;
                AnonymousClass3ZL r8 = r102.A02;
                AnonymousClass3WY.A00(userSession3, str8, "server_setting_fetch_success", String.valueOf(equalsIgnoreCase), C18190wL.A1X(r8.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"));
                String str10 = r62.A03;
                if (str10 == null) {
                    equalsIgnoreCase2 = false;
                } else {
                    equalsIgnoreCase2 = str10.equalsIgnoreCase("ON");
                }
                r8.A04(equalsIgnoreCase2);
                C86074wE r1 = r102.A04;
                String str11 = r62.A03;
                if (str11 == null) {
                    equalsIgnoreCase3 = false;
                } else {
                    equalsIgnoreCase3 = str11.equalsIgnoreCase("ON");
                }
                C86074wE.A01(r1, equalsIgnoreCase3);
                AnonymousClass36X r12 = r7.A00;
                if (r12 != null) {
                    "ON".equals(r62.A02);
                    r12.A00.A0B.notifyDataSetChanged();
                }
                C14030oh.A0A(1185811093, A034);
                i2 = 1678979976;
                break;
            case 2:
                i = C14030oh.A03(863863808);
                C21891So r63 = (C21891So) obj2;
                int A035 = C14030oh.A03(-1187414877);
                AnonymousClass3LY.A00((C10300i6) this.A02).CWx(new AnonymousClass46P(r63.A00));
                C83884s9 r13 = (C83884s9) this.A01;
                if (r13 != null) {
                    r13.CNG(r63.A00);
                }
                C14030oh.A0A(-627035808, A035);
                i2 = 1044783312;
                break;
            default:
                super.onSuccess(obj2);
                return;
        }
        C14030oh.A0A(i2, i);
    }
}
