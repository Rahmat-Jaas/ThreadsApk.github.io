package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1gQ  reason: invalid class name */
public final class AnonymousClass1gQ extends AnonymousClass436 {
    public final Context A00;
    public final C23351dd A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gQ(Context context, C23351dd r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1741072502);
        view.getTag().getClass();
        Context context = this.A00;
        AnonymousClass3B3 r5 = (AnonymousClass3B3) view.getTag();
        AnonymousClass3DN r10 = (AnonymousClass3DN) obj;
        C23351dd r3 = this.A01;
        TextView textView = r5.A02;
        String str = r10.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = r5.A01;
        SpannableStringBuilder append = C18200wM.A0E(C54422zQ.A00(context, r10)).append(" • ");
        String str2 = r10.A05;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(append.append(str2));
        AnonymousClass0wJ.A18(r5.A00, 232, r10, r3);
        C14030oh.A0A(-1350003676, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(210649063);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_row_item);
        A0H.setTag(new AnonymousClass3B3(A0H));
        C14030oh.A0A(507243911, A03);
        return A0H;
    }
}
