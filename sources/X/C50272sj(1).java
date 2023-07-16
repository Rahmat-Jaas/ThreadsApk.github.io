package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.2sj  reason: invalid class name and case insensitive filesystem */
public final class C50272sj {
    public static void A00(C62593aM r7, C200713a r8) {
        TextView textView;
        View view = r8.itemView;
        int i = r7.A04;
        if (i != 0) {
            r8.A04.setText(i);
        }
        CharSequence charSequence = r7.A08;
        if (charSequence != null) {
            r8.A04.setText(charSequence);
        }
        int i2 = r7.A03;
        if (i2 != 0) {
            textView = r8.A02;
            textView.setText(i2);
        } else {
            CharSequence charSequence2 = r7.A07;
            textView = r8.A02;
            if (charSequence2 != null) {
                textView.setText(charSequence2);
            } else {
                textView.setVisibility(8);
            }
        }
        r8.A01.setVisibility(C18190wL.A00(r7.A09 ? 1 : 0));
        String str = r7.A0B;
        TextView textView2 = r8.A03;
        if (str != null) {
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView2.setVisibility(8);
        }
        view.setOnClickListener(r7.A06);
        r8.A00.setAlpha(1.0f);
        C18210wN.A0y(view);
        TextView textView3 = r8.A04;
        textView3.setEnabled(true);
        textView2.setEnabled(true);
        int i3 = r7.A00;
        if (i3 != 0) {
            view.setBackgroundColor(i3);
        }
        if (!(r7.A05 == 0 && r7.A01 == 0)) {
            view.setPadding(view.getPaddingLeft(), r7.A05, view.getPaddingRight(), r7.A01);
        }
        int i4 = r7.A02;
        if (i4 > 0) {
            textView.setMaxLines(i4);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (r7 instanceof AnonymousClass1w7) {
            AnonymousClass1w7 r1 = (AnonymousClass1w7) r7;
            r1.A00.A01(textView3);
            textView3.postDelayed(new AnonymousClass4QH(r1), (long) 1000);
        }
        if (r7.A0A) {
            C18200wM.A0J(view, R.id.row_menu_item_arrow).setImageResource(R.drawable.instagram_more_vertical_pano_outline_24);
        }
    }
}
