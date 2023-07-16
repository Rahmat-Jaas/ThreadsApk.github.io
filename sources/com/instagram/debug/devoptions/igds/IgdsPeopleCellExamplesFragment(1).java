package com.instagram.debug.devoptions.igds;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1m0;
import X.AnonymousClass3AK;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C23894D0g;
import X.C25917DvL;
import X.C34640IcN;
import X.C81504nu;
import X.C82034oy;
import X.C83154qs;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

public final class IgdsPeopleCellExamplesFragment extends C34640IcN implements C82034oy {
    public View curView;
    public final C04530Oa fragmentContext$delegate = AnonymousClass0OY.A02(new IgdsPeopleCellExamplesFragment$fragmentContext$2(this));
    public int index;
    public LinearLayout linearLayout;
    public View.OnClickListener onClickListener;
    public View.OnLongClickListener onLongClickListener;
    public final C04530Oa user$delegate = AnonymousClass0OY.A02(new IgdsPeopleCellExamplesFragment$user$2(this));
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new IgdsPeopleCellExamplesFragment$userSession$2(this));

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825247);
    }

    public String getModuleName() {
        return "igds_people_cell_examples";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.index = 0;
        setUpPeopleCell((C81504nu) null, (C81504nu) null, false, (String) null, false);
        setUpPeopleCell((C81504nu) null, (C81504nu) null, false, (String) null, true);
        setUpPeopleCell(createFollowButton(), (C81504nu) null, false, (String) null, false);
        setUpPeopleCell(createFollowButton(), createXButton(), false, (String) null, false);
        setUpPeopleCell((C81504nu) null, (C81504nu) null, true, (String) null, false);
        setUpPeopleCell(createXButton(), (C81504nu) null, false, (String) null, false);
        setUpPeopleCell(createFollowButton(), createXButton(), false, (String) null, false);
        setUpPeopleCell((C81504nu) null, (C81504nu) null, false, "Followed by user2 and 3 others", false);
        setUpPeopleCell(createFollowButton(), (C81504nu) null, false, "Followed by user2 and 3 others", false);
        setUpPeopleCell(createFollowButton(), createXButton(), false, "Followed by user2 and 3 others", false);
    }

    private final FollowButton createFollowButton() {
        User user = new User("40603070775", "summertesting");
        user.A03 = C23894D0g.FollowStatusNotFollowing;
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = this.curView;
        if (view == null) {
            C04220Ms.A0E("curView");
            throw null;
        }
        View inflate = layoutInflater.inflate(R.layout.follow_button_medium, (ViewGroup) view, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        FollowButton followButton = (FollowButton) inflate;
        C25917DvL dvL = followButton.A03;
        dvL.A0B = false;
        dvL.A02(this, AnonymousClass0wJ.A0X(this.userSession$delegate), user);
        followButton.setContentDescription(AnonymousClass00U.A0L("Follow ", getUser().BK7()));
        return followButton;
    }

    /* access modifiers changed from: private */
    public final Context getFragmentContext() {
        return (Context) this.fragmentContext$delegate.getValue();
    }

    private final User getUser() {
        return (User) this.user$delegate.getValue();
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public static /* synthetic */ void setUpPeopleCell$default(IgdsPeopleCellExamplesFragment igdsPeopleCellExamplesFragment, C81504nu r3, C81504nu r4, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            r3 = null;
        }
        if ((i & 2) != 0) {
            r4 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        igdsPeopleCellExamplesFragment.setUpPeopleCell(r3, r4, z, str, z2);
    }

    private final AnonymousClass1m0 createXButton() {
        Context fragmentContext = getFragmentContext();
        Integer num = AnonymousClass006.A00;
        return new AnonymousClass1m0(fragmentContext, new IgdsPeopleCellExamplesFragment$createXButton$1(this), num, num, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
    }

    private final void setUpPeopleCell(C81504nu r6, C81504nu r7, boolean z, String str, boolean z2) {
        String str2;
        AnonymousClass3AK r4 = new AnonymousClass3AK(this, getUser());
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(getFragmentContext(), z);
        igdsPeopleCell.A05(r4, AnonymousClass0wJ.A0X(this.userSession$delegate), getUser());
        igdsPeopleCell.A07(str);
        if (z2) {
            C83154qs r0 = r4.A02;
            ImageUrl B4M = r0.B4M();
            C04220Ms.A06(B4M);
            ImageUrl B4M2 = r0.B4M();
            C04220Ms.A06(B4M2);
            igdsPeopleCell.A03(B4M, B4M2);
        } else {
            igdsPeopleCell.A04(r4, AnonymousClass0wJ.A0X(this.userSession$delegate), getUser());
        }
        if (r6 != null) {
            igdsPeopleCell.A06(r6, r7);
        }
        View.OnClickListener onClickListener2 = this.onClickListener;
        if (onClickListener2 == null) {
            str2 = "onClickListener";
        } else {
            igdsPeopleCell.setOnClickListener(onClickListener2);
            View.OnLongClickListener onLongClickListener2 = this.onLongClickListener;
            if (onLongClickListener2 == null) {
                str2 = "onLongClickListener";
            } else {
                igdsPeopleCell.setOnLongClickListener(onLongClickListener2);
                LinearLayout linearLayout2 = this.linearLayout;
                if (linearLayout2 == null) {
                    str2 = "linearLayout";
                } else {
                    linearLayout2.addView(igdsPeopleCell, (this.index << 1) + 1);
                    this.index++;
                    return;
                }
            }
        }
        C04220Ms.A0E(str2);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-2130293635);
        super.onCreate(bundle);
        this.onClickListener = new IgdsPeopleCellExamplesFragment$onCreate$1(this);
        this.onLongClickListener = new IgdsPeopleCellExamplesFragment$onCreate$2(this);
        C14030oh.A09(885637961, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1769039774);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.igds_people_cell_examples, (ViewGroup) null);
        C04220Ms.A06(inflate);
        this.curView = inflate;
        this.linearLayout = (LinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.container);
        View view = this.curView;
        if (view == null) {
            C04220Ms.A0E("curView");
            throw null;
        }
        C14030oh.A09(218859675, A02);
        return view;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
