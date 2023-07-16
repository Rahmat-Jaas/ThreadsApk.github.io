package com.instagram.igds.components.textcell;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.accessibility.AccessibleTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsFooterCell extends LinearLayout {
    public View A00;
    public View A01;
    public final AccessibleTextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    public final void A00(CharSequence charSequence) {
        int i = 0;
        C04220Ms.A0B(charSequence, 0);
        AccessibleTextView accessibleTextView = this.A02;
        accessibleTextView.setText(charSequence);
        if (charSequence.length() <= 0) {
            i = 8;
        }
        accessibleTextView.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        setOrientation(1);
        View inflate = LinearLayout.inflate(context, R.layout.igds_footercell_layout, this);
        this.A02 = (AccessibleTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_footer_text);
        this.A00 = AnonymousClass0wJ.A0K(inflate, R.id.igds_footercell_separator);
        this.A01 = AnonymousClass0wJ.A0K(inflate, R.id.igds_footercell_spacer);
    }

    public /* synthetic */ IgdsFooterCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
