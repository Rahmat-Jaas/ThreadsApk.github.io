package com.instagram.business.promote.api.apiwrapper;

import X.AnonymousClass0wJ;
import X.AnonymousClass1S1;
import X.AnonymousClass1S2;
import X.AnonymousClass1im;
import X.AnonymousClass3XX;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C22481Yg;
import X.C22611Yt;
import X.C35394Iu2;
import X.C37077Jk9;
import X.C37741K2b;
import X.C63813iO;
import X.C85814vo;
import android.content.Context;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;

public class IDxWImplShape107S0100000_1_I2 extends AnonymousClass1im {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxWImplShape107S0100000_1_I2(C37741K2b k2b, C22611Yt r3) {
        super(k2b);
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean A02(C85814vo r2) {
        KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2;
        if (this.A01 != 0) {
            AnonymousClass1S1 r22 = (AnonymousClass1S1) r2;
            C04220Ms.A0B(r22, 0);
            ktCSuperShape0S2200000_I2 = r22.A00;
        } else {
            AnonymousClass1S2 r23 = (AnonymousClass1S2) r2;
            C04220Ms.A0B(r23, 0);
            ktCSuperShape0S2200000_I2 = r23.A00;
        }
        return C18220wO.A1U(ktCSuperShape0S2200000_I2);
    }

