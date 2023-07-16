package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5yT  reason: invalid class name */
public final class AnonymousClass5yT extends AnonymousClass436 {
    public final Context A00;
    public final AnonymousClass767 A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yT(Context context, AnonymousClass767 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = C14030oh.A03(1038010292);
        C109186jb r14 = (C109186jb) obj;
        TextView textView = (TextView) view;
        Integer num = r14.A00;
        String str = r14.A02;
        if (r14.A01.intValue() != 0) {
            i2 = R.plurals.anonymous_comments_message;
        } else {
            i2 = R.plurals.anonymous_likers_message;
        }
        AnonymousClass767 r2 = this.A01;
        Context context = textView.getContext();
        int intValue = num.intValue();
        Resources resources = context.getResources();
        SpannableString spannableString = new SpannableString(resources.getString(2131832079));
        spannableString.setSpan(new C87034zj(context, r2, str), 0, spannableString.length(), 18);
        String A0j = C18230wP.A0j(resources, num, i2, intValue);
        SpannableStringBuilder A0E = C18200wM.A0E(A0j);
        int indexOf = A0j.indexOf("{original_post}");
        A0E.replace(indexOf, indexOf + 15, spannableString);
        textView.setText(A0E);
        C14030oh.A0A(639240891, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(216419037);
        TextView textView = (TextView) AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.aggregated_engagement_view);
        C18180wK.A0z(textView);
        C14030oh.A0A(-653188946, A03);
        return textView;
    }
}
