package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.instagram.barcelona.R;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0xt  reason: invalid class name and case insensitive filesystem */
public final class C18780xt extends ArrayAdapter {
    public final ArrayList A00;
    public final List A01;
    public final Context A02;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            Context context = this.A02;
            view = C18240wQ.A0E(LayoutInflater.from(context), R.layout.row_menu_item);
            view.setBackgroundResource(C121907Is.A02(context, R.attr.elevatedBackgroundDrawable));
            view.setPadding(0, 0, 0, 0);
        }
        AnonymousClass0wJ.A0L(view, R.id.row_simple_text_textview).setText(((CountryCodeData) getItem(i)).A01());
        return view;
    }

    public C18780xt(Context context, List list) {
        super(context, R.layout.row_menu_item, list);
        this.A02 = context;
        this.A01 = list;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A00 = A0v;
        A0v.addAll(list);
    }
}
