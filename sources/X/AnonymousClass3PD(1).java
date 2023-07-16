package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.3PD  reason: invalid class name */
public final class AnonymousClass3PD {
    public static void A01(AnonymousClass4MA r8, C57583Bq r9, AnonymousClass13K r10) {
        Drawable A00;
        Drawable A002;
        int i;
        View view = r10.itemView;
        View.OnClickListener onClickListener = r8.A03;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        View.OnLongClickListener onLongClickListener = r8.A04;
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        if (r8.A03 == null && r8.A04 == null) {
            view.setClickable(false);
        } else {
            C18210wN.A0y(view);
        }
        CharSequence charSequence = r8.A05;
        TextView textView = r10.A02;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(r8.A02);
        }
        AnonymousClass7Ko.A0C(AnonymousClass0wJ.A1T(textView.getPaddingLeft(), textView.getPaddingRight()));
        Context context = view.getContext();
        textView.setCompoundDrawablePadding(C18240wQ.A01(context, 8));
        boolean z = r8.A08;
        int i2 = r8.A01;
        if (z) {
            int i3 = r8.A09;
            A00 = C63403hQ.A01(context, i2, i3);
            A002 = C63403hQ.A01(context, r8.A00, i3);
        } else {
            A00 = C63403hQ.A00(context, i2);
            A002 = C63403hQ.A00(context, r8.A00);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A00, (Drawable) null, A002, (Drawable) null);
        view.setBackgroundResource(C50322so.A00(context, r9));
        r10.A00.setVisibility(8);
        if (r9.A03) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -1;
            textView.setLayoutParams(layoutParams);
        } else {
            textView.setGravity(19);
        }
        CheckBox checkBox = r10.A01;
        checkBox.setVisibility(8);
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        boolean z2 = r8.A07;
        textView.setTypeface((Typeface) null);
        if (!z2) {
            i = R.color.igds_secondary_text;
        } else {
            i = r8.A09;
        }
        C18180wK.A0s(context, textView, i);
        if (r8 instanceof C29301xj) {
            C29301xj r1 = (C29301xj) r8;
            AnonymousClass361 r0 = r1.A01;
            QPTooltipAnchor qPTooltipAnchor = r1.A00;
            C29201xU r02 = r0.A00.A05;
            AnonymousClass47H r12 = r02.A01;
            if (r12 != null) {
                r12.A00(textView, qPTooltipAnchor, r02.A00);
            }
        }
        r10.itemView.setEnabled(r8.A07);
    }

    public static M5O A00(Context context, ViewGroup viewGroup) {
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.row_menu_item);
        AnonymousClass13K r0 = new AnonymousClass13K(A0H);
        A0H.setTag(r0);
        return r0;
    }
}
