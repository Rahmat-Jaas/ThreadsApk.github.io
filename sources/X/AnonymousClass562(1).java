package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.redex.IDxCClientShape28S0100000_2_I2;
import com.facebook.redex.IDxVClientShape29S0100000_2_I2;
import com.instagram.barcelona.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;

/* renamed from: X.562  reason: invalid class name */
public final class AnonymousClass562 extends Fragment {
    public WebView A00;
    public ProgressBar A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final HashSet A05 = C18200wM.A0u();

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        this.A00 = (WebView) AnonymousClass0wJ.A0J(view, R.id.auth_web_view);
        ProgressBar progressBar = (ProgressBar) AnonymousClass0wJ.A0J(view, R.id.fbpay_auth_progress_bar);
        this.A01 = progressBar;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setVisibility(8);
            WebView webView = this.A00;
            str = "webView";
            if (webView != null) {
                webView.setFocusable(true);
                WebView webView2 = this.A00;
                if (webView2 != null) {
                    webView2.setFocusableInTouchMode(true);
                    WebView webView3 = this.A00;
                    if (webView3 != null) {
                        WebSettings settings = webView3.getSettings();
                        C04220Ms.A06(settings);
                        settings.setJavaScriptEnabled(true);
                        settings.setJavaScriptCanOpenWindowsAutomatically(true);
                        settings.setSupportMultipleWindows(true);
                        C86144wL.A1D(settings);
                        IDxVClientShape29S0100000_2_I2 iDxVClientShape29S0100000_2_I2 = new IDxVClientShape29S0100000_2_I2(this, 0);
                        WebView webView4 = this.A00;
                        if (webView4 != null) {
                            webView4.setWebViewClient(iDxVClientShape29S0100000_2_I2);
                            WebView webView5 = this.A00;
                            if (webView5 != null) {
                                webView5.setWebChromeClient(new IDxCClientShape28S0100000_2_I2(this, 0));
                                AnonymousClass7Kz A0A = AnonymousClass7Kz.A0A();
                                C002801h.A02(A0A.A00.A0K, "WebViewHelper Factory is not provided!");
                                A0A.A00.A0K.get();
                                String str2 = this.A03;
                                WebView webView6 = this.A00;
                                if (str2 != null) {
                                    if (webView6 != null) {
                                        String str3 = this.A02;
                                        if (str3 != null) {
                                            webView6.postUrl(str3, AnonymousClass74V.A00(str2));
                                            return;
                                        }
                                    }
                                } else if (webView6 != null) {
                                    String str4 = this.A02;
                                    if (str4 != null) {
                                        webView6.loadUrl(str4);
                                        return;
                                    }
                                }
                                C04220Ms.A0E("loadUrl");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-199607994);
        super.onCreate(bundle);
        String string = requireArguments().getString("WEB_VIEW_URL");
        if (string != null) {
            this.A02 = string;
            this.A03 = requireArguments().getString("WEB_VIEW_POST_DATA");
            this.A04 = requireArguments().getBoolean("WEB_VIEW_FULL_SCREEN");
            String[] stringArray = requireArguments().getStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String uri : stringArray) {
                    try {
                        this.A05.add(new URI(uri));
                    } catch (URISyntaxException unused) {
                    }
                }
                C14030oh.A09(-1524415750, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1714515283;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1039439227;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1351919041);
        Context A0A = C18240wQ.A0A(this, layoutInflater, 0);
        AnonymousClass7Kz.A0G();
        LayoutInflater A0E = C86154wM.A0E(A0A, layoutInflater, R.style.FBPayUIWidget);
        AnonymousClass7Kz.A0M();
        if ("web_view_fragment".equals("web_view_fragment")) {
            View inflate = A0E.inflate(R.layout.fbpay_auth_ig_web_view, viewGroup, false);
            if (this.A04) {
                C04220Ms.A06(inflate);
                AnonymousClass0wJ.A0K(inflate, R.id.web_view_layout).setMinimumHeight(C18230wP.A0E(requireContext()).heightPixels);
            }
            C14030oh.A09(-1443457826, A022);
            return inflate;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid style type: ", "web_view_fragment"));
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(2142151378);
        super.onDestroyView();
        WebView webView = this.A00;
        if (webView == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        WebView webView2 = this.A00;
        if (webView2 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView2.clearCache(true);
        WebView webView3 = this.A00;
        if (webView3 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView3.setTag((Object) null);
        WebView webView4 = this.A00;
        if (webView4 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView4.clearHistory();
        WebView webView5 = this.A00;
        if (webView5 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView5.removeAllViews();
        WebView webView6 = this.A00;
        if (webView6 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView6.onPause();
        WebView webView7 = this.A00;
        if (webView7 == null) {
            C04220Ms.A0E("webView");
            throw null;
        }
        webView7.destroy();
        C14030oh.A09(85637932, A022);
    }
}
