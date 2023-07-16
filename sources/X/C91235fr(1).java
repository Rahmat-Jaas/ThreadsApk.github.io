package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStructure;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.secure.webkit.WebView;

/* renamed from: X.5fr  reason: invalid class name and case insensitive filesystem */
public final class C91235fr extends WebView implements C141998dd {
    public final /* synthetic */ SystemWebView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91235fr(Context context, SystemWebView systemWebView) {
        super(context, (AttributeSet) null, 16842885);
        this.A00 = systemWebView;
    }

    public static void A00(C872350v r1, C91235fr r2) {
        super.onProvideAutofillVirtualStructure(r1, 0);
    }

    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        SystemWebView systemWebView = this.A00;
        if (systemWebView.A0I) {
            C112066ov r1 = systemWebView.A0D;
            if (r1 != null && systemWebView.A0J) {
                r1.A00();
            }
        } else if (!systemWebView.A0J || (viewStructure instanceof C872350v)) {
            super.onProvideAutofillVirtualStructure(viewStructure, i);
        } else {
            C112066ov r0 = systemWebView.A0D;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(1506898220);
        super.onAttachedToWindow();
        C14030oh.A0D(1476421381, A06);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C104376bg r0 = this.A00.A0A;
        if (r0 != null) {
            for (L3Z CIl : r0.A00.A0j) {
                CIl.CIl(i, i2, i3, i4);
            }
        }
    }
}
