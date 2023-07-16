package com.instagram.secondaryaccount.ui;

import X.C04220Ms;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;

public final class UsernameSuggestionContainerView extends LinearLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_stacked_max_height) * 5, Process.WAIT_RESULT_TIMEOUT));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSuggestionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
    }
}
