package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0sb  reason: invalid class name and case insensitive filesystem */
public final class C16170sb extends C003201n {
    public final /* synthetic */ ViewPager A00;

    public C16170sb(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public final void A0I(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass07E r0;
        super.A0I(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        ViewPager viewPager = this.A00;
        AnonymousClass07E r02 = viewPager.A08;
        boolean z = true;
        if (r02 == null || r02.getCount() <= 1) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() == 4096 && (r0 = viewPager.A08) != null) {
            accessibilityEvent.setItemCount(r0.getCount());
            accessibilityEvent.setFromIndex(viewPager.A02);
            accessibilityEvent.setToIndex(viewPager.A02);
        }
    }

    public final void A0L(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0L(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.A0A("androidx.viewpager.widget.ViewPager");
        ViewPager viewPager = this.A00;
        AnonymousClass07E r0 = viewPager.A08;
        boolean z = true;
        if (r0 == null || r0.getCount() <= 1) {
            z = false;
        }
        accessibilityNodeInfoCompat.A02.setScrollable(z);
        if (viewPager.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.A06(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.A06(8192);
        }
    }

    public final boolean A0M(View view, int i, Bundle bundle) {
        ViewPager viewPager;
        int i2;
        if (!super.A0M(view, i, bundle)) {
            if (i != 4096) {
                if (i == 8192) {
                    viewPager = this.A00;
                    if (viewPager.canScrollHorizontally(-1)) {
                        i2 = viewPager.A02 - 1;
                    }
                }
                return false;
            }
            viewPager = this.A00;
            if (viewPager.canScrollHorizontally(1)) {
                i2 = viewPager.A02 + 1;
            }
            return false;
            viewPager.setCurrentItem(i2);
        }
        return true;
    }
}
