package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.07N  reason: invalid class name */
public final class AnonymousClass07N extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass07N(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public final void onChanged() {
        this.A00.A0F();
    }

    public final void onInvalidated() {
        this.A00.A0F();
    }
}
