package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1gP  reason: invalid class name */
public final class AnonymousClass1gP extends AnonymousClass436 {
    public final Context A00;
    public final View.OnClickListener A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gP(Context context, View.OnClickListener onClickListener) {
        this.A00 = context;
        this.A01 = onClickListener;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        String string;
        String A0l;
        int i3;
        Object[] objArr;
        int A03 = C14030oh.A03(2085460829);
        C57603Bs r10 = (C57603Bs) obj;
        int intValue = r10.A02.intValue();
        if (intValue == 0) {
            i2 = 2131835627;
            Context context = this.A00;
            string = context.getString(2131835628);
            A0l = AnonymousClass0wJ.A0l(context, string, i2);
        } else if (intValue == 2) {
            i2 = 2131835634;
            Context context2 = this.A00;
            string = context2.getString(2131835628);
            A0l = AnonymousClass0wJ.A0l(context2, string, i2);
        } else if (intValue == 1) {
            Context context3 = this.A00;
            string = context3.getString(2131835628);
            String A012 = C120737Cg.A01(context3.getResources(), Integer.valueOf(r10.A00), false);
            String A013 = C120737Cg.A01(context3.getResources(), Integer.valueOf(r10.A01), false);
            if (r10.A00 == 0) {
                i3 = 2131835631;
                objArr = new Object[]{A013, string};
            } else {
                i3 = 2131835630;
                if (r10.A03) {
                    i3 = 2131835632;
                }
                objArr = new Object[]{A012, A013, string};
            }
            A0l = context3.getString(i3, objArr);
        } else {
            throw C18190wL.A0a("unknown SharedOnFaceBookHeaderType");
        }
        C18670xb r0 = new C18670xb(C15430rJ.A01("https://help.instagram.com/1549313575265878"));
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A01(A0E, r0, string);
        AnonymousClass39G r1 = (AnonymousClass39G) view.getTag();
        r1.A01.setText(A0E);
        r1.A00.setOnClickListener(this.A01);
        C14030oh.A0A(777050227, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-619855284);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.shared_on_facebook_row);
        A0H.setTag(new AnonymousClass39G(A0H));
        C14030oh.A0A(-867758856, A03);
        return A0H;
    }
}
