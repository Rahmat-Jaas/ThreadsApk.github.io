package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.0zB  reason: invalid class name and case insensitive filesystem */
public final class C19100zB extends ConstraintLayout {
    public final IgTextView A00 = ((IgTextView) AnonymousClass0wJ.A0J(this, R.id.description_text_view));
    public final IgTextView A01 = ((IgTextView) AnonymousClass0wJ.A0J(this, R.id.header_text_view));

    public /* synthetic */ C19100zB(Context context) {
        super(context, (AttributeSet) null, 0);
        ConstraintLayout.inflate(context, R.layout.lead_gen_view_creatives_bullet_point, this);
    }

    public final void A04(String str, String str2) {
        C04220Ms.A0B(str2, 1);
        IgTextView igTextView = this.A01;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        igTextView.setVisibility(i);
        igTextView.setText(str);
        this.A00.setText(str2);
    }
}
