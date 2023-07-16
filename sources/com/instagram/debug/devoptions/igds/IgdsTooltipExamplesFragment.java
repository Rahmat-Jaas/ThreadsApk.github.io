package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass3TC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18190wL;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import X.D0f;
import X.M5O;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsTooltipExamplesFragment extends C34640IcN implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final String[] ITEMS = {"Show black tooltip above anchor view", "Show black tooltip below anchor view", "Show white tooltip above anchor view", "Show white tooltip below anchor view"};
    public static final String LABEL = "Example Label";
    public static final String MODULE_NAME = "igds_tooltip_examples";
    public RecyclerView rV;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public final class RowViewHolder extends M5O {
        public ViewGroup rowView;
        public TextView textView;

        public final void setRowView(ViewGroup viewGroup) {
            C04220Ms.A0B(viewGroup, 0);
            this.rowView = viewGroup;
        }

        public final void setTextView(TextView textView2) {
            C04220Ms.A0B(textView2, 0);
            this.textView = textView2;
        }

        public final ViewGroup getRowView() {
            return this.rowView;
        }

        public final TextView getTextView() {
            return this.textView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RowViewHolder(ViewGroup viewGroup, TextView textView2) {
            super(viewGroup);
            AnonymousClass0wJ.A1O(viewGroup, textView2);
            this.rowView = viewGroup;
            this.textView = textView2;
        }
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825263);
    }

    public String getModuleName() {
        return MODULE_NAME;
    }

    public static final /* synthetic */ View.OnClickListener access$getClickListener(IgdsTooltipExamplesFragment igdsTooltipExamplesFragment, TextView textView, AnonymousClass3TC r3, D0f d0f) {
        return new IgdsTooltipExamplesFragment$getClickListener$1(igdsTooltipExamplesFragment, textView, d0f, r3);
    }

    private final View.OnClickListener getClickListener(TextView textView, AnonymousClass3TC r3, D0f d0f) {
        return new IgdsTooltipExamplesFragment$getClickListener$1(this, textView, d0f, r3);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final void populateMenuItems() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String[] strArr = ITEMS;
        String str = strArr[0];
        AnonymousClass3TC r2 = AnonymousClass3TC.A05;
        D0f d0f = D0f.ABOVE_ANCHOR;
        A0y.put(str, new Object[]{r2, d0f});
        String str2 = strArr[1];
        D0f d0f2 = D0f.BELOW_ANCHOR;
        A0y.put(str2, new Object[]{r2, d0f2});
        String str3 = strArr[2];
        AnonymousClass3TC r22 = AnonymousClass3TC.A06;
        A0y.put(str3, new Object[]{r22, d0f});
        A0y.put(strArr[3], new Object[]{r22, d0f2});
        RecyclerView recyclerView = this.rV;
        if (recyclerView == null) {
            C04220Ms.A0E("rV");
            throw null;
        } else {
            recyclerView.setAdapter(new IgdsTooltipExamplesFragment$populateMenuItems$1(A0y, this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1332716544);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.igds_component_examples, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(inflate, 16908298);
        this.rV = recyclerView;
        if (recyclerView == null) {
            C04220Ms.A0E("rV");
            throw null;
        }
        requireContext();
        C18190wL.A1D(recyclerView);
        populateMenuItems();
        C14030oh.A09(1808515708, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
