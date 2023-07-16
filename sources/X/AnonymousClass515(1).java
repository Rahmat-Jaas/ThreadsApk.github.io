package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

/* renamed from: X.515  reason: invalid class name */
public final class AnonymousClass515 extends BaseAdapter implements Filterable {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;

    public AnonymousClass515(Context context, List list) {
        C04220Ms.A0B(context, 1);
        this.A01 = context;
        this.A00 = list == null ? AnonymousClass0ZV.A00 : list;
        LayoutInflater from = LayoutInflater.from(context);
        C04220Ms.A06(from);
        this.A02 = from;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
            r13 = this;
            r7 = r15
            r0 = 2
            r4 = r16
            X.C04220Ms.A0B(r4, r0)
            java.util.List r0 = r13.A00
            java.lang.Object r1 = r0.get(r14)
            X.6cX r1 = (X.C104886cX) r1
            android.content.Context r2 = r13.A01
            android.view.LayoutInflater r3 = r13.A02
            boolean r0 = r1 instanceof X.C92295hw
            if (r0 == 0) goto L_0x00ab
            X.5hw r1 = (X.C92295hw) r1
            boolean r5 = X.AnonymousClass0wJ.A1Y(r2, r3)
            r9 = 4
            if (r15 != 0) goto L_0x005b
            r0 = 2131493824(0x7f0c03c0, float:1.861114E38)
            android.view.View r7 = X.C18180wK.A0D(r3, r4, r0, r5)
            r8 = 0
            r10 = 11
            r11 = r10
            r12 = r9
            X.AnonymousClass7Fe.A03(r7, r8, r9, r10, r11, r12)
            r0 = 2131297128(0x7f090368, float:1.8212192E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131297127(0x7f090367, float:1.821219E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131297124(0x7f090364, float:1.8212184E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0K(r7, r0)
            X.69Q r0 = X.AnonymousClass69Q.A04
            X.AnonymousClass7Fd.A02(r6, r0)
            X.69Q r0 = X.AnonymousClass69Q.A05
            X.AnonymousClass7Fd.A02(r4, r0)
            X.AnonymousClass7Kz.A0G()
            r0 = 2131100111(0x7f0601cf, float:1.7812594E38)
            X.C86114wI.A0z(r2, r3, r0)
        L_0x005b:
            r0 = 24
            X.C86104wH.A1C(r7, r0, r1)
            r0 = 2131297128(0x7f090368, float:1.8212192E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131297127(0x7f090367, float:1.821219E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2131297124(0x7f090364, float:1.8212184E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0K(r7, r0)
            java.util.List r2 = r1.A04
            java.lang.String r0 = r1.A02
            if (r2 == 0) goto L_0x0083
            android.text.SpannableString r0 = X.C92295hw.A00(r0, r2)
        L_0x0083:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            java.lang.String r3 = r1.A01
            r2 = 0
            r0 = 8
            if (r3 == 0) goto L_0x00a7
            r6.setVisibility(r5)
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x009a
            android.text.SpannableString r3 = X.C92295hw.A00(r3, r0)
        L_0x009a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r6.setText(r3)
        L_0x009f:
            if (r14 > 0) goto L_0x00a3
            r2 = 8
        L_0x00a3:
            r4.setVisibility(r2)
            return r7
        L_0x00a7:
            r6.setVisibility(r0)
            goto L_0x009f
        L_0x00ab:
            boolean r0 = r1 instanceof X.C92285hv
            if (r0 == 0) goto L_0x0142
            X.5hv r1 = (X.C92285hv) r1
            boolean r6 = X.AnonymousClass0wJ.A1Y(r2, r3)
            if (r15 != 0) goto L_0x00dc
            r0 = 2131493826(0x7f0c03c2, float:1.8611143E38)
            android.view.View r7 = r3.inflate(r0, r4, r6)
            r0 = 2131297129(0x7f090369, float:1.8212194E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131297124(0x7f090364, float:1.8212184E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0K(r7, r0)
            X.69Q r0 = X.AnonymousClass69Q.A1B
            X.AnonymousClass7Fd.A02(r4, r0)
            X.AnonymousClass7Kz.A0G()
            r0 = 2131100111(0x7f0601cf, float:1.7812594E38)
            X.C86114wI.A0z(r2, r3, r0)
        L_0x00dc:
            r0 = 23
            X.C86104wH.A1C(r7, r0, r1)
            r0 = 2131297129(0x7f090369, float:1.8212194E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131826378(0x7f1116ca, float:1.9285639E38)
            X.C18200wM.A15(r2, r4, r0)
            r0 = 2131297126(0x7f090366, float:1.8212188E38)
            android.view.View r5 = X.AnonymousClass0wJ.A0J(r7, r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            X.3rw r0 = X.C64833rw.A00
            r5.setOnClickListener(r0)
            X.AnonymousClass7Kz.A0G()
            boolean r0 = X.C34822La.A00(r2)
            if (r0 == 0) goto L_0x013f
            java.lang.String r3 = r1.A01
        L_0x0109:
            if (r3 == 0) goto L_0x012e
            r5.setVisibility(r6)
            X.6oc r0 = X.AnonymousClass7Kz.A0L()
            java.lang.String r2 = "AttributionLabel"
            android.content.Context r1 = r0.A00
            X.5kC r0 = new X.5kC
            r0.<init>(r1, r3, r2)
            r0.A02(r5)
        L_0x011e:
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r2, r1, r0, r6)
            return r7
        L_0x012e:
            r0 = 8
            r5.setVisibility(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r6 = r1.getDimensionPixelOffset(r0)
            goto L_0x011e
        L_0x013f:
            java.lang.String r3 = r1.A02
            goto L_0x0109
        L_0x0142:
            boolean r1 = X.AnonymousClass0wJ.A1Y(r2, r3)
            if (r15 != 0) goto L_0x0168
            r0 = 2131493825(0x7f0c03c1, float:1.8611141E38)
            android.view.View r7 = r3.inflate(r0, r4, r1)
            r0 = 5
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r7, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.69Q r0 = X.AnonymousClass69Q.A05
            X.AnonymousClass7Fd.A02(r7, r0)
            r0 = 0
            r7.setClickable(r0)
            r7.setFocusable(r0)
            r7.setEnabled(r0)
        L_0x0168:
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131826382(0x7f1116ce, float:1.9285647E38)
            X.C18200wM.A15(r2, r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass515.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Filter getFilter() {
        return new AnonymousClass51A(this);
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public final int getItemViewType(int i) {
        Integer num;
        C104886cX r1 = (C104886cX) this.A00.get(i);
        if (r1 instanceof C92295hw) {
            num = ((C92295hw) r1).A00;
        } else if (r1 instanceof C92285hv) {
            num = ((C92285hv) r1).A00;
        } else {
            num = ((C92275hu) r1).A00;
        }
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    public final boolean isEnabled(int i) {
        C104886cX r1 = (C104886cX) this.A00.get(i);
        if ((r1 instanceof C92295hw) || (r1 instanceof C92285hv)) {
            return true;
        }
        return false;
    }

    public final int getViewTypeCount() {
        return C18240wQ.A1Z().length;
    }
}
