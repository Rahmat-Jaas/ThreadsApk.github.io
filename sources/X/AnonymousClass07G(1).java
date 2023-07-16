package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.07G  reason: invalid class name */
public final class AnonymousClass07G implements Runnable {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass07G(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public final void run() {
        ViewPager viewPager = this.A00;
        viewPager.setScrollState(0);
        viewPager.A0G(viewPager.A02);
    }
}
