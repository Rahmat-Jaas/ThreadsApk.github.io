package X;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.7Rv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C122397Rv implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView A00;

    public /* synthetic */ C122397Rv(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        this.A00.A0S.A00.CrC(new C114186sp(C86164wN.A04(z ? 1 : 0)));
    }
}
