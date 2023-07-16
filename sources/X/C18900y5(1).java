package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0y5  reason: invalid class name and case insensitive filesystem */
public final class C18900y5 extends BaseAdapter implements Filterable {
    public CharSequence A00 = "";
    public List A01 = AnonymousClass0wJ.A0v();
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final C11630kW A05;
    public final C18920yA A06;
    public final AnonymousClass0BO A07;
    public final Comparator A08 = Comparator.comparing(AnonymousClass4U6.A00);
    public final List A09 = AnonymousClass0wJ.A0v();
    public final boolean A0A;

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean areAllItemsEnabled() {
        return !this.A0A;
    }

    public final int getCount() {
        int size = this.A01.size();
        if (this.A0A) {
            return size + 1;
        }
        return size;
    }

    public final Filter getFilter() {
        return this.A06;
    }

    public final Object getItem(int i) {
        List list;
        if (!this.A0A) {
            list = this.A01;
        } else if (i == 0) {
            return null;
        } else {
            list = this.A01;
            i--;
        }
        return list.get(i);
    }

    public final int getItemViewType(int i) {
        if (i != 0 || !this.A0A) {
            return 0;
        }
        return 1;
    }

    public final int getViewTypeCount() {
        if (this.A0A) {
            return 2;
        }
        return 1;
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final boolean isEnabled(int i) {
        if (!this.A0A || i > 0) {
            return true;
        }
        return false;
    }

    public C18900y5(Context context, C11630kW r3, C10300i6 r4, AnonymousClass35S r5, int i, boolean z) {
        this.A04 = context;
        this.A05 = r3;
        this.A07 = C05030Qo.A01(r4);
        this.A0A = z;
        this.A03 = i;
        this.A06 = new C18920yA(r5, this);
    }

    public final long getItemId(int i) {
        Object item = getItem(i);
        if (item == null) {
            return Long.MIN_VALUE;
        }
        return (long) ((C84604tW) item).BK7().hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (getItemViewType(i) != 1) {
            if (view == null) {
                view = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.autocomplete_user_row);
                C09860go.A0R(view, this.A03);
                view.setTag(new AnonymousClass3AP(view));
            }
            Object item = getItem(i);
            item.getClass();
            C84604tW r2 = (C84604tW) item;
            AnonymousClass3AP r4 = (AnonymousClass3AP) C18210wN.A0X(view);
            r4.A02.setUrl(r2.AoT(), this.A05);
            r4.A01.setText(r2.BK7());
            String A002 = C18920yA.A00(r2, this.A06, C18920yA.A01(this.A00));
            if (A002 == null || A002.equals(r2.BK7())) {
                r4.A00.setVisibility(8);
                return view;
            }
            TextView textView = r4.A00;
            textView.setVisibility(0);
            textView.setText(AnonymousClass00U.A0L(A002, " "));
            int ARi = r2.ARi();
            if (ARi != 0) {
                drawable = this.A04.getDrawable(ARi);
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            C63403hQ.A04(textView);
            return view;
        } else if (view != null) {
            return view;
        } else {
            View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.autocomplete_user_dropdown_header);
            C09860go.A0R(A0H.requireViewById(R.id.dropdown_header), this.A03);
            return A0H;
        }
    }
}
