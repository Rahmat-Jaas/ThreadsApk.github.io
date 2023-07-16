package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape1S2100000_I2;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;

/* renamed from: X.1bs  reason: invalid class name and case insensitive filesystem */
public final class C23071bs extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "ChannelConfigureFragment";
    public IgTextView A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public IgdsListCell A05;
    public User A06;
    public boolean A07;
    public IgTextView A08;
    public boolean A09;
    public final C04530Oa A0A;
    public final C04530Oa A0B;
    public final C04530Oa A0C;
    public final C04530Oa A0D;
    public final C04530Oa A0E;
    public final C04530Oa A0F;
    public final C04530Oa A0G;
    public final C04530Oa A0H;
    public final C04530Oa A0I;
    public final C04530Oa A0J;
    public final C04530Oa A0K = C80644m9.A00(this);
    public final View.OnClickListener A0L;
    public final C04530Oa A0M;

    public final void configureActionBar(AnonymousClass4u2 r8) {
        C04220Ms.A0B(r8, 0);
        r8.CtT(true);
        AnonymousClass4u2.A04(C18180wK.A0N(), r8, this, 366);
        if (!AnonymousClass0wJ.A1X(this.A0H.getValue()) || this.A0A.getValue() != AnonymousClass20y.Social) {
            if (this.A0A.getValue() == AnonymousClass20y.Broadcast) {
                C04530Oa r2 = this.A0K;
                C10300i6 A0U = AnonymousClass0wJ.A0U(r2);
                AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
                if (C63803iN.A0E(r3, A0U, 36327099677615999L)) {
                    if (C04220Ms.A0I(A00(this).A0F.getValue(), C22884Chw.A00)) {
                        r8.AJb(true);
                        r8.setIsLoading(true);
                    } else if (this.A07) {
                        r8.setIsLoading(false);
                        r8.A7X(this.A0L, 2131825800);
                    } else {
                        r8.setIsLoading(false);
                    }
                    r8.A7U(2131825800);
                }
                if (C63803iN.A0E(r3, AnonymousClass0wJ.A0U(r2), 36327099677681536L)) {
                    r8.Cqb(2131825801);
                }
            }
        } else if (this.A07) {
            r8.A7X(this.A0L, 2131825808);
        } else {
            r8.A7U(2131825808);
        }
    }

    public final String getModuleName() {
        return "direct_interest_based_configure";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04c7, code lost:
        if (r0.B1g().size() < 5) goto L_0x04c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r12 = 0
            r2 = r27
            X.C04220Ms.A0B(r2, r12)
            r7 = r26
            r0 = r28
            super.onViewCreated(r2, r0)
            X.C18200wM.A1F(r7)
            r0 = 2131306622(0x7f09287e, float:1.8231448E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r2, r0)
            r0 = 2131298299(0x7f0907fb, float:1.8214567E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.common.ui.base.IgEditText r6 = (com.instagram.common.ui.base.IgEditText) r6
            r0 = 2131298282(0x7f0907ea, float:1.8214533E38)
            android.view.View r23 = X.AnonymousClass0wJ.A0K(r2, r0)
            r0 = 2131298281(0x7f0907e9, float:1.821453E38)
            android.view.View r14 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 2131302601(0x7f0918c9, float:1.8223293E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r7.A08 = r0
            X.0zW r3 = A00(r7)
            boolean r0 = r3 instanceof X.C25641oa
            if (r0 != 0) goto L_0x0050
            X.1ob r3 = (X.C25651ob) r3
            int r3 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0050
            r14.setText(r3)
        L_0x0050:
            r0 = 2131296861(0x7f09025d, float:1.821165E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r7.A01 = r3
            java.lang.String r0 = "audienceAnyoneButton"
            if (r3 == 0) goto L_0x053b
            X.24V r4 = X.AnonymousClass24V.TYPE_RADIO
            r3.setTextCellType(r4)
            com.instagram.igds.components.textcell.IgdsListCell r3 = r7.A01
            if (r3 == 0) goto L_0x053b
            com.facebook.redex.IDxCListenerShape16S0101000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape16S0101000_1_I2
            r0.<init>(r12, r12, r7)
            r3.A0C(r0)
            r0 = 2131300736(0x7f091180, float:1.821951E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r7.A03 = r3
            java.lang.String r0 = "followerRadioButton"
            if (r3 == 0) goto L_0x053b
            r3.setTextCellType(r4)
            com.instagram.igds.components.textcell.IgdsListCell r5 = r7.A03
            if (r5 == 0) goto L_0x053b
            r3 = 1
            com.facebook.redex.IDxCListenerShape16S0101000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape16S0101000_1_I2
            r0.<init>(r3, r12, r7)
            r5.A0C(r0)
            r0 = 2131307611(0x7f092c5b, float:1.8233454E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r7.A04 = r3
            java.lang.String r0 = "subscriberRadioButton"
            if (r3 == 0) goto L_0x053b
            r3.setTextCellType(r4)
            com.instagram.igds.components.textcell.IgdsListCell r5 = r7.A04
            if (r5 == 0) goto L_0x053b
            r3 = 2
            com.facebook.redex.IDxCListenerShape16S0101000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape16S0101000_1_I2
            r0.<init>(r3, r12, r7)
            r5.A0C(r0)
            X.0Ok r22 = X.C06810aP.A01
            X.0Oa r0 = r7.A0K
            r25 = r0
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r25)
            r0 = r22
            com.instagram.user.model.User r0 = r0.A01(r3)
            r7.A06 = r0
            r0 = 2131302601(0x7f0918c9, float:1.8223293E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r7.A00 = r0
            r0 = 2131298804(0x7f0909f4, float:1.8215592E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r7.A02 = r3
            java.lang.String r0 = "collectibleOwnersButton"
            if (r3 == 0) goto L_0x053b
            r3.setTextCellType(r4)
            com.instagram.igds.components.textcell.IgdsListCell r4 = r7.A02
            if (r4 == 0) goto L_0x053b
            r21 = 4
            com.facebook.redex.IDxCListenerShape16S0101000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape16S0101000_1_I2
            r0 = r21
            r3.<init>(r0, r12, r7)
            r4.A0C(r3)
            r0 = 2131308152(0x7f092e78, float:1.8234551E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r7.A05 = r0
            r0 = 2131303938(0x7f091e02, float:1.8226004E38)
            android.view.View r20 = X.AnonymousClass0wJ.A0J(r2, r0)
            r0 = 2131304240(0x7f091f30, float:1.8226617E38)
            android.view.View r5 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r5 = (com.instagram.igds.components.textcell.IgdsListCell) r5
            r0 = 2131304241(0x7f091f31, float:1.822662E38)
            android.view.View r13 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 2131298078(0x7f09071e, float:1.821412E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            r0 = 2131298079(0x7f09071f, float:1.8214121E38)
            android.view.View r11 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131298280(0x7f0907e8, float:1.8214529E38)
            android.view.View r10 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r0 = 2131298315(0x7f09080b, float:1.82146E38)
            android.view.View r15 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r15 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r15
            r0 = 2131299215(0x7f090b8f, float:1.8216425E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = (com.instagram.ui.widget.progressbutton.ProgressButton) r3
            r0 = 368(0x170, float:5.16E-43)
            X.AnonymousClass0wJ.A16(r3, r0, r7)
            r8 = 1
            com.facebook.redex.IDxTListenerShape66S0300000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape66S0300000_1_I2
            r0.<init>(r8, r2, r6, r7)
            r1.setOnTouchListener(r0)
            X.0zW r0 = A00(r7)
            boolean r0 = r0 instanceof X.C25641oa
            if (r0 == 0) goto L_0x050e
            r0 = 2131825851(0x7f1114bb, float:1.928457E38)
        L_0x0157:
            r3.setText((int) r0)
            r0 = -1
            r3.setTextColor(r0)
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r25)
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r0 = 36327099677615999(0x810f4e0001277f, double:3.036742341389156E-306)
            boolean r0 = X.C63803iN.A0E(r9, r2, r0)
            r19 = 8
            if (r0 == 0) goto L_0x0176
            r0 = r19
            r3.setVisibility(r0)
        L_0x0176:
            X.4Oz r0 = new X.4Oz
            r0.<init>(r6)
            r6.post(r0)
            r0 = 7
            X.C18230wP.A17(r6, r7, r0)
            X.3tc r0 = new X.3tc
            r0.<init>(r6, r7)
            r6.setOnKeyListener(r0)
            r0 = 6
            r6.setImeOptions(r0)
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 == 0) goto L_0x0508
            r0 = 2131825850(0x7f1114ba, float:1.9284568E38)
        L_0x0199:
            r6.setHint(r0)
            com.instagram.user.model.User r0 = r7.A06
            r2 = 0
            if (r0 == 0) goto L_0x0535
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0a()
            r15.A09(r0, r7)
            X.0Oa r0 = r7.A0A
            r24 = r0
            java.lang.Object r1 = r24.getValue()
            X.20y r18 = X.AnonymousClass20y.Broadcast
            r0 = r18
            if (r1 != r0) goto L_0x01ec
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r25)
            r16 = 36320008690275947(0x8108db0039166b, double:3.032257972442193E-306)
            r15 = r0
            r0 = r16
            boolean r0 = X.C63803iN.A0E(r9, r15, r0)
            if (r0 == 0) goto L_0x01ec
            android.content.Context r0 = r7.requireContext()
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r1 = new com.instagram.igds.components.peoplecell.IgdsPeopleCell
            r1.<init>((android.content.Context) r0, (boolean) r8)
            r1.setPadding(r12, r12, r12, r12)
            com.instagram.user.model.User r0 = r7.A06
            if (r0 == 0) goto L_0x0535
            r25.getValue()
            r1.A02(r2, r0)
            r10.addView(r1)
            r0 = r23
            r0.setVisibility(r12)
            r10.setVisibility(r12)
            r14.setVisibility(r12)
        L_0x01ec:
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 == 0) goto L_0x0502
            r0 = 1
        L_0x01f5:
            int r1 = X.C18190wL.A00(r0)
            r0 = r20
            r0.setVisibility(r1)
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 != 0) goto L_0x04ad
            X.1ob r1 = (X.C25651ob) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x04ad
        L_0x020c:
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 == 0) goto L_0x04a7
            r0 = 0
        L_0x0215:
            r10 = 8
            int r0 = X.C18190wL.A00(r0)
            r4.setVisibility(r0)
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 != 0) goto L_0x022d
            X.1ob r1 = (X.C25651ob) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x022d
            r10 = 0
        L_0x022d:
            r11.setVisibility(r10)
            X.0zW r1 = A00(r7)
            boolean r0 = r1 instanceof X.C25641oa
            if (r0 != 0) goto L_0x026c
            X.1ob r1 = (X.C25651ob) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x026c
            X.0zW r1 = A00(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A02 = r0
            X.24V r0 = X.AnonymousClass24V.TYPE_SWITCH
            r4.A0F(r0, r8)
            r4.setChecked(r8)
            r0 = 2131825811(0x7f111493, float:1.9284489E38)
            r11.setText(r0)
            r0 = 2131825809(0x7f111491, float:1.9284485E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r4.A0H(r0)
            r4.setVisibility(r12)
            r1 = 3
            com.facebook.redex.IDxTListenerShape181S0200000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape181S0200000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r7)
            r4.A0D(r0)
        L_0x026c:
            X.34D r8 = new X.34D
            r8.<init>(r7)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r7.A05
            java.lang.String r10 = "timeboundCell"
            if (r1 == 0) goto L_0x0531
            r0 = 2131825842(0x7f1114b2, float:1.9284552E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r1.A0H(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r7.A05
            if (r1 == 0) goto L_0x0531
            X.0zW r0 = A00(r7)
            X.4wG r0 = r0.A0E
            java.lang.Object r0 = r0.getValue()
            X.24x r0 = (X.C312624x) r0
            int r0 = r0.A01
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r1.A0J(r0, r12)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r7.A05
            if (r1 == 0) goto L_0x0531
            r0 = 75
            X.AnonymousClass0wJ.A18(r1, r0, r7, r8)
            X.0zW r0 = A00(r7)
            X.4wG r0 = r0.A0E
            r8 = 3
            X.M5J r10 = X.C29110FiC.A00(r2, r0, r8)
            X.066 r1 = r7.getViewLifecycleOwner()
            r0 = 22
            X.C18190wL.A1C(r1, r10, r7, r0)
            X.0zW r0 = A00(r7)
            X.4wE r0 = r0.A0C
            X.M5J r1 = X.C29110FiC.A00(r2, r0, r8)
            X.066 r0 = r7.getViewLifecycleOwner()
            r10 = 9
            X.C18250wR.A0v(r0, r1, r3, r7, r10)
            X.0i6 r11 = X.AnonymousClass0wJ.A0U(r25)
            X.C04220Ms.A0B(r11, r12)
            r0 = 36323594984824760(0x810c1e00091fb8, double:3.034525959555711E-306)
            boolean r11 = X.C63803iN.A0E(r9, r11, r0)
            java.lang.Object r1 = r24.getValue()
            java.lang.String r16 = "Required value was null."
            java.lang.String r9 = "interest_based_channel_entry_point"
            r0 = r18
            if (r1 != r0) goto L_0x03e8
            X.0Oa r0 = r7.A0I
            X.49Y r13 = X.C18240wQ.A0P(r0)
            X.0Oa r0 = r7.A0C
            java.lang.Object r11 = r0.getValue()
            X.24S r11 = (X.AnonymousClass24S) r11
            X.0Oa r0 = r7.A0D
            java.lang.Object r0 = r0.getValue()
            boolean r17 = X.AnonymousClass0wJ.A1X(r0)
            android.os.Bundle r0 = r7.mArguments
            if (r0 == 0) goto L_0x0527
            java.lang.String r1 = r0.getString(r9)
            if (r1 == 0) goto L_0x0527
            android.os.Bundle r9 = r7.requireArguments()
            java.lang.String r0 = "interest_based_channel_implicit_audience_type"
            int r14 = r9.getInt(r0)
            X.C04220Ms.A0B(r11, r12)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = X.AnonymousClass49Y.A00(r13)
            java.lang.String r0 = "broadcast_chat_setup"
            boolean r16 = r0.equals(r1)
            int r1 = r11.ordinal()
            if (r1 == r8) goto L_0x03e4
            r0 = r21
            if (r1 == r0) goto L_0x03e0
            r15 = 0
        L_0x032a:
            boolean r0 = X.AnonymousClass0wJ.A1U(r9)
            if (r0 == 0) goto L_0x0360
            X.AnonymousClass49Y.A03(r9, r13)
            X.2AE r0 = X.AnonymousClass2AE.A05
            X.AnonymousClass2A4.A00(r0, r9)
            X.24S r1 = X.AnonymousClass24S.PROFILE
            if (r11 != r1) goto L_0x03c8
            X.Lci r0 = X.C40328Lci.A0O
        L_0x033e:
            X.C18230wP.A1D(r0, r9)
            if (r11 != r1) goto L_0x03af
            X.2AA r0 = X.AnonymousClass2AA.A0B
        L_0x0345:
            X.AnonymousClass3Zh.A02(r0, r9, r14)
            java.lang.String r1 = r13.A00
            r0 = 10
            java.lang.String r0 = X.C62443a0.A00(r10, r0, r12)
            r9.A0T(r0, r1)
            java.lang.String r0 = "entrypoint"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r15)
            java.util.Map r0 = X.AnonymousClass4WK.A0O(r0)
            X.C18200wM.A1J(r9, r0)
        L_0x0360:
            X.061 r11 = X.AnonymousClass061.STARTED
            X.066 r10 = r7.getViewLifecycleOwner()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = X.AnonymousClass067.A00(r10)
            r14 = 26
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3
            r12 = r7
            r13 = r2
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.C146958n9) r13, (int) r14)
            X.C25237DiI.A00(r2, r2, r9, r0, r8)
            X.066 r10 = r7.getViewLifecycleOwner()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = X.AnonymousClass067.A00(r10)
            r14 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.C146958n9) r13, (int) r14)
            X.C25237DiI.A00(r2, r2, r9, r0, r8)
            android.view.View[] r0 = new android.view.View[]{r6, r5, r4}
            java.util.Set r0 = X.AnonymousClass4WM.A08(r0)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
        L_0x0398:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0513
            java.lang.Object r1 = r4.next()
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0398
            r5.add(r1)
            goto L_0x0398
        L_0x03af:
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL
            if (r11 == r0) goto L_0x03c4
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL_COMPOSER
            if (r11 == r0) goto L_0x03c4
            if (r17 == 0) goto L_0x03bc
            X.2AA r0 = X.AnonymousClass2AA.A05
            goto L_0x0345
        L_0x03bc:
            if (r16 == 0) goto L_0x03c1
            X.2AA r0 = X.AnonymousClass2AA.A06
            goto L_0x0345
        L_0x03c1:
            X.2AA r0 = X.AnonymousClass2AA.A02
            goto L_0x0345
        L_0x03c4:
            X.2AA r0 = X.AnonymousClass2AA.A0A
            goto L_0x0345
        L_0x03c8:
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL
            if (r11 == r0) goto L_0x03dc
            X.24S r0 = X.AnonymousClass24S.MIMICRY_UPSELL_COMPOSER
            if (r11 == r0) goto L_0x03dc
            if (r17 == 0) goto L_0x03d6
            X.Lci r0 = X.C40328Lci.A0B
            goto L_0x033e
        L_0x03d6:
            if (r16 == 0) goto L_0x03dc
            X.Lci r0 = X.C40328Lci.A09
            goto L_0x033e
        L_0x03dc:
            X.Lci r0 = X.C40328Lci.A0F
            goto L_0x033e
        L_0x03e0:
            java.lang.String r15 = "mimicry_upsell_composer_banner"
            goto L_0x032a
        L_0x03e4:
            java.lang.String r15 = "mimicry_upsell_top_of_thread_banner"
            goto L_0x032a
        L_0x03e8:
            java.lang.Object r1 = r24.getValue()
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x0360
            if (r11 == 0) goto L_0x042c
            r0 = r19
            r3.setVisibility(r0)
            X.0Oa r0 = r7.A0J
            java.lang.Object r1 = r0.getValue()
            X.49W r1 = (X.AnonymousClass49W) r1
            X.0nS r0 = r1.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r9)
            if (r0 == 0) goto L_0x0360
            X.AnonymousClass49W.A03(r9, r1)
            X.2AB r0 = X.AnonymousClass2AB.A09
            X.C18220wO.A1D(r0, r9)
            X.2A3 r0 = X.AnonymousClass2A3.IMPRESSION
            X.C18220wO.A1E(r0, r9)
            X.Lcg r0 = X.C40326Lcg.A0D
            java.lang.String r1 = X.AnonymousClass2AH.A00(r0, r9, r1)
            r0 = 10
            java.lang.String r0 = X.C62443a0.A00(r10, r0, r12)
            r9.A0T(r0, r1)
            r9.Bb4()
            goto L_0x0360
        L_0x042c:
            X.0Oa r0 = r7.A0J
            java.lang.Object r1 = r0.getValue()
            X.49W r1 = (X.AnonymousClass49W) r1
            X.0Oa r0 = r7.A0C
            java.lang.Object r11 = r0.getValue()
            X.24S r11 = (X.AnonymousClass24S) r11
            X.0Oa r0 = r7.A0D
            java.lang.Object r0 = r0.getValue()
            boolean r15 = X.AnonymousClass0wJ.A1X(r0)
            android.os.Bundle r0 = r7.mArguments
            if (r0 == 0) goto L_0x052c
            java.lang.String r14 = r0.getString(r9)
            if (r14 == 0) goto L_0x052c
            X.C04220Ms.A0B(r11, r12)
            X.0nS r0 = r1.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r9)
            if (r0 == 0) goto L_0x0360
            X.AnonymousClass49W.A03(r9, r1)
            X.2AB r13 = X.AnonymousClass2AB.A05
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r13, r9, r0)
            java.lang.String r13 = "broadcast_chat_nux"
            boolean r0 = r14.equals(r13)
            if (r0 == 0) goto L_0x049f
            X.Lcg r0 = X.C40326Lcg.A0E
        L_0x0473:
            X.C18230wP.A1D(r0, r9)
            boolean r0 = r14.equals(r13)
            if (r0 == 0) goto L_0x0497
            X.29r r0 = X.C319729r.PUBLIC_CHAT_CREATOR_NUX
        L_0x047e:
            X.AnonymousClass2AH.A01(r0, r9)
            java.lang.String r1 = r1.A00
            r0 = 10
            java.lang.String r0 = X.C62443a0.A00(r10, r0, r12)
            r9.A0T(r0, r1)
            java.lang.String r0 = r11.A00
            java.util.Map r0 = X.AnonymousClass49W.A02(r2, r2, r2, r0)
            X.C18200wM.A1J(r9, r0)
            goto L_0x0360
        L_0x0497:
            if (r15 == 0) goto L_0x049c
            X.29r r0 = X.C319729r.CREATE_CHANNEL
            goto L_0x047e
        L_0x049c:
            X.29r r0 = X.C319729r.DM_CREATION_OMNIPICKER
            goto L_0x047e
        L_0x049f:
            if (r15 == 0) goto L_0x04a4
            X.Lcg r0 = X.C40326Lcg.A08
            goto L_0x0473
        L_0x04a4:
            X.Lcg r0 = X.C40326Lcg.A0B
            goto L_0x0473
        L_0x04a7:
            X.1ob r1 = (X.C25651ob) r1
            boolean r0 = r1.A07
            goto L_0x0215
        L_0x04ad:
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r25)
            r0 = r22
            com.instagram.user.model.User r0 = r0.A01(r1)
            X.4sU r0 = r0.A0Q()
            if (r0 == 0) goto L_0x04c9
            java.util.List r0 = r0.B1g()
            int r1 = r0.size()
            r0 = 5
            r10 = 1
            if (r1 >= r0) goto L_0x04ca
        L_0x04c9:
            r10 = 0
        L_0x04ca:
            X.24V r1 = X.AnonymousClass24V.TYPE_SWITCH
            r0 = r10 ^ 1
            r5.A0F(r1, r0)
            r0 = 2131825818(0x7f11149a, float:1.9284503E38)
            java.lang.String r0 = X.C18180wK.A0g(r7, r0)
            r5.A0H(r0)
            r5.setVisibility(r12)
            r1 = 3
            com.facebook.redex.IDxCListenerShape73S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape73S0300000_1_I2
            r0.<init>(r1, r13, r5, r7)
            r5.A0C(r0)
            if (r10 == 0) goto L_0x04fa
            r0 = 2131825853(0x7f1114bd, float:1.9284574E38)
            X.C18180wK.A10(r13, r7, r0)
            r13.setVisibility(r12)
            r5.setChecked(r12)
            r5.setEnabled(r12)
            goto L_0x020c
        L_0x04fa:
            A00(r7)
            r5.setChecked(r8)
            goto L_0x020c
        L_0x0502:
            X.1ob r1 = (X.C25651ob) r1
            boolean r0 = r1.A08
            goto L_0x01f5
        L_0x0508:
            X.1ob r1 = (X.C25651ob) r1
            int r0 = r1.A01
            goto L_0x0199
        L_0x050e:
            r0 = 2131825822(0x7f11149e, float:1.928451E38)
            goto L_0x0157
        L_0x0513:
            X.0zW r0 = A00(r7)
            X.4wG r1 = r0.A0F
            r9 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0400000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0400000_I2
            r4 = r0
            r6 = r3
            r8 = r2
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.C146958n9) r8, (int) r9)
            X.AnonymousClass3J3.A01(r7, r0, r1)
            return
        L_0x0527:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x052c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x0531:
            X.C04220Ms.A0E(r10)
            throw r2
        L_0x0535:
            java.lang.String r0 = "currentUser"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x053b:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23071bs.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C19230zW A00(C23071bs r0) {
        return (C19230zW) r0.A0M.getValue();
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0K);
    }

    public final boolean onBackPressed() {
        AnonymousClass49W r1 = (AnonymousClass49W) this.A0J.getValue();
        AnonymousClass24S r4 = (AnonymousClass24S) this.A0C.getValue();
        C04220Ms.A0B(r4, 0);
        USLEBaseShape0S0000000 A0D2 = USLEBaseShape0S0000000.A0D(r1.A02);
        if (AnonymousClass0wJ.A1U(A0D2)) {
            AnonymousClass49W.A03(A0D2, r1);
            C18220wO.A1D(AnonymousClass2AB.A0B, A0D2);
            C18220wO.A1E(AnonymousClass2A3.IMPRESSION, A0D2);
            C62443a0.A01(A0D2, AnonymousClass2AH.A00(C40326Lcg.A02, A0D2, r1));
            C18200wM.A1J(A0D2, AnonymousClass49W.A02((Boolean) null, (Boolean) null, (Boolean) null, r4.A00));
        }
        return false;
    }

    public C23071bs() {
        Integer num = AnonymousClass006.A0C;
        this.A0I = C18200wM.A0x(num, this, 43);
        this.A0J = C18200wM.A0x(num, this, 44);
        this.A0D = C18200wM.A0x(num, this, 40);
        this.A0H = C18200wM.A0x(num, this, 42);
        this.A0A = C18200wM.A0x(num, this, 37);
        this.A0C = C18200wM.A0x(num, this, 39);
        this.A0F = C18200wM.A0x(num, this, 41);
        this.A0B = C18200wM.A0x(num, this, 38);
        this.A0E = AnonymousClass0OY.A01(num, new AnonymousClass4YA(this));
        this.A0G = AnonymousClass0OY.A01(num, new KtLambdaShape1S2100000_I2(this, "interest_based_channel_implicit_audience_type", "interest_based_channel_implicit_audience_type", 3));
        KtLambdaShape63S0100000_I2_43 A0e = C18250wR.A0e(this, 48);
        C04530Oa A0x = C18200wM.A0x(num, C18250wR.A0e(this, 45), 46);
        this.A0M = C18220wO.A0M(C18250wR.A0e(A0x, 47), A0e, C18250wR.A0d(A0x, (Object) null, 12), C18210wN.A0l(C19230zW.class));
        this.A0L = C18190wL.A0H(this, 367);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = C14030oh.A02(12523177);
        super.onCreate(bundle);
        this.A09 = false;
        C19230zW A002 = A00(this);
        int A042 = AnonymousClass0wJ.A04(this.A0F.getValue());
        int A043 = AnonymousClass0wJ.A04(this.A0B.getValue());
        A002.A01 = A042;
        A002.A00 = A043;
        C86074wE r3 = A002.A07;
        int i = 2;
        if (A002.A05 == AnonymousClass20y.Social) {
            if (A002 instanceof C25641oa) {
                z = ((C25641oa) A002).A07;
            } else {
                z = ((C25651ob) A002).A06;
            }
            if (!z || A043 < 2) {
                i = 0;
            }
        } else {
            i = AnonymousClass2M1.A00(A002.A06, Integer.valueOf(A042));
        }
        r3.CrC(Integer.valueOf(i));
        C14030oh.A09(-39315272, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1952507791);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D2 = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_configure, false);
        C14030oh.A09(414658317, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1275871771);
        super.onDestroy();
        if (!this.A09) {
            C04530Oa r5 = this.A0K;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r5), 36321073838430732L) && !AnonymousClass0wJ.A1X(this.A0H.getValue())) {
                AnonymousClass49O A002 = AnonymousClass49O.A00(AnonymousClass0wJ.A0X(r5));
                AnonymousClass3w6 r2 = new AnonymousClass3w6();
                C32163H7y h7y = A002.A01;
                if (h7y != null && !A002.A03) {
                    A002.A03 = true;
                    r2.accept(h7y);
                }
                A002.A01();
                this.A09 = true;
            }
        }
        C14030oh.A09(1880854685, A022);
    }
}
