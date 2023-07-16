package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.6su  reason: invalid class name and case insensitive filesystem */
public final class C114236su {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114236su) || i != ((C114236su) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }

    public /* synthetic */ C114236su(int i) {
        this.A00 = i;
    }
}
