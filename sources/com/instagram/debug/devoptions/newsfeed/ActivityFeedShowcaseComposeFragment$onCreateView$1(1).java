package com.instagram.debug.devoptions.newsfeed;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass70T;
import X.AnonymousClass74X;
import X.AnonymousClass79L;
import X.AnonymousClass7Ad;
import X.AnonymousClass7JR;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C122087Kb;
import X.C133767wL;
import X.C133787wN;
import X.C133797wO;
import X.C134747yH;
import X.C142918fo;
import X.C146288ly;
import X.C147188nY;
import X.C86134wK;
import X.C90635Mu;
import X.C90645Mv;
import X.C90655Mx;
import X.C90665My;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape9S0100000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.igds.compose.ComposeShowcaseComponentsKt;
import kotlin.Unit;

public final class ActivityFeedShowcaseComposeFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ ActivityFeedShowcaseComposeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFeedShowcaseComposeFragment$onCreateView$1(ActivityFeedShowcaseComposeFragment activityFeedShowcaseComposeFragment) {
        super(2);
        this.this$0 = activityFeedShowcaseComposeFragment;
    }

    public final void invoke(C147188nY r15, int i) {
        C147188nY r4 = r15;
        if ((i & 11) != 2 || !r15.BCM()) {
            final ActivityFeedShowcaseComposeFragment activityFeedShowcaseComposeFragment = this.this$0;
            AnonymousClass70T.A01((AnonymousClass79L) null, r4, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r15, new AnonymousClass0YP() {
                public final void invoke(C147188nY r39, int i) {
                    C147188nY r12 = r39;
                    if ((i & 11) != 2 || !r12.BCM()) {
                        ActivityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1 activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1 = new ActivityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1(C147188nY.A0T(r12));
                        Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r12), Modifier.A00);
                        ActivityFeedShowcaseComposeFragment activityFeedShowcaseComposeFragment = ActivityFeedShowcaseComposeFragment.this;
                        C146288ly A05 = AnonymousClass7KV.A05(r12);
                        Object A0p = C147188nY.A0p(r12);
                        Object A0n = C147188nY.A0n(r12);
                        Object A0m = C147188nY.A0m(r12);
                        AnonymousClass0ZU r2 = AnonymousClass74X.A00;
                        AnonymousClass0YM A00 = C98236Es.A00(A01);
                        AnonymousClass7W3 r5 = (AnonymousClass7W3) r12;
                        C147188nY.A0w(r12, r5, r2);
                        AnonymousClass7W3.A0a(r12, r5, A05, A0p);
                        AnonymousClass7KP.A07(r12, A0n, A0m, A00);
                        r12.Cvb(1954087097);
                        C90665My r6 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, title, message"), (ImageUrl) null, (Integer) null, true);
                        C134747yH r22 = ActivityFeedShowcaseComposeFragment.MESSAGE;
                        C134747yH r0 = ActivityFeedShowcaseComposeFragment.MESSAGE_CONTENT_DESCRIPTION;
                        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = new KtCSuperShape0S0210000_I2(r22, r0);
                        C133787wN r16 = C133787wN.A00;
                        C122087Kb.A03(r12, (Modifier) null, ktCSuperShape0S0210000_I2, (KtCSuperShape0S2010000_I2) null, r16, r6, ActivityFeedShowcaseComposeFragment.TITLE, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1, 25160, 40);
                        C90665My r9 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left double avatar, message, badge + chevron"), activityFeedShowcaseComposeFragment.getUser().B4M(), (Integer) null, true);
                        C134747yH r8 = ActivityFeedShowcaseComposeFragment.LONG_MESSAGE;
                        C134747yH r7 = ActivityFeedShowcaseComposeFragment.LONG_MESSAGE_CONTENT_DESCRIPTION;
                        C147188nY r19 = r12;
                        ActivityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1 activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12 = activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1;
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r8, r7), (KtCSuperShape0S2010000_I2) null, C133767wL.A00, r9, (String) null, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 584, 56);
                        C90665My r92 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, long message, x out"), (ImageUrl) null, (Integer) null, false);
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r8, r7), (KtCSuperShape0S2010000_I2) null, C133797wO.A00, r92, (String) null, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 584, 56);
                        C90665My r93 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, message, primary button"), (ImageUrl) null, (Integer) null, false);
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, new C90635Mu("Text"), r93, (String) null, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 584, 56);
                        C90665My r94 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, message, follow request button group"), (ImageUrl) null, (Integer) null, false);
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, new C90645Mv(2131824237), r94, (String) null, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 584, 56);
                        C90665My r62 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, title, message, follow button"), (ImageUrl) null, (Integer) null, false);
                        String str = ActivityFeedShowcaseComposeFragment.TITLE;
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, new KtCSuperShape9S0100000_I2(), r62, str, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 25160, 40);
                        C90665My r82 = new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, title, message, right image"), (ImageUrl) null, (Integer) null, true);
                        C122087Kb.A03(r19, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, new KtCSuperShape9S0100000_I2(activityFeedShowcaseComposeFragment.getUser().B4M()), r82, str, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$12, 25160, 40);
                        C122087Kb.A03(r12, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, r16, new C90665My(C86134wK.A0X(r12, activityFeedShowcaseComposeFragment, "Left avatar, message, inline UFI"), (ImageUrl) null, (Integer) null, true), (String) null, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1, 584, 56);
                        ComposeShowcaseComponentsKt.ShowcaseSectionHeader("Left icon, title, message", r12, 6);
                        C122087Kb.A03(r12, (Modifier) null, new KtCSuperShape0S0210000_I2(r22, r0), (KtCSuperShape0S2010000_I2) null, r16, new C90655Mx((Integer) null, R.drawable.instagram_info_pano_outline_24), ActivityFeedShowcaseComposeFragment.TITLE, activityFeedShowcaseComposeFragment$onCreateView$1$1$onClick$1, 25160, 40);
                        AnonymousClass7W3.A0v(r5, true);
                        return;
                    }
                    r12.CuJ();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, 1835774275), 196608, 31, 0, 0);
            return;
        }
        r15.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
