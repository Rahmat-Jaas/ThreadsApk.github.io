package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape100S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape10S0110000_1_I2;
import com.facebook.redex.IDxCListenerShape149S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape2S1300000_1_I2;
import com.facebook.redex.IDxCListenerShape5S1300000_1_I2;
import com.facebook.redex.IDxCListenerShape6S0201000_1_I2;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape8S0210000_1_I2;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.barcelona.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsDraftRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.3iC  reason: invalid class name and case insensitive filesystem */
public final class C63723iC {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final C12560m7 A02;
    public final C11630kW A03;
    public final C695549b A04;
    public final AnonymousClass3GU A05;
    public final AnonymousClass39K A06;
    public final AnonymousClass38Y A07;
    public final UserSession A08;
    public final AnonymousClass06E A09;

    public static void A05(C63723iC r12, Integer num) {
        C63723iC r4 = r12;
        UserSession userSession = r12.A08;
        String userId = userSession.getUserId();
        C63533hk A022 = C63533hk.A02(userSession);
        C18180wK.A1K(C15730rn.A00(r12.A03, "logout_d3_loaded"), userSession);
        Integer num2 = num;
        IDxCListenerShape2S1300000_1_I2 iDxCListenerShape2S1300000_1_I2 = new IDxCListenerShape2S1300000_1_I2(r4, num2, A022, userId, 1);
        IDxCListenerShape2S1300000_1_I2 iDxCListenerShape2S1300000_1_I22 = new IDxCListenerShape2S1300000_1_I2(r12, num2, A022, userId, 2);
        C25828Dsm A0W = C18190wL.A0W(r4.A01);
        Integer num3 = AnonymousClass006.A0C;
        int i = 2131834561;
        if (num2 == num3) {
            i = 2131834564;
        }
        A0W.A0L(i);
        int i2 = 2131834562;
        if (num2 == num3) {
            i2 = 2131834565;
        }
        A0W.A0K(i2);
        A0W.A0P(iDxCListenerShape2S1300000_1_I2, 2131834560);
        A0W.A0O(iDxCListenerShape2S1300000_1_I22, 2131831869);
        AnonymousClass0wJ.A1K(A0W);
        A022.A0G(userId);
    }

