package com.instagram.feed.survey;

import X.C04220Ms;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

public final class SurveySubmitButton extends IgTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        boolean isActivated = isActivated();
        int i = R.drawable.not_activated_survey_submit_button_background;
        if (isActivated) {
            i = R.drawable.activated_survey_submit_button_background;
        }
        setBackgroundResource(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurveySubmitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
    }
}
