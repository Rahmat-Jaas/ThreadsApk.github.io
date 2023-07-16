package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1fo  reason: invalid class name and case insensitive filesystem */
public final class C23811fo extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        if (r3 != null && obj2 != null) {
            r3.A5L(C18180wK.A1Z(obj2, C302820k.A02) ? 1 : 0, (Object) null, obj2);
        }
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public C23811fo(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        C555633s r1;
        IgTextView igTextView;
        Context context;
        int i3;
        int A03 = C14030oh.A03(-614487088);
        Object obj3 = null;
        if (view != null) {
            obj3 = view.getTag();
        }
        if (!(obj3 instanceof C555633s) || (r1 = (C555633s) obj3) == null) {
            i2 = -1390326019;
        } else {
            if (i != 0) {
                if (i == 1) {
                    igTextView = r1.A00;
                    context = this.A00;
                    i3 = 2131824157;
                }
                i2 = 410365439;
            } else {
                igTextView = r1.A00;
                context = this.A00;
                i3 = 2131824156;
            }
            C18200wM.A15(context, igTextView, i3);
            i2 = 410365439;
        }
        C14030oh.A0A(i2, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(1265926449, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_comment_group_title);
        C04220Ms.A06(A0H);
        A0H.setTag(new C555633s(A0H));
        C14030oh.A0A(1303700871, A002);
        return A0H;
    }
}
