package com.instagram.debug.devoptions.newsfeed;

import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.AnonymousClass8f7;
import X.C04220Ms;
import X.C04530Oa;
import X.C06810aP;
import X.C10300i6;
import X.C11630kW;
import X.C133767wL;
import X.C133797wO;
import X.C14030oh;
import X.C18180wK;
import X.C18250wR;
import X.C27710Es0;
import X.C34640IcN;
import X.C7G;
import X.C82034oy;
import X.C86114wI;
import X.C90635Mu;
import X.C90645Mv;
import X.C90655Mx;
import X.C90665My;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0700000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape9S0100000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.igds.IgdsComponentDemoRow;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public final class ActivityFeedShowcaseFragment extends C34640IcN implements C11630kW, C82034oy {
    public static final int $stable = 8;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824986);
    }

    public String getModuleName() {
        return "activity_feed_showcase";
    }

    private final void displayRows(LinearLayout linearLayout) {
        User A01 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.userSession$delegate));
        Context requireContext = requireContext();
        ActivityFeedShowcaseFragment$displayRows$onLongClickListener$1 activityFeedShowcaseFragment$displayRows$onLongClickListener$1 = new ActivityFeedShowcaseFragment$displayRows$onLongClickListener$1(requireContext);
        ActivityFeedShowcaseFragment$displayRows$onClickListener$1 activityFeedShowcaseFragment$displayRows$onClickListener$1 = new ActivityFeedShowcaseFragment$displayRows$onClickListener$1(requireContext);
        C7G c7g = new C7G(requireContext);
        C90665My r10 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, true);
        ActivityFeedShowcaseFragment$displayRows$onClickListener$1 activityFeedShowcaseFragment$displayRows$onClickListener$12 = activityFeedShowcaseFragment$displayRows$onClickListener$1;
        ActivityFeedShowcaseFragment$displayRows$onLongClickListener$1 activityFeedShowcaseFragment$displayRows$onLongClickListener$12 = activityFeedShowcaseFragment$displayRows$onLongClickListener$1;
        c7g.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$12, activityFeedShowcaseFragment$displayRows$onLongClickListener$12, (AnonymousClass8f7) null, r10, ActivityFeedShowcaseComposeFragment.TITLE, 24), this);
        LinearLayout linearLayout2 = linearLayout;
        C7G A0Y = C86114wI.A0Y(requireContext, c7g, linearLayout2, "Left avatar, title, message");
        C90665My r11 = new C90665My(A01.B4M(), A01.B4M(), (Integer) null, false);
        ActivityFeedShowcaseFragment$displayRows$onClickListener$1 activityFeedShowcaseFragment$displayRows$onClickListener$13 = activityFeedShowcaseFragment$displayRows$onClickListener$1;
        ActivityFeedShowcaseFragment$displayRows$onLongClickListener$1 activityFeedShowcaseFragment$displayRows$onLongClickListener$13 = activityFeedShowcaseFragment$displayRows$onLongClickListener$1;
        A0Y.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going...", (CharSequence) "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going..."), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$13, activityFeedShowcaseFragment$displayRows$onLongClickListener$13, C133767wL.A00, r11, (CharSequence) null, 12), this);
        C7G A0Y2 = C86114wI.A0Y(requireContext, A0Y, linearLayout2, "Left double avatar, message, badge + chevron");
        C90665My r9 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, false);
        A0Y2.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going...", (CharSequence) "This is a really really really really really long message. Hello world. This message is seriously long oh my gosh. And it just keeps on going and going and going..."), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$13, activityFeedShowcaseFragment$displayRows$onLongClickListener$13, C133797wO.A00, r9, (CharSequence) null, 12), this);
        C7G A0Y3 = C86114wI.A0Y(requireContext, A0Y2, linearLayout2, "Left avatar, long message, x out");
        C90665My r112 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, false);
        A0Y3.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$13, activityFeedShowcaseFragment$displayRows$onLongClickListener$13, new C90635Mu("Text"), r112, (CharSequence) null, 12), this);
        C7G A0Y4 = C86114wI.A0Y(requireContext, A0Y3, linearLayout2, "Left avatar, message, primary button");
        C90665My r113 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, false);
        A0Y4.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$13, activityFeedShowcaseFragment$displayRows$onLongClickListener$13, new C90645Mv(2131824237), r113, (CharSequence) null, 12), this);
        C7G A0Y5 = C86114wI.A0Y(requireContext, A0Y4, linearLayout2, "Left avatar, message, follow request button group");
        C90665My r102 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, false);
        A0Y5.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$12, activityFeedShowcaseFragment$displayRows$onLongClickListener$12, new KtCSuperShape9S0100000_I2(), r102, ActivityFeedShowcaseComposeFragment.TITLE, 8), this);
        C7G A0Y6 = C86114wI.A0Y(requireContext, A0Y5, linearLayout2, "Left avatar, title, message, follow button");
        C90665My r114 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, true);
        A0Y6.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$12, activityFeedShowcaseFragment$displayRows$onLongClickListener$12, new KtCSuperShape9S0100000_I2(A01.B4M()), r114, ActivityFeedShowcaseComposeFragment.TITLE, 8), this);
        C7G A0Y7 = C86114wI.A0Y(requireContext, A0Y6, linearLayout2, "Left avatar, title, message, right image");
        C90665My r103 = new C90665My(A01.B4M(), (ImageUrl) null, (Integer) null, true);
        A0Y7.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), new KtCSuperShape0S2010000_I2((String) null, 7, 6, false), activityFeedShowcaseFragment$displayRows$onClickListener$13, activityFeedShowcaseFragment$displayRows$onLongClickListener$13, (AnonymousClass8f7) null, r103, (CharSequence) null, 20), this);
        C7G A0Y8 = C86114wI.A0Y(requireContext, A0Y7, linearLayout2, "Left avatar, message, inline UFI");
        A0Y8.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$12, activityFeedShowcaseFragment$displayRows$onLongClickListener$12, (AnonymousClass8f7) null, new C90655Mx((Integer) null, R.drawable.instagram_info_pano_outline_24), ActivityFeedShowcaseComposeFragment.TITLE, 24), this);
        C7G A0Y9 = C86114wI.A0Y(requireContext, A0Y8, linearLayout2, "Left icon, title, message");
        A0Y9.setState(new KtCSuperShape0S0700000_I2(new KtCSuperShape0S0210000_I2((CharSequence) "This is the message", (CharSequence) "This is the message"), (KtCSuperShape0S2010000_I2) null, activityFeedShowcaseFragment$displayRows$onClickListener$1, (C27710Es0) null, (AnonymousClass8f7) null, new C90665My(C18250wR.A0K("https://i.instagram.com/static/images/activity/info-1.5.png/3385260677b8.png"), (ImageUrl) null, Integer.valueOf(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color), false), ActivityFeedShowcaseComposeFragment.TITLE, 88), this);
        linearLayout2.addView(new IgdsComponentDemoRow(requireContext, "Left server side icon, title, message", A0Y9));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1885122089);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.igds_showcase_scrollview, false);
        displayRows((LinearLayout) AnonymousClass0wJ.A0J(A0D, R.id.igds_component_examples_container));
        C14030oh.A09(-870660783, A02);
        return A0D;
    }
}
