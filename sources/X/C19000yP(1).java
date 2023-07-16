package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape48S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxEListenerShape165S0200000_1_I2;
import com.facebook.redex.IDxTListenerShape94S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
public final class C19000yP extends FrameLayout implements CallerContextable {
    public static final String __redex_internal_original_name = "ShareTable";
    public View A00;
    public TextView A01;
    public C61103Rx A02;
    public IgSwitch A03;
    public C83104qn A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D;
    public View A0E;
    public TextView A0F;
    public TextView A0G;
    public C82394pY A0H;
    public C82394pY A0I;
    public C22671Yz A0J;
    public boolean A0K;
    public final ViewGroup A0L;
    public final FragmentActivity A0M;
    public final C34640IcN A0N;
    public final ShareLaterMedia A0O;
    public final UserSession A0P;
    public final C61283Sp A0Q;
    public final C83864s7 A0R;
    public final String A0S;
    public final List A0T = AnonymousClass0wJ.A0v();
    public final List A0U = AnonymousClass0wJ.A0v();
    public final View.OnClickListener A0V = C18210wN.A0H(this, 331);
    public final View A0W;

    private void setupOtherIGSharingButton(LayoutInflater layoutInflater, AnonymousClass3AG r8) {
        LayoutInflater A0C2 = C18180wK.A0C(this);
        ViewGroup viewGroup = this.A0L;
        View A0H2 = AnonymousClass0wJ.A0H(A0C2, viewGroup, R.layout.widget_share_table_row);
        C18210wN.A0z(A0H2.findViewById(R.id.row_divider));
        viewGroup.addView(A0H2);
        ViewGroup A0J2 = C18220wO.A0J(A0H2, R.id.share_table_row_button_container);
        View inflate = layoutInflater.inflate(R.layout.widget_share_table_row_redesign, A0J2, false);
        TextView A0G2 = C18180wK.A0G(inflate, R.id.share_table_button);
        if (A0G2 != null) {
            A0G2.setText(r8.A02);
        }
        IgSwitch igSwitch = (IgSwitch) inflate.findViewById(R.id.share_switch);
        if (igSwitch != null) {
            UserSession userSession = this.A0P;
            if (userSession != null) {
                C62383Zj.A01(AnonymousClass2A9.A0D, AnonymousClass2A8.A04, userSession);
            }
            igSwitch.A07 = new IDxTListenerShape94S0300000_1_I2(2, this, r8, inflate);
            igSwitch.setTag(r8.A02);
        }
        this.A0U.add(igSwitch);
        A0J2.addView(inflate);
        this.A0E = inflate;
    }

    public final void A04(C209416t r12, IgSwitch igSwitch, String str, String str2, boolean z) {
        UserSession userSession = this.A0P;
        if (C63073bQ.A00(userSession).A03() != null) {
            AnonymousClass1ak A002 = AnonymousClass2MH.A00(str2);
            A002.A01 = new C69874Av(r12, igSwitch, this);
            C37032Jj9 A0L2 = C18210wN.A0L(userSession);
            A0L2.A0M = C18180wK.A0X();
            FragmentActivity fragmentActivity = this.A0M;
            A0L2.A08 = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
            A0L2.A0J = new C71964Ll(r12, igSwitch, this, str, str2);
            C37383Jqm A003 = A0L2.A00();
            if (z) {
                AnonymousClass0wJ.A0F().postDelayed(new C73414Sh(A002, A003, this), 500);
            } else {
                C37383Jqm.A00(fragmentActivity, A002, A003);
            }
        }
    }

    public static void A00(C318329d r4, C19000yP r5, boolean z) {
        AnonymousClass14I r3 = new AnonymousClass14I();
        r3.A07("is_xpost_enabled", Boolean.valueOf(z));
        UserSession userSession = r5.A0P;
        C49212r1.A00(r4, AnonymousClass293.FEED, AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, r3, userSession);
    }

    public static void A01(C209416t r9, IgSwitch igSwitch, C19000yP r11) {
        TextView textView;
        UserSession userSession = r11.A0P;
        if (C63073bQ.A01(userSession) != null) {
            r9.A00 = true;
            C63073bQ.A00(userSession).A0B(r9);
        }
        View view = r11.A00;
        if (view != null) {
            view.setVisibility(8);
            if (C63073bQ.A00(userSession).A0E() && (textView = r11.A0F) != null) {
                Context context = r11.getContext();
                String str = r11.A05;
                Integer valueOf = Integer.valueOf(C63803iN.A02(AnonymousClass0TJ.A05, userSession));
                boolean z = false;
                if (C67373zR.A0D(userSession)) {
                    z = true;
                }
                textView.setText(C63143c0.A03(context, r9, valueOf, str, z));
                r11.A0F.setVisibility(0);
            }
            if (igSwitch != null && C63073bQ.A00(userSession).A0E()) {
                if (r11.A08 || C62183Xq.A00(userSession)) {
                    igSwitch.A00();
                }
                igSwitch.setClickable(true);
            }
        }
    }

