package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass0wJ;
import X.AnonymousClass526;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.instagram.barcelona.R;

public class InstantExperiencesSaveAutofillDialog extends AnonymousClass526 {
    public InstantExperiencesSaveAutofillDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        AnonymousClass0wJ.A0L(this, R.id.instant_experiences_confirm_dialog_title).setText(resources.getString(2131821701));
        this.A00.setText(resources.getString(2131821698));
        this.A01.setText(resources.getString(2131821699));
    }

    public InstantExperiencesSaveAutofillDialog(Context context) {
        super(context);
    }
}
