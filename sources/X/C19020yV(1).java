package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.0yV  reason: invalid class name and case insensitive filesystem */
public final class C19020yV extends LinearLayout {
    public IgTextView A00;
    public IgTextView A01;

    public final void A01(String str, View.OnClickListener onClickListener) {
        IgTextView igTextView = this.A00;
        if (igTextView == null) {
            C04220Ms.A0E("actionText");
            throw null;
        }
        igTextView.setVisibility(0);
        igTextView.setText(str);
        igTextView.setOnClickListener(onClickListener);
    }

    public final void A00(CharSequence charSequence) {
        IgTextView igTextView = this.A01;
        if (igTextView == null) {
            C04220Ms.A0E("headerText");
            throw null;
        } else {
            igTextView.setText(charSequence);
        }
    }

    public C19020yV(Context context) {
        super(context);
        String str;
        setOrientation(1);
        View inflate = LinearLayout.inflate(context, R.layout.igds_group_header_layout, this);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_group_header_title);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_group_header_action);
        IgTextView igTextView = this.A01;
        if (igTextView == null) {
            str = "headerText";
        } else {
            AnonymousClass7JU.A01(igTextView);
            IgTextView igTextView2 = this.A00;
            if (igTextView2 == null) {
                str = "actionText";
            } else {
                C18210wN.A0y(igTextView2);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
