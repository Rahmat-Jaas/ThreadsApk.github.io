package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Yu  reason: invalid class name and case insensitive filesystem */
public final class C22621Yu extends C34640IcN {
    public static final String __redex_internal_original_name = "LiveAudienceSelectorFragment";
    public TextView A00;
    public AnonymousClass433 A01;
    public C19577Ayd A02;
    public C19577Ayd A03;
    public C19577Ayd A04;
    public C19577Ayd A05;
    public C19577Ayd A06;
    public C19577Ayd A07;
    public C19577Ayd A08;
    public C82444pd A09;
    public AnonymousClass495 A0A;
    public IgdsBottomButtonLayout A0B;
    public C37383Jqm A0C;
    public AnonymousClass252 A0D;
    public boolean A0E;
    public C19577Ayd A0F;
    public final C04530Oa A0G = C80644m9.A00(this);
    public final EnumMap A0H = new EnumMap(AnonymousClass252.class);

    public final String getModuleName() {
        return "live_audience_control";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0201, code lost:
        r10 = X.C18200wM.A0K(r1, com.instagram.barcelona.R.id.title);
        r10.setText(X.C59573Li.A00(X.AnonymousClass0wJ.A0X(r8), r2, X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0223, code lost:
        if (X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8)) == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0225, code lost:
        r10.setTextAppearance(requireContext(), com.instagram.barcelona.R.style.igds_emphasized_body_1);
        X.C18180wK.A0s(requireContext(), r10, com.instagram.barcelona.R.color.igds_primary_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0239, code lost:
        r10 = X.C18200wM.A0K(r1, com.instagram.barcelona.R.id.sub_title);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0248, code lost:
        if (X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8)) == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x024c, code lost:
        if (r2 != X.AnonymousClass252.A03) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x024e, code lost:
        r14.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0250, code lost:
        r9 = X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0258, code lost:
        switch(r11) {
            case 0: goto L_0x0277;
            case 1: goto L_0x0289;
            case 2: goto L_0x027d;
            case 3: goto L_0x0283;
            case 4: goto L_0x029f;
            default: goto L_0x025b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025b, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025d, code lost:
        r0 = 2131828654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0260, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        if (r0 == null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0266, code lost:
        r10.setText(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026d, code lost:
        r0 = r14.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026f, code lost:
        if (r0 != null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0271, code lost:
        X.C04220Ms.A0E("selectedVisibilityMode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0276, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0277, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0279, code lost:
        r0 = 2131828661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027d, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027f, code lost:
        r0 = 2131828666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0283, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0285, code lost:
        r0 = 2131828648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0291, code lost:
        if (X.C19573AyZ.A02(X.AnonymousClass0wJ.A0X(r8)) == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0293, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0295, code lost:
        r0 = 2131828658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0299, code lost:
        if (r9 != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029b, code lost:
        r0 = 2131828657;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029f, code lost:
        r10.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a3, code lost:
        if (r2 != r0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a5, code lost:
        A01(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a8, code lost:
        X.AnonymousClass0wJ.A18(r1, 60, r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02af, code lost:
        if (r2 != X.AnonymousClass252.A03) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b9, code lost:
        if (X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8)) != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bb, code lost:
        r14.A00 = X.C18200wM.A0K(r1, com.instagram.barcelona.R.id.action_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c4, code lost:
        r0 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c8, code lost:
        if (r0 != null) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ca, code lost:
        X.C04220Ms.A0E("closeFriendsActionTextView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02cd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ce, code lost:
        r0.setVisibility(0);
        r2 = X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8));
        r0 = com.instagram.barcelona.R.id.action_chevron;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02dc, code lost:
        if (r2 == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02de, code lost:
        r0 = com.instagram.barcelona.R.id.sub_title_chevron;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02e1, code lost:
        r0 = r1.requireViewById(r0);
        X.C04220Ms.A0C(r0, "null cannot be cast to non-null type android.widget.ImageView");
        r0.setVisibility(0);
        r0 = X.AnonymousClass0wJ.A0X(r8);
        r10 = X.C06810aP.A01;
        r0 = r10.A01(r0).A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f9, code lost:
        if (r0 == null) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ff, code lost:
        if (r0.intValue() != 0) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0301, code lost:
        r1 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0303, code lost:
        if (r1 != null) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0305, code lost:
        X.C04220Ms.A0E("closeFriendsActionTextView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0308, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0309, code lost:
        r9 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x030b, code lost:
        if (r9 != null) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030d, code lost:
        X.C04220Ms.A0E("closeFriendsActionTextView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0310, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0311, code lost:
        r0 = r10.A01(X.AnonymousClass0wJ.A0X(r8)).A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031d, code lost:
        if (r0 == null) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031f, code lost:
        r0 = X.C18230wP.A0j(r1.getResources(), r10.A01(X.AnonymousClass0wJ.A0X(r8)).A0l(), com.instagram.barcelona.R.plurals.iglive_audience_mode_close_friends_edit_option_close_friends_added, r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033a, code lost:
        r9.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0340, code lost:
        r1.setText(2131828649);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0346, code lost:
        r1 = r14.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0348, code lost:
        if (r1 != null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x034a, code lost:
        X.C04220Ms.A0E("closeFriendsActionTextView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034e, code lost:
        X.AnonymousClass0wJ.A16(r1, 275, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0361, code lost:
        if (X.C28161tl.A04(X.AnonymousClass0wJ.A0X(r8)).getBoolean("live_has_seen_close_friends_tooltip_when_selected_from_audience_bottomsheet", false) != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0363, code lost:
        r0 = r14.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0365, code lost:
        if (r0 != null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0367, code lost:
        X.C04220Ms.A0E("closeFriendsTooltipViewStub");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036d, code lost:
        r10 = X.C18200wM.A0K(r0.A08(), com.instagram.barcelona.R.id.tooltip_text);
        r9 = X.C18730xl.A00(r14, X.C18180wK.A00(r14), 13);
        r0 = 2131829730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x038d, code lost:
        if (X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8)) == false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038f, code lost:
        r0 = 2131829731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0392, code lost:
        r1 = X.AnonymousClass00U.A0V(getString(r0), " ", getString(2131821599));
        X.C04220Ms.A06(r1);
        r10.setText(r1);
        X.AnonymousClass3Zw.A03(r9, r10, getString(2131821599), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0152, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ec, code lost:
        if (r14.A0E != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        if (r14.A0E != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        if (r14.A0E != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bc, code lost:
        r1 = X.C18230wP.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c0, code lost:
        r3 = r1.requireViewById(com.instagram.barcelona.R.id.radio_button);
        X.C04220Ms.A0C(r3, "null cannot be cast to non-null type android.widget.RadioButton");
        r14.A0H.put(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01db, code lost:
        if (X.C25776Drp.A02(X.AnonymousClass0wJ.A0X(r8)) == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01dd, code lost:
        r9 = r1.requireViewById(com.instagram.barcelona.R.id.icon);
        X.C04220Ms.A0C(r9, "null cannot be cast to non-null type android.widget.ImageView");
        r9 = (android.widget.ImageView) r9;
        r9.setVisibility(0);
        r0 = requireContext();
        r8.getValue();
        r9.setImageDrawable(X.C59573Li.A01(r0, r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fc, code lost:
        if (r2 != X.AnonymousClass252.A03) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fe, code lost:
        r9.setBackground((android.graphics.drawable.Drawable) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r7 = 0
            X.C04220Ms.A0B(r15, r7)
            r0 = r16
            super.onViewCreated(r15, r0)
            r0 = 2131297055(0x7f09031f, float:1.8212044E38)
            android.view.View r6 = r15.requireViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C04220Ms.A0C(r6, r0)
            boolean r0 = r14.A0E
            if (r0 != 0) goto L_0x0048
            X.0Oa r0 = r14.A0G
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.C18250wR.A0D(r3, r7)
            r0 = 36325235662005252(0x810d9c00042404, double:3.035563530411131E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0048
            int r4 = r6.getPaddingLeft()
            int r3 = r6.getPaddingTop()
            int r2 = r6.getPaddingRight()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.setPadding(r4, r3, r2, r0)
        L_0x0048:
            r0 = 2131297073(0x7f090331, float:1.821208E38)
            android.view.View r1 = r15.requireViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout"
            X.C04220Ms.A0C(r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            r14.A0B = r1
            boolean r0 = r14.A0E
            r4 = 8
            java.lang.String r13 = "submitButton"
            r5 = 0
            if (r0 != 0) goto L_0x0081
            X.0Oa r0 = r14.A0G
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.C18250wR.A0D(r3, r7)
            r0 = 36325235662005252(0x810d9c00042404, double:3.035563530411131E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0081
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0B
            if (r0 != 0) goto L_0x007e
            X.C04220Ms.A0E(r13)
            throw r5
        L_0x007e:
            r0.setVisibility(r4)
        L_0x0081:
            X.0Oa r8 = r14.A0G
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            if (r0 == 0) goto L_0x00bc
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0B
            if (r0 != 0) goto L_0x0095
            X.C04220Ms.A0E(r13)
            throw r5
        L_0x0095:
            android.view.ViewGroup$MarginLayoutParams r9 = X.C18230wP.A0H(r0)
            int r3 = r9.getMarginStart()
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r14)
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r9.getMarginEnd()
            int r0 = r9.bottomMargin
            r9.setMargins(r3, r2, r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A0B
            if (r0 != 0) goto L_0x00b9
            X.C04220Ms.A0E(r13)
            throw r5
        L_0x00b9:
            r0.setLayoutParams(r9)
        L_0x00bc:
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x00db
            android.view.View r1 = r14.requireView()
            r0 = 2131296442(0x7f0900ba, float:1.82108E38)
            android.view.ViewGroup r2 = X.C18220wO.A0J(r1, r0)
            r0 = 274(0x112, float:3.84E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r14, r0)
            X.E2V r1 = new X.E2V
            r1.<init>(r0, r2)
            X.41o r0 = X.C679541o.A00
            r1.A0S(r0)
        L_0x00db:
            boolean r0 = r14.A0E
            r11 = r0 ^ 1
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C19573AyZ.A02(r0)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r14.A0E
            r10 = 1
            if (r0 == 0) goto L_0x00ef
        L_0x00ee:
            r10 = 0
        L_0x00ef:
            android.os.Bundle r1 = r14.mArguments
            if (r1 == 0) goto L_0x03b2
            java.lang.String r0 = "ARG_IS_FAN_CLUB_ELIGIBLE"
            boolean r9 = r1.getBoolean(r0)
        L_0x00f9:
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r8)
            X.0TJ r2 = X.C18250wR.A0D(r3, r7)
            r0 = 36325235662136325(0x810d9c00062405, double:3.035563530494022E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0111
            boolean r0 = r14.A0E
            r3 = 1
            if (r0 == 0) goto L_0x0112
        L_0x0111:
            r3 = 0
        L_0x0112:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A00(r0)
            if (r0 == 0) goto L_0x0121
            boolean r0 = r14.A0E
            r2 = 1
            if (r0 == 0) goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            X.252 r0 = X.AnonymousClass252.A07
            r1.add(r0)
            if (r11 == 0) goto L_0x0132
            X.252 r0 = X.AnonymousClass252.A06
            r1.add(r0)
        L_0x0132:
            if (r10 == 0) goto L_0x0139
            X.252 r0 = X.AnonymousClass252.A05
            r1.add(r0)
        L_0x0139:
            if (r9 == 0) goto L_0x0140
            X.252 r0 = X.AnonymousClass252.A08
            r1.add(r0)
        L_0x0140:
            if (r3 == 0) goto L_0x0147
            X.252 r0 = X.AnonymousClass252.A04
            r1.add(r0)
        L_0x0147:
            if (r2 == 0) goto L_0x014e
            X.252 r0 = X.AnonymousClass252.A03
            r1.add(r0)
        L_0x014e:
            java.util.Iterator r12 = r1.iterator()
        L_0x0152:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03b5
            java.lang.Object r2 = r12.next()
            X.252 r2 = (X.AnonymousClass252) r2
            int r11 = r2.ordinal()
            switch(r11) {
                case 0: goto L_0x016d;
                case 1: goto L_0x017b;
                case 2: goto L_0x0174;
                case 3: goto L_0x018c;
                case 4: goto L_0x01a4;
                case 5: goto L_0x0182;
                default: goto L_0x0165;
            }
        L_0x0165:
            java.lang.String r0 = "Cannot get title for unsupported audience mode"
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>(r0)
            throw r5
        L_0x016d:
            X.Ayd r0 = r14.A07
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "publicAudienceViewStub"
            goto L_0x0188
        L_0x0174:
            X.Ayd r0 = r14.A08
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "subscribersPrivateAudienceViewStub"
            goto L_0x0188
        L_0x017b:
            X.Ayd r0 = r14.A06
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "privateAudienceViewStub"
            goto L_0x0188
        L_0x0182:
            X.Ayd r0 = r14.A05
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "internalAudienceViewStub"
        L_0x0188:
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x018c:
            X.Ayd r0 = r14.A02
            if (r0 != 0) goto L_0x0196
            java.lang.String r0 = "closeFriendsAudienceViewStub"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x0196:
            android.view.View r1 = r0.A08()
            if (r1 != 0) goto L_0x01c0
            java.lang.String r0 = "View does not exist in layout for visibility mode close friends."
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>(r0)
            throw r5
        L_0x01a4:
            X.Ayd r0 = r14.A04
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "followersYouFollowBackAudienceViewStub"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x01ae:
            android.view.View r1 = r0.A08()
            if (r1 != 0) goto L_0x01c0
            java.lang.String r0 = "View does not exist in layout for visibility mode followers you follow back."
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>(r0)
            throw r5
        L_0x01bc:
            android.view.View r1 = X.C18230wP.A0G(r0)
        L_0x01c0:
            r0 = 2131305266(0x7f092332, float:1.8228698E38)
            android.view.View r3 = r1.requireViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RadioButton"
            X.C04220Ms.A0C(r3, r0)
            java.util.EnumMap r0 = r14.A0H
            r0.put(r2, r3)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.ImageView"
            if (r0 == 0) goto L_0x0201
            r0 = 2131301509(0x7f091485, float:1.8221078E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.C04220Ms.A0C(r9, r3)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9.setVisibility(r7)
            android.content.Context r0 = r14.requireContext()
            r8.getValue()
            android.graphics.drawable.Drawable r0 = X.C59573Li.A01(r0, r2, r7)
            r9.setImageDrawable(r0)
            X.252 r0 = X.AnonymousClass252.A03
            if (r2 != r0) goto L_0x0201
            r9.setBackground(r5)
        L_0x0201:
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r10 = X.C18200wM.A0K(r1, r0)
            com.instagram.service.session.UserSession r9 = X.AnonymousClass0wJ.A0X(r8)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            int r0 = X.C59573Li.A00(r9, r2, r0)
            r10.setText(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            if (r0 == 0) goto L_0x0239
            android.content.Context r9 = r14.requireContext()
            r0 = 2131887420(0x7f12053c, float:1.9409447E38)
            r10.setTextAppearance(r9, r0)
            android.content.Context r9 = r14.requireContext()
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C18180wK.A0s(r9, r10, r0)
        L_0x0239:
            r0 = 2131307597(0x7f092c4d, float:1.8233426E38)
            android.widget.TextView r10 = X.C18200wM.A0K(r1, r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            if (r0 == 0) goto L_0x0250
            X.252 r0 = X.AnonymousClass252.A03
            if (r2 != r0) goto L_0x0250
            r14.A00 = r10
        L_0x0250:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r9 = X.C25776Drp.A02(r0)
            switch(r11) {
                case 0: goto L_0x0277;
                case 1: goto L_0x0289;
                case 2: goto L_0x027d;
                case 3: goto L_0x0283;
                case 4: goto L_0x029f;
                default: goto L_0x025b;
            }
        L_0x025b:
            if (r9 != 0) goto L_0x029f
            r0 = 2131828654(0x7f111fae, float:1.9290255E38)
        L_0x0260:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x029f
            int r0 = r0.intValue()
            r10.setText(r0)
        L_0x026d:
            X.252 r0 = r14.A0D
            if (r0 != 0) goto L_0x02a3
            java.lang.String r0 = "selectedVisibilityMode"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x0277:
            if (r9 != 0) goto L_0x029f
            r0 = 2131828661(0x7f111fb5, float:1.929027E38)
            goto L_0x0260
        L_0x027d:
            if (r9 != 0) goto L_0x029f
            r0 = 2131828666(0x7f111fba, float:1.929028E38)
            goto L_0x0260
        L_0x0283:
            if (r9 != 0) goto L_0x029f
            r0 = 2131828648(0x7f111fa8, float:1.9290243E38)
            goto L_0x0260
        L_0x0289:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C19573AyZ.A02(r0)
            if (r0 == 0) goto L_0x0299
            if (r9 != 0) goto L_0x029f
            r0 = 2131828658(0x7f111fb2, float:1.9290263E38)
            goto L_0x0260
        L_0x0299:
            if (r9 != 0) goto L_0x029f
            r0 = 2131828657(0x7f111fb1, float:1.9290261E38)
            goto L_0x0260
        L_0x029f:
            r10.setVisibility(r4)
            goto L_0x026d
        L_0x02a3:
            if (r2 != r0) goto L_0x02a8
            A01(r14, r2)
        L_0x02a8:
            r0 = 60
            X.AnonymousClass0wJ.A18(r1, r0, r14, r2)
            X.252 r0 = X.AnonymousClass252.A03
            if (r2 != r0) goto L_0x0152
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r0 = X.C25776Drp.A02(r0)
            if (r0 != 0) goto L_0x02c4
            r0 = 2131296528(0x7f090110, float:1.8210975E38)
            android.widget.TextView r0 = X.C18200wM.A0K(r1, r0)
            r14.A00 = r0
        L_0x02c4:
            android.widget.TextView r0 = r14.A00
            java.lang.String r11 = "closeFriendsActionTextView"
            if (r0 != 0) goto L_0x02ce
            X.C04220Ms.A0E(r11)
            throw r5
        L_0x02ce:
            r0.setVisibility(r7)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r2 = X.C25776Drp.A02(r0)
            r0 = 2131296497(0x7f0900f1, float:1.8210912E38)
            if (r2 == 0) goto L_0x02e1
            r0 = 2131307598(0x7f092c4e, float:1.8233428E38)
        L_0x02e1:
            android.view.View r0 = r1.requireViewById(r0)
            X.C04220Ms.A0C(r0, r3)
            r0.setVisibility(r7)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            X.0Ok r10 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r10.A01(r0)
            java.lang.Integer r0 = r0.A0l()
            if (r0 == 0) goto L_0x0309
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0309
            android.widget.TextView r1 = r14.A00
            if (r1 != 0) goto L_0x0340
            X.C04220Ms.A0E(r11)
            throw r5
        L_0x0309:
            android.widget.TextView r9 = r14.A00
            if (r9 != 0) goto L_0x0311
            X.C04220Ms.A0E(r11)
            throw r5
        L_0x0311:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            com.instagram.user.model.User r0 = r10.A01(r0)
            java.lang.Integer r0 = r0.A0l()
            if (r0 == 0) goto L_0x033e
            int r3 = r0.intValue()
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131689599(0x7f0f007f, float:1.9008218E38)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            com.instagram.user.model.User r0 = r10.A01(r0)
            java.lang.Integer r0 = r0.A0l()
            java.lang.String r0 = X.C18230wP.A0j(r2, r0, r1, r3)
        L_0x033a:
            r9.setText(r0)
            goto L_0x0346
        L_0x033e:
            r0 = r5
            goto L_0x033a
        L_0x0340:
            r0 = 2131828649(0x7f111fa9, float:1.9290245E38)
            r1.setText(r0)
        L_0x0346:
            android.widget.TextView r1 = r14.A00
            if (r1 != 0) goto L_0x034e
            X.C04220Ms.A0E(r11)
            throw r5
        L_0x034e:
            r0 = 275(0x113, float:3.85E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r14)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "live_has_seen_close_friends_tooltip_when_selected_from_audience_bottomsheet"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x0152
            X.Ayd r0 = r14.A03
            if (r0 != 0) goto L_0x036d
            java.lang.String r0 = "closeFriendsTooltipViewStub"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x036d:
            android.view.View r1 = r0.A08()
            r0 = 2131308325(0x7f092f25, float:1.8234902E38)
            android.widget.TextView r10 = X.C18200wM.A0K(r1, r0)
            int r1 = X.C18180wK.A00(r14)
            r0 = 13
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r9 = X.C18730xl.A00(r14, r1, r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            boolean r1 = X.C25776Drp.A02(r0)
            r0 = 2131829730(0x7f1123e2, float:1.9292437E38)
            if (r1 == 0) goto L_0x0392
            r0 = 2131829731(0x7f1123e3, float:1.929244E38)
        L_0x0392:
            java.lang.String r3 = r14.getString(r0)
            java.lang.String r1 = " "
            r2 = 2131821599(0x7f11041f, float:1.9275946E38)
            java.lang.String r0 = r14.getString(r2)
            java.lang.String r1 = X.AnonymousClass00U.A0V(r3, r1, r0)
            X.C04220Ms.A06(r1)
            r10.setText(r1)
            java.lang.String r0 = r14.getString(r2)
            X.AnonymousClass3Zw.A03(r9, r10, r0, r1)
            goto L_0x0152
        L_0x03b2:
            r9 = 0
            goto L_0x00f9
        L_0x03b5:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r8)
            com.instagram.monetization.repository.MonetizationRepository r1 = X.AnonymousClass2RN.A00(r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0446
            X.Ayd r0 = r14.A0F
            java.lang.String r10 = "subscriptionsReminderViewStub"
            if (r0 != 0) goto L_0x03cf
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x03cf:
            android.view.View r1 = r0.A08()
            r0 = 2131307597(0x7f092c4d, float:1.8233426E38)
            android.widget.TextView r9 = X.C18200wM.A0K(r1, r0)
            X.Ayd r0 = r14.A0F
            if (r0 != 0) goto L_0x03e2
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x03e2:
            android.view.View r1 = r0.A08()
            r0 = 2131296528(0x7f090110, float:1.8210975E38)
            android.widget.TextView r1 = X.C18200wM.A0K(r1, r0)
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x0431
            r0 = 2131828786(0x7f112032, float:1.9290523E38)
            java.lang.String r2 = X.C18180wK.A0g(r14, r0)
            r0 = 2131828785(0x7f112031, float:1.929052E38)
            java.lang.String r1 = X.C18180wK.A0g(r14, r0)
            r0 = 32
            java.lang.String r0 = X.AnonymousClass00U.A0N(r2, r1, r0)
            android.text.SpannableStringBuilder r8 = X.C18200wM.A0E(r0)
            int r4 = X.C18220wO.A08(r2)
            int r3 = X.C18220wO.A08(r1)
            int r1 = X.C18180wK.A00(r14)
            r0 = 14
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r2 = X.C18730xl.A00(r14, r1, r0)
            int r1 = r4 + 1
            int r4 = r4 + r3
            int r0 = r4 + 1
            r8.setSpan(r2, r1, r0, r7)
            X.C18180wK.A0z(r9)
            r9.setText(r8)
        L_0x0429:
            X.Ayd r0 = r14.A0F
            if (r0 != 0) goto L_0x0443
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x0431:
            r0 = 2131828781(0x7f11202d, float:1.9290513E38)
            r9.setText(r0)
            r0 = 2131828780(0x7f11202c, float:1.929051E38)
            r1.setText(r0)
            r0 = 276(0x114, float:3.87E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r14)
            goto L_0x0429
        L_0x0443:
            r0.A09(r7)
        L_0x0446:
            r6.invalidate()
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r14.A0B
            if (r1 != 0) goto L_0x0451
            X.C04220Ms.A0E(r13)
            throw r5
        L_0x0451:
            r0 = 277(0x115, float:3.88E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r14, r0)
            r1.setPrimaryActionOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22621Yu.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C22621Yu r3) {
        C82444pd r1 = r3.A09;
        if (r1 != null) {
            AnonymousClass252 r0 = r3.A0D;
            if (r0 != null) {
                r1.BlU(r0);
            }
            C04220Ms.A0E("selectedVisibilityMode");
            throw null;
        }
        AnonymousClass252 r12 = r3.A0D;
        if (r12 != null) {
            if (r12 == AnonymousClass252.A03) {
                AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r3.A0G))), "live_has_seen_close_friends_tooltip_when_selected_from_audience_bottomsheet", true);
            }
            if (r3.A0E) {
                FragmentActivity activity = r3.getActivity();
                if (activity != null) {
                    activity.getSupportFragmentManager().A16();
                    return;
                }
                return;
            }
            Context context = r3.getContext();
            if (context != null) {
                C18210wN.A0p(context);
                return;
            }
            return;
        }
        C04220Ms.A0E("selectedVisibilityMode");
        throw null;
    }

    public static final void A01(C22621Yu r4, AnonymousClass252 r5) {
        boolean z;
        String str;
        Iterator A0u = C18190wL.A0u(r4.A0H);
        while (true) {
            z = true;
            if (!A0u.hasNext()) {
                break;
            }
            Map.Entry A0o = C18180wK.A0o(A0u);
            Object key = A0o.getKey();
            CompoundButton compoundButton = (CompoundButton) A0o.getValue();
            if (key != r5) {
                z = false;
            }
            compoundButton.setChecked(z);
        }
        r4.A0D = r5;
        IgdsBottomButtonLayout igdsBottomButtonLayout = r4.A0B;
        if (igdsBottomButtonLayout == null) {
            str = "submitButton";
        } else {
            Integer A0l = AnonymousClass0wJ.A0Y(AnonymousClass0wJ.A0X(r4.A0G)).A0l();
            if (A0l != null && A0l.intValue() == 0) {
                AnonymousClass252 r1 = r4.A0D;
                if (r1 == null) {
                    str = "selectedVisibilityMode";
                } else if (r1 == AnonymousClass252.A03) {
                    z = false;
                }
            }
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
            return;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r10 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r0.containsKey(r3) == true) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != true) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r8 != r0) goto L_0x00a6
            X.0Oa r0 = r7.A0G
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.Integer r4 = r0.A0l()
            java.lang.String r3 = "private_story_audience_member_count"
            r2 = 1
            if (r10 == 0) goto L_0x0027
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x0027
            boolean r1 = r0.containsKey(r3)
            r0 = 1
            if (r1 == r2) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r6 = 0
            if (r0 == 0) goto L_0x004c
            if (r10 == 0) goto L_0x004a
        L_0x002d:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x004a
            java.lang.Integer r4 = X.C18210wN.A0T(r0, r3)
        L_0x0037:
            r5 = 0
            java.lang.String r2 = "closeFriendsActionTextView"
            if (r4 == 0) goto L_0x005d
            int r0 = r4.intValue()
            if (r0 != 0) goto L_0x005d
            android.widget.TextView r1 = r7.A00
            if (r1 != 0) goto L_0x007c
            X.C04220Ms.A0E(r2)
            throw r6
        L_0x004a:
            r4 = r6
            goto L_0x0037
        L_0x004c:
            java.lang.String r3 = "close_friend_count"
            if (r10 == 0) goto L_0x0037
            android.os.Bundle r0 = r10.getExtras()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L_0x0037
            goto L_0x002d
        L_0x005d:
            android.widget.TextView r3 = r7.A00
            if (r3 != 0) goto L_0x0065
            X.C04220Ms.A0E(r2)
            throw r6
        L_0x0065:
            if (r4 == 0) goto L_0x007a
            int r2 = r4.intValue()
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r7)
            r0 = 2131689599(0x7f0f007f, float:1.9008218E38)
            java.lang.String r0 = X.C18230wP.A0j(r1, r4, r0, r2)
        L_0x0076:
            r3.setText(r0)
            goto L_0x0082
        L_0x007a:
            r0 = r6
            goto L_0x0076
        L_0x007c:
            r0 = 2131828649(0x7f111fa9, float:1.9290245E38)
            r1.setText(r0)
        L_0x0082:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r7.A0B
            if (r2 != 0) goto L_0x008c
            java.lang.String r0 = "submitButton"
            X.C04220Ms.A0E(r0)
            throw r6
        L_0x008c:
            X.252 r1 = r7.A0D
            if (r1 != 0) goto L_0x0096
            java.lang.String r0 = "selectedVisibilityMode"
            X.C04220Ms.A0E(r0)
            throw r6
        L_0x0096:
            X.252 r0 = X.AnonymousClass252.A03
            if (r1 != r0) goto L_0x00a2
            if (r4 == 0) goto L_0x00a2
            int r0 = r4.intValue()
            if (r0 == 0) goto L_0x00a3
        L_0x00a2:
            r5 = 1
        L_0x00a3:
            r2.setPrimaryButtonEnabled(r5)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22621Yu.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(313147867);
        super.onCreate(bundle);
        C04530Oa r1 = this.A0G;
        this.A0A = AnonymousClass2O7.A00(AnonymousClass0wJ.A0X(r1));
        this.A01 = new AnonymousClass433(requireActivity(), AnonymousClass0wJ.A0X(r1));
        setModuleNameV2("live_audience_control");
        C14030oh.A09(213996474, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-1243105440);
        C04220Ms.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean("ARG_IS_FOR_SCHEDULING_LIVE")) {
            z = false;
        }
        this.A0E = z;
        int i = R.layout.layout_iglive_audience_mode_tool;
        if (z) {
            i = R.layout.layout_iglive_audience_mode_scheduling;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.audience_mode_public);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        this.A07 = new C19577Ayd((ViewStub) requireViewById);
        this.A04 = C18190wL.A0U(inflate, R.id.audience_mode_followers_you_follow_back);
        this.A02 = C18190wL.A0U(inflate, R.id.audience_mode_close_friends);
        this.A03 = C18190wL.A0U(inflate, R.id.tooltip_close_friends);
        this.A08 = C18180wK.A0U(inflate, R.id.audience_mode_subscribers);
        this.A06 = C18180wK.A0U(inflate, R.id.audience_mode_private);
        this.A05 = C18180wK.A0U(inflate, R.id.audience_mode_internal);
        this.A0F = C18180wK.A0U(inflate, R.id.subscriptions_reminder);
        if (this.A0D == null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (str = bundle3.getString("ARG_INITIAL_AUDIENCE_MODE")) == null) {
                str = "public";
            }
            this.A0D = C60443Pb.A01(str);
        }
        C14030oh.A09(1195728080, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2129619264);
        super.onResume();
        AnonymousClass252 r0 = this.A0D;
        if (r0 == null) {
            C04220Ms.A0E("selectedVisibilityMode");
            throw null;
        }
        A01(this, r0);
        C14030oh.A09(-429802538, A022);
    }
}
