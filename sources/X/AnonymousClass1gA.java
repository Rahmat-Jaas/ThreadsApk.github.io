package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1gA  reason: invalid class name */
public final class AnonymousClass1gA extends AnonymousClass436 {
    public final Context A00;
    public final C23371df A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gA(Context context, C23371df r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1681916901);
        C554133c r0 = (C554133c) view.getTag();
        AnonymousClass386 r7 = (AnonymousClass386) obj;
        C23371df r2 = this.A01;
        AnonymousClass0wJ.A1N(r0, r7);
        TextView textView = r0.A00;
        textView.setText(r7.A01);
        AnonymousClass0wJ.A18(textView, 36, r2, r7);
        C14030oh.A0A(-622014360, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1365289419);
        Context context = this.A00;
        C04220Ms.A0B(context, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_city, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        inflate.setTag(new C554133c(inflate));
        C14030oh.A0A(977374153, A03);
        return inflate;
    }
}