    public static void A02(C19000yP r10) {
        UserSession userSession = r10.A0P;
        C04620Ok r4 = C06810aP.A01;
        if (C18200wM.A1X(userSession, r4) && !r10.getIsPageConnectedAndPublished()) {
            for (CompoundButton compoundButton : r10.A0U) {
                if (compoundButton.getTag() == AnonymousClass2AI.A04 && !compoundButton.isChecked() && r10.A0J != null) {
                    User A012 = r4.A01(userSession);
                    if (((TextUtils.isEmpty(A012.A17()) && A012.A3Z()) || A012.A2j()) && r10.A0K) {
                        C67243zD.A00(r10.getContext(), r10.A0J, r10.A0N, userSession, "share_table");
                    } else if (r10.A0D) {
                        Context context = r10.getContext();
                        C34640IcN icN = r10.A0N;
                        C22671Yz r3 = r10.A0J;
                        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
                        AnonymousClass0wJ.A1Q(icN, r3);
                        AnonymousClass1o2.A01("edit_profile_flow").A06();
                        AnonymousClass2KU.A00(userSession, "claim_publish_row");
                        C25828Dsm A0W2 = C18190wL.A0W(context);
                        A0W2.A0l(r4.A01(userSession).B4M(), icN);
                        A0W2.A0L(2131833823);
                        A0W2.A0p(AnonymousClass0wJ.A0l(context, r4.A01(userSession).A18(), 2131833822));
                        A0W2.A0P(new IDxCListenerShape48S0300000_1_I2(context, (Fragment) r3, userSession, 12), 2131833821);
                        C18240wQ.A0s(new IDxCListenerShape77S0200000_1_I2(15, (Object) userSession, (Object) r3), A0W2, 2131831869, A1Z);
                        Dialog A0G2 = A0W2.A0G();
                        if (r3 instanceof DialogInterface.OnCancelListener) {
                            A0G2.setOnCancelListener(r3);
                        }
                        C13950oZ.A00(A0G2);
                    }
                }
            }
        }
    }

    private boolean A03() {
        UserSession userSession = this.A0P;
        C04220Ms.A0B(userSession, 0);
        if (!C63073bQ.A03(userSession) || C63073bQ.A00(userSession).A03() == null) {
            return false;
        }
        return true;
    }

