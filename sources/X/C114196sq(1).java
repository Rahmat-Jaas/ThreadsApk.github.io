package X;

import android.view.KeyEvent;

/* renamed from: X.6sq  reason: invalid class name and case insensitive filesystem */
public final class C114196sq {
    public final KeyEvent A00;

    public final boolean equals(Object obj) {
        KeyEvent keyEvent = this.A00;
        if (!(obj instanceof C114196sq) || !C04220Ms.A0I(keyEvent, ((C114196sq) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("KeyEvent(nativeKeyEvent="));
    }

    public /* synthetic */ C114196sq(KeyEvent keyEvent) {
        this.A00 = keyEvent;
    }
}
