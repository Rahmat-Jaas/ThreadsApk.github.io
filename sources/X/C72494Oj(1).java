package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.comments.controller.CommentComposerController;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Oj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72494Oj implements Runnable {
    public final /* synthetic */ CommentComposerController A00;

    public /* synthetic */ C72494Oj(CommentComposerController commentComposerController) {
        this.A00 = commentComposerController;
    }

    public final void run() {
        CommentComposerController commentComposerController = this.A00;
        FragmentActivity activity = commentComposerController.A0X.getActivity();
        View A01 = CommentComposerController.A01(commentComposerController);
        if (activity != null && A01 != null && !commentComposerController.A0I) {
            UserSession userSession = commentComposerController.A0i;
            C04220Ms.A0B(userSession, 0);
            AnonymousClass0wJ.A14(C28161tl.A04(userSession), "inline_emoji_composer_single_tap_nux_seen_count", 0);
            commentComposerController.A0I = true;
            int i = 2131829070;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324634367697486L)) {
                i = 2131829071;
            }
            C25553Dnn A002 = AnonymousClass4DS.A00(activity, i);
            C18230wP.A15(A01, A002);
            C18200wM.A1Q(A002);
        }
    }
}
