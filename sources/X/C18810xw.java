package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0xw  reason: invalid class name and case insensitive filesystem */
public final class C18810xw extends ArrayAdapter implements SpinnerAdapter {
    public final List A00;

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 2);
        if (view == null) {
            view = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.lead_ads_select_question_row);
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(C18190wL.A0p(this.A00, i));
        }
        C04220Ms.A09(view);
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 2);
        if (view == null) {
            view = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.lead_ads_select_question_item);
        }
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.item_text);
        if (i == getCount()) {
            textView.setHint(C18190wL.A0p(this.A00, i));
            textView.setText("");
            return view;
        }
        textView.setHint("");
        textView.setText(C18190wL.A0p(this.A00, i));
        return view;
    }

    public final int getCount() {
        return this.A00.size() - 1;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public C18810xw(Context context, ImmutableList immutableList, String str) {
        super(context, R.layout.lead_ads_select_question_item);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A00 = A0v;
        A0v.addAll(immutableList);
        A0v.add(str);
    }
}
