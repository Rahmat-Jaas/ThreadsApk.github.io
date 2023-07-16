package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5A9  reason: invalid class name */
public final class AnonymousClass5A9 extends C41030Luu {
    public ImmutableList A00;
    public final SparseArray A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.5Ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.5Bt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.5Ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.5Ae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.M5O r13, int r14) {
        /*
            r12 = this;
            com.google.common.collect.ImmutableList r0 = r12.A00
            java.lang.Object r5 = r0.get(r14)
            X.6j9 r5 = (X.C108906j9) r5
            X.6gZ r3 = r5.A02
            if (r3 == 0) goto L_0x001e
            android.view.View r2 = r13.itemView
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 == r0) goto L_0x0017
            X.AnonymousClass7FY.A02(r2, r1)
        L_0x0017:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x001e
            r2.setContentDescription(r0)
        L_0x001e:
            android.view.View r1 = r13.itemView
            int r0 = r5.A01
            r1.setId(r0)
            boolean r0 = r5 instanceof X.C92675jd
            if (r0 == 0) goto L_0x0097
            X.5jd r5 = (X.C92675jd) r5
            boolean r0 = r13 instanceof X.C88985Bl
            if (r0 == 0) goto L_0x04a6
            r4 = r13
            X.5Bl r4 = (X.C88985Bl) r4
            int r2 = r5.A01
            if (r2 == 0) goto L_0x0045
            android.widget.TextView r1 = r4.A03
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            android.util.TypedValue r0 = X.C86104wH.A0G(r0, r2)
            int r0 = r0.data
            r1.setTextColor(r0)
        L_0x0045:
            android.widget.TextView r6 = r4.A03
            java.lang.String r3 = r5.A05
            int r2 = r5.A02
            r1 = 0
            r6.setVisibility(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0093
            if (r2 == 0) goto L_0x0091
            r6.setText(r2)
        L_0x005a:
            android.widget.TextView r3 = r4.A02
            java.lang.String r0 = r5.A04
            X.AnonymousClass3JL.A01(r3, r0, r1)
            android.widget.TextView r2 = r4.A01
            r1 = 0
            int r0 = r5.A00
            X.AnonymousClass3JL.A01(r2, r1, r0)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0071
            r0 = 4
            r2.setVisibility(r0)
        L_0x0071:
            boolean r1 = r5.A08
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x0079
            r0 = 1
        L_0x0079:
            r3.setMaxLines(r0)
            android.view.View$OnClickListener r1 = r5.A03
            if (r1 == 0) goto L_0x0085
            android.view.View r0 = r4.itemView
            r0.setOnClickListener(r1)
        L_0x0085:
            android.widget.ImageView r1 = r4.A00
            boolean r0 = r5.A07
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
        L_0x0090:
            return
        L_0x0091:
            java.lang.String r3 = ""
        L_0x0093:
            r6.setText(r3)
            goto L_0x005a
        L_0x0097:
            boolean r0 = r5 instanceof X.AnonymousClass5jZ
            if (r0 == 0) goto L_0x00e2
            X.5jZ r5 = (X.AnonymousClass5jZ) r5
            boolean r0 = r13 instanceof X.AnonymousClass5BU
            if (r0 == 0) goto L_0x04ab
            r1 = r13
            X.5BU r1 = (X.AnonymousClass5BU) r1
            android.widget.TextView r8 = r1.A02
            java.lang.String r7 = r5.A02
            r6 = 8
            r0 = 0
            if (r7 != 0) goto L_0x00af
            r0 = 8
        L_0x00af:
            r8.setVisibility(r0)
            android.widget.TextView r4 = r1.A01
            java.lang.String r3 = r5.A01
            r0 = 0
            if (r3 != 0) goto L_0x00bb
            r0 = 8
        L_0x00bb:
            r4.setVisibility(r0)
            android.widget.ImageView r2 = r1.A00
            int r1 = r5.A00
            if (r1 == 0) goto L_0x00c5
            r6 = 0
        L_0x00c5:
            r2.setVisibility(r6)
            if (r7 == 0) goto L_0x00cd
            r8.setText(r7)
        L_0x00cd:
            if (r3 == 0) goto L_0x00d2
            r4.setText(r3)
        L_0x00d2:
            if (r1 == 0) goto L_0x0090
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            android.util.TypedValue r0 = X.C86104wH.A0G(r0, r1)
            int r0 = r0.resourceId
            r2.setImageResource(r0)
            return
        L_0x00e2:
            boolean r0 = r5 instanceof X.AnonymousClass5je
            if (r0 == 0) goto L_0x03ef
            X.5je r5 = (X.AnonymousClass5je) r5
            boolean r0 = r13 instanceof X.C89065Bt
            if (r0 == 0) goto L_0x04ba
            r2 = r13
            X.5Bt r2 = (X.C89065Bt) r2
            java.lang.String r6 = r5.A0E
            r3 = 0
            if (r6 == 0) goto L_0x03ce
            X.6oc r0 = X.AnonymousClass7Kz.A0L()
            java.lang.String r1 = "HubMediaItemViewController"
            android.content.Context r0 = r0.A00
            X.5kC r4 = new X.5kC
            r4.<init>(r0, r6, r1)
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x03bf
            r0 = 1
            r4.A07 = r0
        L_0x0108:
            android.widget.ImageView r6 = r2.A01
            r4.A02(r6)
        L_0x010d:
            android.widget.TextView r7 = r2.A04
            int r0 = r5.A04
            r7.setMaxLines(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x03bb
            r0 = 0
        L_0x011a:
            r7.setEllipsize(r0)
            android.widget.TextView r4 = r2.A03
            int r0 = r5.A03
            r4.setMaxLines(r0)
            if (r0 != r1) goto L_0x03b7
            r0 = 0
        L_0x0127:
            r4.setEllipsize(r0)
            int r0 = r5.A01
            if (r0 == 0) goto L_0x03b2
            r6.setBackgroundResource(r0)
        L_0x0131:
            java.lang.String r1 = r5.A0G
            int r0 = r5.A07
            X.AnonymousClass3JL.A01(r7, r1, r0)
            java.lang.String r3 = r5.A0F
            int r1 = r5.A06
            com.facebook.graphql.impls.PAYTextWithEntitiesFragmentImpl r0 = r5.A0A
            X.AnonymousClass3JL.A00(r4, r0, r3, r1)
            android.widget.TextView r3 = r2.A02
            java.lang.String r1 = r5.A0D
            r6 = 0
            com.facebook.graphql.impls.PAYTextWithEntitiesFragmentImpl r0 = r5.A09
            X.AnonymousClass3JL.A00(r3, r0, r1, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x015c
            java.lang.Integer r0 = r5.A0C
            if (r0 == 0) goto L_0x015c
            int r0 = r0.intValue()
            r3.setTextColor(r0)
        L_0x015c:
            int r1 = r5.A05
            if (r1 == 0) goto L_0x016d
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            android.util.TypedValue r0 = X.C86104wH.A0G(r0, r1)
            int r0 = r0.data
            r4.setTextColor(r0)
        L_0x016d:
            X.6Ik r7 = r5.A0B
            if (r7 == 0) goto L_0x01d2
            X.6gX r4 = r2.A05
            if (r4 == 0) goto L_0x01d2
            android.view.ViewStub r1 = r4.A01
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01a0
            android.view.View r0 = r1.inflate()
            r4.A00 = r0
            boolean r0 = r4 instanceof X.AnonymousClass5jj
            if (r0 == 0) goto L_0x0357
            r3 = r4
            X.5jj r3 = (X.AnonymousClass5jj) r3
            android.view.View r1 = r3.A00
            r0 = 2131305939(0x7f0925d3, float:1.8230063E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r1, r0)
            r3.A01 = r0
            android.view.View r1 = r3.A00
            r0 = 2131305938(0x7f0925d2, float:1.823006E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r1, r0)
            r3.A00 = r0
        L_0x01a0:
            boolean r0 = r7 instanceof X.C92695jg
            if (r0 == 0) goto L_0x01e4
            X.5jg r7 = (X.C92695jg) r7
            boolean r0 = r4 instanceof X.AnonymousClass5jj
            if (r0 == 0) goto L_0x04b0
            X.5jj r4 = (X.AnonymousClass5jj) r4
            java.lang.String r8 = r7.A01
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            r1 = 8
            android.widget.TextView r0 = r4.A01
            if (r3 != 0) goto L_0x01e0
            r0.setText(r8)
            android.widget.TextView r0 = r4.A01
            r0.setVisibility(r6)
        L_0x01c0:
            java.lang.String r3 = r7.A00
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01dc
            android.widget.TextView r0 = r4.A00
            r0.setText(r3)
            android.widget.TextView r0 = r4.A00
            r0.setVisibility(r6)
        L_0x01d2:
            android.view.View$OnClickListener r1 = r5.A08
        L_0x01d4:
            if (r1 == 0) goto L_0x0090
            android.view.View r0 = r2.itemView
            r0.setOnClickListener(r1)
            return
        L_0x01dc:
            android.widget.TextView r0 = r4.A00
            goto L_0x0352
        L_0x01e0:
            r0.setVisibility(r1)
            goto L_0x01c0
        L_0x01e4:
            boolean r0 = r7 instanceof X.C92705jh
            if (r0 == 0) goto L_0x01d2
            X.5jh r7 = (X.C92705jh) r7
            boolean r0 = r4 instanceof X.AnonymousClass5jk
            if (r0 == 0) goto L_0x04b5
            X.5jk r4 = (X.AnonymousClass5jk) r4
            com.google.common.collect.ImmutableList r3 = r7.A00
            int r11 = r3.size()
            r1 = 8
            if (r11 == 0) goto L_0x0350
            r7 = 1
            if (r11 == r7) goto L_0x031f
            r8 = 2
            if (r11 == r8) goto L_0x02e8
            r9 = 3
            if (r11 == r9) goto L_0x02ab
            r10 = 4
            android.view.View r0 = r4.A00
            if (r11 == r10) goto L_0x0276
            r0.setVisibility(r6)
            android.widget.ImageView r1 = r4.A03
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A04
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A01
            java.lang.Object r0 = r3.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A02
            java.lang.Object r0 = r3.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.view.View r0 = r4.A00
            android.content.res.Resources r8 = r0.getResources()
            android.widget.TextView r7 = r4.A05
            int r3 = r3.size()
            int r3 = r3 - r9
            r7.setVisibility(r6)
            r0 = 10
            if (r3 < r0) goto L_0x0267
            r0 = 2131836902(0x7f113fe6, float:1.9306984E38)
            r7.setText(r0)
        L_0x0251:
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969397(0x7f040335, float:1.7547475E38)
        L_0x025c:
            android.util.TypedValue r0 = X.C86104wH.A0G(r1, r0)
            int r0 = r0.resourceId
            r3.setBackgroundResource(r0)
            goto L_0x01d2
        L_0x0267:
            r1 = 2131836901(0x7f113fe5, float:1.9306982E38)
            java.lang.Object[] r0 = X.C18210wN.A1X(r3)
            java.lang.String r0 = r8.getString(r1, r0)
            r7.setText(r0)
            goto L_0x0251
        L_0x0276:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r4.A03
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A04
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A01
            java.lang.Object r0 = r3.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A02
            java.lang.Object r0 = r3.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            goto L_0x0251
        L_0x02ab:
            android.view.View r0 = r4.A00
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r4.A03
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A01
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A02
            java.lang.Object r0 = r3.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969399(0x7f040337, float:1.7547479E38)
            goto L_0x025c
        L_0x02e8:
            android.view.View r0 = r4.A00
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r4.A03
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.widget.ImageView r1 = r4.A01
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969400(0x7f040338, float:1.754748E38)
            goto L_0x025c
        L_0x031f:
            android.view.View r0 = r4.A00
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.A01
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r4.A03
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            X.C92705jh.A00(r1, r0)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969398(0x7f040336, float:1.7547477E38)
            goto L_0x025c
        L_0x0350:
            android.view.View r0 = r4.A00
        L_0x0352:
            r0.setVisibility(r1)
            goto L_0x01d2
        L_0x0357:
            boolean r0 = r4 instanceof X.AnonymousClass5jk
            if (r0 == 0) goto L_0x03a2
            r3 = r4
            X.5jk r3 = (X.AnonymousClass5jk) r3
            android.view.View r1 = r3.A00
            r0 = 2131308348(0x7f092f3c, float:1.823495E38)
            android.widget.ImageView r0 = X.C18200wM.A0J(r1, r0)
            r3.A03 = r0
            android.view.View r1 = r3.A00
            r0 = 2131308356(0x7f092f44, float:1.8234965E38)
            android.widget.ImageView r0 = X.C18200wM.A0J(r1, r0)
            r3.A04 = r0
            android.view.View r1 = r3.A00
            r0 = 2131297608(0x7f090548, float:1.8213166E38)
            android.widget.ImageView r0 = X.C18200wM.A0J(r1, r0)
            r3.A01 = r0
            android.view.View r1 = r3.A00
            r0 = 2131297621(0x7f090555, float:1.8213192E38)
            android.widget.ImageView r0 = X.C18200wM.A0J(r1, r0)
            r3.A02 = r0
            android.view.View r1 = r3.A00
            r0 = 2131299923(0x7f090e53, float:1.8217861E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A00 = r0
            android.view.View r1 = r3.A00
            r0 = 2131300341(0x7f090ff5, float:1.8218709E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r1, r0)
            r3.A05 = r0
            goto L_0x01a0
        L_0x03a2:
            r3 = r4
            X.5ji r3 = (X.C92715ji) r3
            android.view.View r1 = r3.A00
            r0 = 2131298362(0x7f09083a, float:1.8214695E38)
            android.widget.ImageView r0 = X.C18200wM.A0J(r1, r0)
            r3.A00 = r0
            goto L_0x01a0
        L_0x03b2:
            r6.setBackground(r3)
            goto L_0x0131
        L_0x03b7:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            goto L_0x0127
        L_0x03bb:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            goto L_0x011a
        L_0x03bf:
            android.content.Context r1 = X.C18240wQ.A0B(r13)
            r0 = 2130969474(0x7f040382, float:1.754763E38)
            float r0 = X.C117006xy.A00(r1, r0)
            r4.A00 = r0
            goto L_0x0108
        L_0x03ce:
            int r0 = r5.A02
            if (r0 == 0) goto L_0x03d9
            android.widget.ImageView r6 = r2.A01
        L_0x03d4:
            r6.setImageResource(r0)
            goto L_0x010d
        L_0x03d9:
            int r1 = r5.A00
            android.widget.ImageView r6 = r2.A01
            if (r1 == 0) goto L_0x03ea
            android.content.Context r0 = X.C18240wQ.A0B(r13)
            android.util.TypedValue r0 = X.C86104wH.A0G(r0, r1)
            int r0 = r0.resourceId
            goto L_0x03d4
        L_0x03ea:
            r6.setImageDrawable(r3)
            goto L_0x010d
        L_0x03ef:
            boolean r0 = r5 instanceof X.AnonymousClass5jY
            if (r0 != 0) goto L_0x0090
            boolean r0 = r5 instanceof X.C92655jb
            if (r0 == 0) goto L_0x0413
            X.5jb r5 = (X.C92655jb) r5
            boolean r0 = r13 instanceof X.AnonymousClass5Ae
            if (r0 == 0) goto L_0x04bf
            r2 = r13
            X.5Ae r2 = (X.AnonymousClass5Ae) r2
            java.lang.String r0 = r5.A02
            android.widget.TextView r1 = r2.A00
            if (r0 == 0) goto L_0x040d
            r1.setText(r0)
        L_0x0409:
            android.view.View$OnClickListener r1 = r5.A01
            goto L_0x01d4
        L_0x040d:
            int r0 = r5.A00
            r1.setText(r0)
            goto L_0x0409
        L_0x0413:
            boolean r0 = r5 instanceof X.C92665jc
            if (r0 == 0) goto L_0x0461
            X.5jc r5 = (X.C92665jc) r5
            boolean r0 = r13 instanceof X.AnonymousClass5BD
            if (r0 == 0) goto L_0x04c4
            X.5BD r13 = (X.AnonymousClass5BD) r13
            android.widget.TextView r6 = r13.A01
            java.lang.String r1 = r5.A04
            int r0 = r5.A02
            X.AnonymousClass3JL.A01(r6, r1, r0)
            android.widget.TextView r2 = r13.A00
            r1 = 0
            int r0 = r5.A00
            X.AnonymousClass3JL.A01(r2, r1, r0)
            android.view.View$OnClickListener r0 = r5.A03
            if (r0 == 0) goto L_0x0437
            r2.setOnClickListener(r0)
        L_0x0437:
            int r2 = r5.A01
            r4 = 0
            if (r2 == 0) goto L_0x0459
            r0 = 1
            if (r2 == r0) goto L_0x0451
            r0 = 2
            android.content.Context r1 = X.C18240wQ.A0B(r13)
            if (r2 != r0) goto L_0x04a2
            r0 = 2130969472(0x7f040380, float:1.7547627E38)
        L_0x0449:
            float r0 = X.C117006xy.A00(r1, r0)
            r6.setTextSize(r4, r0)
            return
        L_0x0451:
            android.content.Context r1 = X.C18240wQ.A0B(r13)
            r0 = 2130969470(0x7f04037e, float:1.7547623E38)
            goto L_0x0449
        L_0x0459:
            android.content.Context r1 = X.C18240wQ.A0B(r13)
            r0 = 2130969469(0x7f04037d, float:1.754762E38)
            goto L_0x0449
        L_0x0461:
            boolean r0 = r5 instanceof X.AnonymousClass5jX
            if (r0 != 0) goto L_0x0090
            X.5ja r5 = (X.C92645ja) r5
            boolean r0 = r13 instanceof X.C88685Ad
            if (r0 == 0) goto L_0x04c9
            X.5Ad r13 = (X.C88685Ad) r13
            android.widget.TextView r6 = r13.A00
            android.content.Context r4 = X.C18240wQ.A0B(r13)
            java.lang.String r0 = r5.A03
            r0.getClass()
            com.google.common.collect.ImmutableList r3 = r5.A00
            X.6p6 r2 = X.C99186Il.A00(r4, r3, r0)
            r1 = 2
            com.facebook.redex.IDxCListenerShape270S0200000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape270S0200000_2_I2
            r0.<init>(r1, r4, r5)
            r4 = 0
            java.lang.CharSequence r0 = r2.A00(r0, r4)
            r6.setText(r0)
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L_0x049a
            android.view.View r1 = r13.itemView
            android.view.View$OnClickListener r0 = r5.A02
            r1.setOnClickListener(r0)
        L_0x049a:
            int r0 = r5.A01
            if (r0 != r2) goto L_0x0090
            android.content.Context r1 = X.C18240wQ.A0B(r13)
        L_0x04a2:
            r0 = 2130969471(0x7f04037f, float:1.7547625E38)
            goto L_0x0449
        L_0x04a6:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        L_0x04ab:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        L_0x04b0:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r7)
            throw r0
        L_0x04b5:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r7)
            throw r0
        L_0x04ba:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        L_0x04bf:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        L_0x04c4:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        L_0x04c9:
            java.lang.UnsupportedOperationException r0 = X.C86104wH.A12(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5A9.onBindViewHolder(X.M5O, int):void");
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ((C143658h6) C86124wJ.A0k(this.A01, i)).Bse(viewGroup);
    }

    public AnonymousClass5A9(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    public final int getItemCount() {
        int size;
        int A03 = C14030oh.A03(1347653007);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            size = 0;
        } else {
            size = immutableList.size();
        }
        C14030oh.A0A(146871296, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = C14030oh.A03(-1622172813);
        int i2 = ((C108906j9) this.A00.get(i)).A00;
        C14030oh.A0A(249712601, A03);
        return i2;
    }
}
