package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1g4  reason: invalid class name */
public final class AnonymousClass1g4 extends AnonymousClass436 {
    public final LayoutInflater A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g4(Context context) {
        this.A00 = LayoutInflater.from(context);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(428897324);
        TextView textView = ((C561936d) C18210wN.A0X(view)).A00;
        textView.setText((CharSequence) obj);
        C18180wK.A0z(textView);
        C14030oh.A0A(-1454279402, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-918611600);
        View A0E = C18240wQ.A0E(this.A00, R.layout.reporting_bottom_sheet_bullet_policy);
        A0E.setTag(new C561936d(A0E));
        C14030oh.A0A(-529468653, A03);
        return A0E;
    }
}
