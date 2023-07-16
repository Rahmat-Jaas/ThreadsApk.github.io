package com.instagram.nux.impl.dynamicflow.onboarding;

import X.AnonymousClass006;
import X.AnonymousClass051;
import X.AnonymousClass05O;
import X.AnonymousClass0PA;
import X.AnonymousClass0TJ;
import X.AnonymousClass1eI;
import X.AnonymousClass2AQ;
import X.AnonymousClass35X;
import X.AnonymousClass3IX;
import X.AnonymousClass3LY;
import X.AnonymousClass3z3;
import X.AnonymousClass44V;
import X.AnonymousClass473;
import X.AnonymousClass4A9;
import X.AnonymousClass4F3;
import X.C04220Ms;
import X.C10300i6;
import X.C11630kW;
import X.C12560m7;
import X.C130667qT;
import X.C14030oh;
import X.C15730rn;
import X.C18180wK;
import X.C18190wL;
import X.C27551sh;
import X.C27581sn;
import X.C31155GhB;
import X.C313625r;
import X.C38040KHr;
import X.C58723Gw;
import X.C62313Yf;
import X.C63263h8;
import X.C63803iN;
import X.C67073yp;
import X.C67123yu;
import X.C688145o;
import X.C74014Vp;
import X.C81244nR;
import X.C81604o4;
import X.C82394pY;
import X.C82844qM;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.redex.IDxEListenerShape165S0200000_1_I2;
import com.facebook.redex.IDxPredicateShape351S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class OnboardingActivity extends BaseFragmentActivity implements C11630kW, C82844qM, C81244nR {
    public AnonymousClass44V A00;
    public AnonymousClass3z3 A01;
    public UserSession A02;
    public AnonymousClass35X A03 = null;

    public final String getModuleName() {
        return "onboarding_activity";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025b, code lost:
        r8.A00.Ben(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0261, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b6, code lost:
        r1.setArguments(r3);
        X.AnonymousClass3z3.A01(r1, r10, r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d9, code lost:
        X.AnonymousClass3z3.A01(r1, r10, r2, r0.name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r10 = this;
            X.44V r1 = r10.A00
            X.3IX r0 = r1.A00
            if (r0 != 0) goto L_0x000a
            r10.finish()
        L_0x0009:
            return
        L_0x000a:
            X.3z3 r8 = r10.A01
            java.lang.Object r2 = r1.A02
            X.3yp r2 = (X.C67073yp) r2
            r9 = 0
            r6 = 1
            r5 = 2
            X.C04220Ms.A0B(r2, r5)
            X.4o4 r3 = r0.A00
            java.lang.Enum r3 = (java.lang.Enum) r3
            r4 = r3
            X.2AQ r4 = (X.AnonymousClass2AQ) r4
            int[] r1 = X.AnonymousClass31E.A00
            int r0 = r4.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x00e0;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00b3;
                case 4: goto L_0x01aa;
                case 5: goto L_0x00fb;
                case 6: goto L_0x00fb;
                case 7: goto L_0x008d;
                case 8: goto L_0x019d;
                case 9: goto L_0x0190;
                case 10: goto L_0x0183;
                case 11: goto L_0x002f;
                case 12: goto L_0x002f;
                case 13: goto L_0x0171;
                case 14: goto L_0x015f;
                case 15: goto L_0x0072;
                case 16: goto L_0x0152;
                case 17: goto L_0x01be;
                case 18: goto L_0x0145;
                case 19: goto L_0x0131;
                case 20: goto L_0x011e;
                default: goto L_0x0028;
            }
        L_0x0028:
            X.4qM r1 = r8.A00
            r0 = -2
            r1.Ben(r0)
            return
        L_0x002f:
            com.instagram.service.session.UserSession r2 = r2.A00
            if (r2 == 0) goto L_0x0009
            java.lang.Class<com.instagram.nux.cal.model.DpActionContent> r1 = com.instagram.nux.cal.model.DpActionContent.class
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r1 = r2.A00(r1)
            com.instagram.nux.cal.model.DpActionContent r1 = (com.instagram.nux.cal.model.DpActionContent) r1
            if (r1 == 0) goto L_0x025b
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x025b
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.String r4 = "FACEBOOK"
            java.lang.String r3 = r1.A02
            java.lang.String r0 = "Required value was null."
            if (r3 == 0) goto L_0x01eb
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x01e6
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x01e1
            com.instagram.discoverpeople.model.FindPeopleButtonOverride r0 = new com.instagram.discoverpeople.model.FindPeopleButtonOverride
            r0.<init>(r3, r2, r1)
            r5.putParcelable(r4, r0)
            java.lang.String r0 = "Error! Trying to access DiscoverPeoplePlugin without an instance!"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0072:
            com.instagram.service.session.UserSession r5 = r2.A00
            if (r5 == 0) goto L_0x0009
            java.lang.Class<X.3AS> r1 = X.AnonymousClass3AS.class
            X.4UY r0 = X.AnonymousClass4UY.A00
            java.lang.Object r7 = r5.A01(r1, r0)
            r4 = r7
            X.3AS r4 = (X.AnonymousClass3AS) r4
            X.C04220Ms.A06(r4)
            java.lang.Object r1 = r5.A01(r1, r0)
            X.3AS r1 = (X.AnonymousClass3AS) r1
            monitor-enter(r1)
            goto L_0x01f7
        L_0x008d:
            com.instagram.service.session.UserSession r4 = r2.A00
            if (r4 == 0) goto L_0x0009
            r0 = 44
            kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70 r3 = new kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70
            r3.<init>(r8, r0)
            X.3yu r0 = X.C67123yu.A04
            if (r0 != 0) goto L_0x00a3
            X.3yu r0 = new X.3yu
            r0.<init>(r4)
            X.C67123yu.A04 = r0
        L_0x00a3:
            X.49N r1 = r0.A03
            X.4L5 r0 = new X.4L5
            r0.<init>(r4, r3)
            androidx.fragment.app.Fragment r1 = r1.A01(r10, r0)
            r0 = 0
            X.AnonymousClass3z3.A01(r1, r10, r2, r0)
            return
        L_0x00b3:
            com.instagram.service.session.UserSession r2 = r2.A00
            if (r2 == 0) goto L_0x0009
            X.38d r0 = X.AnonymousClass3Zq.A00(r2)
            if (r0 == 0) goto L_0x025b
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A00
            X.AnonymousClass3Zq.A02(r10, r2, r1, r0)
            return
        L_0x00c5:
            com.instagram.service.session.UserSession r1 = r2.A00
            if (r1 == 0) goto L_0x0009
            java.lang.String r0 = "fetch_email_in_nux"
            X.0rn r0 = X.C63313hF.A00(r1, r0)
            X.C18180wK.A1K(r0, r1)
            com.instagram.common.task.IDxLTaskShape48S0200000_1_I2 r0 = new com.instagram.common.task.IDxLTaskShape48S0200000_1_I2
            r0.<init>(r5, r10, r1)
            X.C31155GhB.A03(r0)
            X.4qM r0 = r8.A00
            r0.Ben(r6)
            return
        L_0x00e0:
            com.instagram.service.session.UserSession r3 = r2.A00
            if (r3 == 0) goto L_0x0009
            X.38d r0 = X.AnonymousClass3Zq.A00(r3)
            if (r0 != 0) goto L_0x00f5
            r2 = 0
            X.1hi r1 = new X.1hi
            r1.<init>(r3)
            java.lang.String r0 = "auto_confirmation"
            X.AnonymousClass3Zq.A01(r10, r1, r3, r0, r2)
        L_0x00f5:
            X.4qM r0 = r8.A00
            r0.Ben(r6)
            return
        L_0x00fb:
            X.C04220Ms.A06(r3)
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.2AQ r0 = X.AnonymousClass2AQ.IDENTITY_SYNCING_AFTER_NUX_LINKING
            if (r4 != r0) goto L_0x011b
            X.2A6 r0 = X.AnonymousClass2A6.A04
        L_0x0108:
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ONBOARDING_STEP"
            r3.putString(r0, r1)
            X.C63463hW.A03()
            X.1Yr r1 = new X.1Yr
            r1.<init>()
            goto L_0x01b6
        L_0x011b:
            X.2A6 r0 = X.AnonymousClass2A6.A03
            goto L_0x0108
        L_0x011e:
            X.C63463hW.A03()
            android.os.Bundle r0 = X.C18180wK.A06()
            X.1cp r1 = new X.1cp
            r1.<init>()
            r1.setArguments(r0)
            X.2AQ r0 = X.AnonymousClass2AQ.PUSH_OPT_IN
            goto L_0x01d9
        L_0x0131:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            java.lang.String r1 = "NUX"
            java.lang.String r0 = "ShareProfileFragment.NavControlVariant"
            r3.putString(r0, r1)
            X.1Yq r1 = new X.1Yq
            r1.<init>()
            goto L_0x01b6
        L_0x0145:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1QZ r1 = new X.1QZ
            r1.<init>()
            goto L_0x01b6
        L_0x0152:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1Yv r1 = new X.1Yv
            r1.<init>()
            goto L_0x01b6
        L_0x015f:
            X.C63463hW.A03()
            android.os.Bundle r0 = X.C18180wK.A06()
            X.Iat r1 = new X.Iat
            r1.<init>()
            r1.setArguments(r0)
            X.2AQ r0 = X.AnonymousClass2AQ.DISCOVER_ACCOUNTS
            goto L_0x01d9
        L_0x0171:
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            r3.putBoolean(r0, r6)
            X.C63463hW.A03()
            X.9Ne r1 = new X.9Ne
            r1.<init>()
            goto L_0x01b6
        L_0x0183:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1cR r1 = new X.1cR
            r1.<init>()
            goto L_0x01b6
        L_0x0190:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1ay r1 = new X.1ay
            r1.<init>()
            goto L_0x01b6
        L_0x019d:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1Y6 r1 = new X.1Y6
            r1.<init>()
            goto L_0x01b6
        L_0x01aa:
            X.C63463hW.A03()
            android.os.Bundle r3 = X.AnonymousClass3z3.A00(r2)
            X.1cQ r1 = new X.1cQ
            r1.<init>()
        L_0x01b6:
            r1.setArguments(r3)
            r0 = 0
            X.AnonymousClass3z3.A01(r1, r10, r2, r0)
            return
        L_0x01be:
            com.instagram.service.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r0.getUserId()
            if (r0 == 0) goto L_0x025b
            X.C63463hW.A03()
            android.os.Bundle r0 = X.AnonymousClass3z3.A00(r2)
            X.1dk r1 = new X.1dk
            r1.<init>()
            r1.setArguments(r0)
            X.2AQ r0 = X.AnonymousClass2AQ.FOLLOW_FROM_LOGGED_IN_ACCOUNTS
        L_0x01d9:
            java.lang.String r0 = r0.name()
            X.AnonymousClass3z3.A01(r1, r10, r2, r0)
            return
        L_0x01e1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01e6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01eb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01f0:
            java.lang.String r0 = "Error! Trying to access DiscoverPeoplePlugin without an instance!"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x01f7:
            X.38c r3 = r1.A00     // Catch:{ all -> 0x0258 }
            monitor-exit(r1)
            if (r3 == 0) goto L_0x025b
            java.lang.String r0 = "nux_add_email_source_info"
            X.0rn r2 = X.C63313hF.A00(r5, r0)
            monitor-enter(r7)
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x0255 }
            monitor-exit(r7)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0237;
                case 1: goto L_0x0234;
                default: goto L_0x020d;
            }
        L_0x020d:
            java.lang.String r1 = "UNKNOWN"
        L_0x020f:
            java.lang.String r0 = "device_oauth_available"
            r2.A0D(r0, r1)
            boolean r0 = r3.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "email_fetched_with_oauth"
            r2.A09(r0, r1)
            java.lang.String r1 = "email_prefetch_location"
            java.lang.String r0 = "none"
            r2.A0D(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "prefetch_without_oauth"
            r2.A09(r0, r1)
            X.C18180wK.A1K(r2, r5)
            monitor-enter(r7)
            goto L_0x023a
        L_0x0234:
            java.lang.String r1 = "NOT_AVAILABLE"
            goto L_0x020f
        L_0x0237:
            java.lang.String r1 = "AVAILABLE"
            goto L_0x020f
        L_0x023a:
            r4.A02 = r6     // Catch:{ all -> 0x0255 }
            monitor-exit(r7)
            java.lang.String r4 = r3.A00
            X.Drz r3 = X.C63463hW.A00(r10, r5)
            X.1cd r2 = new X.1cd
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass0wJ.A0E(r5)
            java.lang.String r0 = "argument_email"
            r1.putString(r0, r4)
            X.C18180wK.A0x(r1, r2, r3)
            return
        L_0x0255:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0258:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x025b:
            X.4qM r1 = r8.A00
            r0 = -1
            r1.Ben(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity.A00():void");
    }

    public final void Ben(int i) {
        this.A00.Ben(i);
        A00();
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onBackPressed() {
        AnonymousClass2AQ r0;
        AnonymousClass2AQ r02;
        AnonymousClass2AQ r03;
        AnonymousClass3IX r04 = this.A00.A00;
        if (r04 != null) {
            C81604o4 r1 = r04.A00;
            AnonymousClass2AQ r05 = AnonymousClass2AQ.FOLLOW_FROM_LOGGED_IN_ACCOUNTS;
            if ((r1 == r05 && !A01(r05)) || ((r1 == (r0 = AnonymousClass2AQ.DISCOVER_PEOPLE) && !A01(r0)) || ((r1 == (r02 = AnonymousClass2AQ.DISCOVER_ACCOUNTS) && !A01(r02)) || (r1 == (r03 = AnonymousClass2AQ.BASED_ON_YOUR_INTERESTS) && !A01(r03))))) {
                super.onBackPressed();
            }
        }
    }

    private boolean A01(AnonymousClass2AQ r4) {
        C12560m7 supportFragmentManager = getSupportFragmentManager();
        int A0I = supportFragmentManager.A0I();
        if (A0I == 0) {
            return true;
        }
        return r4.name().equals(((AnonymousClass05O) ((AnonymousClass051) supportFragmentManager.A0D.get(A0I - 1))).A0A);
    }

    public final void A0D(Bundle bundle) {
        Bundle A0C = C18190wL.A0C(this);
        A0C.getClass();
        UserSession A0V = C18180wK.A0V(A0C);
        this.A02 = A0V;
        C27551sh A032 = C27551sh.A03(A0V.getUserId());
        this.A01 = new AnonymousClass3z3(this);
        if (A032 == null) {
            A032 = C27551sh.A03((String) null);
            if (A032 == null) {
                C67073yp r2 = new C67073yp();
                r2.A01 = C313625r.EMAIL;
                r2.A02 = AnonymousClass006.A00;
                UserSession userSession = this.A02;
                r2.A00 = userSession;
                A032 = new C27551sh(this, userSession, r2, new C27581sn());
                A032.A03.add(new AnonymousClass4F3(this));
            }
            C15730rn A002 = C15730rn.A00(this, "ig_dynamic_onboarding_missing_business_logic");
            A002.A09("found", C18180wK.A0Y());
            C18180wK.A1K(A002, this.A02);
        }
        this.A00 = A032;
        C58723Gw r0 = A032.A01;
        AnonymousClass2AQ r1 = AnonymousClass2AQ.AUTO_CROSSPOSTING;
        List list = r0.A01;
        IDxPredicateShape351S0100000_1_I2 iDxPredicateShape351S0100000_1_I2 = new IDxPredicateShape351S0100000_1_I2(r1, 0);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!iDxPredicateShape351S0100000_1_I2.apply(it.next())) {
                i++;
            } else if (i != -1) {
                C313625r r12 = null;
                AnonymousClass44V r22 = this.A00;
                if (r22 instanceof C27551sh) {
                    r12 = ((C67073yp) r22.A02).A01;
                }
                UserSession userSession2 = this.A02;
                C04220Ms.A0B(userSession2, 0);
                C67123yu r3 = C67123yu.A04;
                if (r3 == null) {
                    r3 = new C67123yu(userSession2);
                    C67123yu.A04 = r3;
                }
                if (r12 == null) {
                    r12 = C313625r.NONE;
                }
                synchronized (r3) {
                    C04220Ms.A0B(r12, 1);
                    if (!C67123yu.A00(this, r3, r12)) {
                        AnonymousClass473 r23 = new AnonymousClass473(this, r3, r12);
                        AnonymousClass3LY.A00(r3.A02).A01(r23, C688145o.class);
                        r3.A00 = r23;
                    }
                }
            }
        }
        if (this.A00.A00 == null) {
            Ben(1);
        } else {
            A00();
        }
        UserSession userSession3 = this.A02;
        C74014Vp r4 = new C74014Vp(this);
        C130667qT A003 = C130667qT.A00((SparseArray) null, this, this, userSession3);
        AnonymousClass4A9 A004 = C63263h8.A00(userSession3, "com.bloks.www.privacy.consent.prompt.action", r4);
        A004.A00 = new AnonymousClass1eI(A003, "ONBOARDING_ACTIVITY");
        C31155GhB.A03(A004);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(1361493835);
        super.onCreate(bundle);
        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A02, 36326773260035838L).booleanValue()) {
            AnonymousClass35X r3 = new AnonymousClass35X();
            this.A03 = r3;
            UserSession userSession = this.A02;
            C04220Ms.A0B(userSession, 1);
            r3.A00 = new IDxEListenerShape165S0200000_1_I2(4, this, userSession);
            AnonymousClass35X r0 = this.A03;
            C38040KHr kHr = C38040KHr.A01;
            Class<AnonymousClass0PA> cls = AnonymousClass0PA.class;
            C82394pY r02 = r0.A00;
            if (r02 == null) {
                C04220Ms.A0E("logoutEventListener");
                throw null;
            }
            kHr.A03(r02, cls);
        }
        C62313Yf.A00().A02();
        C14030oh.A07(246807973, A002);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(1741122087);
        super.onDestroy();
        AnonymousClass35X r0 = this.A03;
        if (r0 != null) {
            C38040KHr kHr = C38040KHr.A01;
            Class<AnonymousClass0PA> cls = AnonymousClass0PA.class;
            C82394pY r02 = r0.A00;
            if (r02 == null) {
                C04220Ms.A0E("logoutEventListener");
                throw null;
            } else {
                kHr.A04(r02, cls);
                this.A03 = null;
            }
        }
        C14030oh.A07(960124643, A002);
    }
}
