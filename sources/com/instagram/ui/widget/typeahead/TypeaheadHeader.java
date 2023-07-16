package com.instagram.ui.widget.typeahead;

import X.AnonymousClass0wJ;
import X.AnonymousClass3PE;
import X.C14030oh;
import X.C18180wK;
import X.C83114qo;
import X.C83874s8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCListenerShape690S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape545S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public class TypeaheadHeader extends LinearLayout implements AbsListView.OnScrollListener {
    public SearchEditText A00;
    public C83874s8 A01;
    public C83114qo A02;

    public final void A01() {
        this.A00.clearFocus();
        this.A00.A02();
    }

    public String getSearchString() {
        return AnonymousClass0wJ.A0n(this.A00).trim();
    }

    public void setAllowTextSelection(boolean z) {
        this.A00.setAllowTextSelection(z);
    }

    public void setClearButtonEnabled(boolean z) {
        this.A00.setClearButtonEnabled(z);
    }

    public void setEditTextBackground(Drawable drawable) {
        this.A00.setBackground(drawable);
    }

    public void setFocusOnTouchEnabled(boolean z) {
        this.A00.A0E = z;
    }

    public void setOnSearchEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setSearchIconPadding(int i) {
        this.A00.setCompoundDrawablePadding(i);
    }

    public TypeaheadHeader(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        C18180wK.A0C(this).inflate(R.layout.typeahead_header, this, true);
        SearchEditText searchEditText = (SearchEditText) requireViewById(R.id.row_search_edit_text);
        this.A00 = searchEditText;
        searchEditText.A06 = new IDxTListenerShape545S0100000_1_I2(this, 4);
        searchEditText.A05 = new IDxCListenerShape690S0100000_1_I2(this, 1);
        AnonymousClass3PE.A00(searchEditText);
        AnonymousClass3PE.A01(this.A00);
        C83874s8 r1 = this.A01;
        if (r1 != null) {
            r1.registerTextViewLogging(this.A00);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C14030oh.A0A(-10701698, C14030oh.A03(911549058));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C14030oh.A03(-125974086);
        if (i == 1) {
            A01();
        }
        C14030oh.A0A(1980414413, A03);
    }

    public void setDelegate(C83874s8 r1) {
        this.A01 = r1;
    }

    public void setSearchClearListener(C83114qo r1) {
        this.A02 = r1;
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public TypeaheadHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
