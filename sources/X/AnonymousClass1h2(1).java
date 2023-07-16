package X;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1h2  reason: invalid class name */
public final class AnonymousClass1h2 extends C63873iU {
    public final /* synthetic */ AnonymousClass1cQ A00;

    public AnonymousClass1h2(AnonymousClass1cQ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int A03 = C14030oh.A03(1983909327);
        C22061Tf r9 = (C22061Tf) obj;
        int A032 = C14030oh.A03(1892449418);
        C04220Ms.A0B(r9, 0);
        AnonymousClass1cQ r2 = this.A00;
        AnonymousClass3XB.A00(AnonymousClass0wJ.A0U(r2.A06), AnonymousClass265.A0f, (Boolean) null, (Long) null, 28);
        String str = r9.A03;
        if (!(str == null || str.length() == 0)) {
            TextView textView = r2.A00;
            if (textView != null) {
                textView.setVisibility(0);
            }
            int integer = AnonymousClass0wJ.A0B(r2).getInteger(17694721);
            TextView textView2 = r2.A00;
            if (textView2 != null) {
                textView2.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            TextView textView3 = r2.A00;
            if (textView3 != null) {
                textView3.setText(r9.A03);
            }
            TextView textView4 = r2.A00;
            if (!(textView4 == null || (animate = textView4.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration((long) integer)) == null)) {
                duration.start();
            }
        }
        C14030oh.A0A(1422744, A032);
        C14030oh.A0A(751671816, A03);
    }
}
