package com.instagram.business.insights.fragment;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18250wR;
import X.C34640IcN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public abstract class BaseAccountInsightsTabFragment extends C34640IcN {
    public ViewStub mContentViewStub;
    public View mErrorView;
    public SpinnerImageView mLoading;
    public IgTextView mTextViewErrorMessage;

    public final C10300i6 getSession() {
        return C18180wK.A0V(C18250wR.A07(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-360132371);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.base_account_insights_tab_fragment);
        C14030oh.A09(1287937225, A02);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoading = (SpinnerImageView) view.requireViewById(R.id.account_insights_tab_loading_spinner);
        this.mErrorView = view.requireViewById(R.id.account_insights_tab_error_view);
        this.mContentViewStub = (ViewStub) view.requireViewById(R.id.content_view_stub);
        this.mTextViewErrorMessage = C18250wR.A0L(view, R.id.account_insights_tab_single_error_message);
        AnonymousClass0wJ.A16(view.requireViewById(R.id.error_loading_retry), 176, this);
    }
}
