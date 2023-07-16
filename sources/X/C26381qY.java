package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.1qY  reason: invalid class name and case insensitive filesystem */
public final class C26381qY extends AnonymousClass4DS {
    public final /* bridge */ /* synthetic */ void AAp(AnonymousClass3TC r7, C558534v r8) {
        TextView textView = ((C26361qW) r8).A00;
        Context context = textView.getContext();
        String string = context.getString(2131832573);
        String A0l = AnonymousClass0wJ.A0l(context, string, 2131832572);
        Uri A01 = C15430rJ.A01("https://help.instagram.com/2937306082959298?helpref=uf_permalink");
        int color = context.getColor(r7.A02);
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A01(A0E, new C18680xd(A01, color), string);
        textView.setText(A0E);
        textView.setTextColor(color);
        C18180wK.A0z(textView);
    }
}
