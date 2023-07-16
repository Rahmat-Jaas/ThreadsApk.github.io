package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.4OL  reason: invalid class name */
public final class AnonymousClass4OL implements Runnable {
    public final /* synthetic */ AnonymousClass1c8 A00;

    public AnonymousClass4OL(AnonymousClass1c8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1c8 r3 = this.A00;
        if (r3.mView != null && r3.getContext() != null) {
            View view = r3.A00;
            if (view == null || view.getParent() != null) {
                Integer num = r3.A0A.A0M;
                if (num != null) {
                    View A0H = AnonymousClass0wJ.A0H(C18230wP.A0F(r3), (ViewGroup) r3.mView, num.intValue());
                    r3.A00 = A0H;
                    ((ViewGroup) r3.mView).addView(A0H);
                    return;
                }
                SpinnerImageView spinnerImageView = new SpinnerImageView(r3.getContext());
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                r3.A00 = spinnerImageView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                ((ViewGroup) r3.mView).addView(r3.A00, layoutParams);
            }
        }
    }
}
