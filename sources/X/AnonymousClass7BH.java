package X;

import com.facebook.common.locale.Country;
import com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl;
import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7BH  reason: invalid class name */
public final class AnonymousClass7BH {
    public static final AddressFormFieldsConfig A00(FBPayAddressFormConfigFragmentImpl fBPayAddressFormConfigFragmentImpl) {
        Integer num;
        FBPayAddressFormConfigFragmentImpl fBPayAddressFormConfigFragmentImpl2 = fBPayAddressFormConfigFragmentImpl;
        C04220Ms.A0B(fBPayAddressFormConfigFragmentImpl2, 0);
        Country A00 = Country.A00(Country.A00((Country) null, "US"), fBPayAddressFormConfigFragmentImpl2.getStringValue("default_country"));
        ImmutableList A0P = C18230wP.A0P(fBPayAddressFormConfigFragmentImpl2, FBPayAddressFormConfigFragmentImpl.CountryToFields.class, "country_to_fields");
        ArrayList A0w = AnonymousClass0wJ.A0w(A0P);
        Iterator it = A0P.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            Country A002 = Country.A00(Country.A00((Country) null, "US"), A0G.getStringValue("country_code"));
            C04220Ms.A06(A002);
            ImmutableList A0P2 = C18230wP.A0P(A0G, FBPayAddressFormConfigFragmentImpl.CountryToFields.FormFields.class, "form_fields");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it2 = A0P2.iterator();
            while (it2.hasNext()) {
                TreeJNI reinterpret = C18210wN.A0G(it2).reinterpret(FBPayFormFieldImpl.class);
                if (!(reinterpret.getStringValue("field_id") == null || reinterpret.getStringValue("label") == null || reinterpret.getStringValue("placeholder") == null)) {
                    String stringValue = reinterpret.getStringValue("field_id");
                    if (stringValue != null) {
                        String stringValue2 = reinterpret.getStringValue("label");
                        if (stringValue2 != null) {
                            String stringValue3 = reinterpret.getStringValue("placeholder");
                            if (stringValue3 != null) {
                                String stringValue4 = reinterpret.getStringValue("error_message");
                                boolean booleanValue = reinterpret.getBooleanValue("is_optional");
                                ImmutableList A0P3 = C18230wP.A0P(reinterpret, FBPayFormFieldImpl.ValidationRules.class, "validation_rules");
                                boolean booleanValue2 = reinterpret.getBooleanValue("is_optional");
                                String stringValue5 = reinterpret.getStringValue("field_id");
                                if (stringValue5 != null) {
                                    List A02 = A02(stringValue5, reinterpret.getStringValue("error_message"), A0P3, booleanValue2, C04220Ms.A0I(A0G.getStringValue("country_code"), "US"), C04220Ms.A0I(reinterpret.getStringValue("field_id"), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                                    C966366c r3 = (C966366c) C86104wH.A0a(reinterpret, C966366c.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value_type");
                                    if (r3 != null) {
                                        switch (r3.ordinal()) {
                                            case 1:
                                                num = AnonymousClass006.A00;
                                                break;
                                            case 2:
                                                num = AnonymousClass006.A01;
                                                break;
                                            case 3:
                                                num = AnonymousClass006.A0C;
                                                break;
                                            case 5:
                                                num = AnonymousClass006.A0Y;
                                                break;
                                        }
                                    }
                                    num = AnonymousClass006.A0N;
                                    A0v.add(new FormField(num, stringValue, stringValue2, stringValue3, stringValue4, A02, booleanValue));
                                } else {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                            } else {
                                throw C18180wK.A0a("Required value was null.");
                            }
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
            A0w.add(new FormCountry(A002, A0v));
        }
        C04220Ms.A06(A00);
        return new AddressFormFieldsConfig(A00, A0w);
    }

    public static final FormCountry A01(String str, List list) {
        Object obj;
        C04220Ms.A0B(str, 0);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C04220Ms.A0I(C86164wN.A0f(((FormCountry) obj).A00), str)) {
                break;
            }
        }
        return (FormCountry) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        r6 = X.AnonymousClass006.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        switch(r5) {
            case -1881886578: goto L_0x0103;
            case -1881886577: goto L_0x00f9;
            case -1677176261: goto L_0x00ef;
            case -612351174: goto L_0x00de;
            case 120609: goto L_0x00d4;
            case 3053931: goto L_0x00ca;
            case 96619420: goto L_0x00c0;
            case 109757585: goto L_0x00b6;
            case 553963973: goto L_0x00ac;
            default: goto L_0x00a4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r2 = new com.facebookpay.form.cell.text.TextValidatorParams(r6, "", r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r0 = r7.equals("care_of");
        r5 = 2131823150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        r0 = r7.equals(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        r5 = 2131823191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        r0 = r7.equals("email");
        r5 = 2131823167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r0 = r7.equals(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.CITY);
        r5 = 2131823152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r0 = r7.equals(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.POSTAL_CODE);
        r5 = 2131823142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r0 = r7.equals(X.AnonymousClass72H.A00(0, 12, 75));
        r5 = 2131823184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r0 = r7.equals("full_name");
        r5 = 2131823175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        r0 = r7.equals("street2");
        r5 = 2131823194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        r0 = r7.equals("street1");
        r5 = 2131823193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010c, code lost:
        if (r0 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r8 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014d, code lost:
        r0 = r7.equals(r0);
        r1 = 2131823176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r8.length() == 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r2 = new com.facebookpay.form.cell.text.TextValidatorParams(r8, r1, X.AnonymousClass006.A0Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(java.lang.String r7, java.lang.String r8, java.util.List r9, boolean r10, boolean r11, boolean r12) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.lang.String r3 = ""
            if (r10 != 0) goto L_0x0022
            int r5 = r7.hashCode()
            switch(r5) {
                case -1881886578: goto L_0x0155;
                case -1677176261: goto L_0x014b;
                case -612351174: goto L_0x013a;
                case 120609: goto L_0x0130;
                case 3053931: goto L_0x0126;
                case 96619420: goto L_0x011c;
                case 109757585: goto L_0x0112;
                case 553963973: goto L_0x010f;
                default: goto L_0x000f;
            }
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r8 == 0) goto L_0x009f
            int r0 = r8.length()
            if (r0 == 0) goto L_0x009f
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            com.facebookpay.form.cell.text.TextValidatorParams r2 = new com.facebookpay.form.cell.text.TextValidatorParams
            r2.<init>((java.lang.String) r8, (int) r1, (java.lang.Integer) r0)
        L_0x001f:
            r4.add(r2)
        L_0x0022:
            if (r11 == 0) goto L_0x0034
            if (r12 == 0) goto L_0x0034
            java.lang.Integer r5 = X.AnonymousClass006.A0j
            r2 = 2131823192(0x7f110a58, float:1.9279177E38)
            r1 = 0
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r5, r3, r2, r1)
            r4.add(r0)
        L_0x0034:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r9.iterator()
        L_0x003c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0167
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r8)
            java.lang.Class<com.facebook.graphql.impls.FBPayFormValidationRulesImpl> r0 = com.facebook.graphql.impls.FBPayFormValidationRulesImpl.class
            com.facebook.pando.TreeJNI r7 = r1.reinterpret(r0)
            X.C04220Ms.A06(r7)
            X.66b r3 = X.C966266b.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r0 = X.C86104wH.A0a(r7, r3, r1)
            if (r0 == 0) goto L_0x003c
            java.lang.String r2 = "value"
            java.lang.String r0 = r7.getStringValue(r2)
            if (r0 == 0) goto L_0x003c
            java.lang.String r5 = "error_message"
            java.lang.String r0 = r7.getStringValue(r5)
            if (r0 == 0) goto L_0x003c
            java.lang.Enum r0 = X.C86104wH.A0a(r7, r3, r1)
            X.66b r0 = (X.C966266b) r0
            if (r0 == 0) goto L_0x003c
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x009c
            r0 = 3
            if (r1 == r0) goto L_0x0099
            r0 = 2
            if (r1 == r0) goto L_0x0096
            r0 = 5
            if (r1 != r0) goto L_0x003c
            java.lang.Integer r3 = X.AnonymousClass006.A0N
        L_0x0083:
            java.lang.String r2 = r7.getStringValue(r2)
            if (r2 == 0) goto L_0x0162
            java.lang.String r1 = r7.getStringValue(r5)
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>((java.lang.String) r2, (java.lang.Integer) r3, (java.lang.String) r1)
            r6.add(r0)
            goto L_0x003c
        L_0x0096:
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            goto L_0x0083
        L_0x0099:
            java.lang.Integer r3 = X.AnonymousClass006.A01
            goto L_0x0083
        L_0x009c:
            java.lang.Integer r3 = X.AnonymousClass006.A00
            goto L_0x0083
        L_0x009f:
            java.lang.Integer r6 = X.AnonymousClass006.A0Y
            switch(r5) {
                case -1881886578: goto L_0x0103;
                case -1881886577: goto L_0x00f9;
                case -1677176261: goto L_0x00ef;
                case -612351174: goto L_0x00de;
                case 120609: goto L_0x00d4;
                case 3053931: goto L_0x00ca;
                case 96619420: goto L_0x00c0;
                case 109757585: goto L_0x00b6;
                case 553963973: goto L_0x00ac;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            com.facebookpay.form.cell.text.TextValidatorParams r2 = new com.facebookpay.form.cell.text.TextValidatorParams
            r2.<init>(r6, r3, r5, r1)
            goto L_0x001f
        L_0x00ac:
            java.lang.String r0 = "care_of"
            boolean r0 = r7.equals(r0)
            r5 = 2131823150(0x7f110a2e, float:1.9279092E38)
            goto L_0x010c
        L_0x00b6:
            java.lang.String r0 = "state"
            boolean r0 = r7.equals(r0)
            r5 = 2131823191(0x7f110a57, float:1.9279175E38)
            goto L_0x010c
        L_0x00c0:
            java.lang.String r0 = "email"
            boolean r0 = r7.equals(r0)
            r5 = 2131823167(0x7f110a3f, float:1.9279126E38)
            goto L_0x010c
        L_0x00ca:
            java.lang.String r0 = "city"
            boolean r0 = r7.equals(r0)
            r5 = 2131823152(0x7f110a30, float:1.9279096E38)
            goto L_0x010c
        L_0x00d4:
            java.lang.String r0 = "zip"
            boolean r0 = r7.equals(r0)
            r5 = 2131823142(0x7f110a26, float:1.9279075E38)
            goto L_0x010c
        L_0x00de:
            r5 = 0
            r2 = 12
            r0 = 75
            java.lang.String r0 = X.AnonymousClass72H.A00(r5, r2, r0)
            boolean r0 = r7.equals(r0)
            r5 = 2131823184(0x7f110a50, float:1.927916E38)
            goto L_0x010c
        L_0x00ef:
            java.lang.String r0 = "full_name"
            boolean r0 = r7.equals(r0)
            r5 = 2131823175(0x7f110a47, float:1.9279142E38)
            goto L_0x010c
        L_0x00f9:
            java.lang.String r0 = "street2"
            boolean r0 = r7.equals(r0)
            r5 = 2131823194(0x7f110a5a, float:1.927918E38)
            goto L_0x010c
        L_0x0103:
            java.lang.String r0 = "street1"
            boolean r0 = r7.equals(r0)
            r5 = 2131823193(0x7f110a59, float:1.9279179E38)
        L_0x010c:
            if (r0 != 0) goto L_0x00a5
            goto L_0x00a4
        L_0x010f:
            java.lang.String r0 = "care_of"
            goto L_0x014d
        L_0x0112:
            java.lang.String r0 = "state"
            boolean r0 = r7.equals(r0)
            r1 = 2131823190(0x7f110a56, float:1.9279173E38)
            goto L_0x015e
        L_0x011c:
            java.lang.String r0 = "email"
            boolean r0 = r7.equals(r0)
            r1 = 2131823166(0x7f110a3e, float:1.9279124E38)
            goto L_0x015e
        L_0x0126:
            java.lang.String r0 = "city"
            boolean r0 = r7.equals(r0)
            r1 = 2131823151(0x7f110a2f, float:1.9279094E38)
            goto L_0x015e
        L_0x0130:
            java.lang.String r0 = "zip"
            boolean r0 = r7.equals(r0)
            r1 = 2131823195(0x7f110a5b, float:1.9279183E38)
            goto L_0x015e
        L_0x013a:
            r2 = 0
            r1 = 12
            r0 = 75
            java.lang.String r0 = X.AnonymousClass72H.A00(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            r1 = 2131823183(0x7f110a4f, float:1.9279158E38)
            goto L_0x015e
        L_0x014b:
            java.lang.String r0 = "full_name"
        L_0x014d:
            boolean r0 = r7.equals(r0)
            r1 = 2131823176(0x7f110a48, float:1.9279144E38)
            goto L_0x015e
        L_0x0155:
            java.lang.String r0 = "street1"
            boolean r0 = r7.equals(r0)
            r1 = 2131823135(0x7f110a1f, float:1.9279061E38)
        L_0x015e:
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0162:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0167:
            r4.addAll(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BH.A02(java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean):java.util.List");
    }
}
