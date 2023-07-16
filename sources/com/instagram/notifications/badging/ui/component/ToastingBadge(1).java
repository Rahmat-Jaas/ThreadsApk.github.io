package com.instagram.notifications.badging.ui.component;

import X.AnonymousClass25R;
import X.AnonymousClass2AP;
import X.AnonymousClass4EJ;
import X.AnonymousClass4WJ;
import X.C04220Ms;
import X.C04530Oa;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C29511yH;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ToastingBadge extends C29511yH {
    public AnonymousClass2AP A00;
    public final AnonymousClass25R A01;
    public final boolean A02;
    public final TypedArray A03;
    public final Map A04;
    public final C04530Oa A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setUseCase(AnonymousClass2AP r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass2AP getUseCase() {
        AnonymousClass2AP r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("useCase");
        throw null;
    }

    public AnonymousClass4EJ getViewModelFactory() {
        return (AnonymousClass4EJ) this.A05.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        Map A0H = AnonymousClass4WJ.A0H(C18180wK.A0p(0, AnonymousClass25R.BOTTOM_NAVIGATION_BAR), C18180wK.A0p(1, AnonymousClass25R.PROFILE_PAGE), C18180wK.A0p(2, AnonymousClass25R.PROFILE_MENU), C18180wK.A0p(3, AnonymousClass25R.ACCOUNT_SWITCHER), C18180wK.A0p(4, AnonymousClass25R.ACTIVITY_FEED), C18180wK.A0p(5, AnonymousClass25R.TOP_NAVIGATION_BAR));
        this.A04 = A0H;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A2E, 0, 0);
        C04220Ms.A06(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes;
        this.A02 = obtainStyledAttributes.getBoolean(2, false);
        AnonymousClass25R r0 = (AnonymousClass25R) C18200wM.A0f(A0H, obtainStyledAttributes.getInt(0, -1));
        this.A01 = r0 == null ? AnonymousClass25R.INVALID : r0;
        this.A05 = C18190wL.A0x(this, 15);
    }

    public /* synthetic */ ToastingBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
