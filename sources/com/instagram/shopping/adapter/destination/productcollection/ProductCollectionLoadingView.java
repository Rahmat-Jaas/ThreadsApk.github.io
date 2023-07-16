package com.instagram.shopping.adapter.destination.productcollection;

import X.AnonymousClass5yG;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProductCollectionLoadingView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A1k);
        C04220Ms.A06(obtainStyledAttributes);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setAdapter(new AnonymousClass5yG(context, z, z2, z3));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductCollectionLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ ProductCollectionLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
