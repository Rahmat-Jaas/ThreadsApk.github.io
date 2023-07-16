package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass24V;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C17996AVq;
import X.C34640IcN;
import X.C82034oy;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.service.session.UserSession;

public class IgdsSegmentedTabExamplesFragment extends C34640IcN implements C82034oy {
    public static final String TAB_LAYOUT_SELECTOR_TITLE = "Enable Scrollable Tab Layout";
    public static final String TAB_TITLE = "Tab Title";
    public Context mContext;
    public IgSegmentedTabLayout2 mFixedTabLayout;
    public LinearLayout mLinearLayout;
    public IgSegmentedTabLayout2 mScrollableTabLayout;
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_segmented_tab_examples";
    }

    private void setTabLayoutSelector() {
        IgdsListCell igdsListCell = new IgdsListCell(this.mContext);
        igdsListCell.A0H(TAB_LAYOUT_SELECTOR_TITLE);
        igdsListCell.A0F(AnonymousClass24V.TYPE_CHECKBOX, true);
        igdsListCell.A0C(new IgdsSegmentedTabExamplesFragment$$ExternalSyntheticLambda0(this));
        this.mLinearLayout.addView(igdsListCell);
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$setTabLayoutSelector$0$com-instagram-debug-devoptions-igds-IgdsSegmentedTabExamplesFragment  reason: not valid java name */
    public /* synthetic */ void m7lambda$setTabLayoutSelector$0$cominstagramdebugdevoptionsigdsIgdsSegmentedTabExamplesFragment(CompoundButton compoundButton, boolean z) {
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = this.mFixedTabLayout;
        int i = 8;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        igSegmentedTabLayout2.setVisibility(i2);
        IgSegmentedTabLayout2 igSegmentedTabLayout22 = this.mScrollableTabLayout;
        if (z) {
            i = 0;
        }
        igSegmentedTabLayout22.setVisibility(i);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825252);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1243465305);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        this.mContext = requireContext();
        C14030oh.A09(1628099606, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1677541750);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.igds_segmented_tab_examples);
        C14030oh.A09(-691945337, A02);
        return A0H;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLinearLayout = (LinearLayout) view.requireViewById(R.id.tab_layout_example_container);
        this.mFixedTabLayout = (IgSegmentedTabLayout2) view.requireViewById(R.id.tab_layout_example_fixed);
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) view.requireViewById(R.id.tab_layout_example_scroll);
        this.mScrollableTabLayout = igSegmentedTabLayout2;
        igSegmentedTabLayout2.setVisibility(8);
        int i = 0;
        do {
            this.mFixedTabLayout.A02(new C17996AVq((Drawable) null, TAB_TITLE, -1, true));
            this.mScrollableTabLayout.A02(new C17996AVq((Drawable) null, TAB_TITLE, -1, true));
            i++;
        } while (i < 6);
        setTabLayoutSelector();
    }
}
