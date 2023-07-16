package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

/* renamed from: X.1gN  reason: invalid class name */
public final class AnonymousClass1gN extends AnonymousClass436 {
    public Context A00;
    public CUH A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gN(Context context, CUH cuh) {
        this.A00 = context;
        this.A01 = cuh;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1108019498);
        String str = (String) obj;
        AnonymousClass0wJ.A17(view, 344, this.A01);
        AnonymousClass39F r5 = (AnonymousClass39F) view.getTag();
        Context context = view.getContext();
        if (!(r5 == null || context == null)) {
            String string = view.getResources().getString(2131827616);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(string);
            spannableStringBuilder.append(" ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan(C09250f7.A05.A00(context).A03(C09340fG.A0k)), length, spannableStringBuilder.length(), 33);
            TextView textView = r5.A01;
            textView.setText(spannableStringBuilder);
            textView.setContentDescription(AnonymousClass0wJ.A0l(context, spannableStringBuilder, 2131828273));
            C18210wN.A0y(r5.A00);
        }
        C14030oh.A0A(-2069395098, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-409124397);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.follow_list_sorting_entry_row);
        A0H.setTag(new AnonymousClass39F(A0H));
        C14030oh.A0A(1403025550, A03);
        return A0H;
    }
}
