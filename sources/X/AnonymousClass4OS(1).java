package X;

import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.4OS  reason: invalid class name */
public final class AnonymousClass4OS implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public AnonymousClass4OS(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    public final void run() {
        CategorySearchFragment categorySearchFragment = this.A00;
        int measuredHeight = categorySearchFragment.mBusinessNavBar.getMeasuredHeight();
        C39909L6z l6z = (C39909L6z) categorySearchFragment.mBusinessNavBar.getLayoutParams();
        l6z.height = measuredHeight;
        categorySearchFragment.mBusinessNavBar.setLayoutParams(l6z);
        categorySearchFragment.mBusinessNavBar.setFooterText(categorySearchFragment.getString(2131821300));
    }
}
