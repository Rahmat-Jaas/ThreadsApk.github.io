package X;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;

/* renamed from: X.0y0  reason: invalid class name and case insensitive filesystem */
public final class C18850y0 extends BaseAdapter {
    public Context A00;
    public List A01;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        if (i != 0) {
            return i != 3 ? 1 : 2;
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public final int getCount() {
        return this.A01.size();
    }

    public final Object getItem(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r6 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            android.content.Context r0 = r9.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r6 = r9.getItemViewType(r10)
            r5 = 2
            if (r6 == 0) goto L_0x0068
            r0 = 1
            if (r6 == r0) goto L_0x0015
            r0 = 2131497169(0x7f0c10d1, float:1.8617924E38)
            if (r6 == r5) goto L_0x0018
        L_0x0015:
            r0 = 2131497170(0x7f0c10d2, float:1.8617926E38)
        L_0x0018:
            if (r11 != 0) goto L_0x001e
            android.view.View r11 = X.AnonymousClass0wJ.A0H(r1, r12, r0)
        L_0x001e:
            r0 = 2131300044(0x7f090ecc, float:1.8218107E38)
            android.widget.TextView r8 = X.C18180wK.A0G(r11, r0)
            r0 = 2131300040(0x7f090ec8, float:1.8218098E38)
            android.widget.TextView r7 = X.C18180wK.A0G(r11, r0)
            r0 = 2131300042(0x7f090eca, float:1.8218102E38)
            android.widget.TextView r4 = X.C18180wK.A0G(r11, r0)
            r0 = 2131300043(0x7f090ecb, float:1.8218104E38)
            android.widget.ImageView r3 = X.C18220wO.A0K(r11, r0)
            java.util.List r0 = r9.A01
            java.lang.Object r2 = r0.get(r10)
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel r2 = (com.instagram.ui.slidecardpageadapter.SlideCardViewModel) r2
            java.lang.String r1 = r2.A0C
            r8.setText(r1)
            java.lang.String r0 = r2.A0B
            r7.setText(r0)
            java.lang.CharSequence r0 = r2.A08
            r4.setText(r0)
            int r0 = r2.A01
            r3.setImageResource(r0)
            int r0 = r2.A00
            r11.setBackgroundResource(r0)
            if (r6 != r5) goto L_0x0067
            r0 = 2131301165(0x7f09132d, float:1.822038E38)
            android.widget.TextView r0 = X.C18180wK.A0G(r11, r0)
            r0.setText(r1)
        L_0x0067:
            return r11
        L_0x0068:
            r0 = 2131497167(0x7f0c10cf, float:1.861792E38)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18850y0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C18850y0(Context context, List list) {
        this.A00 = context;
        this.A01 = list;
    }
}
