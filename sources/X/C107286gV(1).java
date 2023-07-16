package X;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.instagram.barcelona.R;

/* renamed from: X.6gV  reason: invalid class name and case insensitive filesystem */
public final class C107286gV {
    public WebView A00;
    public ProgressBar A01;

    public C107286gV(View view) {
        this.A01 = (ProgressBar) view.requireViewById(R.id.fbpay_auth_progress_bar);
        this.A00 = (WebView) view.requireViewById(R.id.auth_web_view);
    }
}
