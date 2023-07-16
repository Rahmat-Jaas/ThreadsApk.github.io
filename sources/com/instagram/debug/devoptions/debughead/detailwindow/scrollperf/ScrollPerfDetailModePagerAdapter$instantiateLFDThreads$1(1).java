package com.instagram.debug.devoptions.debughead.detailwindow.scrollperf;

import X.C04220Ms;
import X.C14030oh;
import android.view.View;
import android.widget.TextView;

public final class ScrollPerfDetailModePagerAdapter$instantiateLFDThreads$1 implements View.OnClickListener {
    public final /* synthetic */ TextView $itemDetailThreadDifferenceButton;
    public boolean mShown;
    public final /* synthetic */ ScrollPerfDetailModePagerAdapter this$0;

    public ScrollPerfDetailModePagerAdapter$instantiateLFDThreads$1(ScrollPerfDetailModePagerAdapter scrollPerfDetailModePagerAdapter, TextView textView) {
        this.this$0 = scrollPerfDetailModePagerAdapter;
        this.$itemDetailThreadDifferenceButton = textView;
    }

    public final boolean getMShown() {
        return this.mShown;
    }

    public void onClick(View view) {
        TextView textView;
        String str;
        int A05 = C14030oh.A05(831210129);
        boolean z = !this.mShown;
        this.mShown = z;
        TextView textView2 = this.this$0.mItemDetailThreadDifference;
        if (z) {
            C04220Ms.A0A(textView2);
            textView2.setVisibility(0);
            textView = this.$itemDetailThreadDifferenceButton;
            str = "-";
        } else {
            C04220Ms.A0A(textView2);
            textView2.setVisibility(8);
            textView = this.$itemDetailThreadDifferenceButton;
            str = "+";
        }
        textView.setText(str);
        C14030oh.A0C(1847851627, A05);
    }

    public final void setMShown(boolean z) {
        this.mShown = z;
    }
}
