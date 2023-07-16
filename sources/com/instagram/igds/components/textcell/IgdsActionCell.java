package com.instagram.igds.components.textcell;

import X.AnonymousClass0wJ;
import X.AnonymousClass223;
import X.C04220Ms;
import X.C09860go;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsActionCell extends FrameLayout {
    public final IgTextView A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setActionText(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    public final void A00(View.OnClickListener onClickListener, AnonymousClass223 r7, CharSequence charSequence) {
        int i;
        boolean A1Z = AnonymousClass0wJ.A1Z(charSequence, r7);
        IgTextView igTextView = this.A00;
        igTextView.setText(charSequence);
        setOnClickListener(onClickListener);
        int ordinal = r7.ordinal();
        Context context = getContext();
        if (ordinal == A1Z) {
            i = R.color.igds_primary_button;
        } else if (ordinal != 2) {
            i = R.color.igds_primary_text;
        } else {
            i = R.color.igds_error_or_destructive;
        }
        C18180wK.A0s(context, igTextView, i);
        setContentDescription(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        View inflate = FrameLayout.inflate(context, R.layout.igds_actioncell_layout, this);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_actioncell_label);
        C09860go.A0d(inflate, R.dimen.abc_floating_window_z, R.dimen.abc_floating_window_z, R.dimen.abc_floating_window_z, R.dimen.abc_floating_window_z);
        C18210wN.A0y(this);
    }

    public /* synthetic */ IgdsActionCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
