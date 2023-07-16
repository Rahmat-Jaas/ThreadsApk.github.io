package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.redex.IDxCClientShape28S0100000_2_I2;
import com.facebook.redex.IDxVClientShape29S0100000_2_I2;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

/* renamed from: X.569  reason: invalid class name */
public final class AnonymousClass569 extends Fragment implements C143618h2 {
    public C107286gV A00;
    public Set A01;
    public AnonymousClass5jI A02;
    public String A03;

    public final boolean onBackPressed() {
        C107286gV r0 = this.A00;
        if (r0 == null || !r0.A00.canGoBack()) {
            return false;
        }
        this.A00.A00.goBack();
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C107286gV r0 = new C107286gV(view);
        this.A00 = r0;
        r0.A00.setFocusable(true);
        this.A00.A00.setFocusableInTouchMode(true);
        WebSettings settings = this.A00.A00.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        C86144wL.A1D(settings);
        this.A00.A00.setWebChromeClient(new IDxCClientShape28S0100000_2_I2(this, 1));
        this.A00.A00.setWebViewClient(new IDxVClientShape29S0100000_2_I2(this, 1));
        if (!TextUtils.isEmpty(this.A03)) {
            this.A00.A00.loadUrl(this.A03);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1455285550);
        super.onCreate(bundle);
        this.A02 = (AnonymousClass5jI) AnonymousClass7Kz.A07().A02(getActivity(), AnonymousClass5jI.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getString("WEB_FRAGMENT_LOAD_URL");
            this.A01 = C18200wM.A0u();
            String[] stringArray = bundle2.getStringArray("WEB_FRAGMENT_INTERCEPT_URLS");
            if (stringArray != null) {
                for (String uri : stringArray) {
                    try {
                        this.A01.add(new URI(uri));
                    } catch (URISyntaxException unused) {
                    }
                }
            }
        }
        C14030oh.A09(-271611429, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(846859192);
        AnonymousClass5jI r1 = this.A02;
        C143608h1 r0 = r1.A01;
        View A0D = C18180wK.A0D(((C128707k8) r0).A00, viewGroup, r1.A00, false);
        C14030oh.A09(-742202134, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1110457254);
        super.onDestroyView();
        WebView webView = this.A00.A00;
        webView.loadUrl(ReactWebViewManager.BLANK_URL);
        webView.clearCache(true);
        webView.setTag((Object) null);
        webView.clearHistory();
        webView.removeAllViews();
        webView.onPause();
        webView.destroy();
        this.A00 = null;
        C14030oh.A09(1501645186, A022);
    }
}
