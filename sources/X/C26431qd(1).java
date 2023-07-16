package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.1qd  reason: invalid class name and case insensitive filesystem */
public final class C26431qd extends AnonymousClass4DS {
    public int A00;
    public CharSequence A01;

    public C26431qd(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 1);
        this.A01 = charSequence;
    }

    public final /* bridge */ /* synthetic */ void AAp(AnonymousClass3TC r6, C558534v r7) {
        TextView textView;
        C26361qW r72 = (C26361qW) r7;
        boolean A1Y = AnonymousClass0wJ.A1Y(r72, r6);
        CharSequence charSequence = this.A01;
        if (charSequence == null || charSequence.length() == 0) {
            textView = r72.A00;
            textView.setText(this.A00);
        } else {
            textView = r72.A00;
            textView.setText(charSequence);
        }
        Context context = textView.getContext();
        textView.setTextSize(A1Y ? 1 : 0, context.getResources().getDimension(r6.A03));
        C18180wK.A0s(context, textView, r6.A02);
    }

    public C26431qd(int i) {
        this.A00 = i;
    }
}