    public static void A07(C63723iC r11, boolean z) {
        C63723iC r9 = r11;
        r11.A00();
        UserSession userSession = r11.A08;
        String userId = userSession.getUserId();
        C63533hk A022 = C63533hk.A02(userSession);
        A022.A0G(userId);
        AnonymousClass1YS r8 = new AnonymousClass1YS();
        r8.A00 = z;
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0M = C18180wK.A0X();
        FragmentActivity fragmentActivity = r9.A01;
        A0L.A0R = fragmentActivity.getResources().getString(2131832010);
        A0L.A0W = true;
        A0L.A0A = new IDxCListenerShape5S1300000_1_I2(r8, r9, A022, userId, 7);
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18296294393118938L)) {
            A0L.A0O = C18190wL.A0h(fragmentActivity.getResources(), AnonymousClass0wJ.A0Y(userSession).BK7(), 2131832013);
        }
        C37383Jqm A002 = A0L.A00();
        A002.A0I(true);
        C37383Jqm.A00(r9.A00.requireContext(), r8, A002);
    }

    private void A00() {
        AnonymousClass3IR r3 = AnonymousClass3IR.A00;
        if (r3 != null) {
            r3.A02(this.A08, this.A01, "1949557911961250");
        }
    }

    public static void A01(AnonymousClass3LL r8, C63723iC r9, boolean z) {
        UserSession userSession = r9.A08;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3LL.A00(userSession, "logout_password_saving_logout_dialog_viewed", "logout_spi", "logout", "logout_interaction", (String) null, (HashMap) null);
        C25828Dsm A0W = C18190wL.A0W(r9.A01);
        A0W.A0L(2131822810);
        AnonymousClass25l.A00(new IDxCListenerShape8S0210000_1_I2(r8, r9, 1, z), A0W, 2131822809);
        C18230wP.A1M(A0W, r9, r8, 36, 2131822808);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A03(C63723iC r7) {
        List list;
        UserSession userSession = r7.A08;
        C18180wK.A1K(C15730rn.A00(r7.A03, "logout_d4_loaded"), userSession);
        C62813an A012 = C62813an.A01(userSession);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A012.A04(userSession).iterator();
        while (it.hasNext()) {
            A0v.add(C18220wO.A0c(it).BK7());
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        User A032 = A012.A03(userSession);
        if (A032 != null) {
            AccountFamily accountFamily = (AccountFamily) A012.A02.get(A032.getId());
            if (accountFamily != null) {
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                List A002 = C50492t5.A00(list);
                HashSet A0u = C18200wM.A0u();
                Iterator it2 = A002.iterator();
                while (it2.hasNext()) {
                    C72144Mm.A00(A0u, it2);
                }
                C62353Yv r0 = A012.A00;
                if (r0 != null) {
                    C1366783w it3 = C18240wQ.A0J(r0.A00).iterator();
                    while (it3.hasNext()) {
                        AnonymousClass3H7 r1 = (AnonymousClass3H7) it3.next();
                        if (A0u.contains(r1.A00())) {
                            A0v2.add(r1.A01());
                        }
                    }
                }
            }
        }
        A0v.addAll(A0v2);
        C63533hk.A02(userSession).A0I(userSession.getUserId());
        FragmentActivity fragmentActivity = r7.A01;
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        Resources resources = fragmentActivity.getResources();
        int i = 2131830118;
        int size = A0v.size();
        if (size != 1) {
            if (size == 2) {
                i = 2131830120;
            } else if (size == 3) {
                i = 2131830119;
            } else if (size == 4) {
                i = 2131830117;
            } else if (size == 5) {
                i = 2131830116;
            }
        }
        A0W.A02 = C16370sw.A01(resources, (String[]) A0v.toArray(new String[A0v.size()]), i).toString();
        C18180wK.A1O(A0W, r7, 108, 2131830113);
        C18180wK.A1N(A0W, r7, 107, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r4.A05() == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C63723iC r5, java.lang.Integer r6) {
        /*
            com.instagram.service.session.UserSession r0 = r5.A08
            X.3an r4 = X.C62813an.A01(r0)
            com.instagram.user.model.User r5 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r0 = r5.getId()
            java.util.Map r1 = r4.A02
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r5.getId()
            boolean r0 = r4.A07(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r5.getId()
            java.lang.Object r0 = r1.get(r0)
            com.instagram.accountlinking.model.AccountFamily r0 = (com.instagram.accountlinking.model.AccountFamily) r0
            java.util.List r0 = r0.A04
            java.util.List r0 = X.C50492t5.A00(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0034:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r2 = r3.next()
            X.4Mm r2 = (X.C72144Mm) r2
            X.0BO r1 = r4.A01
            java.lang.String r0 = r2.A01()
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0034
        L_0x004c:
            java.lang.String r1 = r2.A02()
            java.lang.String r0 = X.C63593hs.A01()
            boolean r3 = r1.equals(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r6 == r0) goto L_0x0063
            boolean r1 = r4.A05()
            r0 = 0
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            if (r3 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r2.A02()
            com.instagram.user.model.MicroUserDict r0 = r2.A00
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            r0.getClass()
            X.C63593hs.A03(r0, r1)
        L_0x0076:
            return
        L_0x0077:
            X.4Mm r2 = new X.4Mm
            r2.<init>((com.instagram.user.model.User) r5)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63723iC.A04(X.3iC, java.lang.Integer):void");
    }

    public static void A06(C63723iC r14, Integer num, HashMap hashMap) {
        int i;
        int i2;
        AnonymousClass3AD r11 = new AnonymousClass3AD(r14.A01, r14.A00, r14.A08);
        AnonymousClass38P r13 = new AnonymousClass38P(r14, num);
        AnonymousClass2A9 r12 = AnonymousClass2A9.A09;
        Activity activity = r11.A00;
        C25828Dsm A0W = C18190wL.A0W(activity);
        C18230wP.A11(activity, A0W, R.drawable.ig_illustrations_illo_account_linking);
        UserSession userSession = r11.A02;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r4, userSession, 36325441820238944L)) {
            i = 2131836944;
        } else {
            i = 2131837709;
            if (C04220Ms.A0I(C63803iN.A0C(AnonymousClass0TJ.A06, userSession, 36878689442726056L), "truncated_question")) {
                i = 2131836943;
            }
        }
        A0W.A0L(i);
        if (C63803iN.A0E(r4, userSession, 36325441820238944L)) {
            i2 = 2131836942;
        } else {
            i2 = 2131837708;
            if (C04220Ms.A0I(C63803iN.A0C(AnonymousClass0TJ.A06, userSession, 36878689442726056L), "truncated_question")) {
                i2 = 2131836941;
            }
        }
        A0W.A0K(i2);
        A0W.A0q(true);
        A0W.A0r(true);
        Resources resources = activity.getResources();
        int i3 = 2131830183;
        if (C63803iN.A0E(r4, userSession, 36325441820238944L)) {
            i3 = 2131830184;
        }
        HashMap hashMap2 = hashMap;
        A0W.A0c(new IDxCListenerShape20S0400000_1_I2(4, (Object) hashMap2, (Object) r11, (Object) r12, (Object) r13), resources.getString(i3));
        Resources resources2 = activity.getResources();
        int i4 = 2131830185;
        if (C63803iN.A0E(r4, userSession, 36325441820238944L)) {
            i4 = 2131830186;
        }
        A0W.A0a(C18250wR.A0E(hashMap2, r12, r11, 22), resources2.getString(i4));
        A0W.A0M(new IDxCListenerShape100S0300000_1_I2(2, r12, r11, hashMap2));
        AnonymousClass0wJ.A1K(A0W);
        C62383Zj.A00(C318729h.CAL_FLOW, r12, AnonymousClass2A8.A04, userSession, hashMap2);
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "fx_cal_right_before_logout_sso_upsell_seen", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.C63173fJ.A05(X.AnonymousClass0TJ.A05, 18313010405779462L) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(X.C63723iC r6, boolean r7) {
        /*
            com.instagram.service.session.UserSession r0 = r6.A08
            X.1tl r5 = X.AnonymousClass3WS.A01(r0)
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "logout_scenario"
            java.lang.String r0 = "all_accounts"
            r4.put(r1, r0)
            X.49b r1 = r6.A04
            androidx.fragment.app.FragmentActivity r0 = r6.A01
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x002d
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18313010405779462(0x410f9600012806, double:1.8980861903258354E-307)
            boolean r1 = X.C63173fJ.A05(r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0044
            if (r7 == 0) goto L_0x003e
            android.content.SharedPreferences r1 = r5.A00
            java.lang.String r0 = "fx_cal_right_before_logout_deprio_other_upsell_seen"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0044
        L_0x003e:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            A06(r6, r0, r4)
            return r3
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63723iC.A0A(X.3iC, boolean):boolean");
    }

    public final void A0B() {
        UserSession userSession = this.A08;
        List A042 = C62813an.A01(userSession).A04(userSession);
        Integer num = AnonymousClass006.A01;
        A04(this, num);
        FragmentActivity fragmentActivity = this.A01;
        if (A042 == null) {
            A042 = AnonymousClass0wJ.A0v();
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        new AnonymousClass1jJ(fragmentActivity, this.A00, fragmentActivity2, this.A02, this.A03, userSession, num, A042, A0v, true, C63533hk.A06(userSession)).A02(new Void[0]);
    }

    public final void A0C(Integer num) {
        ClipsDraftRepository A002 = C24089D8m.A00(this.A01, this.A08);
        D2O d2o = D2O.CLIPS;
        AnonymousClass38N r4 = new AnonymousClass38N(this, num);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(A002, r4, d2o, (C146958n9) null, 9), A002.A01, 3);
    }

    public final void A0D(Integer num, boolean z) {
        Integer num2 = num;
        AnonymousClass1mX r3 = new AnonymousClass1mX(this, num);
        UserSession userSession = this.A08;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312251975926665L)) {
            AnonymousClass0gN.A00().AKp(r3);
        } else {
            r3.run();
        }
        FragmentActivity fragmentActivity = this.A01;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        new AnonymousClass1jJ(fragmentActivity, this.A00, fragmentActivity2, this.A02, this.A03, userSession, num2, A0v, z).A02(new Void[0]);
    }

    public final boolean A0E() {
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18304609449677673L) || !new AnonymousClass3Y9(this.A01, this.A08).A02(AnonymousClass006.A0C)) {
            return false;
        }
        return true;
    }

    public C63723iC(Fragment fragment, FragmentActivity fragmentActivity, C12560m7 r5, AnonymousClass06E r6, C11630kW r7, UserSession userSession) {
        fragmentActivity.getClass();
        this.A01 = fragmentActivity;
        this.A08 = userSession;
        this.A00 = fragment;
        r5.getClass();
        this.A02 = r5;
        this.A09 = r6;
        r7.getClass();
        this.A03 = r7;
        this.A07 = new AnonymousClass38Y(fragmentActivity);
        AnonymousClass39K r0 = AnonymousClass39K.A02;
        if (r0 == null) {
            r0 = new AnonymousClass39K();
            AnonymousClass39K.A02 = r0;
        }
        this.A06 = r0;
        this.A05 = new AnonymousClass3GU();
        C04220Ms.A0B(userSession, 0);
        this.A04 = (C695549b) userSession.A01(C695549b.class, new KtLambdaShape76S0100000_I2_56(userSession, 0));
    }

    public static void A02(C63723iC r13) {
        r13.A00();
        AnonymousClass3LL r5 = new AnonymousClass3LL();
        HashMap A0y = AnonymousClass0wJ.A0y();
        UserSession userSession = r13.A08;
        A0y.put("uids", userSession.multipleAccountHelper.A00.A04((User) null).toString());
        A0y.put("uids_count", String.valueOf(userSession.multipleAccountHelper.A0B()));
        boolean A0E = r13.A0E();
        C15730rn A002 = C15730rn.A00(r13.A03, "logout_d2_loaded");
        A002.A0D("type", "is_all");
        C18180wK.A1K(A002, userSession);
        if (A0E) {
            AnonymousClass3LL.A00(userSession, "logout_password_saving_multiaccount_logout_all_dialog_viewed", "logout_spi", "logout", "logout_interaction", (String) null, (HashMap) null);
        }
        C25828Dsm A0W = C18190wL.A0W(r13.A01);
        A0W.A0L(2131830122);
        A0W.A0P(new C64003jG(r5, r13, A0y, A0E), 2131830113);
        A0W.A0O(new IDxCListenerShape8S0210000_1_I2(r5, r13, 2, A0E), 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A08(C63723iC r7, boolean z) {
        r7.A00();
        UserSession userSession = r7.A08;
        String userId = userSession.getUserId();
        C36242Qo.A00(r7.A03, userSession, "logout_d1_loaded", userId, z);
        C63533hk.A02(userSession).A0G(userId);
        AnonymousClass38O r3 = new AnonymousClass38O(r7, userId);
        FragmentActivity fragmentActivity = r7.A01;
        AnonymousClass3ZB r5 = new AnonymousClass3ZB(fragmentActivity);
        r5.A0D.setText(2131830123);
        r5.A06.setVisibility(0);
        String string = fragmentActivity.getString(2131832014);
        CheckBox checkBox = r5.A08;
        checkBox.setChecked(z);
        checkBox.setText(string);
        checkBox.setOnCheckedChangeListener(new IDxCListenerShape149S0200000_1_I2(8, r3, r5));
        checkBox.setVisibility(0);
        r5.A05.setVisibility(0);
        r5.A0A.setVisibility(8);
        IDxCListenerShape77S0200000_1_I2 iDxCListenerShape77S0200000_1_I2 = new IDxCListenerShape77S0200000_1_I2(73, (Object) r5, (Object) r3);
        String string2 = r5.A02.getString(2131830113);
        TextView textView = r5.A0C;
        textView.setText(string2);
        textView.setOnClickListener(new IDxCListenerShape6S0201000_1_I2(-1, 5, iDxCListenerShape77S0200000_1_I2, r5));
        textView.setVisibility(0);
        View view = r5.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        r5.A01(C18220wO.A0O(r7, 105), 2131823054);
        C13950oZ.A00(r5.A00());
    }

    public static void A09(C63723iC r4, boolean z) {
        r4.A00();
        C18180wK.A1K(C15730rn.A00(r4.A03, "logout_d2_loaded"), r4.A08);
        C25828Dsm A0W = C18190wL.A0W(r4.A01);
        A0W.A0L(2131830123);
        A0W.A0P(new IDxCListenerShape10S0110000_1_I2(1, r4, z), 2131830113);
        C18180wK.A1N(A0W, r4, 109, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }
}
