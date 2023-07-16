package X;

import android.util.Patterns;
import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.Collection;

/* renamed from: X.7j9  reason: invalid class name and case insensitive filesystem */
public final class C128207j9 implements C142168e4 {
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
            of = ImmutableList.of(new TextValidatorParams(AnonymousClass006.A0Y, "", 2131823167, 2131823166), new TextValidatorParams(AnonymousClass006.A0N, Patterns.EMAIL_ADDRESS.pattern(), 2131826467, 0));
        }
        C91895h1 r2 = new C91895h1(1);
        r2.A0C = AnonymousClass006.A0u;
        r2.A0G.addAll((Iterable) of);
        r2.A0F = str;
        r2.A01 = R.id.email_field;
        r2.A0D = "emailAddress";
        r2.A08 = Boolean.valueOf(z);
        r2.A09 = Boolean.valueOf(z2);
        if (fBPayFormFieldImpl == null || (stringValue = fBPayFormFieldImpl.getStringValue("label")) == null || stringValue.length() == 0) {
            r2.A03 = 2131823170;
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r21.length() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(com.facebook.graphql.impls.FBPayFormFieldImpl r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, int r41, boolean r42) {
        /*
            r36 = this;
            r10 = 2131826540(0x7f11176c, float:1.9285967E38)
            r25 = 1
            r0 = 0
            r21 = r39
            if (r39 == 0) goto L_0x0011
            int r1 = r21.length()
            r4 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            r14 = 0
            if (r4 == 0) goto L_0x0119
            java.lang.String r2 = "new_email_form_field"
        L_0x0017:
            r5 = r37
            r3 = r40
            r1 = r42
            com.facebookpay.form.cell.text.TextCellParams r9 = A00(r5, r3, r2, r1, r0)
            java.lang.String r3 = "client_load_contact_success"
            if (r4 == 0) goto L_0x00af
            java.lang.String r5 = "add_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r14)
            java.util.List r32 = X.C18180wK.A0n(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_email_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r33 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_add_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r5)
            java.util.List r34 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_add_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r5)
            java.util.List r35 = X.C18180wK.A0n(r2)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r26 = r13
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r31 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0064:
            boolean r2 = X.AnonymousClass7HK.A01()
            if (r2 == 0) goto L_0x00a7
            r2 = 2131826391(0x7f1116d7, float:1.9285665E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.AnonymousClass7BI.A00(r2)
        L_0x0071:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r9}
            java.util.ArrayList r22 = X.C06750aI.A14(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r12 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r12.<init>(r1, r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r27 = 2131826501(0x7f111745, float:1.9285888E38)
            r28 = 2131826500(0x7f111744, float:1.9285886E38)
            r29 = 2131826495(0x7f11173f, float:1.9285876E38)
            r30 = 2131826488(0x7f111738, float:1.9285862E38)
            com.facebookpay.form.fragment.model.FormParams r10 = new com.facebookpay.form.fragment.model.FormParams
            r18 = r38
            r26 = r41
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r14
            r23 = r14
            r24 = r14
            r31 = r0
            r32 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x00a7:
            r2 = 2131826508(0x7f11174c, float:1.9285902E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.AnonymousClass7BI.A01(r2)
            goto L_0x0071
        L_0x00af:
            java.lang.String r8 = "edit_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r8, r14)
            java.util.List r32 = X.C18180wK.A0n(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_email_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r33 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "user_remove_contact_enter"
            java.lang.String r2 = "remove_email"
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_submit"
            java.lang.String r2 = "remove_email_confirm"
            com.facebookpay.form.fragment.model.FormClickEvent r6 = new com.facebookpay.form.fragment.model.FormClickEvent
            r6.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_cancel"
            java.lang.String r2 = "remove_email_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r5 = new com.facebookpay.form.fragment.model.FormClickEvent
            r5.<init>(r3, r2)
            java.lang.String r3 = "client_edit_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            java.util.List r34 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_edit_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            java.util.List r35 = X.C18180wK.A0n(r2)
            java.lang.String r2 = "client_remove_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r4 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r4.<init>(r2, r8)
            java.lang.String r3 = "client_remove_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r26 = r13
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0064
        L_0x0119:
            r2 = r14
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128207j9.A01(com.facebook.graphql.impls.FBPayFormFieldImpl, java.lang.Integer, java.lang.String, java.lang.String, int, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
