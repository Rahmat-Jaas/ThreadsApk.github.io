package X;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.1vq  reason: invalid class name and case insensitive filesystem */
public final class C28961vq extends C34608Ibe implements C82424pb {
    public static final String __redex_internal_original_name = "IACWebviewFragment";
    public SimpleWebViewConfig A00;
    public C144658ir A01;
    public C84464tB A02;
    public String A03;

    public final boolean onBackPressed() {
        C10300i6 r2 = this.A03;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (!C63803iN.A05(r3, r2, 36325154057495514L).booleanValue() || C63803iN.A05(r3, this.A03, 36325154057429977L).booleanValue()) {
            return super.onBackPressed();
        }
        String url = this.A02.getUrl();
        String str = this.A03;
        if (str == null) {
            C04220Ms.A0E("liveChatUrl");
            throw null;
        } else if (url != null && url.equals(str)) {
            return false;
        } else {
            this.A02.goBack();
            return true;
        }
    }

    public final boolean A02(Uri uri, WebView webView) {
        boolean A1Z = AnonymousClass0wJ.A1Z(webView, uri);
        if (!C63803iN.A05(AnonymousClass0TJ.A05, this.A03, 36325154057429977L).booleanValue()) {
            return super.A02(uri, webView);
        }
        C10300i6 r3 = this.A03;
        if (r3 != null) {
            UserSession userSession = (UserSession) r3;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C37350Jpy A0Y = C18230wP.A0Y(activity, userSession, C171209wF.A1P, uri.toString());
                A0Y.A06(userSession.getUserId());
                A0Y.A07(getModuleName());
                A0Y.A04();
                return A1Z;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        SimpleWebViewConfig simpleWebViewConfig;
        int A022 = C14030oh.A02(-1073977154);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("IACWebviewFragment.LIVE_CHAT_URL_KEY");
        }
        if (str != null) {
            this.A03 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (simpleWebViewConfig = (SimpleWebViewConfig) bundle3.getParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG")) == null) {
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = -1127538672;
            } else {
                this.A00 = simpleWebViewConfig;
                int A012 = C121907Is.A01(getRootActivity(), R.attr.tabBarHeight);
                this.A02 = C25711DqZ.A01(this, false, false);
                this.A01 = new AnonymousClass4AB(this, A012);
                C14030oh.A09(-364047269, A022);
                return;
            }
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -646488503;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(129280892);
        super.onStart();
        C84464tB r1 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (r1 != null) {
            C144658ir r0 = this.A01;
            if (r0 == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                r1.A6s(r0);
                C84464tB r12 = this.A02;
                if (r12 != null) {
                    r12.CLs(getRootActivity());
                    C14030oh.A09(1990900736, A022);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-982738957);
        super.onStop();
        C84464tB r2 = this.A02;
        String str = "keyboardHeightChangeDetector";
        if (r2 != null) {
            C144658ir r0 = this.A01;
            if (r0 == null) {
                str = "onKeyboardHeightChangeListener";
            } else {
                r2.Cc8(r0);
                C84464tB r02 = this.A02;
                if (r02 != null) {
                    r02.onStop();
                    C14030oh.A09(-406493147, A022);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
