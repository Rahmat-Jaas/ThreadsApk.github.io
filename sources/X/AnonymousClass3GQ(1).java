package X;

import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.3GQ  reason: invalid class name */
public abstract class AnonymousClass3GQ {
    public final M5O A00(ViewGroup viewGroup) {
        if (this instanceof AnonymousClass1oF) {
            return new C200612y(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_list_item, C18200wM.A1Y(viewGroup)));
        } else if (this instanceof AnonymousClass1oE) {
            return new AnonymousClass13P(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_product_specific_section, C18200wM.A1Y(viewGroup)));
        } else if (this instanceof AnonymousClass1oD) {
            return new C198912g(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_page_header, false));
        } else {
            if (this instanceof AnonymousClass1oC) {
                return new C200512x(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_inspiration_section, false));
            }
            if (this instanceof AnonymousClass1oG) {
                return new C200412w(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_hscroll_row, C18200wM.A1Y(viewGroup)));
            } else if (this instanceof AnonymousClass1oB) {
                return new C198812f(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_eligibility_criteria_section, C18200wM.A1Y(viewGroup)));
            } else if (this instanceof AnonymousClass1oA) {
                return new C198712e(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_criteria_list_item, C18200wM.A1Y(viewGroup)));
            } else if (this instanceof AnonymousClass1o9) {
                return AnonymousClass3PD.A00(viewGroup.getContext(), viewGroup);
            } else {
                if (this instanceof AnonymousClass1o8) {
                    return C61883We.A00(viewGroup.getContext(), viewGroup, false);
                }
                return new AnonymousClass123(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.value_props_error_row, C18200wM.A1Y(viewGroup)));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.11D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.112} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.11D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.11D} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0277 A[LOOP:0: B:85:0x0271->B:87:0x0277, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.M5O r11, X.C11630kW r12, com.instagram.service.session.UserSession r13, java.util.List r14, int r15) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass1oF
            if (r0 == 0) goto L_0x0032
            boolean r1 = X.AnonymousClass0wJ.A1Y(r11, r14)
            X.12y r11 = (X.C200612y) r11
            java.lang.Object r2 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ValueProp"
            X.C04220Ms.A0C(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2) r2
            X.C04220Ms.A0B(r2, r1)
            java.lang.String r0 = r2.A00
            int r1 = X.C59683Lu.A00(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A00
            r0.setImageResource(r1)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            java.lang.String r0 = r2.A01
            r1.setText(r0)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r10 instanceof X.AnonymousClass1oE
            r9 = r13
            if (r0 == 0) goto L_0x00a8
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r14)
            X.AnonymousClass0wJ.A1R(r13, r12)
            X.13P r11 = (X.AnonymousClass13P) r11
            java.lang.Object r6 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ProductValuePropComponent"
            X.C04220Ms.A0C(r6, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r6
            X.C04220Ms.A0B(r6, r4)
            android.widget.TextView r2 = r11.A01
            java.lang.Object r5 = r6.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2) r5
            r1 = 0
            if (r5 == 0) goto L_0x00a6
            java.lang.String r0 = r5.A02
        L_0x005a:
            r2.setText(r0)
            android.widget.TextView r2 = r11.A00
            if (r5 == 0) goto L_0x00a4
            java.lang.String r0 = r5.A01
        L_0x0063:
            r2.setText(r0)
            android.content.Context r0 = X.C18240wQ.A0B(r11)
            boolean r2 = X.C34822La.A00(r0)
            java.lang.Object r0 = r6.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            if (r2 == 0) goto L_0x009f
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.A00
        L_0x0078:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A03
            X.C18230wP.A1J(r12, r0, r1)
            java.lang.Object r2 = r6.A02
            java.util.List r2 = (java.util.List) r2
            X.11D r1 = new X.11D
            r1.<init>(r12, r13)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A02
            r0.setAdapter(r1)
            X.C18200wM.A1H(r0, r3)
            X.C04220Ms.A0B(r2, r4)
            java.util.List r0 = r1.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0031
            r1.A00 = r2
            r1.notifyDataSetChanged()
            return
        L_0x009f:
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r0.A01
            goto L_0x0078
        L_0x00a4:
            r0 = r1
            goto L_0x0063
        L_0x00a6:
            r0 = r1
            goto L_0x005a
        L_0x00a8:
            boolean r0 = r10 instanceof X.AnonymousClass1oD
            if (r0 == 0) goto L_0x00ef
            boolean r1 = X.AnonymousClass0wJ.A1Y(r11, r14)
            r0 = 4
            X.C04220Ms.A0B(r12, r0)
            X.12g r11 = (X.C198912g) r11
            java.lang.Object r2 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.CoverComponent"
            X.C04220Ms.A0C(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2
            X.C04220Ms.A0B(r2, r1)
            android.content.Context r0 = X.C18240wQ.A0B(r11)
            boolean r1 = X.C34822La.A00(r0)
            java.lang.Object r0 = r2.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = r0.A00
        L_0x00d4:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A01
            X.C18230wP.A1J(r12, r0, r1)
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x00ec
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ec
            android.widget.TextView r0 = r11.A00
            r0.setText(r1)
            return
        L_0x00e9:
            java.lang.String r1 = r0.A01
            goto L_0x00d4
        L_0x00ec:
            android.widget.TextView r1 = r11.A00
            goto L_0x012d
        L_0x00ef:
            boolean r0 = r10 instanceof X.AnonymousClass1oC
            if (r0 == 0) goto L_0x0133
            boolean r4 = X.AnonymousClass0wJ.A1Y(r11, r14)
            r0 = 4
            X.C04220Ms.A0B(r12, r0)
            X.12x r11 = (X.C200512x) r11
            java.lang.Object r3 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.InspirationComponent"
            X.C04220Ms.A0C(r3, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r3
            X.C04220Ms.A0B(r3, r4)
            android.widget.TextView r1 = r11.A01
            java.lang.String r0 = r3.A03
            r1.setText(r0)
            android.widget.TextView r1 = r11.A00
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            android.content.Context r0 = X.C18240wQ.A0B(r11)
            boolean r2 = X.C34822La.A00(r0)
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01fa
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A02
        L_0x012d:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0133:
            boolean r0 = r10 instanceof X.AnonymousClass1oG
            if (r0 == 0) goto L_0x01b5
            r1 = r10
            X.1oG r1 = (X.AnonymousClass1oG) r1
            boolean r3 = X.AnonymousClass0wJ.A1Y(r11, r14)
            r0 = 4
            X.C04220Ms.A0B(r12, r0)
            X.12w r11 = (X.C200412w) r11
            java.lang.Object r2 = r14.get(r15)
            java.lang.String r5 = r1.A00
            X.C04220Ms.A0B(r2, r3)
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = "insights"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0179
            android.widget.TextView r1 = r11.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r2
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            android.widget.TextView r1 = r11.A00
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ThemedImageURL>"
        L_0x016d:
            X.C04220Ms.A0C(r4, r0)
        L_0x0170:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0198
            androidx.recyclerview.widget.RecyclerView r1 = r11.A02
            goto L_0x012d
        L_0x0179:
            java.lang.String r0 = "monetization"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0170
            android.widget.TextView r1 = r11.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2) r2
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            android.widget.TextView r1 = r11.A00
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ImageInfo>"
            goto L_0x016d
        L_0x0198:
            X.112 r2 = new X.112
            r2.<init>(r5, r12)
            androidx.recyclerview.widget.RecyclerView r1 = r11.A02
            r1.setAdapter(r2)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r3, r3)
            r1.setLayoutManager(r0)
            java.util.List r0 = r2.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0031
            r2.A00 = r4
            goto L_0x01f6
        L_0x01b5:
            boolean r0 = r10 instanceof X.AnonymousClass1oB
            if (r0 == 0) goto L_0x020d
            r4 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r11, r14)
            X.AnonymousClass0wJ.A1R(r13, r12)
            X.12f r11 = (X.C198812f) r11
            java.lang.Object r2 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ProductEligibilityCriteriaComponent"
            X.C04220Ms.A0C(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2
            X.C04220Ms.A0B(r2, r4)
            android.widget.TextView r1 = r11.A00
            java.lang.String r0 = r2.A02
            r1.setText(r0)
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            X.11D r2 = new X.11D
            r2.<init>(r12, r13)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            r0.setAdapter(r2)
            X.C18200wM.A1H(r0, r3)
            X.C04220Ms.A0B(r1, r4)
            java.util.List r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0031
            r2.A00 = r1
        L_0x01f6:
            r2.notifyDataSetChanged()
            return
        L_0x01fa:
            java.lang.Object r0 = r1.get(r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            if (r2 == 0) goto L_0x020a
            java.lang.String r1 = r0.A00
        L_0x0204:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A02
            X.C18230wP.A1J(r12, r0, r1)
            return
        L_0x020a:
            java.lang.String r1 = r0.A01
            goto L_0x0204
        L_0x020d:
            boolean r0 = r10 instanceof X.AnonymousClass1oA
            if (r0 == 0) goto L_0x02af
            boolean r1 = X.AnonymousClass0wJ.A1Z(r11, r14)
            r0 = 3
            X.C04220Ms.A0B(r13, r0)
            X.12e r11 = (X.C198712e) r11
            java.lang.Object r4 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.EligibilityCriteriaInfo"
            X.C04220Ms.A0C(r4, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r4
            X.C04220Ms.A0B(r4, r1)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r11.A00
            android.content.Context r5 = X.C18190wL.A0A(r6)
            java.lang.String r3 = r4.A02
            X.C04220Ms.A0B(r3, r1)
            java.lang.String r0 = "circle-x-pano"
            boolean r0 = r3.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x028d
            int r0 = X.C59683Lu.A00(r3)
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
            if (r1 == 0) goto L_0x024e
            r0 = 2131099962(0x7f06013a, float:1.7812292E38)
        L_0x024a:
            X.C63393hP.A03(r5, r1, r0)
        L_0x024d:
            r2 = r1
        L_0x024e:
            r6.setImageDrawable(r2)
            com.instagram.common.ui.base.IgTextView r3 = r11.A01
            android.content.Context r7 = X.C18190wL.A0A(r3)
            java.lang.String r2 = r4.A03
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 2
            X.C04220Ms.A0B(r2, r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r2)
            if (r1 == 0) goto L_0x02a8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02a8
            java.util.Iterator r1 = r1.iterator()
        L_0x0271:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r8 = r1.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r8
            java.lang.String r0 = r8.A00
            int r5 = X.C18210wN.A01(r7)
            r6 = 1
            com.instagram.ui.text.IDxCSpanShape37S0300000_1_I2 r4 = new com.instagram.ui.text.IDxCSpanShape37S0300000_1_I2
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass3Zw.A01(r2, r4, r0)
            goto L_0x0271
        L_0x028d:
            java.lang.String r0 = "circle-check-pano"
            boolean r1 = r3.equals(r0)
            int r0 = X.C59683Lu.A00(r3)
            if (r1 == 0) goto L_0x02a3
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
            if (r1 == 0) goto L_0x024e
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            goto L_0x024a
        L_0x02a3:
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
            goto L_0x024d
        L_0x02a8:
            r3.setText(r2)
            X.C18180wK.A0z(r3)
            return
        L_0x02af:
            boolean r0 = r10 instanceof X.AnonymousClass1o9
            if (r0 == 0) goto L_0x02d6
            r5 = 0
            boolean r4 = X.AnonymousClass0wJ.A1Z(r11, r14)
            X.13K r11 = (X.AnonymousClass13K) r11
            java.lang.Object r3 = r14.get(r15)
            X.4MA r3 = (X.AnonymousClass4MA) r3
            r2 = 1
            boolean r1 = X.C18180wK.A1W(r15)
            int r0 = r14.size()
            int r0 = r0 - r4
            if (r15 == r0) goto L_0x02cd
            r2 = 0
        L_0x02cd:
            X.3Bq r0 = new X.3Bq
            r0.<init>(r1, r2, r5, r5)
            X.AnonymousClass3PD.A01(r3, r0, r11)
            return
        L_0x02d6:
            boolean r0 = r10 instanceof X.AnonymousClass1o8
            boolean r1 = X.AnonymousClass0wJ.A1Y(r11, r14)
            if (r0 == 0) goto L_0x02ea
            X.13j r11 = (X.C201613j) r11
            java.lang.Object r0 = r14.get(r15)
            X.3hu r0 = (X.C63613hu) r0
            X.C61883We.A02(r0, r11, r1)
            return
        L_0x02ea:
            X.123 r11 = (X.AnonymousClass123) r11
            java.lang.Object r2 = r14.get(r15)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creatortools.util.ErrorRowComponent"
            X.C04220Ms.A0C(r2, r0)
            X.348 r2 = (X.AnonymousClass348) r2
            X.C04220Ms.A0B(r2, r1)
            android.widget.TextView r1 = r11.A00
            int r0 = r2.A00
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GQ.A01(X.M5O, X.0kW, com.instagram.service.session.UserSession, java.util.List, int):void");
    }
}
