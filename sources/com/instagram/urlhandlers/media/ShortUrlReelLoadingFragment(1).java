package com.instagram.urlhandlers.media;

import X.AnonymousClass0wJ;
import X.AnonymousClass1hJ;
import X.AnonymousClass4u2;
import X.AnonymousClass69F;
import X.C10300i6;
import X.C14030oh;
import X.C18220wO;
import X.C32165H8c;
import X.C34640IcN;
import X.C50412sx;
import X.L56;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class ShortUrlReelLoadingFragment extends C34640IcN implements L56 {
    public UserSession A00;
    public final Handler A01 = AnonymousClass0wJ.A0F();
    public SpinnerImageView mLoadingSpinner;

    public final boolean BR2() {
        return true;
    }

    public final String getModuleName() {
        return "short_url_reel_loading_fragment";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.Cjt(this.A00, R.layout.action_bar_title_logo, C18220wO.A03(AnonymousClass0wJ.A0B(this)), 0);
        r5.CtT(true);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(566205458);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        String string = requireArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL");
        if (string != null) {
            C32165H8c A002 = C50412sx.A00(this.A00, string);
            A002.A00 = new AnonymousClass1hJ(this, string);
            schedule(A002);
        }
        C14030oh.A09(1049292480, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1738416918);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_loading_spinner);
        C14030oh.A09(188695034, A02);
        return A0H;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(1179998937);
        super.onDestroyView();
        this.mLoadingSpinner = null;
        C14030oh.A09(-1358229143, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.requireViewById(R.id.loading_spinner);
        this.mLoadingSpinner = spinnerImageView;
        spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
    }
}
