package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.IDxDCompatShape5S0000000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.1g9  reason: invalid class name */
public final class AnonymousClass1g9 extends AnonymousClass436 {
    public final Context A00;
    public final CategorySearchFragment A01;

    public final int getViewTypeCount() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        int i;
        if (obj instanceof AnonymousClass48S) {
            i = 0;
        } else if (obj instanceof String) {
            i = 1;
        } else if (obj instanceof C57403Ax) {
            i = 2;
        } else if (obj instanceof Integer) {
            i = 3;
            if (AnonymousClass0wJ.A04(obj) != 3) {
                return;
            }
        } else {
            return;
        }
        r3.A5K(i);
    }

    public AnonymousClass1g9(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A01 = categorySearchFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        int A03 = C14030oh.A03(365983717);
        if (i == 0) {
            AnonymousClass48S r7 = (AnonymousClass48S) obj;
            CategorySearchFragment categorySearchFragment = this.A01;
            textView = ((C554033b) C18210wN.A0X(view)).A00;
            textView.setText(r7.A02);
            AnonymousClass0wJ.A18(textView, 35, categorySearchFragment, r7);
            i2 = 4;
        } else if (i != 1) {
            if (i == 2) {
                C57403Ax r72 = (C57403Ax) obj;
                View view2 = ((M5O) C18210wN.A0X(view)).itemView;
                view2.setOnClickListener(r72.A01);
                CompoundButton compoundButton = (CompoundButton) view2;
                compoundButton.setText(r72.A02);
                compoundButton.setChecked(r72.A00);
            } else if (i != 3) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(I17.A00(43));
                C14030oh.A0A(927317546, A03);
                throw unsupportedOperationException;
            }
            C14030oh.A0A(-1492256036, A03);
        } else {
            textView = ((C553933a) C18210wN.A0X(view)).A00;
            textView.setText((String) obj);
            i2 = 3;
        }
        C006702y.A0C(textView, new IDxDCompatShape5S0000000_2_I2(i2));
        C14030oh.A0A(-1492256036, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0H;
        int i2;
        int A03 = C14030oh.A03(201135655);
        if (i == 0) {
            A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_category);
            A0H.setTag(new C554033b(A0H));
            i2 = -1951458875;
        } else if (i == 1) {
            A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.categories_header);
            A0H.setTag(new C553933a(A0H));
            i2 = -553750416;
        } else if (i == 2) {
            A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_selection_item);
            A0H.setTag(new AnonymousClass11t(A0H));
            i2 = 1061642694;
        } else if (i == 3) {
            A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.divider_layout);
            i2 = -848552359;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(I17.A00(43));
            C14030oh.A0A(-475478758, A03);
            throw unsupportedOperationException;
        }
        C14030oh.A0A(i2, A03);
        return A0H;
    }
}
