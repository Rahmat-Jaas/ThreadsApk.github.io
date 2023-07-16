package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0fS;
import X.AnonymousClass0wJ;
import X.AnonymousClass14O;
import X.AnonymousClass27W;
import X.AnonymousClass2LO;
import X.AnonymousClass2MW;
import X.AnonymousClass3J5;
import X.AnonymousClass3TN;
import X.C04220Ms;
import X.C13330nS;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C195210b;
import X.C22855ChP;
import X.C22856ChS;
import X.C25237DiI;
import X.C25828Dsm;
import X.C26743EUq;
import X.C27952Ew2;
import X.C303820v;
import X.C304020x;
import X.C30608GMw;
import X.C320329x;
import X.C32145H7b;
import X.C34640IcN;
import X.C40320Lca;
import X.C62793ak;
import X.C63813iO;
import X.C685344e;
import X.C81394ni;
import X.C82404pZ;
import X.C83224qz;
import X.C85834vq;
import X.CAp;
import X.ChQ;
import X.ChR;
import X.EAB;
import android.app.Activity;
import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2620000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0101000_I2_9;

public class IDxConsumerShape141S0200000_1_I2 implements C82404pZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxConsumerShape141S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        String str;
        C40320Lca lca;
        C83224qz A002;
        int i2;
        C62793ak r3;
        switch (this.A02) {
            case 0:
                if (C04220Ms.A0I(obj, ChR.A00)) {
                    return;
                }
                if (C04220Ms.A0I(obj, C22856ChS.A00)) {
                    EAB.A02(((C195210b) this.A01).A06);
                    return;
                } else if (C04220Ms.A0I(obj, ChQ.A00) || (obj instanceof C22855ChP)) {
                    C195210b r2 = (C195210b) this.A01;
                    r2.A0E.D7t(C304020x.OFF);
                    AnonymousClass2MW.A00(r2.A07).A00((Activity) this.A00, C303820v.FULLSCREEN_MODAL, AnonymousClass006.A01, AnonymousClass006.A0C);
                    return;
                } else {
                    return;
                }
            case 1:
                C81394ni r9 = (C81394ni) obj;
                C04220Ms.A0B(r9, 0);
                C18250wR.A1C(this.A00);
                if (r9 instanceof C32145H7b) {
                    C18210wN.A14(((AnonymousClass3TN) this.A01).A01);
                    return;
                }
                Object A003 = C30608GMw.A00(r9);
                C04220Ms.A06(A003);
                KtCSuperShape0S5010000_I2 ktCSuperShape0S5010000_I2 = (KtCSuperShape0S5010000_I2) A003;
                AnonymousClass3TN r7 = (AnonymousClass3TN) this.A01;
                C34640IcN icN = r7.A01;
                if (icN.isResumed()) {
                    String str2 = ktCSuperShape0S5010000_I2.A04;
                    if (str2 == null || (str = ktCSuperShape0S5010000_I2.A00) == null) {
                        Context context = r7.A00;
                        if (ktCSuperShape0S5010000_I2.A05) {
                            i = 2131826051;
                        } else if (AnonymousClass0fS.A09(context.getApplicationContext())) {
                            AnonymousClass2LO.A00("DirectWeakConnectionError");
                            i = 2131826087;
                        } else {
                            i = 2131825938;
                        }
                        C63813iO.A03(context, (String) null, i, 0);
                        return;
                    }
                    C25828Dsm A0W = C18190wL.A0W(r7.A00);
                    A0W.A02 = str2;
                    A0W.A0p(str);
                    C18180wK.A1M(A0W);
                    AnonymousClass0wJ.A1K(A0W);
                    String str3 = ktCSuperShape0S5010000_I2.A03;
                    if (str3 != null && str3.length() != 0 && "ADULT_MINOR_GROUP_RESTRICTION".equalsIgnoreCase(str3)) {
                        C320329x r6 = C320329x.A02;
                        C85834vq r1 = r7.A03;
                        String obj2 = r1.toString();
                        boolean z = r1 instanceof MsysThreadId;
                        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(icN, r7.A04), "mwb_actor_experience_event"), 2424);
                        if (AnonymousClass0wJ.A1U(A0I)) {
                            C18220wO.A1E(AnonymousClass27W.GROUP_RESTRICTION_DIALOG_SHOW, A0I);
                            A0I.A0O(r6, "restriction_type");
                            if (z) {
                                lca = C40320Lca.IG_DIRECT_ENCRYPTED_GROUP_THREAD;
                            } else {
                                lca = C40320Lca.IG_DIRECT_GROUP_THREAD;
                            }
                            C18240wQ.A13(lca, A0I);
                            AnonymousClass14O r22 = new AnonymousClass14O();
                            r22.A09("id", -1L);
                            r22.A07("is_fbid", false);
                            A0I.A0P(r22, "other_user");
                            A0I.A0T("thread_id", obj2);
                            A0I.Bb4();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C26743EUq eUq = (C26743EUq) obj;
                if (!eUq.A06() || !((C685344e) eUq.A03()).isOk()) {
                    KtCSuperShape0S2620000_I2 ktCSuperShape0S2620000_I2 = (KtCSuperShape0S2620000_I2) this.A00;
                    if (ktCSuperShape0S2620000_I2 != null) {
                        ktCSuperShape0S2620000_I2.A07 = "enabled";
                    }
                    CAp cAp = (CAp) this.A01;
                    cAp.A03.A0H(ktCSuperShape0S2620000_I2);
                    A002 = AnonymousClass3J5.A00(cAp);
                    i2 = 11;
                    r3 = cAp;
                } else {
                    C62793ak r32 = (C62793ak) this.A01;
                    A002 = AnonymousClass3J5.A00(r32);
                    i2 = 10;
                    r3 = r32;
                }
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0101000_I2_9(r3, (C146958n9) null, i2), A002, 3);
                return;
        }
    }
}
