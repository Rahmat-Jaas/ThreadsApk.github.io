package X;

import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.NameFormatter;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Collection;

/* renamed from: X.7jA  reason: invalid class name and case insensitive filesystem */
public final class C128217jA implements C142168e4 {
    public static final TextCellParams A00(FBPayFormFieldImpl fBPayFormFieldImpl, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        String stringValue;
        if (fBPayFormFieldImpl != null) {
            ImmutableList A0P = C18230wP.A0P(fBPayFormFieldImpl, FBPayFormFieldImpl.ValidationRules.class, "validation_rules");
            boolean booleanValue = fBPayFormFieldImpl.getBooleanValue("is_optional");
            String stringValue2 = fBPayFormFieldImpl.getStringValue("field_id");
            if (stringValue2 != null) {
                of = ImmutableList.copyOf((Collection) AnonymousClass7BH.A02(stringValue2, fBPayFormFieldImpl.getStringValue("error_message"), A0P, booleanValue, false, false));
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            of = ImmutableList.of(new TextValidatorParams(AnonymousClass006.A0Y, "", 2131823175, 2131823176));
        }
        C04220Ms.A06(of);
        C91895h1 r2 = new C91895h1(2);
        r2.A0C = AnonymousClass006.A0N;
        r2.A0G.addAll((Iterable) of);
        r2.A04 = new NameFormatter();
        r2.A0F = str;
        r2.A01 = R.id.name_field;
        r2.A0D = "personName";
        r2.A08 = Boolean.valueOf(z);
        r2.A09 = Boolean.valueOf(z2);
        if (fBPayFormFieldImpl == null || (stringValue = fBPayFormFieldImpl.getStringValue("label")) == null || stringValue.length() == 0) {
            r2.A03 = 2131823177;
        } else {
            String stringValue3 = fBPayFormFieldImpl.getStringValue("label");
            if (stringValue3 != null) {
                r2.A0E = stringValue3;
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        C86134wK.A1J(r2, str2);
        return r2.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(com.facebook.graphql.impls.FBPayFormFieldImpl r31, java.lang.String r32, int r33, boolean r34) {
        /*
            r30 = this;
            r7 = 2131826540(0x7f11176c, float:1.9285967E38)
            r0 = 0
            r3 = r32
            if (r32 == 0) goto L_0x000f
            int r1 = r3.length()
            r4 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r4 = 1
        L_0x0010:
            r11 = 0
            if (r4 == 0) goto L_0x00d6
            java.lang.String r1 = "new_full_name_form_field"
        L_0x0015:
            r5 = r31
            r2 = r34
            com.facebookpay.form.cell.text.TextCellParams r6 = A00(r5, r3, r1, r2, r0)
            java.lang.String r3 = "client_load_contact_success"
            if (r4 == 0) goto L_0x009e
            java.lang.String r5 = "add_name"
            com.facebookpay.form.fragment.model.FormDisplayEvent r1 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r1.<init>(r3, r5, r11)
            java.util.List r16 = X.C18180wK.A0n(r1)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r1 = new com.facebookpay.form.fragment.model.FormClickEvent
            r1.<init>(r4, r3)
            java.util.List r17 = X.C18180wK.A0n(r1)
            java.lang.String r3 = "client_add_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r1 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r1.<init>(r3, r5)
            java.util.List r18 = X.C18180wK.A0n(r1)
            java.lang.String r3 = "client_add_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r1 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r1.<init>(r3, r5)
            java.util.List r19 = X.C18180wK.A0n(r1)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0058:
            boolean r1 = X.AnonymousClass7HK.A01()
            if (r1 == 0) goto L_0x0096
            r1 = 2131826392(0x7f1116d8, float:1.9285667E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.AnonymousClass7BI.A00(r1)
        L_0x0065:
            com.facebookpay.form.cell.CellParams[] r1 = new com.facebookpay.form.cell.CellParams[]{r6}
            java.util.ArrayList r19 = X.C06750aI.A14(r1)
            com.facebookpay.form.fragment.model.FeatureConfiguration r9 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r9.<init>(r2, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r22 = 5
            com.facebookpay.form.fragment.model.FormParams r7 = new com.facebookpay.form.fragment.model.FormParams
            r23 = r33
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r21 = r11
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r28 = r0
            r29 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r7
        L_0x0096:
            r1 = 2131826509(0x7f11174d, float:1.9285904E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.AnonymousClass7BI.A01(r1)
            goto L_0x0065
        L_0x009e:
            java.lang.String r5 = "edit_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r1 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r1.<init>(r3, r5, r11)
            java.util.List r16 = X.C18180wK.A0n(r1)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r1 = new com.facebookpay.form.fragment.model.FormClickEvent
            r1.<init>(r4, r3)
            java.util.List r17 = X.C18180wK.A0n(r1)
            java.lang.String r3 = "client_edit_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r1 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r1.<init>(r3, r5)
            java.util.List r18 = X.C18180wK.A0n(r1)
            java.lang.String r3 = "client_edit_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r1 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r1.<init>(r3, r5)
            java.util.List r19 = X.C18180wK.A0n(r1)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0058
        L_0x00d6:
            r1 = r11
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128217jA.A01(com.facebook.graphql.impls.FBPayFormFieldImpl, java.lang.String, int, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
