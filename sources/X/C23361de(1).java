package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.service.session.UserSession;
import com.instagram.ui.bottomsheet.intf.IDxCListenerShape179S0100000_1_I2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public final class C23361de extends I5x implements C11630kW, AnonymousClass0RJ {
    public static final String __redex_internal_original_name = "AccountSwitchFragment";
    public Context A00;
    public Intent A01;
    public C18890y4 A02;
    public UserSession A03;
    public String A04;
    public List A05;
    public boolean A06;
    public C82704q8 A07 = AnonymousClass4EK.A00;
    public final C82394pY A08 = C18220wO.A0P(this, 43);
    public final C39797L0o A09 = new IDxCListenerShape179S0100000_1_I2(this, 2);

    public final String getModuleName() {
        return "account_switch_fragment";
    }

    public static void A02(C23361de r4, String str, boolean z, boolean z2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4.A03), "account_switch_user_tapped"), 5);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0Q("is_logged_in", C18210wN.A0R(A0I, C18190wL.A0Z(A0I, "entry_point", r4.A04, z), "is_current_user_in", z2));
            C18240wQ.A15(A0I, "account_switch_fragment");
            A0I.A0T(AnonymousClass3QE.A00(34, 8, 76), str);
            A0I.Bb4();
        }
        C63453hV.A02(r4.A03, "native", r4.A04);
        if (r4.A04 == "direct_inbox") {
            C30978Gcg.A00(r4.A03);
            TraceLogger.broadcastEvent(10000008, 0, (List) null);
            new GFJ(AnonymousClass01V.A0p).A00();
        }
    }

    public final C10300i6 A0I() {
        return this.A03;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        C018908v.A00(this);
        this.A05.setOnItemClickListener(this.A02);
        C018908v.A00(this);
        this.A05.setDivider((Drawable) null);
        UserSession userSession = this.A03;
        C04220Ms.A0B(userSession, 0);
        if (userSession.multipleAccountHelper.A0L()) {
            C018908v.A00(this);
            this.A05.setOnItemLongClickListener(this.A02);
        }
        C38040KHr.A01.A03(this.A08, AnonymousClass459.class);
        List list = this.A05;
        HashSet A0u = C18200wM.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18190wL.A1T(A0u, it);
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A03), "account_switcher_impression"), 6);
        A0I.A00.A7d(A0u, "array_accounts_logged_in");
        A0I.Bb4();
        C08350dD A002 = C08360dF.A00();
        AnonymousClass0wJ.A12(C18220wO.A0B(A002), "account_switcher_impression_last_log_time", System.currentTimeMillis());
        UserSession userSession2 = this.A03;
        C04220Ms.A0B(userSession2, 0);
        long j = C18200wM.A0C().getLong("long_press_account_switcher_row_to_create_shortcut_tooltip_last_impression_time", -1);
        long j2 = C18200wM.A0C().getLong("dedicated_account_shortcut_last_tap_time", -1);
        long j3 = C18200wM.A0C().getLong("long_press_account_switcher_row_to_create_shortcut_last_timestamp", -1);
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (((long) C18200wM.A0C().getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0)) < 2) {
            z = true;
        }
        boolean z2 = false;
        if (604800000 <= currentTimeMillis - j) {
            z2 = true;
        }
        boolean z3 = false;
        if (604800000 <= currentTimeMillis - j2) {
            z3 = true;
        }
        boolean z4 = false;
        if (604800000 <= currentTimeMillis - j3) {
            z4 = true;
        }
        if (userSession2.multipleAccountHelper.A0L() && z && z2 && z4 && z3) {
            view2.postDelayed(new AnonymousClass4SR(Html.fromHtml(this.A00.getResources().getString(2131830187)), view2, this), 500);
        }
    }

    public static void A01(C23361de r4) {
        C25745DrH A0b = C18220wO.A0b(r4.requireActivity());
        if (A0b != null) {
            A0b.A0C();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4.A03), "account_switch_add_account_sheet_dismissed"), 0);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0Q("is_short_copy", C18190wL.A0Z(A0I, "entry_point", r4.A04, false));
                A0I.Bb4();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cb, code lost:
        if (X.C63173fJ.A05(r3, 18307770545675494L) == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cf, code lost:
        if (r18 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d1, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
        if (X.C63173fJ.A05(r3, 18307770545609957L) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00de, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e0, code lost:
        if (r18 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e2, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ec, code lost:
        if (X.C63173fJ.A05(r3, 18307770545741031L) != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ee, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ef, code lost:
        r22 = new X.C18890y4(r0, r0, r0.A03, r26, r0.A05, r28, r29, r12, r31, r32, r33);
        r0.A02 = r22;
        A0F(r22);
        r4 = r0.A03;
        X.C04220Ms.A0B(r4, 0);
        r3 = r0.A05.size();
        r2 = ((X.AnonymousClass3SC) r4.A01(X.AnonymousClass3SC.class, new kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67(r4, 29))).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0125, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0126, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0127, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0128, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012a, code lost:
        if (r3 <= 1) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0131, code lost:
        if (r3 <= 5) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0133, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0134, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        r3 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(X.C13330nS.A02(r0.A03), "account_switch_button_tapped"), 4);
        r2 = r0.A03;
        r4 = X.AnonymousClass0wJ.A0v();
        r6 = r2.multipleAccountHelper.A0B();
        r5 = X.C62353Yv.A00(r2);
        r2 = X.C18200wM.A0u();
        r2.addAll(r5.A00.keySet());
        r2.addAll(r5.A01.keySet());
        r1 = r2.size();
        X.C18200wM.A1U(r4, r6);
        X.C18200wM.A1U(r4, r6 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x017b, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x017d, code lost:
        r3.A0T("entry_point", r0.A04);
        r3.A0S("number_of_accounts", java.lang.Long.valueOf(X.C18190wL.A08(r4.get(1))));
        r3.A0S("number_of_logged_in_accounts", java.lang.Long.valueOf(X.C18190wL.A08(r4.get(0))));
        X.C18240wQ.A15(r3, "account_switch_fragment");
        r3.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01af, code lost:
        r9 = r0.A03;
        r15 = X.C59363Kn.A01(r9);
        r1 = (long) X.C59363Kn.A00(r0.A03);
        r16 = X.C67313zL.A06(r0.A03);
        r17 = X.C63793iM.A01();
        r11 = X.AnonymousClass0wJ.A0d(r0.A03.getUserId());
        r12 = X.AnonymousClass0wJ.A0d(r0.A03.getUserId());
        r4 = r0.A04;
        X.C04220Ms.A0B(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e7, code lost:
        switch(r4.hashCode()) {
            case -1814342561: goto L_0x0236;
            case -657162262: goto L_0x0241;
            case -309425751: goto L_0x024c;
            case 441111834: goto L_0x0257;
            case 660917936: goto L_0x0262;
            case 1434631203: goto L_0x026d;
            case 2005378358: goto L_0x0279;
            default: goto L_0x01ea;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01ea, code lost:
        r8 = X.C319629q.UNKNOWN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ec, code lost:
        X.C63453hV.A00(r8, r9, false, r11, r12, r1, r15, r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f0, code lost:
        if (r32 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01f2, code lost:
        if (r7 == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01f4, code lost:
        X.AnonymousClass3NS.A01(r0.A03).A00.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ff, code lost:
        r2 = (X.C82704q8) new X.AnonymousClass7IU((X.C147138nS) new X.C65933wi(), (X.AnonymousClass06C) r0).A01(X.C195510h.class);
        r0.A07 = r2;
        X.C18210wN.A16(r0, r2.AA8(r0.A03), 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021e, code lost:
        r1 = X.C18220wO.A0b(requireActivity());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0226, code lost:
        if (r1 == null) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0228, code lost:
        r1.A0A(r0.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x022d, code lost:
        X.C14030oh.A09(-1142796779, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0235, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x023c, code lost:
        if (r4.equals("double_tap_tab_bar") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x023e, code lost:
        r8 = X.C319629q.TAB_BAR_DOUBLE_TAP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0247, code lost:
        if (r4.equals("long_press_tab_bar") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0249, code lost:
        r8 = X.C319629q.TAB_BAR_LONG_PRESS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0252, code lost:
        if (r4.equals("profile") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0254, code lost:
        r8 = X.C319629q.PROFILE_TITLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x025d, code lost:
        if (r4.equals("unknown_nt_action") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x025f, code lost:
        r8 = X.C319629q.UNKNOWN_NT_ACTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0268, code lost:
        if (r4.equals("direct_inbox") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x026a, code lost:
        r8 = X.C319629q.DIRECT_INBOX;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0273, code lost:
        if (r4.equals("settings") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0275, code lost:
        r8 = X.C319629q.SETTINGS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x027f, code lost:
        if (r4.equals("bookmark") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0281, code lost:
        r8 = X.C319629q.BOOKMARK;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0285  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r35) {
        /*
            r34 = this;
            r0 = -336929187(0xffffffffebeade5d, float:-5.6787745E26)
            int r21 = X.C14030oh.A02(r0)
            r0 = r34
            r1 = r35
            super.onCreate(r1)
            android.os.Bundle r2 = r0.requireArguments()
            com.instagram.service.session.UserSession r1 = X.C18180wK.A0V(r2)
            r0.A03 = r1
            java.lang.String r20 = "entry_point"
            r1 = r20
            java.lang.String r1 = r2.getString(r1)
            r0.A04 = r1
            android.content.Context r1 = r0.getContext()
            r0.A00 = r1
            java.lang.String r1 = "in_app_deeplink_intent"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.A01 = r1
            java.lang.String r1 = "show_add_account_button"
            r13 = 0
            boolean r19 = r2.getBoolean(r1, r13)
            java.lang.String r1 = "hide_logged_in_user"
            boolean r1 = r2.getBoolean(r1, r13)
            r0.A06 = r1
            java.lang.String r1 = "hide_radio_button_and_badge"
            boolean r31 = r2.getBoolean(r1, r13)
            com.instagram.service.session.UserSession r1 = r0.A03
            X.0BO r1 = r1.multipleAccountHelper
            X.0RL r2 = r1.A00
            r1 = 0
            java.util.List r2 = r2.A04(r1)
            int r1 = r2.size()
            r4 = 1
            r18 = 0
            if (r1 <= r4) goto L_0x005d
            r18 = 1
        L_0x005d:
            java.util.ArrayList r1 = X.C18200wM.A0s(r2)
            java.util.ArrayList r2 = X.C18200wM.A0s(r1)
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0072
            com.instagram.service.session.UserSession r1 = r0.A03
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r1)
            r2.remove(r1)
        L_0x0072:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r2)
            r0.A05 = r1
            com.instagram.service.session.UserSession r1 = r0.A03
            X.49X r1 = X.AnonymousClass49X.A00(r1)
            r1.A04()
            com.instagram.service.session.UserSession r1 = r0.A03
            X.3Yv r1 = X.C62353Yv.A00(r1)
            java.util.HashMap r1 = r1.A00
            com.google.common.collect.ImmutableList r28 = X.C18240wQ.A0J(r1)
            com.instagram.service.session.UserSession r1 = r0.A03
            X.3Yv r1 = X.C62353Yv.A00(r1)
            java.util.HashMap r1 = r1.A01
            com.google.common.collect.ImmutableList r29 = X.C18240wQ.A0J(r1)
            com.instagram.service.session.UserSession r1 = r0.A03
            r22 = r1
            X.0TJ r3 = X.C18250wR.A0D(r1, r13)
            r1 = 18300340252248200(0x41041000010888, double:1.8930782802559708E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x0289
            r1 = 18300340252182663(0x41041000000887, double:1.893078280230067E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x0289
        L_0x00b8:
            X.0ZV r12 = X.AnonymousClass0ZV.A00
        L_0x00ba:
            if (r19 == 0) goto L_0x0285
            java.lang.Integer r26 = X.AnonymousClass006.A01
        L_0x00be:
            if (r18 == 0) goto L_0x00cd
            r1 = 18307770545675494(0x410ad200011ce6, double:1.8960151224327276E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            r32 = 1
            if (r1 != 0) goto L_0x00d1
        L_0x00cd:
            r32 = 0
            if (r18 == 0) goto L_0x00de
        L_0x00d1:
            r1 = 18307770545609957(0x410ad200001ce5, double:1.896015122406824E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            r33 = 1
            if (r1 != 0) goto L_0x00e2
        L_0x00de:
            r33 = 0
            if (r18 == 0) goto L_0x00ee
        L_0x00e2:
            r1 = 18307770545741031(0x410ad200021ce7, double:1.8960151224586312E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            r7 = 1
            if (r1 != 0) goto L_0x00ef
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            com.instagram.service.session.UserSession r3 = r0.A03
            java.util.List r2 = r0.A05
            X.0y4 r1 = new X.0y4
            r22 = r1
            r23 = r0
            r24 = r0
            r25 = r3
            r27 = r2
            r30 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A02 = r1
            r0.A0F(r1)
            com.instagram.service.session.UserSession r4 = r0.A03
            X.C04220Ms.A0B(r4, r13)
            java.lang.Class<X.3SC> r3 = X.AnonymousClass3SC.class
            r2 = 29
            kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67 r1 = new kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67
            r1.<init>(r4, r2)
            java.lang.Object r2 = r4.A01(r3, r1)
            X.3SC r2 = (X.AnonymousClass3SC) r2
            java.util.List r1 = r0.A05
            int r3 = r1.size()
            X.4nK r2 = r2.A00
            monitor-enter(r2)
            monitor-exit(r2)
            monitor-enter(r2)
            monitor-exit(r2)
            r1 = 1
            if (r3 <= r1) goto L_0x0135
            monitor-enter(r2)
            monitor-exit(r2)
            monitor-enter(r2)
            monitor-exit(r2)
            r1 = 5
            if (r3 <= r1) goto L_0x0135
            monitor-enter(r2)
            monitor-exit(r2)
        L_0x0135:
            com.instagram.service.session.UserSession r1 = r0.A03
            X.0nS r2 = X.C13330nS.A02(r1)
            java.lang.String r1 = "account_switch_button_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 4
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r1)
            com.instagram.service.session.UserSession r2 = r0.A03
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.0BO r1 = r2.multipleAccountHelper
            int r6 = r1.A0B()
            X.3Yv r5 = X.C62353Yv.A00(r2)
            java.util.HashSet r2 = X.C18200wM.A0u()
            java.util.HashMap r1 = r5.A00
            java.util.Set r1 = r1.keySet()
            r2.addAll(r1)
            java.util.HashMap r1 = r5.A01
            java.util.Set r1 = r1.keySet()
            r2.addAll(r1)
            int r1 = r2.size()
            X.C18200wM.A1U(r4, r6)
            int r6 = r6 + r1
            X.C18200wM.A1U(r4, r6)
            boolean r1 = X.AnonymousClass0wJ.A1U(r3)
            if (r1 == 0) goto L_0x01af
            java.lang.String r2 = r0.A04
            r1 = r20
            r3.A0T(r1, r2)
            r1 = 1
            java.lang.Object r1 = r4.get(r1)
            long r1 = X.C18190wL.A08(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "number_of_accounts"
            r3.A0S(r1, r2)
            java.lang.Object r1 = r4.get(r13)
            long r1 = X.C18190wL.A08(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "number_of_logged_in_accounts"
            r3.A0S(r1, r2)
            java.lang.String r1 = "account_switch_fragment"
            X.C18240wQ.A15(r3, r1)
            r3.Bb4()
        L_0x01af:
            com.instagram.service.session.UserSession r9 = r0.A03
            boolean r15 = X.C59363Kn.A01(r9)
            com.instagram.service.session.UserSession r1 = r0.A03
            int r1 = X.C59363Kn.A00(r1)
            long r1 = (long) r1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)
            com.instagram.service.session.UserSession r3 = r0.A03
            boolean r16 = X.C67313zL.A06(r3)
            boolean r17 = X.C63793iM.A01()
            com.instagram.service.session.UserSession r3 = r0.A03
            java.lang.String r3 = r3.getUserId()
            java.lang.Long r11 = X.AnonymousClass0wJ.A0d(r3)
            com.instagram.service.session.UserSession r3 = r0.A03
            java.lang.String r3 = r3.getUserId()
            java.lang.Long r12 = X.AnonymousClass0wJ.A0d(r3)
            java.lang.String r4 = r0.A04
            X.C04220Ms.A0B(r4, r13)
            int r3 = r4.hashCode()
            switch(r3) {
                case -1814342561: goto L_0x0236;
                case -657162262: goto L_0x0241;
                case -309425751: goto L_0x024c;
                case 441111834: goto L_0x0257;
                case 660917936: goto L_0x0262;
                case 1434631203: goto L_0x026d;
                case 2005378358: goto L_0x0279;
                default: goto L_0x01ea;
            }
        L_0x01ea:
            X.29q r8 = X.C319629q.UNKNOWN
        L_0x01ec:
            r13 = r1
            X.C63453hV.A00(r8, r9, r10, r11, r12, r13, r15, r16, r17)
            if (r32 == 0) goto L_0x021e
            if (r7 == 0) goto L_0x01ff
            com.instagram.service.session.UserSession r1 = r0.A03
            X.3IW r1 = X.AnonymousClass3NS.A01(r1)
            X.3II r1 = r1.A00
            r1.A01()
        L_0x01ff:
            X.3wi r1 = new X.3wi
            r1.<init>()
            X.7IU r2 = new X.7IU
            r2.<init>((X.C147138nS) r1, (X.AnonymousClass06C) r0)
            java.lang.Class<X.10h> r1 = X.C195510h.class
            X.3ak r2 = r2.A01(r1)
            X.4q8 r2 = (X.C82704q8) r2
            r0.A07 = r2
            com.instagram.service.session.UserSession r1 = r0.A03
            X.M5J r2 = r2.AA8(r1)
            r1 = 28
            X.C18210wN.A16(r0, r2, r1)
        L_0x021e:
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.DrH r1 = X.C18220wO.A0b(r1)
            if (r1 == 0) goto L_0x022d
            X.L0o r0 = r0.A09
            r1.A0A(r0)
        L_0x022d:
            r1 = -1142796779(0xffffffffbbe24e15, float:-0.0069062808)
            r0 = r21
            X.C14030oh.A09(r1, r0)
            return
        L_0x0236:
            java.lang.String r3 = "double_tap_tab_bar"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.TAB_BAR_DOUBLE_TAP
            goto L_0x01ec
        L_0x0241:
            java.lang.String r3 = "long_press_tab_bar"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.TAB_BAR_LONG_PRESS
            goto L_0x01ec
        L_0x024c:
            java.lang.String r3 = "profile"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.PROFILE_TITLE
            goto L_0x01ec
        L_0x0257:
            java.lang.String r3 = "unknown_nt_action"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.UNKNOWN_NT_ACTION
            goto L_0x01ec
        L_0x0262:
            java.lang.String r3 = "direct_inbox"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.DIRECT_INBOX
            goto L_0x01ec
        L_0x026d:
            java.lang.String r3 = "settings"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.SETTINGS
            goto L_0x01ec
        L_0x0279:
            java.lang.String r3 = "bookmark"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01ea
            X.29q r8 = X.C319629q.BOOKMARK
            goto L_0x01ec
        L_0x0285:
            java.lang.Integer r26 = X.AnonymousClass006.A00
            goto L_0x00be
        L_0x0289:
            X.0nS r17 = X.C13330nS.A02(r22)
            X.49q r2 = X.AnonymousClass3Zs.A03(r22)
            X.D2R r1 = X.D2R.A1a
            android.content.SharedPreferences r9 = r2.A01(r1)
            X.84Y r5 = X.AnonymousClass84Y.A00
            java.lang.String r8 = "ndx_ig4a_steps"
            java.util.Set r7 = r9.getStringSet(r8, r5)
            if (r7 == 0) goto L_0x00b8
            java.lang.String r6 = "multiple_account"
            boolean r1 = r7.contains(r6)
            if (r1 == 0) goto L_0x00b8
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = "written_timestamp"
            long r1 = r9.getLong(r10, r1)
            long r14 = X.C18240wQ.A09(r1)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r1 = (long) r4
            long r10 = r10.toMillis(r1)
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e6
            r7.remove(r6)
            android.content.SharedPreferences$Editor r1 = r9.edit()
            X.C18250wR.A0p(r1, r8, r7)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r17)
            java.lang.String r1 = "flow_name"
            r2.A0T(r1, r6)
            java.lang.String r1 = "fail_ttl_check"
            X.C18200wM.A1I(r2, r1)
            java.lang.String r4 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r1 = "ig_ndx_source"
            r2.A0T(r1, r4)
        L_0x02e1:
            r2.Bb4()
            goto L_0x00b8
        L_0x02e6:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r17)
            java.lang.String r16 = "flow_name"
            r1 = r16
            r2.A0T(r1, r6)
            java.lang.String r1 = "pass_ttl_check"
            java.lang.String r15 = "action"
            r2.A0T(r15, r1)
            java.lang.String r10 = "567067343352427"
            java.lang.String r9 = "ig_appid"
            r2.A0T(r9, r10)
            java.lang.String r8 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r7 = "ig_ndx_source"
            r2.A0T(r7, r8)
            r2.Bb4()
            android.content.Context r11 = X.C60943Re.A00
            java.lang.String r2 = r22.getUserId()
            java.lang.String r1 = "_multiple_account_info"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r2, r1)
            X.7M8 r14 = X.AnonymousClass3SL.A00(r11, r1)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            X.M4h r12 = new X.M4h
            r12.<init>()
            java.lang.Class<X.16q> r11 = X.C209216q.class
            com.instagram.nux.aymh.accountprovider.AccountDeserializer r2 = new com.instagram.nux.aymh.accountprovider.AccountDeserializer
            r2.<init>()
            r12.A06(r2, r11)
            com.google.gson.Gson r12 = r12.A03()
            java.lang.String r2 = "additional_accounts"
            java.util.Set r2 = r14.getStringSet(r2, r5)
            if (r2 == 0) goto L_0x035a
            java.util.Iterator r14 = r2.iterator()
        L_0x033c:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x035a
            java.lang.String r2 = X.C18180wK.A0k(r14)
            java.lang.Object r2 = r12.A07(r2, r11)     // Catch:{ Exception -> 0x0353 }
            X.16q r2 = (X.C209216q) r2     // Catch:{ Exception -> 0x0353 }
            X.C04220Ms.A04(r2)     // Catch:{ Exception -> 0x0353 }
            r1.add(r2)     // Catch:{ Exception -> 0x0353 }
            goto L_0x033c
        L_0x0353:
            r5 = move-exception
            java.lang.String r2 = "Account Deserialization Error"
            X.C10450iM.A07(r2, r5)
            goto L_0x033c
        L_0x035a:
            boolean r2 = X.C18250wR.A1K(r1)
            if (r2 == 0) goto L_0x03e8
            X.4To r12 = X.AnonymousClass4To.A00()
            r2 = 9
            int r2 = X.C02260Al.A0z(r1, r2)
            if (r2 != 0) goto L_0x03aa
            java.util.List r11 = X.C18180wK.A0n(r12)
        L_0x0370:
            java.lang.Object r1 = X.AnonymousClass00J.A0E(r11)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r1 = r1.values()
            java.util.List r14 = X.AnonymousClass00J.A0N(r1)
        L_0x037e:
            X.0BO r1 = X.C05030Qo.A01(r22)
            java.util.List r1 = r1.A0F()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x038e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x03eb
            java.lang.Object r1 = r11.next()
            X.4Mm r1 = (X.C72144Mm) r1
            java.lang.String r5 = r1.A01()
            java.lang.String r1 = r1.A02()
            kotlin.Pair r1 = X.C18180wK.A0p(r5, r1)
            r2.add(r1)
            goto L_0x038e
        L_0x03aa:
            int r2 = r2 + 1
            java.util.ArrayList r11 = X.C18240wQ.A0k(r2)
            r11.add(r12)
            java.util.Iterator r14 = r1.iterator()
        L_0x03b7:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0370
            java.lang.Object r5 = r14.next()
            X.16q r5 = (X.C209216q) r5
            java.lang.String r1 = r5.A03
            X.3Gg r2 = new X.3Gg
            r2.<init>(r1)
            java.lang.Object r1 = r12.get(r2)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r1
            if (r1 == 0) goto L_0x03e2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = r1.A03(r5)
        L_0x03d6:
            kotlin.Pair r1 = X.C18180wK.A0p(r2, r1)
            java.util.Map r12 = X.AnonymousClass4WJ.A0F(r12, r1)
            r11.add(r12)
            goto L_0x03b7
        L_0x03e2:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r1.<init>((X.C209216q) r5)
            goto L_0x03d6
        L_0x03e8:
            X.0ZV r14 = X.AnonymousClass0ZV.A00
            goto L_0x037e
        L_0x03eb:
            java.util.Map r11 = X.AnonymousClass4WJ.A0B(r2)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r14.iterator()
        L_0x03f7:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x041a
            java.lang.Object r5 = r14.next()
            r2 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r2
            java.lang.String r1 = r2.A04()
            boolean r1 = r11.containsKey(r1)
            if (r1 != 0) goto L_0x03f7
            java.lang.String r1 = r2.A02
            boolean r1 = r11.containsValue(r1)
            if (r1 != 0) goto L_0x03f7
            r12.add(r5)
            goto L_0x03f7
        L_0x041a:
            int r1 = r12.size()
            if (r1 != r4) goto L_0x0444
            r1 = 18300331662248069(0x41040e00000885, double:1.8930748850368008E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x00b8
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r17)
            r1 = r16
            r2.A0T(r1, r6)
            java.lang.String r1 = "push_impression"
            r2.A0T(r15, r1)
            r2.A0T(r9, r10)
            r2.A0T(r7, r8)
            r2.Bb4()
            goto L_0x00ba
        L_0x0444:
            int r1 = r12.size()
            if (r1 <= r4) goto L_0x00b8
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r17)
            r1 = r16
            r2.A0T(r1, r6)
            java.lang.String r1 = "too_many_accounts"
            r2.A0T(r15, r1)
            r2.A0T(r9, r10)
            r2.A0T(r7, r8)
            goto L_0x02e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23361de.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1168770187);
        super.onDestroy();
        C25745DrH A0b = C18220wO.A0b(requireActivity());
        if (A0b != null) {
            A0b.A0B(this.A09);
        }
        C14030oh.A09(1247110987, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1849595034);
        super.onDestroyView();
        C38040KHr.A01.A04(this.A08, AnonymousClass459.class);
        C14030oh.A09(-2057028173, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-198884373);
        super.onResume();
        C018908v.A00(this);
        AnonymousClass7JU.A04(this.A05, 500);
        C14030oh.A09(642859148, A022);
    }
}
