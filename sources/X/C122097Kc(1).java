package X;

import android.content.Context;
import android.util.Pair;
import com.fbpay.w3c.CardDetails;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Kc  reason: invalid class name and case insensitive filesystem */
public final class C122097Kc {
    public static final Map A00;
    public static final Set A01 = Collections.unmodifiableSet(C86114wI.A0t(new String[]{"https://checkout.us.shopifycs.com/", "https://checkout.shopifycs.com/"}));

    public static Pair A00(Context context, String str) {
        Locale locale;
        if (str != null) {
            if (context == null) {
                try {
                    locale = Locale.getDefault();
                } catch (ParseException unused) {
                    return null;
                }
            } else {
                locale = C86114wI.A0B(context).locale;
            }
            Date parse = new SimpleDateFormat("MM/yyyy", locale).parse(str.replaceAll(" ", ""));
            if (parse != null) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                return new Pair(Integer.valueOf(instance.get(2) + 1), A02(context, Integer.valueOf(instance.get(1))));
            }
        }
        return null;
    }

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("NAME_FULL", FXPFAccessLibraryDebugFragment.NAME);
        builder.put("NAME_FIRST", "given-name");
        builder.put("NAME_LAST", "family-name");
        builder.put("EMAIL_ADDRESS", "email");
        builder.put("ADDRESS_HOME_LINE1", "address-line1");
        builder.put("ADDRESS_HOME_LINE2", "address-line2");
        builder.put("ADDRESS_HOME_STATE", "address-level1");
        builder.put("ADDRESS_HOME_CITY", "address-level2");
        builder.put("ADDRESS_HOME_ZIP", "postal-code");
        builder.put("PHONE_HOME_WHOLE_NUMBER", "tel");
        builder.put("CREDIT_CARD_NAME_FULL", "cc-name");
        builder.put("CREDIT_CARD_NUMBER", "cc-number");
        builder.put("CREDIT_CARD_EXP_MONTH", "cc-exp-month");
        builder.put("CREDIT_CARD_EXP_DATE_2_DIGIT_YEAR", "cc-exp-year");
        builder.put("CREDIT_CARD_EXP_4_DIGIT_YEAR", "cc-exp-year");
        builder.put("CREDIT_CARD_VERIFICATION_CODE", "cc-csc");
        A00 = builder.build();
    }

    public static Integer A02(Context context, Integer num) {
        Locale locale;
        Locale locale2;
        if (num == null || num.intValue() >= 1000) {
            return num;
        }
        String obj = num.toString();
        int length = obj.length();
        if (length >= 1 && length <= 2) {
            if (length == 1) {
                obj = AnonymousClass00U.A0L("0", obj);
            }
            if (context == null) {
                locale = Locale.getDefault();
            } else {
                locale = C86114wI.A0B(context).locale;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy", locale);
            if (context == null) {
                locale2 = Locale.getDefault();
            } else {
                locale2 = C86114wI.A0B(context).locale;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", locale2);
            try {
                Date parse = simpleDateFormat.parse(obj);
                if (parse != null) {
                    return C86124wJ.A0h(simpleDateFormat2.format(parse));
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f5, code lost:
        if (r2.length() != 0) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027a, code lost:
        if (r2 != null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0280, code lost:
        if (r2.length() != 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0282, code lost:
        r13 = X.AnonymousClass7DD.A01;
        r12 = X.C18220wO.A0x((java.util.Map) X.C18190wL.A0f(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0292, code lost:
        if (r12.hasNext() == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0294, code lost:
        r11 = X.C18180wK.A0k(r12);
        r10 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a0, code lost:
        if (r10.hasNext() == false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a2, code lost:
        r1 = X.C18180wK.A0k(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02aa, code lost:
        if (r1.length() <= 0) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ac, code lost:
        r0 = ((java.util.Map) X.C18190wL.A0f(r13)).get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b6, code lost:
        if (r0 == null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02be, code lost:
        if (((X.C134697yC) r0).A03(r1) == false) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c0, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02c1, code lost:
        if (r2 == null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02c7, code lost:
        if (r2.length() != 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d3, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02d4, code lost:
        if (r2 == null) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02da, code lost:
        if (r2.length() != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02dc, code lost:
        r1 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02de, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r6.contains(r1) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e6, code lost:
        if (X.AnonymousClass8bP.A0j(r1, "alibaba.com", false) != true) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02e8, code lost:
        r1 = X.C18190wL.A0p(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ee, code lost:
        if (r1 == null) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f4, code lost:
        if (r1.equalsIgnoreCase("Please enter") == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02f6, code lost:
        r1 = X.C18190wL.A0p(r5, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02fc, code lost:
        if (r1 == null) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0302, code lost:
        if (r1.equalsIgnoreCase("tel") == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0304, code lost:
        return "cc-number";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0307, code lost:
        r1 = X.C18190wL.A0p(r5, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x030d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0313, code lost:
        if (r1.equalsIgnoreCase("number") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0321, code lost:
        if (X.AnonymousClass8bP.A0j((java.lang.CharSequence) r5.get(4), "PHONE_HOME_CITY_AND_NUMBER", true) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0323, code lost:
        return "cc-csc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.C872350v r16, X.C89405Ej r17, java.util.Set r18) {
        /*
            r9 = r16
            java.lang.String[] r5 = r9.A07
            r11 = r17
            r6 = r18
            if (r5 == 0) goto L_0x002d
            int r3 = r5.length
            if (r3 == 0) goto L_0x002d
            r2 = 0
        L_0x000e:
            r0 = r5[r2]
            java.lang.String r1 = "fake"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d1
            com.instagram.service.session.UserSession r4 = r11.A0B
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36310512516661368(0x810038002b0078, double:3.026252554010311E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r0, r4, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d7
        L_0x002b:
            if (r1 != 0) goto L_0x004d
        L_0x002d:
            java.lang.CharSequence r0 = r9.A04
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = " "
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replaceAll(r1, r0)
            java.lang.String r0 = "MM/YY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "cc-exp"
            boolean r0 = r6.contains(r1)
            if (r0 == 0) goto L_0x006a
        L_0x004d:
            java.lang.String r0 = "fake"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e6
            com.instagram.service.session.UserSession r4 = r11.A0B
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36310512516661368(0x810038002b0078, double:3.026252554010311E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r0, r4, r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00e6
            r0 = 0
            return r0
        L_0x006a:
            android.view.ViewStructure$HtmlInfo r0 = r9.A02
            r1 = 0
            if (r0 == 0) goto L_0x004d
            java.util.List r0 = r0.getAttributes()
            if (r0 == 0) goto L_0x004d
            android.view.ViewStructure$HtmlInfo r0 = r9.A02
            java.util.List r0 = r0.getAttributes()
            java.util.Iterator r4 = r0.iterator()
        L_0x007f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r3 = r4.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r2 = r3.first
            java.lang.String r0 = "label"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = " "
            java.lang.String r0 = ""
            java.lang.String r2 = r3.replaceAll(r2, r0)
            java.lang.String r0 = "MM/YY"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.String r2 = "cc-exp"
            boolean r0 = r6.contains(r2)
            if (r0 == 0) goto L_0x007f
            r1 = r2
            goto L_0x004d
        L_0x00b3:
            android.view.ViewStructure$HtmlInfo r0 = r9.A02
            java.util.List r3 = r0.getAttributes()
            r2 = 0
            com.facebook.redex.IDxPredicateShape352S0100000_2_I2 r0 = new com.facebook.redex.IDxPredicateShape352S0100000_2_I2
            r0.<init>(r6, r2)
            java.lang.Object r0 = X.AnonymousClass3W7.A00(r0, r3)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x004d
            java.util.Map r1 = A00
            java.lang.Object r0 = r0.second
            java.lang.String r1 = X.C18210wN.A0g(r0, r1)
            goto L_0x004d
        L_0x00d1:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00d7
            goto L_0x000e
        L_0x00d7:
            int r3 = r5.length
            r2 = 0
        L_0x00d9:
            if (r2 >= r3) goto L_0x002d
            r1 = r5[r2]
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00e6:
            if (r1 != 0) goto L_0x00f9
            r8 = 0
            r3 = 1
            android.view.ViewStructure$HtmlInfo r0 = r9.A02
            r1 = 0
            if (r0 == 0) goto L_0x00f5
            java.util.List r0 = r0.getAttributes()
            if (r0 != 0) goto L_0x00fa
        L_0x00f5:
            java.lang.CharSequence r0 = r9.A04
            if (r0 != 0) goto L_0x00fa
        L_0x00f9:
            return r1
        L_0x00fa:
            java.lang.String r12 = ""
            java.lang.CharSequence r0 = r9.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r14 = X.AnonymousClass8bP.A0P(r0)
            r7 = 2
            r6 = 3
            r4 = 4
            r10 = 5
            r13 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            java.lang.String[] r0 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18}
            java.util.List r5 = X.C06750aI.A18(r0)
            android.view.ViewStructure$HtmlInfo r0 = r9.A02
            if (r0 == 0) goto L_0x018d
            java.util.List r0 = r0.getAttributes()
            if (r0 == 0) goto L_0x018d
            java.util.Iterator r14 = r0.iterator()
            if (r14 == 0) goto L_0x018d
        L_0x012a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r2 = r14.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r12 = r2.first
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0163
            int r13 = r12.hashCode()
            r0 = 3355(0xd1b, float:4.701E-42)
            if (r13 == r0) goto L_0x0187
            r0 = 3373707(0x337a8b, float:4.72757E-39)
            if (r13 == r0) goto L_0x0181
            r0 = 3575610(0x368f3a, float:5.010497E-39)
            if (r13 == r0) goto L_0x017b
            r0 = 102727412(0x61f7ef4, float:2.9997847E-35)
            if (r13 != r0) goto L_0x0163
            java.lang.String r0 = "label"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r2.second
            X.C04220Ms.A05(r0)
            r5.set(r10, r0)
        L_0x0163:
            java.lang.Object r12 = r2.first
            X.C04220Ms.A05(r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r0 = "autofill-hints"
            boolean r0 = X.AnonymousClass8bP.A0j(r12, r0, r3)
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r2.second
            X.C04220Ms.A05(r0)
            r5.set(r4, r0)
            goto L_0x012a
        L_0x017b:
            java.lang.String r0 = "type"
            A06(r2, r0, r12, r5, r6)
            goto L_0x0163
        L_0x0181:
            java.lang.String r0 = "name"
            A06(r2, r0, r12, r5, r8)
            goto L_0x0163
        L_0x0187:
            java.lang.String r0 = "id"
            A06(r2, r0, r12, r5, r3)
            goto L_0x0163
        L_0x018d:
            X.0Oa r15 = X.AnonymousClass7DD.A03
            java.lang.Object r0 = X.C18190wL.A0f(r15)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r14 = X.C18220wO.A0x(r0)
        L_0x0199:
            boolean r0 = r14.hasNext()
            java.lang.String r17 = "Required value was null."
            if (r0 == 0) goto L_0x01ed
            java.lang.String r2 = X.C18180wK.A0k(r14)
            java.lang.Object r0 = X.C18190wL.A0f(r15)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r13 = r0.get(r2)
            if (r13 == 0) goto L_0x01e8
            X.7yC r13 = (X.C134697yC) r13
            X.0Oa r0 = X.AnonymousClass7DD.A02
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r12 = r0.get(r2)
            X.7yC r12 = (X.C134697yC) r12
            boolean r0 = A09(r5, r13, r8)
            if (r0 != 0) goto L_0x01d3
            boolean r0 = A09(r5, r13, r3)
            if (r0 != 0) goto L_0x01d3
            boolean r0 = A09(r5, r13, r7)
            if (r0 == 0) goto L_0x0199
        L_0x01d3:
            if (r12 == 0) goto L_0x01ef
            boolean r0 = A09(r5, r12, r8)
            if (r0 == r3) goto L_0x0199
            boolean r0 = A09(r5, r12, r3)
            if (r0 == r3) goto L_0x0199
            boolean r0 = A09(r5, r12, r7)
            if (r0 != r3) goto L_0x01ef
            goto L_0x0199
        L_0x01e8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r17)
            throw r0
        L_0x01ed:
            r2 = r1
            goto L_0x01f7
        L_0x01ef:
            if (r2 == 0) goto L_0x01f7
            int r0 = r2.length()
            if (r0 != 0) goto L_0x027c
        L_0x01f7:
            X.0Oa r16 = X.AnonymousClass7DD.A04
            java.lang.Object r0 = r16.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r15 = X.C18220wO.A0x(r0)
        L_0x0203:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x027a
            java.lang.String r13 = X.C18180wK.A0k(r15)
            java.lang.Object r0 = r16.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r12 = r0.get(r13)
            if (r12 == 0) goto L_0x02ca
            X.7yC r12 = (X.C134697yC) r12
            X.0Oa r0 = X.AnonymousClass7DD.A02
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r13)
            X.7yC r1 = (X.C134697yC) r1
            java.lang.Object r0 = r5.get(r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r12.A03(r0)
            if (r0 != 0) goto L_0x024b
            boolean r0 = A09(r5, r12, r3)
            if (r0 != 0) goto L_0x024b
            boolean r0 = A09(r5, r12, r7)
            if (r0 != 0) goto L_0x024b
            boolean r0 = A09(r5, r12, r10)
            if (r0 == 0) goto L_0x0203
            int r0 = r9.A00
            if (r0 != r3) goto L_0x0203
        L_0x024b:
            if (r1 == 0) goto L_0x0266
            boolean r0 = A09(r5, r1, r8)
            if (r0 == r3) goto L_0x0203
            boolean r0 = A09(r5, r1, r3)
            if (r0 == r3) goto L_0x0203
            boolean r0 = A09(r5, r1, r7)
            if (r0 == r3) goto L_0x0203
            boolean r0 = A09(r5, r1, r10)
            if (r0 != r3) goto L_0x0266
            goto L_0x0203
        L_0x0266:
            com.instagram.service.session.UserSession r14 = r11.A0B
            X.0TJ r12 = X.AnonymousClass0TJ.A05
            r0 = 36310512516661368(0x810038002b0078, double:3.026252554010311E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r12, r14, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0203
            r2 = r13
        L_0x027a:
            if (r2 == 0) goto L_0x0282
        L_0x027c:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x02d6
        L_0x0282:
            X.0Oa r13 = X.AnonymousClass7DD.A01
            java.lang.Object r0 = X.C18190wL.A0f(r13)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r12 = X.C18220wO.A0x(r0)
        L_0x028e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.String r11 = X.C18180wK.A0k(r12)
            java.util.Iterator r10 = r5.iterator()
        L_0x029c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02c1
            java.lang.String r1 = X.C18180wK.A0k(r10)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x029c
            java.lang.Object r0 = X.C18190wL.A0f(r13)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x02cf
            X.7yC r0 = (X.C134697yC) r0
            boolean r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x029c
            r2 = r11
        L_0x02c1:
            if (r2 == 0) goto L_0x028e
            int r0 = r2.length()
            if (r0 != 0) goto L_0x02d6
            goto L_0x028e
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r17)
            throw r0
        L_0x02cf:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r17)
            throw r0
        L_0x02d4:
            if (r2 == 0) goto L_0x02dc
        L_0x02d6:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0306
        L_0x02dc:
            java.lang.String r1 = r9.A05
            if (r1 == 0) goto L_0x0306
            java.lang.String r0 = "alibaba.com"
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r8)
            if (r0 != r3) goto L_0x0306
            java.lang.String r1 = X.C18190wL.A0p(r5, r7)
            java.lang.String r0 = "Please enter"
            if (r1 == 0) goto L_0x0307
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0307
            java.lang.String r1 = X.C18190wL.A0p(r5, r6)
            java.lang.String r0 = "tel"
            if (r1 == 0) goto L_0x0307
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0307
            java.lang.String r2 = "cc-number"
        L_0x0306:
            return r2
        L_0x0307:
            java.lang.String r1 = X.C18190wL.A0p(r5, r6)
            java.lang.String r0 = "number"
            if (r1 == 0) goto L_0x0306
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0306
            java.lang.Object r1 = r5.get(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = "PHONE_HOME_CITY_AND_NUMBER"
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r3)
            if (r0 == 0) goto L_0x0306
            java.lang.String r2 = "cc-csc"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122097Kc.A04(X.50v, X.5Ej, java.util.Set):java.lang.String");
    }

    public static String A05(String str, String str2) {
        Integer num;
        int intValue;
        if ("cc-exp-month".equals(str)) {
            num = A03(str2);
            if (num == null || (intValue = num.intValue()) < 1 || intValue > 12) {
                return null;
            }
        } else if (!"cc-exp-year".equals(str)) {
            return str2;
        } else {
            num = A03(str2);
            if (num == null) {
                return null;
            }
        }
        return num.toString();
    }

    public static boolean A07(CardDetails cardDetails) {
        Integer num;
        Integer num2 = cardDetails.A02;
        if (num2 == null || (num = cardDetails.A03) == null) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(2, num2.intValue() - 1);
        instance.set(1, num.intValue());
        return !instance.before(Calendar.getInstance());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0131, code lost:
        r1 = r5.A01;
        r0 = android.view.autofill.AutofillValue.forList(r7);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.SparseArray A01(X.C872350v r13, X.C89405Ej r14, java.util.Map r15, java.util.Set r16, java.util.Set r17) {
        /*
            android.util.SparseArray r4 = X.C86154wM.A0D()
            if (r13 == 0) goto L_0x013c
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x013c
            java.util.List r0 = r13.A08
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0016:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r5 = r13.next()
            X.50v r5 = (X.C872350v) r5
            r0 = r16
            java.lang.String r6 = A04(r5, r14, r0)
            if (r6 == 0) goto L_0x0016
            boolean r0 = r15.containsKey(r6)
            if (r0 == 0) goto L_0x0016
            android.view.autofill.AutofillValue r2 = r5.A03
            java.lang.String r3 = X.C18220wO.A0r(r6, r15)
            if (r3 == 0) goto L_0x0016
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.isList()
            r1 = r17
            if (r0 == 0) goto L_0x0110
            int r0 = r2.getListValue()
            java.lang.CharSequence[] r9 = r5.A06
            if (r9 == 0) goto L_0x0016
            int r8 = r9.length
            if (r0 >= r8) goto L_0x0016
            r0 = r9[r0]
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "length"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0058:
            boolean r0 = r1.contains(r6)
            if (r0 == 0) goto L_0x0016
            r7 = 0
        L_0x005f:
            if (r7 >= r8) goto L_0x0016
            r0 = r9[r7]
            java.lang.String r11 = r0.toString()
            boolean r0 = r3.equalsIgnoreCase(r11)
            r12 = 1
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "cc-exp-month"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0081
            java.lang.Integer r1 = A03(r11)
            if (r1 == 0) goto L_0x00b3
            java.lang.Integer r0 = X.C86124wJ.A0h(r3)     // Catch:{ NumberFormatException -> 0x00b5 }
            goto L_0x00b6
        L_0x0081:
            java.lang.String r0 = "cc-exp-year"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00b3
            int r1 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00b3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00b3 }
            if (r10 == 0) goto L_0x00b3
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r0) goto L_0x00b3
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r1 > r0) goto L_0x00b3
            int r0 = r1 % 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = A03(r11)
            boolean r0 = r10.equals(r1)
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00ba
            r12 = 0
            goto L_0x00ba
        L_0x00b3:
            r12 = 0
            goto L_0x00ba
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            boolean r12 = r1.equals(r0)
        L_0x00ba:
            if (r12 != 0) goto L_0x0131
            r0 = r9[r7]
            java.lang.String r10 = r0.toString()
            boolean r0 = r3.equalsIgnoreCase(r10)
            r2 = 1
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "cc-exp-month"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e7
            int r11 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x00e7 }
            if (r0 == 0) goto L_0x00e7
            r0 = 12
            if (r11 > r0) goto L_0x00e7
            if (r11 < r2) goto L_0x00e7
            java.text.DateFormatSymbols r0 = new java.text.DateFormatSymbols     // Catch:{  }
            r0.<init>()     // Catch:{  }
            goto L_0x00e9
        L_0x00e7:
            r2 = 0
            goto L_0x0108
        L_0x00e9:
            java.lang.String[] r12 = r0.getMonths()
            java.lang.String[] r1 = r0.getShortMonths()
            if (r12 == 0) goto L_0x00fd
            int r0 = r11 - r2
            r0 = r12[r0]
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0108
        L_0x00fd:
            if (r1 == 0) goto L_0x010e
            int r11 = r11 - r2
            r0 = r1[r11]
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x010e
        L_0x0108:
            if (r2 != 0) goto L_0x0131
            int r7 = r7 + 1
            goto L_0x005f
        L_0x010e:
            r2 = 0
            goto L_0x0108
        L_0x0110:
            boolean r0 = r2.isText()
            if (r0 == 0) goto L_0x0016
            java.lang.CharSequence r0 = r2.getTextValue()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x012a
            boolean r0 = r1.contains(r6)
            if (r0 == 0) goto L_0x0016
        L_0x012a:
            int r1 = r5.A01
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r3)
            goto L_0x0137
        L_0x0131:
            int r1 = r5.A01
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forList(r7)
        L_0x0137:
            r4.put(r1, r0)
            goto L_0x0016
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122097Kc.A01(X.50v, X.5Ej, java.util.Map, java.util.Set, java.util.Set):android.util.SparseArray");
    }

    public static Integer A03(String str) {
        String trim = str.trim();
        StringBuilder A0r = C18200wM.A0r();
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (!Character.isDigit(charAt)) {
                break;
            }
            A0r.append(charAt);
        }
        try {
            return C86124wJ.A0h(A0r.toString());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void A06(Pair pair, Object obj, String str, List list, int i) {
        if (str.equals(obj)) {
            Object obj2 = pair.second;
            C04220Ms.A05(obj2);
            list.set(i, AnonymousClass7DD.A00((String) obj2));
        }
    }

    public static boolean A08(String str, Set set) {
        if (set.contains(str)) {
            return true;
        }
        if (FXPFAccessLibraryDebugFragment.NAME.equals(str) && set.contains("cc-name")) {
            return true;
        }
        if ("family-name".equals(str) && set.contains("cc-family-name")) {
            return true;
        }
        if (!"given-name".equals(str) || !set.contains("cc-given-name")) {
            return false;
        }
        return true;
    }

    public static boolean A09(List list, C134697yC r1, int i) {
        return r1.A03((CharSequence) list.get(i));
    }
}
