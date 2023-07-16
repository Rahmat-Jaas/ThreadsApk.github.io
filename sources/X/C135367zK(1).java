package X;

import android.content.Context;
import android.widget.TextView;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.7zK  reason: invalid class name and case insensitive filesystem */
public final class C135367zK implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public C135367zK(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    public final void run() {
        boolean z = FBPayAnimationButton.A0E;
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        if (z) {
            TextView progressMsgView = fBPayAnimationButton.getProgressMsgView();
            Context context = fBPayAnimationButton.getContext();
            C18200wM.A15(context, progressMsgView, 2131826592);
            fBPayAnimationButton.getProgressMsgView().setTextColor(AnonymousClass7Kz.A0G().A03(context, 16));
            return;
        }
        C18200wM.A15(fBPayAnimationButton.getContext(), fBPayAnimationButton.getProgressMsgView(), 2131826591);
    }
}
