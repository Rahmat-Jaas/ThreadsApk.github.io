package com.facebookpay.msc.view;

import X.AnonymousClass5A5;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MSCPivotBar extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        AnonymousClass7Kz.A0D().A00(context, 12);
        throw null;
    }

    public final void setAdapter(AnonymousClass5A5 r2) {
        C04220Ms.A0B(r2, 0);
        setAdapter(r2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
        throw null;
    }

    public /* synthetic */ MSCPivotBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
        throw null;
    }
}
