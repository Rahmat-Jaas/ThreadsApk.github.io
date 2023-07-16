package com.instagram.common.bloks.component.textinput;

import X.C04220Ms;
import X.C14030oh;
import X.C18210wN;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EditTextForMeasure extends BloksEditText {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextForMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
    }

    public final void requestLayout() {
    }

    public final void invalidate() {
        C14030oh.A0A(289975394, C14030oh.A03(1287002842));
    }

    public /* synthetic */ EditTextForMeasure(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
