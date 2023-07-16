package X;

import android.view.ViewPropertyAnimator;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.7zL  reason: invalid class name */
public final class AnonymousClass7zL implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public AnonymousClass7zL(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    public final void run() {
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (FBPayAnimationButton.A0E) {
            ViewPropertyAnimator withEndAction = fBPayAnimationButton.getProgressMsgView().animate().setStartDelay(3600).setDuration(3000).withStartAction(new C135357zI(fBPayAnimationButton)).withEndAction(new AnonymousClass7zJ(fBPayAnimationButton));
            fBPayAnimationButton.A03 = withEndAction;
            if (withEndAction != null) {
                withEndAction.start();
            }
        }
    }
}
