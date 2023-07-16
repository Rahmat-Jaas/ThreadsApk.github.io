package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxExecutorShape577S0100000_2_I2;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.barcelona.R;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.5xH  reason: invalid class name */
public final class AnonymousClass5xH extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "InstantExperiencesBrowserFragment";
    public IGInstantExperiencesParameters A00;
    public AnonymousClass7pY A01;
    public AnonymousClass7pZ A02;
    public UserSession A03;
    public boolean A04 = false;
    public C105746dv A05;
    public InstantExperiencesBrowserChrome A06;
    public C121507Gm A07;

    public final String getModuleName() {
        return "instant_experiences_browser";
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        C121507Gm r4 = this.A07;
        Stack stack = r4.A0D;
        WebView webView = (WebView) stack.peek();
        if (webView == null) {
            return false;
        }
        if (webView.canGoBack()) {
            webView.goBack();
            return true;
        } else if (stack.size() <= 1) {
            return false;
        } else {
            C121507Gm.A02(r4);
            return true;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(733139151);
        View inflate = layoutInflater.inflate(R.layout.instant_experiences_browser_fragment, viewGroup, false);
        UserSession A0V = C18180wK.A0V(requireArguments());
        this.A03 = A0V;
        C115456v8 r7 = new C115456v8(A0V);
        FragmentActivity activity = getActivity();
        C121557Gu r6 = new C121557Gu(activity, C60053Nl.A00(activity).A00);
        AnonymousClass76J r11 = new AnonymousClass76J(new AnonymousClass3z7(requireArguments(), r6, this.A03), r7, Executors.newSingleThreadExecutor(), Executors.newSingleThreadExecutor());
        r11.A03.execute(new C72864Qa(r11, new C125267co(r11, new SettableFuture())));
        C109696kQ r12 = new C109696kQ(r11, r6, r7, Executors.newSingleThreadExecutor());
        IDxExecutorShape577S0100000_2_I2 iDxExecutorShape577S0100000_2_I2 = new IDxExecutorShape577S0100000_2_I2(this, 2);
        String string = requireArguments().getString(AnonymousClass69T.A0C.toString());
        try {
            this.A00 = new IGInstantExperiencesParameters(AnonymousClass00U.A0h("{\"whitelisted_domains\": \"https://fbplugins.herokuapp.com\", \"feature_list\": {\"is_autofill_enabled\": true, \"is_autofill_save_enabled\": true, \"is_payment_enabled\": true}, \"page_name\": \"IX Test\",\"business_id\": \"", requireArguments().getString(AnonymousClass69T.A05.toString()), "\",\"website_uri\": \"", string, "\"}"), Long.valueOf(new Random().nextLong()));
            requireArguments().getString(AnonymousClass69T.A0A.toString());
            requireArguments().getString(AnonymousClass69T.A0B.toString());
            this.A00.A00 = requireArguments().getString(AnonymousClass69T.A02.toString());
        } catch (JSONException e) {
            AnonymousClass0LU.A03(AnonymousClass5xH.class, e.getMessage(), e);
        }
        AnonymousClass7H6 A012 = AnonymousClass7H6.A01(this.A03);
        IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A00;
        C81194nK r72 = A012.A00;
        synchronized (r72) {
        }
        AnonymousClass32J A002 = AnonymousClass7H6.A00(iGInstantExperiencesParameters);
        iGInstantExperiencesParameters.A02.toString();
        synchronized (A002) {
        }
        synchronized (r72) {
        }
        this.A06 = (InstantExperiencesBrowserChrome) inflate.requireViewById(R.id.instant_experiences_browser_chrome);
        this.A01 = new AnonymousClass7pY();
        this.A02 = new AnonymousClass7pZ(r12, this.A03, iDxExecutorShape577S0100000_2_I2);
        this.A05 = new C105746dv(iDxExecutorShape577S0100000_2_I2);
        Context context = getContext();
        UserSession userSession = this.A03;
        C121507Gm r73 = new C121507Gm(context, (ProgressBar) inflate.findViewById(R.id.instant_experiences_browser_progress_bar), new AnonymousClass6GH(), r11, r12, new AnonymousClass6GI(), this.A00, this, (InstantExperiencesWebViewContainerLayout) inflate.findViewById(R.id.instant_experiences_webview_container), userSession);
        this.A07 = r73;
        InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A06;
        UserSession userSession2 = this.A03;
        instantExperiencesBrowserChrome.A08 = r73;
        instantExperiencesBrowserChrome.A09 = userSession2;
        instantExperiencesBrowserChrome.A0A = new IDxExecutorShape577S0100000_2_I2(instantExperiencesBrowserChrome, 1);
        instantExperiencesBrowserChrome.A06 = AnonymousClass0wJ.A0L(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_title);
        instantExperiencesBrowserChrome.A05 = AnonymousClass0wJ.A0L(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_subtitle);
        instantExperiencesBrowserChrome.A04 = AnonymousClass0wJ.A0L(instantExperiencesBrowserChrome, R.id.instant_experiences_chrome_loading);
        instantExperiencesBrowserChrome.A03 = C18200wM.A0J(instantExperiencesBrowserChrome, R.id.instant_experiences_overflow_menu);
        instantExperiencesBrowserChrome.A06.setVisibility(8);
        instantExperiencesBrowserChrome.A05.setVisibility(8);
        instantExperiencesBrowserChrome.A04.setVisibility(0);
        C121507Gm r0 = instantExperiencesBrowserChrome.A08;
        r0.A0B.add(new C125307cv(instantExperiencesBrowserChrome));
        ImageView A0J = C18200wM.A0J(instantExperiencesBrowserChrome, R.id.instant_experiences_back_button);
        instantExperiencesBrowserChrome.A02 = A0J;
        A0J.setColorFilter(-7829368);
        instantExperiencesBrowserChrome.A03.setColorFilter(-7829368);
        FrameLayout frameLayout = (FrameLayout) instantExperiencesBrowserChrome.requireViewById(R.id.instant_experiences_back_button_container);
        instantExperiencesBrowserChrome.A01 = frameLayout;
        C86104wH.A1C(frameLayout, 106, instantExperiencesBrowserChrome);
        instantExperiencesBrowserChrome.A03.setOnClickListener(C18190wL.A0H(instantExperiencesBrowserChrome, 178));
        this.A06.A07 = new C130257pa(this);
        ArrayList<C144488ia> A0v = AnonymousClass0wJ.A0v();
        A0v.add(this.A01);
        A0v.add(this.A02);
        C105746dv r8 = this.A05;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C112486pg r62 = new C112486pg(r8, A0v, atomicBoolean);
        for (C144488ia BDb : A0v) {
            BDb.BDb().A00.add(r62);
        }
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass7Rq(inflate, r62, r8, atomicBoolean));
        r62.A00();
        ((WebView) this.A07.A0D.peek()).loadUrl(string);
        this.A04 = false;
        C14030oh.A09(997043351, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-584013345);
        super.onDestroy();
        if (this.A00 != null) {
            AnonymousClass7H6 A012 = AnonymousClass7H6.A01(this.A03);
            AnonymousClass7H6.A00(this.A00);
            C81194nK r0 = A012.A00;
            synchronized (r0) {
            }
            synchronized (r0) {
            }
        }
        C14030oh.A09(-1063733712, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-384031703);
        super.onPause();
        AnonymousClass7H6 A012 = AnonymousClass7H6.A01(this.A03);
        AnonymousClass7H6.A00(this.A00);
        synchronized (A012.A00) {
        }
        C14030oh.A09(-1588754703, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1154434063);
        super.onResume();
        AnonymousClass7H6 A012 = AnonymousClass7H6.A01(this.A03);
        IGInstantExperiencesParameters iGInstantExperiencesParameters = this.A00;
        C81194nK r0 = A012.A00;
        synchronized (r0) {
        }
        AnonymousClass7H6.A00(iGInstantExperiencesParameters);
        synchronized (r0) {
        }
        C14030oh.A09(1216117113, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-646118361);
        super.onStop();
        if (this.A00 != null) {
            AnonymousClass7H6 A012 = AnonymousClass7H6.A01(this.A03);
            AnonymousClass7H6.A00(this.A00);
            C81194nK r0 = A012.A00;
            synchronized (r0) {
            }
            synchronized (r0) {
            }
        }
        C14030oh.A09(-949994176, A022);
    }
}
