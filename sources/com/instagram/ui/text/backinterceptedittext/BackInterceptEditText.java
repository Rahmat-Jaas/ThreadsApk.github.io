package com.instagram.ui.text.backinterceptedittext;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C77394fi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.instagram.common.ui.base.IgEditText;

public final class BackInterceptEditText extends IgEditText {
    public AnonymousClass0ZU A00 = C77394fi.A00;

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C04220Ms.A0B(keyEvent, 1);
        if (i == 4) {
            this.A00.invoke();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setOnBackCallback(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass0ZU getOnBackCallback() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackInterceptEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0wJ.A1O(context, attributeSet);
    }
}
