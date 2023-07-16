package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1gz  reason: invalid class name and case insensitive filesystem */
public final class C24161gz extends AnonymousClass435 {
    public AnonymousClass3BV A00;
    public final Context A01;
    public final C558834y A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1899120828);
        this.A00 = (AnonymousClass3BV) obj;
        if (view == null) {
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A01), viewGroup, R.layout.location_page_info_page_stacked_title_row);
            view.setTag(new AnonymousClass38G(AnonymousClass0wJ.A0L(view, R.id.super_title), AnonymousClass0wJ.A0L(view, R.id.title)));
        }
        Context context = this.A01;
        AnonymousClass38G r7 = (AnonymousClass38G) view.getTag();
        AnonymousClass3BV r6 = this.A00;
        C558834y r5 = this.A02;
        TextView textView = r7.A01;
        CharSequence charSequence = r6.A00;
        int length = charSequence.length();
        StringBuilder A0r = C18200wM.A0r();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            A0r.append(charAt);
            if (charAt == 10) {
                while (i3 < length && Character.isWhitespace(charSequence.charAt(i3))) {
                    i3++;
                }
            }
            i2 = i3;
        }
        textView.setText(A0r);
        if (r6.A03) {
            C18180wK.A0s(context, textView, C121907Is.A02(context, R.attr.textColorRegularLink));
            AnonymousClass0wJ.A18(textView, 126, r5, r6);
        }
        r7.A00.setText(r6.A02);
        C14030oh.A0A(603244638, A03);
        return view;
    }

    public C24161gz(Context context, C558834y r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
