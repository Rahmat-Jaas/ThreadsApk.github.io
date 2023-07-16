package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.65T  reason: invalid class name */
public final class AnonymousClass65T extends C64493mQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EditText A01;
    public final /* synthetic */ AnonymousClass5x5 A02;
    public final /* synthetic */ IgLinearLayout A03;

    public AnonymousClass65T(EditText editText, AnonymousClass5x5 r2, IgLinearLayout igLinearLayout, int i) {
        this.A01 = editText;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = igLinearLayout;
    }

    public final void afterTextChanged(Editable editable) {
        AnonymousClass7IM r5 = AnonymousClass7IM.A00;
        EditText editText = this.A01;
        boolean z = !AnonymousClass7IM.A02(editText);
        if (!z) {
            AnonymousClass7IM.A00(this.A02.requireContext(), editText, this.A00, false);
        }
        IgLinearLayout igLinearLayout = this.A03;
        r5.A03(igLinearLayout, this.A00, z);
        AnonymousClass5x5 r7 = this.A02;
        Context requireContext = r7.requireContext();
        int i = R.drawable.comment_poll_option_row_hint_background;
        if (z) {
            i = R.drawable.comment_poll_option_row_background;
        }
        Drawable drawable = requireContext.getDrawable(i);
        if (drawable != null) {
            igLinearLayout.setBackground(drawable);
            ViewGroup viewGroup = r7.A01;
            if (viewGroup != null && viewGroup.getChildCount() >= 3) {
                boolean A022 = AnonymousClass7IM.A02((EditText) AnonymousClass0wJ.A0I(viewGroup.getChildAt(2), R.id.option_row_edit_text));
                if (viewGroup.getChildCount() < 4 && !A022) {
                    viewGroup.addView(AnonymousClass5x5.A00(r7, (String) null, viewGroup.getChildCount(), false));
                }
                if (viewGroup.getChildCount() == 4 && A022 && AnonymousClass7IM.A02((EditText) AnonymousClass0wJ.A0I(viewGroup.getChildAt(viewGroup.getChildCount() - 1), R.id.option_row_edit_text))) {
                    viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
                    viewGroup.getChildAt(viewGroup.getChildCount() - 1).requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
