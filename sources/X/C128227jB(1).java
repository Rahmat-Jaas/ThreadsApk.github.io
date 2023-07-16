package X;

import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.PhoneFormatter;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Collection;

/* renamed from: X.7jB  reason: invalid class name and case insensitive filesystem */
public final class C128227jB implements C142168e4 {
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
            of = ImmutableList.of(new TextValidatorParams(AnonymousClass006.A0Y, "", 2131823184, 2131823183), new TextValidatorParams(AnonymousClass006.A01, "25", 2131826600, 0));
        }
        C91895h1 r2 = new C91895h1(0);
        r2.A0C = AnonymousClass006.A0j;
        r2.A0G.addAll((Iterable) of);
        r2.A0F = str;
        r2.A04 = new PhoneFormatter();
        r2.A01 = R.id.phone_number_field;
        r2.A0D = "phoneNumber";
        r2.A08 = Boolean.valueOf(z);
        r2.A09 = Boolean.valueOf(z2);
        if (fBPayFormFieldImpl == null || (stringValue = fBPayFormFieldImpl.getStringValue("label")) == null || stringValue.length() == 0) {
            r2.A03 = 2131823186;
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
        if (r21.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(com.facebook.graphql.impls.FBPayFormFieldImpl r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, int r38, boolean r39) {
        /*
            r33 = this;
            r10 = 2131826540(0x7f11176c, float:1.9285967E38)
            r0 = 0
            r21 = r36
            if (r36 == 0) goto L_0x000f
            int r1 = r21.length()
            r4 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r4 = 1
        L_0x0010:
            r14 = 0
            if (r4 == 0) goto L_0x0119
            java.lang.String r2 = "new_phone_number_form_field"
        L_0x0015:
            r5 = r34
            r3 = r37
            r1 = r39
            com.facebookpay.form.cell.text.TextCellParams r9 = A00(r5, r3, r2, r1, r0)
            java.lang.String r3 = "client_load_contact_success"
            if (r4 == 0) goto L_0x00af
            java.lang.String r5 = "add_phone"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r14)
            java.util.List r28 = X.C18180wK.A0n(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_phone_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r29 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_add_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r5)
            java.util.List r30 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_add_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r5)
            java.util.List r31 = X.C18180wK.A0n(r2)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r22 = r13
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0062:
            boolean r2 = X.AnonymousClass7HK.A01()
            if (r2 == 0) goto L_0x00a7
            r2 = 2131826396(0x7f1116dc, float:1.9285675E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.AnonymousClass7BI.A00(r2)
        L_0x006f:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r9}
            java.util.ArrayList r22 = X.C06750aI.A14(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r12 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r12.<init>(r1, r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r27 = 2131826505(0x7f111749, float:1.9285896E38)
            r28 = 2131826504(0x7f111748, float:1.9285894E38)
            r29 = 2131826495(0x7f11173f, float:1.9285876E38)
            r30 = 2131826488(0x7f111738, float:1.9285862E38)
            com.facebookpay.form.fragment.model.FormParams r10 = new com.facebookpay.form.fragment.model.FormParams
            r18 = r35
            r26 = r38
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r14
            r23 = r14
            r24 = r14
            r25 = r0
            r31 = r0
            r32 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x00a7:
            r2 = 2131826511(0x7f11174f, float:1.9285908E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.AnonymousClass7BI.A01(r2)
            goto L_0x006f
        L_0x00af:
            java.lang.String r8 = "edit_phone"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r8, r14)
            java.util.List r28 = X.C18180wK.A0n(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_phone_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r29 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "user_remove_contact_enter"
            java.lang.String r2 = "remove_phone"
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_submit"
            java.lang.String r2 = "remove_phone_confirm"
            com.facebookpay.form.fragment.model.FormClickEvent r6 = new com.facebookpay.form.fragment.model.FormClickEvent
            r6.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_cancel"
            java.lang.String r2 = "remove_phone_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r5 = new com.facebookpay.form.fragment.model.FormClickEvent
            r5.<init>(r3, r2)
            java.lang.String r3 = "client_edit_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            java.util.List r30 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_edit_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            java.util.List r31 = X.C18180wK.A0n(r2)
            java.lang.String r2 = "client_remove_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r4 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r4.<init>(r2, r8)
            java.lang.String r3 = "client_remove_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r22 = r13
            r23 = r7
            r24 = r6
            r25 = r5
            r26 = r4
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0062
        L_0x0119:
            r2 = r14
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128227jB.A01(com.facebook.graphql.impls.FBPayFormFieldImpl, java.lang.Integer, java.lang.String, java.lang.String, int, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
