package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.1qa  reason: invalid class name and case insensitive filesystem */
public final class C26401qa extends AnonymousClass4DS {
    public CharSequence A00;
    public final Context A01;

    public C26401qa(Context context, CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 1);
        this.A00 = charSequence;
        this.A01 = context;
    }

    public final /* bridge */ /* synthetic */ void AAp(AnonymousClass3TC r6, C558534v r7) {
        C26361qW r72 = (C26361qW) r7;
        boolean A1Y = AnonymousClass0wJ.A1Y(r72, r6);
        CharSequence charSequence = this.A00;
        if (charSequence.length() != 0) {
            r72.A00.setText(charSequence);
        }
        TextView textView = r72.A00;
        Context context = textView.getContext();
        textView.setTextSize(A1Y ? 1 : 0, context.getResources().getDimension(r6.A03));
        C18180wK.A0s(context, textView, r6.A02);
        textView.setMaxWidth((int) (((float) C09860go.A08(this.A01)) * 0.6f));
    }
}
