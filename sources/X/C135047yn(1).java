package X;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7yn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135047yn implements Runnable {
    public final /* synthetic */ AndroidComposeView A00;

    public /* synthetic */ C135047yn(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    public final void run() {
        AndroidComposeView androidComposeView = this.A00;
        androidComposeView.A07 = false;
        MotionEvent motionEvent = androidComposeView.A03;
        C04220Ms.A0A(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            AndroidComposeView.A01(motionEvent, androidComposeView);
            return;
        }
        throw C18180wK.A0a("The ACTION_HOVER_EXIT event was not cleared.");
    }
}
