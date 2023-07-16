package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1qb  reason: invalid class name and case insensitive filesystem */
public final class C26411qb extends AnonymousClass4DS {
    public final Context A00;
    public final CharSequence A01;

    public final /* bridge */ /* synthetic */ void AAp(AnonymousClass3TC r6, C558534v r7) {
        C26361qW r72 = (C26361qW) r7;
        boolean A1Y = AnonymousClass0wJ.A1Y(r72, r6);
        TextView textView = r72.A00;
        int color = textView.getContext().getColor(r6.A02);
        textView.setText(this.A01);
        textView.setTextColor(color);
        Drawable drawable = this.A00.getDrawable(R.drawable.chevron_right);
        if (drawable != null) {
            drawable.setTint(color);
            textView.setCompoundDrawablesWithIntrinsicBounds(A1Y ? 1 : 0, A1Y, R.drawable.chevron_right, A1Y);
        }
    }

    public C26411qb(Context context, CharSequence charSequence) {
        this.A00 = context;
        this.A01 = charSequence;
    }
}
