package com.instagram.feed.ui.views;

import X.AnonymousClass50V;
import X.AnonymousClass8f2;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class EndOfFeedDemarcatorCheckmark extends AnonymousClass50V implements AnonymousClass8f2 {
    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A0U, 0, i);
            this.A02 = typedArray.getInteger(2, this.A02);
            this.A01 = typedArray.getFloat(1, this.A01);
            this.A00 = typedArray.getFloat(0, this.A00);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public EndOfFeedDemarcatorCheckmark(Context context) {
        this(context, (AttributeSet) null);
    }

    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
