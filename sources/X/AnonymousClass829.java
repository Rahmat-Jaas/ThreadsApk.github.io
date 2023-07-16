package X;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.829  reason: invalid class name */
public final class AnonymousClass829 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ C107026g1 A02;

    public AnonymousClass829(WebView webView, C107026g1 r2, int i) {
        this.A02 = r2;
        this.A01 = webView;
        this.A00 = i;
    }

    public final void run() {
        C107026g1 r3 = this.A02;
        WebView webView = this.A01;
        int i = this.A00 * 10;
        int i2 = 100;
        if (i <= 100) {
            i = 100;
        }
        String url = webView.getUrl();
        if (AnonymousClass7CU.A00(url) || !AnonymousClass74M.A00(Uri.parse(url))) {
            i2 = i;
            if (i == 1000) {
                ProgressBar progressBar = r3.A01;
                if (progressBar.getVisibility() == 0) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    alphaAnimation.setInterpolator(new AccelerateInterpolator());
                    alphaAnimation.setDuration((long) 300);
                    alphaAnimation.setAnimationListener(new C122427Rz(progressBar));
                    progressBar.startAnimation(alphaAnimation);
                    return;
                } else if (progressBar.getVisibility() == 4) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
        }
        ProgressBar progressBar2 = r3.A01;
        if (progressBar2.getVisibility() == 8) {
            progressBar2.setVisibility(0);
        }
        if (i2 < progressBar2.getProgress()) {
            progressBar2.setProgress(0);
        }
        if (i2 != progressBar2.getProgress()) {
            ObjectAnimator objectAnimator = r3.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            r3.A00 = ObjectAnimator.ofInt(progressBar2, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{progressBar2.getProgress(), i2});
            r3.A00.setDuration((long) ((i2 - progressBar2.getProgress()) << 1));
            C86164wN.A15(r3.A00);
            r3.A00.start();
        }
    }
}
