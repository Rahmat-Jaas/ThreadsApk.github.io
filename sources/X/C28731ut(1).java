package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.redex.IDxListenerShape824S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29;

/* renamed from: X.1ut  reason: invalid class name and case insensitive filesystem */
public final class C28731ut extends AnonymousClass1cP {
    public static final String __redex_internal_original_name = "PrivateStoryAudiencePickerFragment";
    public int A00 = 0;
    public C312224t A01;
    public AnonymousClass3GJ A02;
    public UserSession A03;
    public AnonymousClass3I8 A04;
    public C67233zC A05;
    public boolean A06 = false;
    public boolean A07 = false;

    public final String getModuleName() {
        return "audience_selection";
    }

    public static void A02(C28731ut r5) {
        UserSession userSession = r5.A03;
        int size = r5.A04.A01.size();
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36325643683636392L)) {
            AnonymousClass0wJ.A0Y(userSession).A05.CiF(Integer.valueOf(size));
        } else {
            ((C565037l) userSession.A01(C565037l.class, new KtLambdaShape49S0100000_I2_29(userSession, 47))).A00 = size;
        }
        C57343Ar r2 = r5.A04.A00;
        AnonymousClass3GJ r1 = r5.A02;
        r1.A03 = r2.A02.size();
        r1.A01 = r2.A00.size();
        r1.A00 = r2.A01.size();
        r1.A07 = AnonymousClass006.A0N;
        r1.A00();
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("private_story_audience_member_count", r5.A04.A01.size());
        if (r5.A06) {
            A0B.putExtra("private_story_share_to_fb", r5.A05.A02);
        }
        UserSession userSession2 = r5.A03;
        String A0j = C18180wK.A0j("users/%s/info/", new Object[]{userSession2.getUserId()});
        H1T A0P = AnonymousClass0wJ.A0P(userSession2);
        A0P.A0J(A0j);
        C63873iU.A0C(r5, AnonymousClass0wJ.A0T(A0P, CP8.class, C25056Dep.class), 39);
        r5.requireActivity().setResult(-1, A0B);
        C18190wL.A1A(r5);
    }

    public static void A03(C28731ut r2) {
        int i;
        int size = r2.A04.A01.size();
        if (r2.A05.A02) {
            i = r2.A00;
        } else {
            i = 0;
        }
        r2.A00.A02(size + i);
    }

    public final void A06() {
        this.A00.A03(requireContext(), (View.OnClickListener) null, C170039uK.LOADING);
        Context requireContext = requireContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(this);
        UserSession userSession = this.A03;
        C04220Ms.A0B(userSession, 0);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("stories/private_stories/members/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1TM.class, AnonymousClass3LO.class);
        C63873iU.A0E(A0T, this, 38);
        C31155GhB.A01(requireContext, A002, A0T);
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    private SpannableStringBuilder A01(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(2131828387);
        spannableStringBuilder.append(getString(i)).append(" ").append(string);
        AnonymousClass3Zw.A01(spannableStringBuilder, new C18720xk(C18220wO.A02(requireContext(), R.attr.textColorBoldLink)), string);
        return spannableStringBuilder;
    }

    public final void A05(IgCheckBox igCheckBox, AnonymousClass395 r9) {
        boolean z = !igCheckBox.isChecked();
        igCheckBox.setChecked(z);
        this.A04.A01(r9, z, this.A01.A01);
        AnonymousClass1cP.A00(this);
        A03(this);
        UserSession userSession = this.A03;
        C312224t r0 = this.A02.A05;
        r0.getClass();
        String str = r0.A00;
        String id = r9.A01.getId();
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1Q(str, id);
        AnonymousClass3LR.A00((C63873iU) null, userSession, "audience_selection", str, id, (String) null, z);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(getString(2131824038));
        r3.CtT(true);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 253);
    }

    public final boolean onBackPressed() {
        A02(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(460586478);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0V = C18180wK.A0V(requireArguments);
        this.A03 = A0V;
        this.A04 = new AnonymousClass3I8();
        this.A02 = new AnonymousClass3GJ(this, A0V);
        C312224t r0 = (C312224t) requireArguments.getSerializable("entry_point");
        this.A01 = r0;
        AnonymousClass3GJ r1 = this.A02;
        if (r0 == null) {
            r0 = C312224t.UNKNOWN;
        }
        r1.A05 = r0;
        r1.A09 = true;
        this.A06 = requireArguments.getBoolean("private_story_eligible_for_fb", false);
        this.A07 = requireArguments.getBoolean("private_story_share_to_fb", false);
        this.A05 = C60303Om.A01(this.A03, new IDxListenerShape824S0100000_1_I2(this, 0));
        C14030oh.A09(1287198291, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r7 == X.C312224t.A0I) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            super.onViewCreated(r9, r10)
            android.content.Context r6 = r8.requireContext()
            r0 = 2131297063(0x7f090327, float:1.821206E38)
            android.widget.TextView r4 = X.AnonymousClass0wJ.A0L(r9, r0)
            X.24t r7 = r8.A01
            X.24t r0 = X.C312224t.STORY_SHARE_SHEET
            r5 = 1
            r3 = 0
            if (r7 == r0) goto L_0x001b
            X.24t r0 = X.C312224t.STORY_SHARE_SHORTCUT
            r2 = 0
            if (r7 != r0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            X.24t r0 = X.C312224t.STATUS_SHARE_SHEET
            boolean r1 = X.C18180wK.A1Z(r7, r0)
            X.24t r0 = X.C312224t.REELS_AUDIENCE_CONTROL
            if (r7 == r0) goto L_0x0027
            r5 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0098
            r0 = 2131832798(0x7f112fde, float:1.929866E38)
        L_0x002c:
            r4.setText(r0)
        L_0x002f:
            r4.setVisibility(r3)
            r0 = 2131299831(0x7f090df7, float:1.8217675E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 2131826219(0x7f11162b, float:1.9285316E38)
            r1.setText((int) r0)
            r0 = 1
            r1.setEnabled(r0)
            r0 = 254(0xfe, float:3.56E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r8)
            r1.setVisibility(r3)
            r0 = 2131824038(0x7f110da6, float:1.9280893E38)
            java.lang.String r5 = r6.getString(r0)
            r0 = 2131832799(0x7f112fdf, float:1.9298662E38)
            java.lang.String r4 = r6.getString(r0)
            X.1fV r2 = r8.A00
            r1 = 2131233044(0x7f080914, float:1.8082214E38)
            X.3CS r0 = new X.3CS
            r0.<init>(r6, r5, r4, r1)
            r2.A01 = r0
            X.4Jz r2 = r8.A01
            com.instagram.service.session.UserSession r0 = r8.A03
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r0 = r0.getId()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "users/search/"
            java.lang.String r1 = X.C18180wK.A0j(r0, r1)
            java.lang.String r0 = "favorites_list_page"
            r2.A00(r1, r0)
            X.3zC r2 = r8.A05
            boolean r1 = r8.A07
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A05(r0, r1)
            X.1fV r1 = r8.A00
            X.3zC r0 = r8.A05
            X.C04220Ms.A0B(r0, r3)
            r1.A02 = r0
            r8.A06()
            return
        L_0x0098:
            if (r1 == 0) goto L_0x009e
            r0 = 2131836121(0x7f113cd9, float:1.93054E38)
            goto L_0x002c
        L_0x009e:
            if (r5 == 0) goto L_0x00b7
            r0 = 2131821596(0x7f11041c, float:1.927594E38)
            android.text.SpannableStringBuilder r0 = r8.A01(r0)
            r4.setText(r0)
            X.C18180wK.A0z(r4)
            r4.setHighlightColor(r3)
            r0 = 255(0xff, float:3.57E-43)
        L_0x00b2:
            X.AnonymousClass0wJ.A16(r4, r0, r8)
            goto L_0x002f
        L_0x00b7:
            r0 = 2131824041(0x7f110da9, float:1.9280899E38)
            android.text.SpannableStringBuilder r0 = r8.A01(r0)
            r4.setText(r0)
            X.C18180wK.A0z(r4)
            r4.setHighlightColor(r3)
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28731ut.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
