package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* renamed from: X.7Rx  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Rx implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ AnonymousClass7Rx(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        List list;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.A0K.getEnabledAccessibilityServiceList(-1);
        } else {
            list = AnonymousClass0ZV.A00;
        }
        androidComposeViewAccessibilityDelegateCompat.A0B = list;
    }
}
