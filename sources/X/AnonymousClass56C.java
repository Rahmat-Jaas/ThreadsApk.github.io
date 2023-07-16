package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.redex.IDxCClientShape28S0100000_2_I2;
import com.facebook.redex.IDxVClientShape29S0100000_2_I2;
import com.fbpay.hub.common.view.HubProgressBar;
import com.instagram.barcelona.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

/* renamed from: X.56C  reason: invalid class name */
public final class AnonymousClass56C extends Fragment implements C143618h2, C143678h8 {
    public HubProgressBar A00;
    public WebView A01;
    public String A02;
    public final Set A03 = C18200wM.A0u();

    public final C113986sV BH4() {
        boolean z;
        String str;
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = true;
            int i = bundle.getInt("title_res");
            Bundle bundle2 = this.mArguments;
            if (i != 0) {
                str = getString(bundle2.getInt("title_res"));
            } else {
                str = bundle2.getString(DialogModule.KEY_TITLE);
            }
        } else {
            z = false;
            str = null;
        }
        return new C113986sV((Drawable) null, (View.OnClickListener) null, (String) null, str, 0, 0, false, false, z);
    }

    public final boolean onBackPressed() {
        if (!this.A01.canGoBack()) {
            return false;
        }
        this.A01.goBack();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1239536250);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A02 = bundle2.getString("web_fragment_load_url");
            String[] stringArray = bundle2.getStringArray("web_fragment_intercept_urls");
            if (stringArray != null) {
                for (String uri : stringArray) {
                    try {
                        this.A03.add(new URI(uri));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        C14030oh.A09(-1401836163, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1293650017);
        AnonymousClass7Kz.A0K();
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_hub_web_view);
        C14030oh.A09(1719184425, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-36887658);
        super.onDestroyView();
        WebView webView = this.A01;
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        webView.clearCache(true);
        webView.setTag((Object) null);
        webView.clearHistory();
        webView.removeAllViews();
        webView.onPause();
        webView.destroy();
        this.A01 = null;
        this.A00 = null;
        C14030oh.A09(-1296932875, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = (HubProgressBar) view.requireViewById(R.id.fbpay_hub_progress_bar);
        WebView webView = (WebView) view.requireViewById(R.id.fbpay_hub_web_view);
        this.A01 = webView;
        webView.setFocusable(true);
        this.A01.setFocusableInTouchMode(true);
        WebSettings settings = this.A01.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C86144wL.A1D(settings);
        this.A01.setWebChromeClient(new IDxCClientShape28S0100000_2_I2(this, 2));
        this.A01.setWebViewClient(new IDxVClientShape29S0100000_2_I2(this, 2));
        if (!TextUtils.isEmpty(this.A02)) {
            this.A01.loadUrl(this.A02);
        }
    }
}
