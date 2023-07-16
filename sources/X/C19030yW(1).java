package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.0yW  reason: invalid class name and case insensitive filesystem */
public final class C19030yW extends LinearLayout {
    public View A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;

    public final void A01(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        A02(charSequence, false);
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
        C04220Ms.A0B(str, 0);
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            C04220Ms.A0E("actionText");
            throw null;
        }
        igTextView.setVisibility(0);
        igTextView.setText(str);
        igTextView.setOnClickListener(onClickListener);
    }

    public final void A00() {
        String str;
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "actionText";
        } else {
            C09860go.A0J(igTextView);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                C09860go.A0J(view);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void A02(CharSequence charSequence, boolean z) {
        String str;
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            igTextView.setText(charSequence);
            View view = this.A00;
            if (view == null) {
                str = "headerCellSeparator";
            } else {
                view.setVisibility(C18190wL.A00(z ? 1 : 0));
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public C19030yW(Context context) {
        super(context);
        String str;
        setOrientation(1);
        View inflate = LinearLayout.inflate(context, R.layout.igds_headercell_layout, this);
        this.A03 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_headercell_title);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.igds_headercell_action);
        this.A00 = AnonymousClass0wJ.A0K(inflate, R.id.igds_headercell_separator);
        this.A01 = (IgLinearLayout) AnonymousClass0wJ.A0J(inflate, R.id.igds_headercell_container);
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            str = "headerText";
        } else {
            AnonymousClass7JU.A01(igTextView);
            IgTextView igTextView2 = this.A02;
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
