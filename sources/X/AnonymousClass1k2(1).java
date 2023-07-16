package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.search.SearchController;

/* renamed from: X.1k2  reason: invalid class name */
public final class AnonymousClass1k2 extends C19819BBt implements C39798L0p {
    public boolean A00;
    public final View A01;
    public final CategorySearchFragment A02;
    public final SearchController A03;
    public final Activity A04;
    public final ViewGroup A05;

    public final void BxL() {
        A00(true);
    }

    public final void onSearchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        if (this.A03.A03 != AnonymousClass006.A01) {
            this.A02.A0N(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        this.A03.onViewCreated(view, bundle);
    }

    public AnonymousClass1k2(Activity activity, View view, ViewGroup viewGroup, ViewGroup viewGroup2, AnonymousClass1fK r17, CategorySearchFragment categorySearchFragment, InlineSearchBox inlineSearchBox) {
        AnonymousClass1fK r3 = r17;
        boolean A1Z = C18200wM.A1Z(r3);
        ViewGroup viewGroup3 = viewGroup2;
        C18180wK.A1R(viewGroup, viewGroup3);
        C04220Ms.A0B(view, 6);
        InlineSearchBox inlineSearchBox2 = inlineSearchBox;
        C04220Ms.A0B(inlineSearchBox2, 7);
        this.A04 = activity;
        this.A02 = categorySearchFragment;
        this.A05 = viewGroup;
        this.A01 = view;
        this.A00 = A1Z;
        SearchController searchController = new SearchController(activity, viewGroup3, new C27011rd(this), this, 0, 0, false);
        ListView listView = searchController.mViewHolder.A00;
        if (listView != null) {
            listView.setAdapter(r3);
        }
        this.A03 = searchController;
        BackInterceptEditText backInterceptEditText = inlineSearchBox2.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setTextIsSelectable(false);
            backInterceptEditText.setFocusable(false);
            backInterceptEditText.setFocusableInTouchMode(false);
            backInterceptEditText.setEnabled(false);
            backInterceptEditText.setClickable(false);
            backInterceptEditText.setLongClickable(false);
            backInterceptEditText.clearFocus();
        }
        AnonymousClass0wJ.A16(inlineSearchBox2, 217, this);
    }

    public final void A00(boolean z) {
        SearchController searchController = this.A03;
        if (searchController.A03 == AnonymousClass006.A0C) {
            String trim = AnonymousClass0wJ.A0n(searchController.mViewHolder.A0B).trim();
            if (trim == null) {
                trim = "";
            }
            searchController.A00(AnonymousClass006.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01.getHeight(), z);
            CategorySearchFragment categorySearchFragment = this.A02;
            ViewGroup viewGroup = categorySearchFragment.mContainer;
            if (viewGroup != null) {
                viewGroup.setPadding(0, categorySearchFragment.A00, 0, 0);
            }
            categorySearchFragment.mSearchBox.A07(trim, false);
            CategorySearchFragment.A06(categorySearchFragment);
            categorySearchFragment.mMainScreenContainer.setLayoutTransition(new LayoutTransition());
        }
    }

    public final float AQl(SearchController searchController, Integer num) {
        return (float) this.A01.getHeight();
    }

    public final void Bkd(SearchController searchController, Integer num, float f, float f2) {
        View view = this.A01;
        Activity activity = this.A04;
        ViewGroup viewGroup = this.A05;
        float height = f2 - ((float) view.getHeight());
        ViewGroup viewGroup2 = E2V.A03(activity).A0L;
        C04220Ms.A06(viewGroup2);
        viewGroup2.setTranslationY(height);
        viewGroup.setTranslationY(height);
    }

    public final void onDestroyView() {
        this.A03.onDestroyView();
    }

    public final void onPause() {
        this.A03.onPause();
    }

    public final void onResume() {
        SearchController searchController = this.A03;
        searchController.onResume();
        if (searchController.A03 == AnonymousClass006.A0C) {
            this.A02.A0L();
        }
    }
}
