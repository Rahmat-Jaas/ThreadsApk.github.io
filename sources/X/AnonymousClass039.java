package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.039  reason: invalid class name */
public final class AnonymousClass039 extends C010204r {
    public final /* synthetic */ Fragment A00;

    public AnonymousClass039(Fragment fragment) {
        this.A00 = fragment;
    }

    public final View A00(int i) {
        Fragment fragment = this.A00;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean A01() {
        if (this.A00.mView != null) {
            return true;
        }
        return false;
    }
}
