package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.7Ry  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C122417Ry implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ C122417Ry(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        androidComposeViewAccessibilityDelegateCompat.A0B = androidComposeViewAccessibilityDelegateCompat.A0K.getEnabledAccessibilityServiceList(-1);
    }
}
