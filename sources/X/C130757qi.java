package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7qi  reason: invalid class name and case insensitive filesystem */
public final class C130757qi implements C82354pU {
    public Parcelable A00;
    public RecyclerView A01;
    public C91075fY A02 = new C91075fY();
    public String A03 = "";

    public final boolean isScrolledToTop() {
        if (AnonymousClass7J1.A04()) {
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                return !recyclerView.canScrollVertically(-1);
            }
            return true;
        }
        throw C18250wR.A0V("Cannot call isScrolledToTop off the main thread!");
    }
}
