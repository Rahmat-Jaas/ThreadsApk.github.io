package com.instagram.notifications.badging.ui.component;

import X.AnonymousClass17J;
import X.AnonymousClass2AP;
import X.AnonymousClass4EI;
import X.C04220Ms;
import X.C04530Oa;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C27081rw;
import X.C29511yH;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MutableBadgeView extends C29511yH {
    public AnonymousClass2AP A00;
    public final C04530Oa A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MutableBadgeView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setBadgeData(AnonymousClass17J r2) {
        C04220Ms.A0B(r2, 0);
        ((C27081rw) getViewModel()).A00.CrC(r2);
    }

    public final AnonymousClass2AP getUseCase() {
        return this.A00;
    }

    public AnonymousClass4EI getViewModelFactory() {
        return (AnonymousClass4EI) this.A01.getValue();
    }

    public final void setUseCase(AnonymousClass2AP r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A01 = C18190wL.A0x(this, 14);
    }

    public /* synthetic */ MutableBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MutableBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