    private boolean getIsPageConnectedAndPublished() {
        C22671Yz r0 = this.A0J;
        if (r0 == null || !r0.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c4, code lost:
        if (r11 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ca, code lost:
        if (r7.A06(r11) != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cc, code lost:
        X.C04220Ms.A0B(r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e4, code lost:
        if (X.C28161tl.A04(r5).getInt("feed_last_server_xposting_turn_on_time_in_second", -1) >= X.C28161tl.A04(r5).getInt("xpost_to_facebook_feed_server_mtime_in_second", 0)) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ea, code lost:
        if (X.C62183Xq.A00(r5) == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ec, code lost:
        r1 = new X.C73314Rx(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (X.AnonymousClass0wJ.A0Y(r9.A0P).Apo() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0359, code lost:
        if (X.C67373zR.A0D(r5) != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (X.C18210wN.A0J(r1).contains("FB") == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupAppSharingButtons(android.view.View r38, android.view.LayoutInflater r39, X.AnonymousClass2AI r40) {
        /*
            r37 = this;
            java.lang.Class<X.0yP> r24 = X.C19000yP.class
            X.2AI r7 = X.AnonymousClass2AI.A04
            r23 = 1
            r6 = 0
            r9 = r37
            r8 = r40
            if (r8 != r7) goto L_0x0029
            com.instagram.model.sharelater.ShareLaterMedia r0 = r9.A0O
            if (r0 == 0) goto L_0x0029
            java.util.List r1 = r0.A06
            if (r1 == 0) goto L_0x0029
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r0 == 0) goto L_0x0029
            com.google.common.collect.ImmutableList r1 = X.C18210wN.A0J(r1)
            java.lang.String r0 = "FB"
            boolean r0 = r1.contains(r0)
            r22 = 1
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r22 = 0
        L_0x002b:
            if (r8 != r7) goto L_0x003b
            com.instagram.service.session.UserSession r0 = r9.A0P
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            boolean r0 = r0.Apo()
            r21 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            r21 = 0
        L_0x003d:
            com.instagram.service.session.UserSession r5 = r9.A0P
            X.1z6 r1 = X.C35692Ol.A00(r5)
            java.lang.String r11 = r8.A01(r5)
            android.view.LayoutInflater r3 = X.C18180wK.A0C(r9)
            r2 = 2131497557(0x7f0c1255, float:1.861871E38)
            android.view.ViewGroup r0 = r9.A0L
            r35 = r0
            android.view.View r2 = X.AnonymousClass0wJ.A0H(r3, r0, r2)
            r0 = 2131306102(0x7f092676, float:1.8230394E38)
            android.view.View r0 = r2.findViewById(r0)
            X.C18210wN.A0z(r0)
            r0 = r35
            r0.addView(r2)
            r0 = 2131307032(0x7f092a18, float:1.823228E38)
            android.view.ViewGroup r4 = X.C18220wO.A0J(r2, r0)
            X.16t r20 = X.C63073bQ.A01(r5)
            r2 = 0
            java.lang.String r3 = "ig_android_linking_cache_feed_composer"
            r36 = r39
            if (r8 != r7) goto L_0x0445
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A00(r24)
            boolean r0 = r1.A05(r0, r3)
            if (r0 != 0) goto L_0x0087
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x0445
        L_0x0087:
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x03e6
            r1 = 2131497556(0x7f0c1254, float:1.8618708E38)
            r0 = r36
            android.view.View r0 = r0.inflate(r1, r4, r6)
            r1 = 2131296871(0x7f090267, float:1.821167E38)
            android.view.View r1 = r0.requireViewById(r1)
            r1.setOnClickListener(r2)
            r9.A05 = r11
            r1 = 2131297045(0x7f090315, float:1.8212024E38)
            android.view.View r1 = r0.requireViewById(r1)
            r9.A00 = r1
            r1 = 2131297067(0x7f09032b, float:1.8212068E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r0, r1)
            r9.A0F = r1
            X.16t r12 = X.C63073bQ.A01(r5)
            android.view.View r1 = r9.A00
            if (r1 == 0) goto L_0x0164
            if (r12 == 0) goto L_0x0164
            boolean r1 = r12.A00
            if (r1 != 0) goto L_0x03dd
            X.C04220Ms.A0B(r5, r6)
            boolean r1 = X.C63073bQ.A03(r5)
            if (r1 == 0) goto L_0x03dd
            android.content.Context r13 = r9.getContext()
            r1 = 2131820810(0x7f11010a, float:1.9274345E38)
            java.lang.String r10 = r13.getString(r1)
            android.content.res.Resources r14 = r9.getResources()
            r1 = 2131820809(0x7f110109, float:1.9274343E38)
            java.lang.String r19 = r14.getString(r1)
            r1 = 2131835768(0x7f113b78, float:1.9304684E38)
            java.lang.String r18 = X.AnonymousClass0wJ.A0l(r13, r10, r1)
            r15 = 2131835767(0x7f113b77, float:1.9304682E38)
            r33 = 2
            java.lang.String r2 = r12.A03
            r1 = r19
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r17 = r14.getString(r15, r1)
            r1 = 2131297044(0x7f090314, float:1.8212022E38)
            android.widget.TextView r16 = X.AnonymousClass0wJ.A0L(r0, r1)
            r1 = 2131307023(0x7f092a0f, float:1.8232262E38)
            android.view.View r2 = r0.requireViewById(r1)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            X.49i r1 = X.C63073bQ.A00(r5)
            boolean r15 = r1.A0E()
            X.49i r1 = X.C63073bQ.A00(r5)
            boolean r1 = r1.A0G(r5)
            if (r1 == 0) goto L_0x012d
            r2.setChecked(r6)
            r2.setClickable(r6)
            r1 = 2131307024(0x7f092a10, float:1.8232264E38)
            android.view.View r14 = r0.requireViewById(r1)
            r1 = 67
            X.C18200wM.A1E(r14, r9, r12, r2, r1)
        L_0x012d:
            r34 = r18
            if (r15 != 0) goto L_0x0135
            r10 = r19
            r34 = r17
        L_0x0135:
            int r32 = X.C18210wN.A01(r13)
            r31 = r17
            if (r15 == 0) goto L_0x013f
            r31 = r18
        L_0x013f:
            java.lang.Integer r27 = X.AnonymousClass006.A01
            r13 = 16
            if (r15 != 0) goto L_0x0147
            r18 = r17
        L_0x0147:
            X.03m r14 = new X.03m
            r1 = r18
            r14.<init>((int) r13, (java.lang.CharSequence) r1)
            com.instagram.common.accessibility.IDxCSpanShape14S0300000_1_I2 r1 = new com.instagram.common.accessibility.IDxCSpanShape14S0300000_1_I2
            r25 = r1
            r26 = r14
            r28 = r9
            r29 = r12
            r30 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r12 = r16
            r2 = r34
            X.AnonymousClass3Zw.A03(r1, r12, r10, r2)
        L_0x0164:
            r0.setTag(r8)
            android.view.View$OnClickListener r1 = r9.A0V
            r0.setOnClickListener(r1)
            r1 = 2131307023(0x7f092a0f, float:1.8232262E38)
            com.instagram.igds.components.switchbutton.IgSwitch r10 = X.C18250wR.A0N(r0, r1)
            r1 = 2131306441(0x7f0927c9, float:1.8231081E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r0, r1)
            if (r8 != r7) goto L_0x0180
            r9.A01 = r2
            r9.A03 = r10
        L_0x0180:
            r14 = r38
            if (r21 == 0) goto L_0x02fb
            r12 = 5
            com.facebook.redex.IDxEListenerShape165S0200000_1_I2 r1 = new com.facebook.redex.IDxEListenerShape165S0200000_1_I2
            r1.<init>(r12, r9, r8)
            r9.A0H = r1
            X.1Yz r1 = new X.1Yz
            r1.<init>()
            r9.A0J = r1
            android.os.Bundle r13 = X.C18180wK.A06()
            com.instagram.model.sharelater.ShareLaterMedia r12 = r9.A0O
            java.lang.String r1 = "ShareLaterMedia.SHARE_LATER_MEDIA"
            r13.putParcelable(r1, r12)
            X.C05050Qq.A00(r13, r5)
            X.1Yz r1 = r9.A0J
            r1.setArguments(r13)
            androidx.fragment.app.FragmentActivity r1 = r9.A0M
            X.01J r13 = X.C18220wO.A0L(r1)
            X.1Yz r12 = r9.A0J
            java.lang.String r1 = "share_to_fb_page"
            r13.A0E(r12, r1)
            r13.A01()
            r9.setFbShareTextView(r10)
            com.instagram.user.model.User r12 = X.AnonymousClass0wJ.A0Y(r5)
            java.lang.String r1 = r12.A17()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x02f3
            boolean r1 = r12.A3Z()
            if (r1 == 0) goto L_0x02f3
        L_0x01cd:
            r1 = r23
            r9.A0K = r1
            boolean r1 = r9.A03()
            if (r1 != 0) goto L_0x01e0
            r1 = 2131835775(0x7f113b7f, float:1.9304698E38)
            r2.setText(r1)
            r2.setVisibility(r6)
        L_0x01e0:
            if (r8 != r7) goto L_0x0233
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r5)
            boolean r1 = r1.Apo()
            if (r1 != 0) goto L_0x0233
            com.instagram.model.sharelater.ShareLaterMedia r11 = r9.A0O
            if (r11 == 0) goto L_0x01f6
            boolean r1 = r7.A06(r11)
            if (r1 != 0) goto L_0x02c6
        L_0x01f6:
            X.C04220Ms.A0B(r5, r6)
            boolean r1 = X.C62183Xq.A00(r5)
            if (r1 != 0) goto L_0x02c4
            android.content.SharedPreferences r2 = X.C28161tl.A04(r5)
            java.lang.String r1 = "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms"
            long r12 = X.C18180wK.A05(r2, r1)
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "fb_feed_crossposting_advanced_settings_tooltip"
            int r2 = r2.getInt(r1, r6)
            r1 = 3
            if (r2 >= r1) goto L_0x02c4
            long r15 = r15 - r12
            long r12 = X.C61283Sp.A03
            int r1 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x02c4
            X.2AD r2 = X.AnonymousClass2AD.A0Y
            X.2AC r1 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            boolean r1 = X.C63423hS.A03(r1, r2, r5)
            if (r1 == 0) goto L_0x02c4
            r1 = r23
            r9.A07 = r1
            X.4Rw r1 = new X.4Rw
            r1.<init>(r10, r9)
        L_0x0230:
            r14.post(r1)
        L_0x0233:
            if (r8 != r7) goto L_0x024d
            boolean r1 = X.C17578AFm.A00(r5)
            if (r1 == 0) goto L_0x024d
            r2 = 2131497553(0x7f0c1251, float:1.8618702E38)
            r1 = r36
            android.view.View r2 = r1.inflate(r2, r4, r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r9.A0G = r2
            r1 = r35
            r1.addView(r2)
        L_0x024d:
            if (r8 != r7) goto L_0x028a
            boolean r1 = X.C62183Xq.A00(r5)
            if (r1 != 0) goto L_0x025f
            com.instagram.model.sharelater.ShareLaterMedia r1 = r9.A0O
            if (r1 == 0) goto L_0x02c2
            boolean r1 = r7.A06(r1)
            if (r1 == 0) goto L_0x02c2
        L_0x025f:
            r11 = 1
        L_0x0260:
            boolean r2 = r9.A06
            boolean r1 = r9.A07
            if (r2 == 0) goto L_0x02bb
            if (r1 == 0) goto L_0x02b8
            java.lang.String r2 = "profile_icon_and_tooltip_show_both"
        L_0x026a:
            java.lang.String r1 = "view"
            X.C49192qz.A00(r5, r1, r2, r11)
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r5)
            boolean r2 = r1.A3D()
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r24)
            if (r2 == 0) goto L_0x02b3
            boolean r1 = X.C61853Wb.A01(r1, r5, r3)
        L_0x0281:
            if (r1 != 0) goto L_0x028a
            X.2A8 r2 = X.AnonymousClass2A8.A04
            X.2A9 r1 = X.AnonymousClass2A9.A0C
            X.C62383Zj.A01(r1, r2, r5)
        L_0x028a:
            r2 = 3
            com.facebook.redex.IDxTListenerShape94S0300000_1_I2 r1 = new com.facebook.redex.IDxTListenerShape94S0300000_1_I2
            r1.<init>(r2, r9, r0, r8)
            r10.A07 = r1
            if (r22 == 0) goto L_0x02a0
            boolean r1 = r9.getShouldShowNewUI()
            if (r1 != 0) goto L_0x02a0
        L_0x029a:
            X.29d r0 = X.C318329d.UNAVAILABLE
            A00(r0, r9, r6)
            return
        L_0x02a0:
            if (r8 != r7) goto L_0x046f
            com.instagram.model.sharelater.ShareLaterMedia r1 = r9.A0O
            if (r1 == 0) goto L_0x046f
            X.24M r2 = r1.A01
            if (r2 == 0) goto L_0x046f
            X.24M r1 = X.AnonymousClass24M.SHARING
            if (r2 == r1) goto L_0x029a
            X.24M r1 = X.AnonymousClass24M.SHARED
            if (r2 != r1) goto L_0x046f
            goto L_0x029a
        L_0x02b3:
            boolean r1 = X.C62963bD.A03(r1, r5, r3)
            goto L_0x0281
        L_0x02b8:
            java.lang.String r2 = "profile_icon_only_shown_only"
            goto L_0x026a
        L_0x02bb:
            if (r1 == 0) goto L_0x02c0
            java.lang.String r2 = "tooltip_shown_only"
            goto L_0x026a
        L_0x02c0:
            r2 = 0
            goto L_0x026a
        L_0x02c2:
            r11 = 0
            goto L_0x0260
        L_0x02c4:
            if (r11 == 0) goto L_0x02cc
        L_0x02c6:
            boolean r1 = r7.A06(r11)
            if (r1 == 0) goto L_0x0233
        L_0x02cc:
            X.C04220Ms.A0B(r5, r6)
            android.content.SharedPreferences r11 = X.C28161tl.A04(r5)
            java.lang.String r2 = "feed_last_server_xposting_turn_on_time_in_second"
            r1 = -1
            int r11 = r11.getInt(r2, r1)
            android.content.SharedPreferences r2 = X.C28161tl.A04(r5)
            java.lang.String r1 = "xpost_to_facebook_feed_server_mtime_in_second"
            int r1 = r2.getInt(r1, r6)
            if (r11 >= r1) goto L_0x0233
            boolean r1 = X.C62183Xq.A00(r5)
            if (r1 == 0) goto L_0x0233
            X.4Rx r1 = new X.4Rx
            r1.<init>(r10, r9)
            goto L_0x0230
        L_0x02f3:
            boolean r1 = r12.A2j()
            if (r1 == 0) goto L_0x02fb
            goto L_0x01cd
        L_0x02fb:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x01e0
            r2.setText(r11)
            r11 = 8
            if (r22 == 0) goto L_0x033a
            boolean r1 = r9.getShouldShowNewUI()
            if (r1 == 0) goto L_0x033a
            r10.setClickable(r6)
            r10.setEnabled(r6)
            boolean r1 = r9.A03()
            if (r1 != 0) goto L_0x0320
            r1 = 2131307031(0x7f092a17, float:1.8232278E38)
            X.C18190wL.A18(r0, r1, r11)
        L_0x0320:
            r12 = -1
            android.content.res.Resources r11 = r9.getResources()
            r1 = 2131165461(0x7f070115, float:1.794514E38)
            int r11 = r11.getDimensionPixelOffset(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r12, r11)
            r0.setLayoutParams(r1)
            r1 = 2131835763(0x7f113b73, float:1.9304674E38)
            r2.setText(r1)
        L_0x033a:
            if (r8 != r7) goto L_0x03c7
            boolean r1 = r9.A03()
            if (r1 == 0) goto L_0x03c7
            android.content.Context r13 = r9.getContext()
            java.lang.String r12 = r9.A05
            X.0TJ r1 = X.AnonymousClass0TJ.A05
            int r1 = X.C63803iN.A02(r1, r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            if (r21 != 0) goto L_0x035b
            boolean r1 = X.C67373zR.A0D(r5)
            r2 = 0
            if (r1 == 0) goto L_0x035c
        L_0x035b:
            r2 = 1
        L_0x035c:
            r1 = r20
            android.text.Spanned r2 = X.C63143c0.A03(r13, r1, r11, r12, r2)
            android.widget.TextView r1 = r9.A0F
            if (r1 == 0) goto L_0x037a
            r1.setText(r2)
            X.49i r1 = X.C63073bQ.A00(r5)
            boolean r1 = r1.A0G(r5)
            if (r1 == 0) goto L_0x037a
            android.widget.TextView r2 = r9.A0F
            r1 = 8
        L_0x0377:
            r2.setVisibility(r1)
        L_0x037a:
            if (r21 == 0) goto L_0x01e0
            X.0TJ r11 = X.AnonymousClass0TJ.A05
            r1 = 36313952782714625(0x81035900010701, double:3.02842819211523E-306)
            boolean r1 = X.C63803iN.A0E(r11, r5, r1)
            if (r1 == 0) goto L_0x01e0
            r1 = 36595427759556611(0x82035900030803, double:3.20643410087886E-306)
            long r16 = X.C63803iN.A03(r11, r5, r1)
            X.1tl r13 = X.AnonymousClass3WS.A01(r5)
            android.content.SharedPreferences r12 = r13.A00
            java.lang.String r1 = "xshare_facebook_page_nux_impression"
            int r1 = r12.getInt(r1, r6)
            long r1 = (long) r1
            int r15 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e0
            r1 = 36595427759622148(0x82035900040804, double:3.206434100920306E-306)
            long r17 = X.C63803iN.A03(r11, r5, r1)
            java.lang.String r11 = "xshare_facebook_page_nux_last_seen_time"
            r1 = 0
            long r15 = r12.getLong(r11, r1)
            int r11 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r11 == 0) goto L_0x03c9
            long r11 = X.C18240wQ.A09(r15)
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r17 = r17 * r1
            int r1 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r1 >= 0) goto L_0x03c9
            goto L_0x01e0
        L_0x03c7:
            r1 = 0
            goto L_0x0377
        L_0x03c9:
            X.2AD r2 = X.AnonymousClass2AD.A0b
            X.2AC r1 = X.AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_TOOLTIP
            boolean r1 = X.C63423hS.A03(r1, r2, r5)
            if (r1 == 0) goto L_0x01e0
            X.4Si r1 = new X.4Si
            r1.<init>(r10, r13, r9)
            r14.post(r1)
            goto L_0x01e0
        L_0x03dd:
            android.view.View r2 = r9.A00
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x0164
        L_0x03e6:
            r1 = 2131497555(0x7f0c1253, float:1.8618706E38)
            r0 = r36
            android.view.View r0 = r0.inflate(r1, r4, r6)
            r1 = 2131307031(0x7f092a17, float:1.8232278E38)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = X.C18250wR.A0M(r0, r1)
            X.1z6 r2 = X.C35692Ol.A00(r5)
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r24)
            boolean r1 = r2.A05(r1, r3)
            if (r1 == 0) goto L_0x043f
            r10.setVisibility(r6)
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r24)
            fxcache.model.FxCalAccount r1 = r2.A01(r1, r3)
            if (r1 == 0) goto L_0x0434
            java.lang.String r1 = r1.A06
            if (r1 == 0) goto L_0x0434
            android.net.Uri r1 = X.C15430rJ.A01(r1)
            com.instagram.common.typedurl.ImageUrl r2 = X.AnonymousClass3WG.A00(r1)
            X.IcN r1 = r9.A0N
            r10.setUrl(r2, r1)
            r1 = r23
            r9.A06 = r1
        L_0x0426:
            r1 = 2131307026(0x7f092a12, float:1.8232268E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r0, r1)
            int r1 = r8.A01
            r2.setText(r1)
            goto L_0x0164
        L_0x0434:
            android.content.Context r2 = r9.getContext()
            r1 = 2131233606(0x7f080b46, float:1.8083354E38)
            X.C18180wK.A0r(r2, r10, r1)
            goto L_0x0426
        L_0x043f:
            r1 = 8
            r10.setVisibility(r1)
            goto L_0x0426
        L_0x0445:
            r1 = 2131497558(0x7f0c1256, float:1.8618713E38)
            r0 = r36
            android.view.View r0 = r0.inflate(r1, r4, r6)
            r1 = 2131307026(0x7f092a12, float:1.8232268E38)
            android.widget.TextView r13 = X.AnonymousClass0wJ.A0L(r0, r1)
            android.content.res.Resources r12 = r9.getResources()
            r10 = 2131835773(0x7f113b7d, float:1.9304694E38)
            android.content.Context r2 = r9.getContext()
            int r1 = r8.A01
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r1 = X.C18190wL.A0h(r12, r1, r10)
            r13.setText(r1)
            goto L_0x0164
        L_0x046f:
            if (r8 != r7) goto L_0x0487
            boolean r1 = X.C62183Xq.A00(r5)
            if (r1 != 0) goto L_0x0481
            com.instagram.model.sharelater.ShareLaterMedia r1 = r9.A0O
            if (r1 == 0) goto L_0x0482
            boolean r1 = r7.A06(r1)
            if (r1 == 0) goto L_0x0482
        L_0x0481:
            r6 = 1
        L_0x0482:
            X.29d r1 = X.C318329d.VIEW
            A00(r1, r9, r6)
        L_0x0487:
            r10.setTag(r8)
            java.util.List r1 = r9.A0T
            r1.add(r0)
            java.util.List r1 = r9.A0U
            r1.add(r10)
            r4.addView(r0)
            r9.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19000yP.setupAppSharingButtons(android.view.View, android.view.LayoutInflater, X.2AI):void");
    }

    private void setupViews(View view, LayoutInflater layoutInflater, List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass2AI r0 = (AnonymousClass2AI) it.next();
                setupAppSharingButtons(view, layoutInflater, r0);
                this.A0R.Bcv(r0.A02);
            }
        } else if (list2 != null) {
            UserSession userSession = this.A0P;
            if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36317891267858467L)) {
                List A0N2 = AnonymousClass00J.A0N(C35812Ox.A00(userSession).A02);
                Iterator it2 = A0N2.iterator();
                while (it2.hasNext()) {
                    String A0k = C18180wK.A0k(it2);
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        AnonymousClass3AG r1 = (AnonymousClass3AG) it3.next();
                        if (A0k.equals(r1.A02)) {
                            setupOtherIGSharingButton(layoutInflater, r1);
                            break;
                        }
                    }
                }
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    AnonymousClass3AG r12 = (AnonymousClass3AG) it4.next();
                    String str = r12.A02;
                    if (!A0N2.contains(str)) {
                        setupOtherIGSharingButton(layoutInflater, r12);
                        Vector vector = C35812Ox.A00(userSession).A02;
                        if (!vector.contains(str)) {
                            vector.add(str);
                        }
                    }
                }
            } else {
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    setupOtherIGSharingButton(layoutInflater, (AnonymousClass3AG) it5.next());
                }
            }
            this.A0I = new IDxEListenerShape165S0200000_1_I2(6, this, list2);
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [android.text.Spanned] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (X.C67373zR.A0D(r4) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e8, code lost:
        if (r8.A07(r5, r4) == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        if (r8.A06(r5) == false) goto L_0x017c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C84554tP r26) {
        /*
            r25 = this;
            r6 = r25
            java.util.List r0 = r6.A0T
            java.util.Iterator r4 = r0.iterator()
            r15 = 0
        L_0x0009:
            boolean r0 = r4.hasNext()
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = r26
            if (r0 == 0) goto L_0x0033
            java.lang.Object r2 = r4.next()
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = X.C18210wN.A0X(r2)
            X.2AI r1 = (X.AnonymousClass2AI) r1
            com.instagram.service.session.UserSession r0 = r6.A0P
            boolean r0 = r1.A07(r5, r0)
            if (r0 != 0) goto L_0x002a
            r3 = 1050253722(0x3e99999a, float:0.3)
        L_0x002a:
            r2.setAlpha(r3)
            X.2AI r0 = X.AnonymousClass2AI.A04
            if (r1 != r0) goto L_0x0009
            r15 = r2
            goto L_0x0009
        L_0x0033:
            com.instagram.service.session.UserSession r4 = r6.A0P
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r4)
            boolean r14 = r0.Apo()
            X.16t r3 = X.C63073bQ.A01(r4)
            java.util.List r0 = r6.A0U
            java.util.Iterator r13 = r0.iterator()
        L_0x0047:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r7 = r13.next()
            android.widget.CompoundButton r7 = (android.widget.CompoundButton) r7
            java.lang.Object r8 = r7.getTag()
            X.2AI r8 = (X.AnonymousClass2AI) r8
            r12 = 1
            r2 = 0
            if (r8 == 0) goto L_0x00bd
            X.2AI r0 = X.AnonymousClass2AI.A04
            if (r8 != r0) goto L_0x00bd
            java.lang.String r0 = r8.A01(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bd
            android.widget.TextView r0 = r6.A01
            r0.getClass()
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008a
            android.widget.TextView r0 = r6.A01
            java.lang.CharSequence r1 = r0.getText()
            java.lang.String r0 = r8.A01(r4)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00bd
        L_0x008a:
            java.lang.String r10 = r8.A01(r4)
            android.content.Context r11 = r6.getContext()
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            int r0 = X.C63803iN.A02(r0, r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            if (r14 != 0) goto L_0x00a5
            boolean r1 = X.C67373zR.A0D(r4)
            r0 = 0
            if (r1 == 0) goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            android.text.Spanned r9 = X.C63143c0.A03(r11, r3, r9, r10, r0)
            if (r14 != 0) goto L_0x00bd
            android.widget.TextView r1 = r6.A01
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x00b5
            r10 = r9
        L_0x00b5:
            r1.setText(r10)
            android.widget.TextView r0 = r6.A01
            r0.setVisibility(r2)
        L_0x00bd:
            X.2AI r9 = X.AnonymousClass2AI.A04
            if (r8 != r9) goto L_0x00d1
            boolean r0 = r6.A0D
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x00d1
        L_0x00c9:
            if (r14 == 0) goto L_0x00e0
            boolean r0 = r6.getIsPageConnectedAndPublished()
            if (r0 == 0) goto L_0x00e0
        L_0x00d1:
            if (r8 != r9) goto L_0x0173
            X.49i r0 = X.C63073bQ.A00(r4)
            boolean r0 = r0.A0G(r4)
            if (r0 == 0) goto L_0x0173
            r7.setChecked(r2)
        L_0x00e0:
            if (r8 == 0) goto L_0x00ea
            boolean r1 = r8.A07(r5, r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x00ed
        L_0x00ea:
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x00ed:
            r7.setAlpha(r0)
            if (r8 != r9) goto L_0x0109
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0109
            if (r3 == 0) goto L_0x0102
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0102
            boolean r0 = r7.isChecked()
            if (r0 != 0) goto L_0x0109
        L_0x0102:
            android.view.View r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x0109:
            if (r8 == 0) goto L_0x0047
            if (r8 != r9) goto L_0x0047
            if (r15 == 0) goto L_0x0047
            X.C04220Ms.A0B(r4, r2)
            boolean r0 = X.C63073bQ.A03(r4)
            if (r0 == 0) goto L_0x0047
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0047
            if (r3 == 0) goto L_0x0171
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0171
        L_0x0122:
            X.49i r0 = X.C63073bQ.A00(r4)
            boolean r0 = r0.A0G(r4)
            if (r0 != 0) goto L_0x0136
            boolean r0 = r8.A06(r5)
            if (r0 == 0) goto L_0x0047
            if (r3 == 0) goto L_0x0047
            if (r12 != 0) goto L_0x0047
        L_0x0136:
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            X.29v r16 = X.C320129v.DEFAULT_PRIVACY_INSTRUCTION_VIEW_IMPRESSION
            r22 = 0
            r18 = 0
            android.content.Context r1 = r7.getContext()
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            int r0 = X.C63803iN.A02(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r19 = X.C63143c0.A05(r1, r0)
            java.lang.String r1 = r6.A0S
            boolean r23 = X.C62183Xq.A00(r4)
            if (r3 != 0) goto L_0x0168
            r21 = 0
        L_0x015d:
            r20 = r1
            r24 = r2
            r17 = r4
            X.C59693Lv.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0047
        L_0x0168:
            boolean r2 = r3.A05
            X.21z r0 = r3.A01
            java.lang.String r21 = r0.name()
            goto L_0x015d
        L_0x0171:
            r12 = 0
            goto L_0x0122
        L_0x0173:
            if (r8 == 0) goto L_0x017c
            boolean r1 = r8.A06(r5)
            r0 = 1
            if (r1 != 0) goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            r7.setChecked(r0)
            goto L_0x00e0
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19000yP.A05(X.4tP):void");
    }

    public boolean getShouldShowNewUI() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A0P, 36316276359957566L);
    }

    public C19000yP(Context context, View view, C34640IcN icN, ShareLaterMedia shareLaterMedia, UserSession userSession, C83864s7 r9, String str, List list, List list2) {
        super(context);
        this.A0M = icN.requireActivity();
        this.A0N = icN;
        this.A0P = userSession;
        LayoutInflater A0C2 = C18180wK.A0C(this);
        A0C2.inflate(R.layout.widget_share_table, this);
        this.A0L = C18220wO.A0J(this, R.id.share_table_button_container);
        View requireViewById = requireViewById(R.id.share_table_divider);
        this.A0W = requireViewById;
        this.A0R = r9;
        this.A0O = shareLaterMedia;
        this.A0Q = new C61283Sp();
        this.A0S = str;
        if (C62913b8.A00(AnonymousClass2RN.A00(userSession))) {
            this.A02 = new C61103Rx(context);
        }
        setupViews(view, A0C2, list, list2);
        requireViewById.setVisibility(8);
    }

    private void setFbShareTextView(IgSwitch igSwitch) {
        Context context = getContext();
        UserSession userSession = this.A0P;
        AnonymousClass06E A002 = AnonymousClass06E.A00(this.A0N);
        IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(50, this, igSwitch);
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        String A17 = A0Y.A17();
        if (A17 != null) {
            CallerContext callerContext = C67163yy.A00;
            if (C61853Wb.A00(callerContext, userSession, "ig_unpublished_fb_page_fetcher") != null && A0Y.A17() != null) {
                C67463zb A003 = C67463zb.A00();
                A003.A05("page_id", A17);
                AnonymousClass7Ko.A0B(A1Z);
                C32165H8c A0X = C18220wO.A0X(C67473zc.A00(A003, C204414r.class, "FbPageUnpublishedStatusQuery"), C61853Wb.A00(callerContext, userSession, "ig_unpublished_fb_page_fetcher"));
                A0X.A00 = iDxACallbackShape35S0200000_1_I2;
                C31155GhB.A01(context, A002, A0X);
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = C14030oh.A06(1663264099);
        if (this.A0H != null) {
            AnonymousClass3LY.A00(this.A0P).A01(this.A0H, AnonymousClass46V.class);
        }
        if (this.A0I != null) {
            AnonymousClass3LY.A00(this.A0P).A01(this.A0I, AnonymousClass46U.class);
        }
        C14030oh.A0D(1867524867, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(-1462359931);
        if (this.A0H != null) {
            AnonymousClass3LY.A00(this.A0P).A02(this.A0H, AnonymousClass46V.class);
        }
        if (this.A0I != null) {
            AnonymousClass3LY.A00(this.A0P).A02(this.A0I, AnonymousClass46U.class);
        }
        C14030oh.A0D(-143610878, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0E != null) {
            View view = this.A0W;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.A0E.getMeasuredHeight(), 1073741824));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (View enabled : this.A0T) {
            enabled.setEnabled(z);
        }
        for (View enabled2 : this.A0U) {
            enabled2.setEnabled(z);
        }
    }

    public void setIsShareToCloseFriends(Boolean bool) {
        this.A0B = bool.booleanValue();
    }

    public void setIsPostingToSelfIgProfile(boolean z) {
        this.A0A = z;
    }

    public void setOnAppSharingToggleListener(C83104qn r1) {
        this.A04 = r1;
    }
}
