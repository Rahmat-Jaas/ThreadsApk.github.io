package com.instagram.debug.devoptions;

import android.view.View;
import android.widget.AdapterView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;

public final class InjectMediaFragment$onCreateView$3 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ IgTextView $clearAllButton;
    public final /* synthetic */ InlineSearchBox $inlineSearchBox;
    public final /* synthetic */ TriangleSpinner $surfaceSelector;
    public final /* synthetic */ InjectMediaFragment this$0;

    public void onNothingSelected(AdapterView adapterView) {
    }

    public InjectMediaFragment$onCreateView$3(InjectMediaFragment injectMediaFragment, TriangleSpinner triangleSpinner, IgTextView igTextView, InlineSearchBox inlineSearchBox) {
        this.this$0 = injectMediaFragment;
        this.$surfaceSelector = triangleSpinner;
        this.$clearAllButton = igTextView;
        this.$inlineSearchBox = inlineSearchBox;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.this$0.updateList(this.$surfaceSelector, this.$clearAllButton, this.$inlineSearchBox);
    }
}
