package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public final class C007703i implements AccessibilityManager.AccessibilityStateChangeListener {
    public C007603h A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C007703i)) {
            return false;
        }
        return this.A00.equals(((C007703i) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void onAccessibilityStateChanged(boolean z) {
        this.A00.onAccessibilityStateChanged(z);
    }

    public C007703i(C007603h r1) {
        this.A00 = r1;
    }
}
