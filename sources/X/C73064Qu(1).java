package X;

import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.4Qu  reason: invalid class name and case insensitive filesystem */
public final class C73064Qu implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;
    public final /* synthetic */ Integer A01;

    public C73064Qu(CategorySearchFragment categorySearchFragment, Integer num) {
        this.A00 = categorySearchFragment;
        this.A01 = num;
    }

    public final void run() {
        this.A00.mCategoriesListView.setSelection(this.A01.intValue());
    }
}
