package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.redex.IDxExecutorShape577S0100000_2_I2;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.business.instantexperiences.ui.InstantExperiencesWebViewContainerLayout;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Executors;

/* renamed from: X.7Gm  reason: invalid class name and case insensitive filesystem */
public final class C121507Gm {
    public final Context A00;
    public final AnonymousClass6GH A01;
    public final AnonymousClass76J A02;
    public final C109696kQ A03;
    public final C113046qd A04;
    public final AnonymousClass6GI A05;
    public final IGInstantExperiencesParameters A06;
    public final C109196jc A07;
    public final AnonymousClass5xH A08;
    public final AnonymousClass511 A09;
    public final UserSession A0A;
    public final List A0B = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A0C = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final Stack A0D;
    public final C143228gK A0E;
    public final C143248gM A0F;
    public final InstantExperiencesWebViewContainerLayout A0G;
    public final C105756dw A0H;

    public static C91225fq A00(C121507Gm r10) {
        C91225fq r0;
        C91225fq r7 = new C91225fq(r10.A00, r10.A05);
        AnonymousClass513 r3 = new AnonymousClass513(r7, Executors.newSingleThreadExecutor());
        r3.A00 = r10.A04;
        r7.setWebViewClient(r3);
        UserSession userSession = r10.A0A;
        r7.addJavascriptInterface(new C115586vW(r3, r10.A06, new AnonymousClass78B(r10.A02, r10.A03, r7, r10.A08, userSession)), "_FBExtensions");
        String A0V = AnonymousClass00U.A0V(AnonymousClass7CV.A00(), " ", C18180wK.A0j("%s %s %s", new Object[]{"FBExtensions/0.1", "IGInstantExperience/0.1", "(autofill-enabled)"}));
        CookieManager.getInstance().setAcceptThirdPartyCookies(r7, true);
        WebSettings settings = r7.getSettings();
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setUserAgentString(AnonymousClass00U.A0V(settings.getUserAgentString(), " ", A0V));
        r7.setWebChromeClient(r10.A09);
        r3.A04.add(new C125337cy(r10));
        C109196jc r6 = r10.A07;
        if (r6.A00 == -1) {
            r6.A00 = System.currentTimeMillis();
        }
        r3.A06.add(new C104356be(new C105736du(r6)));
        Stack stack = r10.A0D;
        if (!stack.empty() && (r0 = (C91225fq) stack.peek()) != null) {
            AnonymousClass513 r02 = r0.A00;
            r02.A05.remove(r10.A0F);
        }
        AnonymousClass513 r2 = r7.A00;
        r2.A05.add(r10.A0F);
        r2.A03.add(r10.A0E);
        stack.push(r7);
        r10.A0G.setWebView(r7);
        return r7;
    }

    public static String A01(InstantExperiencesBrowserChrome instantExperiencesBrowserChrome) {
        return ((WebView) instantExperiencesBrowserChrome.A08.A0D.peek()).getUrl();
    }

    public static void A02(C121507Gm r4) {
        Stack stack = r4.A0D;
        if (stack.size() > 1) {
            WebView webView = (WebView) stack.pop();
            webView.setVisibility(8);
            InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout = r4.A0G;
            instantExperiencesWebViewContainerLayout.removeView(webView);
            webView.loadUrl(ReactWebViewManager.BLANK_URL);
            webView.setTag((Object) null);
            webView.clearHistory();
            webView.removeAllViews();
            webView.onPause();
            webView.destroy();
            C91225fq r3 = (C91225fq) stack.peek();
            if (r3 != null) {
                r3.setVisibility(0);
                r3.onResume();
                instantExperiencesWebViewContainerLayout.setWebView(r3);
                C113046qd r2 = r4.A04;
                r2.A01.execute(new AnonymousClass80U(r3, r2));
            }
        }
    }

    public C121507Gm(Context context, ProgressBar progressBar, AnonymousClass6GH r6, AnonymousClass76J r7, C109696kQ r8, AnonymousClass6GI r9, IGInstantExperiencesParameters iGInstantExperiencesParameters, AnonymousClass5xH r11, InstantExperiencesWebViewContainerLayout instantExperiencesWebViewContainerLayout, UserSession userSession) {
        C105756dw r1 = new C105756dw(this);
        this.A0H = r1;
        this.A0F = new AnonymousClass7d0(this);
        this.A0E = new C125317cw(this);
        this.A0D = new Stack();
        this.A09 = new AnonymousClass511(context, progressBar, r1, this);
        this.A0A = userSession;
        this.A08 = r11;
        this.A05 = r9;
        this.A01 = r6;
        this.A0G = instantExperiencesWebViewContainerLayout;
        this.A02 = r7;
        this.A00 = context;
        this.A06 = iGInstantExperiencesParameters;
        this.A03 = r8;
        C113046qd r12 = new C113046qd(Executors.newSingleThreadExecutor(), new IDxExecutorShape577S0100000_2_I2(this, 3));
        this.A04 = r12;
        this.A07 = new C109196jc(r12, iGInstantExperiencesParameters, userSession);
        A00(this);
    }
}