    public final void onFail(AnonymousClass3XX r14) {
        int i;
        int i2;
        String str;
        String str2;
        if (this.A01 != 0) {
            i = C14030oh.A03(622702638);
            C04220Ms.A0B(r14, 0);
            Throwable th = r14.A01;
            String str3 = "";
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = str3;
            }
            C22611Yt r5 = (C22611Yt) this.A00;
            C37741K2b k2b = r5.A00;
            if (k2b != null) {
                String obj = C35394Iu2.A0U.toString();
                if (str2 != null) {
                    str3 = str2;
                }
                C37741K2b.A0C(k2b, obj, "save_draft", str3, (String) null, C22611Yt.A00(r5));
                String A0g = C18190wL.A0g(AnonymousClass0wJ.A0B(r5), 2131833669);
                Context requireContext = r5.requireContext();
                if (A0g.length() == 0) {
                    A0g = C18180wK.A0g(r5, 2131833669);
                }
                C63813iO.A02(requireContext, A0g, (String) null, 0);
                UserSession userSession = r5.A03;
                if (userSession == null) {
                    C18210wN.A0m();
                    throw null;
                }
                if (C37077Jk9.A02(userSession)) {
                    super.onFail(r14);
                }
                i2 = -679562169;
                C14030oh.A0A(i2, i);
                return;
            }
            str = "promoteLogger";
        } else {
            i = C14030oh.A03(2129411406);
            C04220Ms.A0B(r14, 0);
            C22481Yg r52 = (C22481Yg) this.A00;
            C37741K2b k2b2 = r52.A02;
            if (k2b2 != null) {
                k2b2.A0W(C35394Iu2.A19.toString(), "delete_draft", r14.A01);
                String A0g2 = C18190wL.A0g(AnonymousClass0wJ.A0B(r52), 2131833277);
                Context requireContext2 = r52.requireContext();
                if (A0g2.length() == 0) {
                    A0g2 = C18180wK.A0g(r52, 2131833277);
                }
                C63813iO.A02(requireContext2, A0g2, (String) null, 0);
                UserSession userSession2 = r52.A05;
                if (userSession2 == null) {
                    str = "userSession";
                } else {
                    if (C37077Jk9.A02(userSession2)) {
                        super.onFail(r14);
                    }
                    i2 = -868750867;
                    C14030oh.A0A(i2, i);
                    return;
                }
            }
            str = "promoteLogger";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onFinish() {
        int A03;
        int i;
        String str;
        if (this.A01 != 0) {
            A03 = C14030oh.A03(281169133);
            C22611Yt.A01((C22611Yt) this.A00, true);
            i = -466479604;
        } else {
            A03 = C14030oh.A03(1271628951);
            C22481Yg r2 = (C22481Yg) this.A00;
            View view = r2.A01;
            if (view == null) {
                str = "discardButtonRow";
            } else {
                view.setClickable(true);
                View view2 = r2.A00;
                if (view2 == null) {
                    str = "cancelButtonRow";
                } else {
                    view2.setClickable(true);
                    i = 2024676257;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C14030oh.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        if (this.A01 != 0) {
            int A03 = C14030oh.A03(-484544888);
            AnonymousClass1S1 r14 = (AnonymousClass1S1) obj;
            int A032 = C14030oh.A03(-2080077240);
            C04220Ms.A0B(r14, 0);
            KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2 = r14.A00;
            str = "promoteLogger";
            C22611Yt r5 = (C22611Yt) this.A00;
            if (ktCSuperShape0S2200000_I2 != null) {
                C37741K2b k2b = r5.A00;
                if (k2b != null) {
                    C37741K2b.A0C(k2b, C35394Iu2.A0U.toString(), "save_draft", ktCSuperShape0S2200000_I2.A03, (String) null, C22611Yt.A00(r5));
                    KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I22 = r14.A00;
                    if (ktCSuperShape0S2200000_I22 != null) {
                        String str2 = ktCSuperShape0S2200000_I22.A02;
                        Context requireContext = r5.requireContext();
                        if (str2 == null || str2.length() == 0) {
                            str2 = C18180wK.A0g(r5, 2131833669);
                        }
                        C63813iO.A02(requireContext, str2, (String) null, 0);
                        C18180wK.A12(r5);
                    } else {
                        IllegalStateException A0a = C18180wK.A0a("Required value was null.");
                        C14030oh.A0A(-1346488685, A032);
                        throw A0a;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            C37741K2b k2b2 = r5.A00;
            if (k2b2 != null) {
                C37741K2b.A0A(k2b2, C35394Iu2.A0U.toString(), "save_draft", C22611Yt.A00(r5));
                PromoteData promoteData = r5.A02;
                if (promoteData != null) {
                    promoteData.A2Y = true;
                    C18190wL.A1A(r5);
                }
            }
            C04220Ms.A0E(str);
            throw null;
            UserSession userSession = r5.A03;
            if (userSession != null) {
                if (C37077Jk9.A02(userSession)) {
                    super.A01(r14);
                }
                C14030oh.A0A(-1558330418, A032);
                C14030oh.A0A(-703304702, A03);
                return;
            }
            str = "userSession";
            C04220Ms.A0E(str);
            throw null;
        }
        int A033 = C14030oh.A03(-1560950571);
        AnonymousClass1S2 r142 = (AnonymousClass1S2) obj;
        int A034 = C14030oh.A03(-1505409307);
        C04220Ms.A0B(r142, 0);
        KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I23 = r142.A00;
        str = "promoteLogger";
        C22481Yg r52 = (C22481Yg) this.A00;
        if (ktCSuperShape0S2200000_I23 != null) {
            C37741K2b k2b3 = r52.A02;
            if (k2b3 != null) {
                k2b3.A0R(C35394Iu2.A19.toString(), "delete_draft", ktCSuperShape0S2200000_I23.A03);
                KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I24 = r142.A00;
                if (ktCSuperShape0S2200000_I24 != null) {
                    String str3 = ktCSuperShape0S2200000_I24.A02;
                    Context requireContext2 = r52.requireContext();
                    if (str3 == null || str3.length() == 0) {
                        str3 = C18180wK.A0g(r52, 2131833277);
                    }
                    C63813iO.A02(requireContext2, str3, (String) null, 0);
                    C18180wK.A12(r52);
                } else {
                    IllegalStateException A0a2 = C18180wK.A0a("Required value was null.");
                    C14030oh.A0A(-1799593049, A034);
                    throw A0a2;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C37741K2b k2b4 = r52.A02;
        if (k2b4 != null) {
            k2b4.A0Q(C35394Iu2.A19.toString(), "delete_draft");
            PromoteData promoteData2 = r52.A04;
            if (promoteData2 != null) {
                promoteData2.A2Y = true;
                C18190wL.A1A(r52);
            }
        }
        C04220Ms.A0E(str);
        throw null;
        UserSession userSession2 = r52.A05;
        if (userSession2 != null) {
            if (C37077Jk9.A02(userSession2)) {
                super.A01(r142);
            }
            C14030oh.A0A(1945853894, A034);
            C14030oh.A0A(-2110626056, A033);
            return;
        }
        str = "userSession";
        C04220Ms.A0E(str);
        throw null;
        str = "promoteData";
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxWImplShape107S0100000_1_I2(C37741K2b k2b, C22481Yg r3, String str) {
        super(k2b, str);
        this.A00 = r3;
    }
}
