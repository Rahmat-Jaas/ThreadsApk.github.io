package com.instagram.business.insights.ui;

import X.AnonymousClass0wJ;
import X.AnonymousClass2LX;
import X.C04220Ms;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

public final class InsightsHelpItemView extends LinearLayout {
    public IgTextView A00;
    public IgTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsHelpItemView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        setOrientation(1);
        A00(context, (AttributeSet) null);
    }

    public final void setPrimaryText(String str) {
        C04220Ms.A0B(str, 0);
        IgTextView igTextView = this.A00;
        if (igTextView == null) {
            C04220Ms.A0E("primaryText");
            throw null;
        } else {
            igTextView.setText(str);
        }
    }

    public final void setSecondaryText(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        IgTextView igTextView = this.A01;
        if (igTextView == null) {
            C04220Ms.A0E("secondaryText");
            throw null;
        } else {
            igTextView.setText(charSequence);
        }
    }

    public final IgTextView getSecondaryTextView() {
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            return igTextView;
        }
        C04220Ms.A0E("secondaryText");
        throw null;
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.insights_help_item_view, this);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.insightsHelpPrimaryText);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.insightsHelpSecondaryText);
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1Y);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    IgTextView igTextView = this.A00;
                    if (igTextView == null) {
                        C04220Ms.A0E("primaryText");
                        throw null;
                    }
                    igTextView.setText(AnonymousClass2LX.A00(context, obtainStyledAttributes, 0));
                }
                if (obtainStyledAttributes.hasValue(1)) {
                    IgTextView igTextView2 = this.A01;
                    if (igTextView2 == null) {
                        C04220Ms.A0E("secondaryText");
                        throw null;
                    }
                    igTextView2.setText(AnonymousClass2LX.A00(context, obtainStyledAttributes, 1));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                th = th;
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsHelpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0wJ.A1M(context, 1, attributeSet);
        setOrientation(1);
        A00(context, attributeSet);
    }
}
