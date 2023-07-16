package com.instagram.direct.ui.polls;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C11630kW;
import X.C121907Is;
import X.C18210wN;
import X.C18220wO;
import X.C86304xQ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PollMessageVotersView extends FrameLayout implements C11630kW {
    public int A00;
    public int A01;
    public final int A02;
    public final List A03;
    public final IgTextView A04;
    public final C86304xQ A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public String getModuleName() {
        return "PollMessageVotersView";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A02 = dimensionPixelSize;
        this.A01 = C121907Is.A00(context, R.attr.messageFromOthersGrayBackground);
        this.A00 = context.getColor(R.color.direct_widget_primary_background);
        context.getColor(R.color.igds_primary_text);
        FrameLayout.inflate(context, R.layout.direct_poll_message_voters, this);
        A0v.add(AnonymousClass0wJ.A0K(this, R.id.voter_avatar_1));
        A0v.add(AnonymousClass0wJ.A0K(this, R.id.voter_avatar_2));
        A0v.add(AnonymousClass0wJ.A0K(this, R.id.voter_avatar_3));
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(this, R.id.avatar_count);
        this.A04 = igTextView;
        C86304xQ r0 = new C86304xQ(dimensionPixelSize, this.A01, this.A00);
        this.A05 = r0;
        igTextView.setBackground(r0);
        int i2 = this.A01;
        for (CircularImageView circularImageView : this.A03) {
            circularImageView.A0F(this.A02, i2);
            circularImageView.A02 = true;
        }
    }

    public /* synthetic */ PollMessageVotersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
