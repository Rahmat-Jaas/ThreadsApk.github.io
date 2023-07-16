package com.instagram.direct.ui;

import X.AnonymousClass4xN;
import X.C04220Ms;
import X.C39910L7c;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

public final class DirectShareShimmerView extends C39910L7c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        Resources resources = getResources();
        C04220Ms.A06(resources);
        setImageDrawable(new AnonymousClass4xN(resources, this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context) {
        super(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
        Resources resources = getResources();
        C04220Ms.A06(resources);
        setImageDrawable(new AnonymousClass4xN(resources, this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
        Resources resources = getResources();
        C04220Ms.A06(resources);
        setImageDrawable(new AnonymousClass4xN(resources, this));
    }
}
