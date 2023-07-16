package X;

import com.facebook.graphql.impls.FBPayOneTimePhoneNumberImpl;
import com.facebook.graphql.impls.FBPayPhoneNumberImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.6xe  reason: invalid class name and case insensitive filesystem */
public final class C116846xe {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r10.reinterpret(com.facebook.graphql.impls.FBPayOneTimeEmailImpl.class) == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C115356uv A00(com.facebook.graphql.impls.FBPayEmailImpl r10) {
        /*
            java.lang.String r3 = X.C18250wR.A0X(r10)
            java.lang.String r0 = "user_input_email_address"
            java.lang.String r4 = r10.getStringValue(r0)
            java.lang.String r0 = "normalized_email_address"
            java.lang.String r5 = r10.getStringValue(r0)
            java.lang.String r0 = "is_default"
            boolean r7 = r10.getBooleanValue(r0)
            java.lang.String r2 = "PAYOneTimeEmail"
            boolean r0 = r10.isFulfilled(r2)
            if (r0 == 0) goto L_0x0027
            java.lang.Class<com.facebook.graphql.impls.FBPayOneTimeEmailImpl> r0 = com.facebook.graphql.impls.FBPayOneTimeEmailImpl.class
            com.facebook.pando.TreeJNI r0 = r10.reinterpret(r0)
            r8 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            boolean r0 = r10.isFulfilled(r2)
            if (r0 == 0) goto L_0x0058
            java.lang.Class<com.facebook.graphql.impls.FBPayOneTimeEmailImpl> r0 = com.facebook.graphql.impls.FBPayOneTimeEmailImpl.class
            com.facebook.pando.TreeJNI r1 = r10.reinterpret(r0)
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "is_editable"
            boolean r9 = r1.getBooleanValue(r0)
        L_0x003c:
            boolean r0 = r10.isFulfilled(r2)
            if (r0 == 0) goto L_0x0056
            java.lang.Class<com.facebook.graphql.impls.FBPayOneTimeEmailImpl> r0 = com.facebook.graphql.impls.FBPayOneTimeEmailImpl.class
            com.facebook.pando.TreeJNI r1 = r10.reinterpret(r0)
            if (r1 == 0) goto L_0x0056
            java.lang.String r0 = "external_source_label"
            java.lang.String r6 = r1.getStringValue(r0)
        L_0x0050:
            X.6uv r2 = new X.6uv
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0056:
            r6 = 0
            goto L_0x0050
        L_0x0058:
            r9 = 1
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116846xe.A00(com.facebook.graphql.impls.FBPayEmailImpl):X.6uv");
    }

    public static final C115306uq A01(FBPayPhoneNumberImpl fBPayPhoneNumberImpl) {
        boolean z;
        String str;
        TreeJNI reinterpret;
        TreeJNI reinterpret2;
        String A0X = C18250wR.A0X(fBPayPhoneNumberImpl);
        String stringValue = fBPayPhoneNumberImpl.getStringValue("normalized_phone_number");
        String stringValue2 = fBPayPhoneNumberImpl.getStringValue("formatted_intl_number_with_plus");
        boolean booleanValue = fBPayPhoneNumberImpl.getBooleanValue("is_default");
        if (!fBPayPhoneNumberImpl.isFulfilled("PAYOneTimePhone") || (reinterpret2 = fBPayPhoneNumberImpl.reinterpret(FBPayOneTimePhoneNumberImpl.class)) == null) {
            z = true;
        } else {
            z = reinterpret2.getBooleanValue("is_editable");
        }
        if (!fBPayPhoneNumberImpl.isFulfilled("PAYOneTimePhone") || (reinterpret = fBPayPhoneNumberImpl.reinterpret(FBPayOneTimePhoneNumberImpl.class)) == null) {
            str = null;
        } else {
            str = reinterpret.getStringValue("external_source_label");
        }
        return new C115306uq(A0X, stringValue, stringValue2, str, booleanValue, z);
    }
}
