package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.bloks.component.textinput.BloksEditText;

/* renamed from: X.7Jb  reason: invalid class name and case insensitive filesystem */
public final class C121977Jb {
    public static final InputFilter[] A00 = new InputFilter[0];

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b3, code lost:
        X.C30967GcS.A02("TextInputBinderUtils", X.AnonymousClass00U.A0L("Unsupported value for autofill type: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02be, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d3, code lost:
        if (r1.equals(r4) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x031d, code lost:
        if (r1.equals(r2) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0369, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036a, code lost:
        r11.setImportantForAutofill(1);
        r11.setAutofillHints(new java.lang.String[]{r4});
        X.AnonymousClass7J1.A00().post(new X.C135667zr(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0380, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0232, code lost:
        r11.setImeOptions(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C111326n9 A01(X.C107206gM r14, X.AnonymousClass3HX r15, X.C127397h3 r16, com.instagram.common.bloks.component.textinput.BloksEditText r17, java.lang.Object r18) {
        /*
            r9 = r15
            r10 = r16
            java.lang.Object r12 = X.AnonymousClass7K7.A03(r15, r10)
            X.6n9 r12 = (X.C111326n9) r12
            r1 = r18
            r5 = r1
            X.6hq r5 = (X.C108116hq) r5
            java.lang.Object r0 = r12.A0G
            if (r0 == r1) goto L_0x0018
            int r0 = r5.A00
            r12.A03 = r0
            r12.A0G = r1
        L_0x0018:
            r11 = r17
            r12.A0N = r11
            float r0 = r11.getTextSize()
            r12.A00 = r0
            android.text.TextUtils$TruncateAt r0 = r11.getEllipsize()
            r12.A0B = r0
            android.os.Parcelable r0 = r12.A0A
            r4 = 0
            if (r0 == 0) goto L_0x0032
            r11.onRestoreInstanceState(r0)
            r12.A0A = r4
        L_0x0032:
            int r0 = r12.A02
            if (r0 != 0) goto L_0x003c
            int r0 = r11.getInputType()
            r12.A02 = r0
        L_0x003c:
            android.graphics.Rect r6 = r12.A07
            int r3 = r11.getPaddingLeft()
            int r2 = r11.getPaddingTop()
            int r1 = r11.getPaddingRight()
            int r0 = r11.getPaddingBottom()
            r6.set(r3, r2, r1, r0)
            android.text.method.KeyListener r0 = r12.A0M
            if (r0 != 0) goto L_0x005b
            android.text.method.KeyListener r0 = r11.getKeyListener()
            r12.A0M = r0
        L_0x005b:
            android.text.method.KeyListener r1 = r11.getKeyListener()
            android.text.Editable r0 = r12.A0L
            java.lang.String r13 = r0.toString()
            android.graphics.Typeface r8 = r5.A01
            A03(r8, r9, r10, r11, r12, r13)
            android.text.method.KeyListener r0 = r11.getKeyListener()
            r6 = 0
            r5 = 1
            boolean r2 = X.C18240wQ.A1Y(r1, r0)
            int r1 = r12.A0K
            r3 = -1
            if (r1 != r3) goto L_0x0280
            android.text.Editable r0 = r11.getText()
            if (r0 == 0) goto L_0x008a
            android.text.Editable r0 = r11.getText()
            int r0 = r0.length()
            r11.setSelection(r0)
        L_0x008a:
            r0 = 74
            java.lang.Object r0 = X.C127397h3.A0A(r10, r0)
            boolean r1 = X.AnonymousClass2LL.A00(r0, r5)
            r0 = 83
            android.util.SparseArray r7 = r10.A04
            java.lang.String r0 = X.C86114wI.A0m(r7, r0)
            if (r1 == 0) goto L_0x0264
            if (r0 == 0) goto L_0x026b
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r0)
            android.text.method.KeyListener r0 = r11.getKeyListener()
            if (r0 == r2) goto L_0x00ad
            r11.setKeyListener(r2)
        L_0x00ad:
            r12.A0P = r5
        L_0x00af:
            boolean r0 = r11.isEnabled()
            if (r1 == r0) goto L_0x00b8
            r11.setEnabled(r1)
        L_0x00b8:
            boolean r8 = X.C121887Iq.A05(r11)
            if (r8 == 0) goto L_0x00c3
            android.text.TextUtils$TruncateAt r0 = r12.A0C
            X.C121887Iq.A00(r0, r11, r12)
        L_0x00c3:
            r0 = 84
            java.lang.Object r0 = X.C127397h3.A0A(r10, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r6)
            if (r0 == 0) goto L_0x00da
            r11.setShowSoftInputOnFocus(r6)
            X.7RU r0 = new X.7RU
            r0.<init>()
            r11.setOnKeyListener(r0)
        L_0x00da:
            X.7QF r0 = r12.A0O
            if (r0 != 0) goto L_0x00e5
            X.7QF r0 = new X.7QF
            r0.<init>(r14, r15, r10)
            r12.A0O = r0
        L_0x00e5:
            X.8et r0 = r12.A0F
            if (r0 != 0) goto L_0x00f0
            X.7qk r0 = new X.7qk
            r0.<init>(r15, r10)
            r12.A0F = r0
        L_0x00f0:
            r11.A00 = r0
            X.7QF r0 = r12.A0O
            r11.removeTextChangedListener(r0)
            X.7QF r0 = r12.A0O
            r11.addTextChangedListener(r0)
            java.lang.String r0 = X.C127397h3.A0D(r10)
            if (r0 == 0) goto L_0x011d
            android.text.TextWatcher r1 = r12.A0D
            if (r1 != 0) goto L_0x010d
            X.7QG r1 = new X.7QG
            r1.<init>(r11, r0)
            r12.A0D = r1
        L_0x010d:
            X.7QF r0 = r12.A0O
            java.util.List r0 = r0.A02
            r0.remove(r1)
            X.7QF r0 = r12.A0O
            android.text.TextWatcher r1 = r12.A0D
            java.util.List r0 = r0.A02
            r0.add(r1)
        L_0x011d:
            r0 = 42
            X.6jp r2 = r10.A0L(r0)
            r0 = 45
            X.6jp r1 = r10.A0L(r0)
            if (r2 != 0) goto L_0x025d
            if (r1 != 0) goto L_0x025d
            if (r8 == 0) goto L_0x0137
            X.7RT r0 = new X.7RT
            r0.<init>(r15, r10, r4, r4)
        L_0x0134:
            r11.setOnFocusChangeListener(r0)
        L_0x0137:
            r0 = 55
            X.7h3 r1 = r10.A0K(r0)
            android.content.res.ColorStateList r0 = r11.getTextColors()
            r12.A06 = r0
            if (r1 == 0) goto L_0x0242
            int r0 = X.C101086Pv.A00(r15, r1, r6)
            r11.setTextColor(r0)
        L_0x014c:
            r0 = 65
            X.7h3 r2 = r10.A0K(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x015b
            X.C121887Iq.A01(r15, r2, r11, r12)
        L_0x015b:
            android.content.res.ColorStateList r0 = r11.getHintTextColors()
            r12.A05 = r0
            r0 = 38
            X.7h3 r0 = r10.A0K(r0)
            if (r0 == 0) goto L_0x0170
            int r0 = X.C101086Pv.A00(r15, r0, r6)
            r11.setHintTextColor(r0)
        L_0x0170:
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            r12.A08 = r0
            r0 = 140(0x8c, float:1.96E-43)
            X.7h3 r0 = r10.A0K(r0)
            if (r0 == 0) goto L_0x018a
            int r1 = X.C101086Pv.A00(r15, r0, r6)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r11.setBackground(r0)
        L_0x018a:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r0 = 40
            int r1 = r10.A0H(r0, r3)
            if (r1 <= r3) goto L_0x019e
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r2.add(r0)
        L_0x019e:
            r0 = 62
            X.6jp r1 = r10.A0L(r0)
            if (r1 == 0) goto L_0x01ae
            X.7Q7 r0 = new X.7Q7
            r0.<init>(r15, r10, r1)
            r2.add(r0)
        L_0x01ae:
            int r0 = r2.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r11.setFilters(r0)
            int r0 = r11.getImeOptions()
            r12.A01 = r0
            r0 = 70
            java.lang.String r6 = X.C86114wI.A0m(r7, r0)
            if (r6 == 0) goto L_0x01d5
            int r0 = r6.hashCode()
            r3 = 4
            r2 = 3
            r1 = 2
            switch(r0) {
                case -906336856: goto L_0x0207;
                case 3304: goto L_0x0213;
                case 3089282: goto L_0x021f;
                case 3377907: goto L_0x0229;
                case 3526536: goto L_0x0236;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            r0 = 46
            X.6jp r1 = r10.A0L(r0)
            X.3vw r0 = new X.3vw
            r0.<init>(r15, r10, r1)
            r11.setOnEditorActionListener(r0)
            r0 = 75
            java.lang.String r1 = X.C86114wI.A0m(r7, r0)
            boolean r0 = r11.isAttachedToWindow()
            if (r0 != 0) goto L_0x01fc
            if (r1 != 0) goto L_0x01fd
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[]{r4}
            r11.setAutofillHints(r0)
        L_0x01f9:
            r11.setImportantForAutofill(r1)
        L_0x01fc:
            return r12
        L_0x01fd:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0287
            r1 = 2
            goto L_0x01f9
        L_0x0207:
            java.lang.String r0 = "search"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d5
            r11.setImeOptions(r2)
            goto L_0x01d5
        L_0x0213:
            java.lang.String r0 = "go"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d5
            r11.setImeOptions(r1)
            goto L_0x01d5
        L_0x021f:
            java.lang.String r0 = "done"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d5
            r0 = 6
            goto L_0x0232
        L_0x0229:
            java.lang.String r0 = "next"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d5
            r0 = 5
        L_0x0232:
            r11.setImeOptions(r0)
            goto L_0x01d5
        L_0x0236:
            java.lang.String r0 = "send"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01d5
            r11.setImeOptions(r3)
            goto L_0x01d5
        L_0x0242:
            r0 = 52
            java.lang.String r0 = X.C86114wI.A0m(r7, r0)
            if (r0 == 0) goto L_0x014c
            int r0 = X.AnonymousClass7Kk.A04(r0)     // Catch:{ 1zB -> 0x0253 }
            r11.setTextColor(r0)     // Catch:{ 1zB -> 0x0253 }
            goto L_0x014c
        L_0x0253:
            r2 = move-exception
            java.lang.String r1 = "TextInputBinderUtils"
            java.lang.String r0 = "Error parsing text color for Text input"
            X.C30967GcS.A01(r15, r1, r0, r2, r6)
            goto L_0x014c
        L_0x025d:
            X.7RT r0 = new X.7RT
            r0.<init>(r15, r10, r2, r1)
            goto L_0x0134
        L_0x0264:
            r11.setKeyListener(r4)
            X.C121887Iq.A03(r11, r12, r6)
            goto L_0x027c
        L_0x026b:
            if (r2 != 0) goto L_0x027c
            boolean r0 = r12.A0P
            if (r0 != 0) goto L_0x0277
            android.text.method.KeyListener r0 = r11.getKeyListener()
            if (r0 != 0) goto L_0x027c
        L_0x0277:
            android.text.method.KeyListener r0 = r12.A0M
            r11.setKeyListener(r0)
        L_0x027c:
            r12.A0P = r6
            goto L_0x00af
        L_0x0280:
            int r0 = r12.A0J
            r11.setSelection(r1, r0)
            goto L_0x008a
        L_0x0287:
            android.content.Context r2 = r15.A00
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.autofill.AutofillManager r2 = (android.view.autofill.AutofillManager) r2
            if (r2 == 0) goto L_0x02a0
            android.view.autofill.AutofillId r0 = r2.getNextAutofillId()
            r11.setAutofillId(r0)
            r2.requestAutofill(r11)
            r2.notifyViewClicked(r11)
        L_0x02a0:
            int r6 = r1.hashCode()
            java.lang.String r4 = "password"
            r3 = 31
            r2 = 8
            r0 = 68
            java.lang.String r2 = X.AnonymousClass7C5.A00(r3, r2, r0)
            switch(r6) {
                case -2053263135: goto L_0x035f;
                case -1677176261: goto L_0x0354;
                case -1163041205: goto L_0x0349;
                case -1122949358: goto L_0x033e;
                case -612351174: goto L_0x032b;
                case -397476730: goto L_0x0320;
                case -265713450: goto L_0x0319;
                case -177500692: goto L_0x030e;
                case -177500691: goto L_0x0303;
                case 21980740: goto L_0x02f8;
                case 96619420: goto L_0x02ed;
                case 263786198: goto L_0x02e2;
                case 390008550: goto L_0x02d6;
                case 1216985755: goto L_0x02cf;
                case 1729797393: goto L_0x02bf;
                default: goto L_0x02b3;
            }
        L_0x02b3:
            java.lang.String r0 = "Unsupported value for autofill type: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "TextInputBinderUtils"
            X.C30967GcS.A02(r0, r1)
            return r12
        L_0x02bf:
            r0 = 512(0x200, float:7.175E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "creditCardExpirationDate"
            goto L_0x0369
        L_0x02cf:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x036a
            goto L_0x02b3
        L_0x02d6:
            java.lang.String r0 = "credit_card_card_security_code"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "creditCardSecurityCode"
            goto L_0x0369
        L_0x02e2:
            java.lang.String r0 = "address_city"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "addressLocality"
            goto L_0x0369
        L_0x02ed:
            java.lang.String r0 = "email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "emailAddress"
            goto L_0x0369
        L_0x02f8:
            java.lang.String r0 = "full_address"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "postalAddress"
            goto L_0x0369
        L_0x0303:
            java.lang.String r0 = "address_street_line2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "aptNumber"
            goto L_0x0369
        L_0x030e:
            java.lang.String r0 = "address_street_line1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "streetAddress"
            goto L_0x0369
        L_0x0319:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0369
            goto L_0x02b3
        L_0x0320:
            java.lang.String r0 = "address_state"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "addressRegion"
            goto L_0x0369
        L_0x032b:
            r3 = 9
            r2 = 12
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.AnonymousClass7C5.A00(r3, r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "phone"
            goto L_0x0369
        L_0x033e:
            java.lang.String r0 = "credit_card_number"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "creditCardNumber"
            goto L_0x0369
        L_0x0349:
            java.lang.String r0 = "address_country"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "addressCountry"
            goto L_0x0369
        L_0x0354:
            java.lang.String r0 = "full_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "name"
            goto L_0x0369
        L_0x035f:
            java.lang.String r0 = "postal_code"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r2 = "postalCode"
        L_0x0369:
            r4 = r2
        L_0x036a:
            r11.setImportantForAutofill(r5)
            java.lang.String[] r0 = new java.lang.String[]{r4}
            r11.setAutofillHints(r0)
            X.7zr r1 = new X.7zr
            r1.<init>(r11)
            android.os.Handler r0 = X.AnonymousClass7J1.A00()
            r0.post(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121977Jb.A01(X.6gM, X.3HX, X.7h3, com.instagram.common.bloks.component.textinput.BloksEditText, java.lang.Object):X.6n9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        throw X.C86124wJ.A0c("can't parse unknown inputType: ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011c, code lost:
        if (java.lang.Integer.valueOf(r1) == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015b, code lost:
        if (X.C121887Iq.A04(r11.getInputType()) != false) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.graphics.Typeface r8, X.AnonymousClass3HX r9, X.C127397h3 r10, com.instagram.common.bloks.component.textinput.BloksEditText r11, X.C111326n9 r12, java.lang.String r13) {
        /*
            r6 = 0
            r0 = 59
            java.lang.Object r0 = X.C127397h3.A0A(r10, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r6)
            if (r0 == 0) goto L_0x0010
            r11.setPadding(r6, r6, r6, r6)
        L_0x0010:
            r0 = 90
            X.7h3 r7 = r10.A0K(r0)
            r2 = 36
            java.lang.String r3 = "TextInputBinderUtils"
            if (r7 == 0) goto L_0x0042
            r0 = 35
            X.7h3 r1 = r7.A0K(r0)     // Catch:{ 1zB -> 0x003c }
            int r0 = r11.A01     // Catch:{ 1zB -> 0x003c }
            int r5 = X.C101086Pv.A00(r9, r1, r0)     // Catch:{ 1zB -> 0x003c }
            r0 = 40
            float r4 = X.C127397h3.A00(r7, r0)     // Catch:{ 1zB -> 0x003c }
            float r1 = X.C127397h3.A00(r7, r2)     // Catch:{ 1zB -> 0x003c }
            r0 = 38
            float r0 = X.C127397h3.A00(r7, r0)     // Catch:{ 1zB -> 0x003c }
            r11.setShadowLayer(r4, r1, r0, r5)     // Catch:{ 1zB -> 0x003c }
            goto L_0x0042
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text shadow"
            X.C30967GcS.A01(r9, r3, r0, r1, r6)
        L_0x0042:
            if (r13 == 0) goto L_0x0051
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r11)
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0051
            r11.setText(r13)
        L_0x0051:
            android.util.SparseArray r5 = r10.A04
            java.lang.String r0 = X.C86114wI.A0m(r5, r2)
            r11.setHint(r0)
            r0 = 51
            java.lang.String r0 = X.C86114wI.A0m(r5, r0)
            if (r0 == 0) goto L_0x0070
            int r0 = X.AnonymousClass7Kk.A07(r0)     // Catch:{ 1zB -> 0x006a }
            r11.setGravity(r0)     // Catch:{ 1zB -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C30967GcS.A01(r9, r3, r0, r1, r6)
        L_0x0070:
            r0 = 56
            java.lang.String r2 = X.C86114wI.A0m(r5, r0)
            r4 = 0
            if (r2 == 0) goto L_0x0125
            int r0 = r2.hashCode()     // Catch:{ 1zB -> 0x011f }
            r1 = 2
            switch(r0) {
                case -2141169668: goto L_0x0088;
                case -2066832464: goto L_0x0091;
                case -1831299680: goto L_0x009a;
                case -1413853096: goto L_0x00a3;
                case -1034364087: goto L_0x00ac;
                case 3076014: goto L_0x00b5;
                case 3556653: goto L_0x00be;
                case 96619420: goto L_0x00c7;
                case 106642798: goto L_0x00d0;
                case 260133443: goto L_0x00d9;
                case 1216389502: goto L_0x00e2;
                case 1216985755: goto L_0x00eb;
                default: goto L_0x0081;
            }     // Catch:{ 1zB -> 0x011f }
        L_0x0081:
            java.lang.String r0 = "can't parse unknown inputType: "
            X.1zB r0 = X.C86124wJ.A0c(r0, r2)     // Catch:{ 1zB -> 0x011f }
            throw r0     // Catch:{ 1zB -> 0x011f }
        L_0x0088:
            java.lang.String r0 = "cap_words"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x00f4
        L_0x0091:
            java.lang.String r0 = "text_no_suggestion"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x00f8
        L_0x009a:
            java.lang.String r0 = "cap_letters"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x00fc
        L_0x00a3:
            java.lang.String r0 = "amount"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x0100
        L_0x00ac:
            java.lang.String r0 = "number"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 != 0) goto L_0x0118
            goto L_0x0081
        L_0x00b5:
            java.lang.String r0 = "date"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x0103
        L_0x00be:
            java.lang.String r0 = "text"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x0106
        L_0x00c7:
            java.lang.String r0 = "email"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x010a
        L_0x00d0:
            java.lang.String r0 = "phone"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x010d
        L_0x00d9:
            java.lang.String r0 = "cap_sentences"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x010f
        L_0x00e2:
            java.lang.String r0 = "passcode"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x0113
        L_0x00eb:
            java.lang.String r0 = "password"
            boolean r0 = r2.equals(r0)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0081
            goto L_0x0116
        L_0x00f4:
            r1 = 139265(0x22001, float:1.95152E-40)
            goto L_0x0118
        L_0x00f8:
            r1 = 655361(0xa0001, float:9.18356E-40)
            goto L_0x0118
        L_0x00fc:
            r1 = 135169(0x21001, float:1.89412E-40)
            goto L_0x0118
        L_0x0100:
            r1 = 12290(0x3002, float:1.7222E-41)
            goto L_0x0118
        L_0x0103:
            r1 = 20
            goto L_0x0118
        L_0x0106:
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L_0x0118
        L_0x010a:
            r1 = 33
            goto L_0x0118
        L_0x010d:
            r1 = 3
            goto L_0x0118
        L_0x010f:
            r1 = 180225(0x2c001, float:2.52549E-40)
            goto L_0x0118
        L_0x0113:
            r1 = 18
            goto L_0x0118
        L_0x0116:
            r1 = 129(0x81, float:1.81E-43)
        L_0x0118:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ 1zB -> 0x011f }
            if (r0 == 0) goto L_0x0125
            goto L_0x012b
        L_0x011f:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C30967GcS.A01(r9, r3, r0, r1, r6)
        L_0x0125:
            if (r12 == 0) goto L_0x017e
            int r1 = r12.A04
            if (r1 == 0) goto L_0x017e
        L_0x012b:
            r0 = r1 & 15
            r2 = 2
            r7 = 1
            if (r0 != r7) goto L_0x013d
            r0 = 73
            int r0 = r10.A0H(r0, r6)
            if (r0 != r7) goto L_0x0177
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            r1 = r1 & r0
        L_0x013d:
            int r0 = r11.getInputType()
            if (r1 == r0) goto L_0x0146
            X.C121887Iq.A03(r11, r12, r1)
        L_0x0146:
            r0 = 49
            java.lang.Object r0 = X.C127397h3.A0A(r10, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r6)
            if (r0 == 0) goto L_0x015d
            int r0 = r11.getInputType()
            boolean r0 = X.C121887Iq.A04(r0)
            r1 = 1
            if (r0 == 0) goto L_0x015e
        L_0x015d:
            r1 = 0
        L_0x015e:
            if (r12 == 0) goto L_0x0165
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x0165
            r6 = 1
        L_0x0165:
            if (r1 == r6) goto L_0x016e
            r11.setSingleLine(r1)
            if (r12 == 0) goto L_0x016e
            r12.A0H = r1
        L_0x016e:
            r0 = 53
            java.lang.String r0 = X.C86114wI.A0m(r5, r0)
            if (r0 == 0) goto L_0x0192
            goto L_0x0183
        L_0x0177:
            if (r0 != r2) goto L_0x013d
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            goto L_0x013d
        L_0x017e:
            int r1 = r11.getInputType()
            goto L_0x012b
        L_0x0183:
            float r0 = X.AnonymousClass7Kk.A02(r0)     // Catch:{ 1zB -> 0x018b }
            r11.setTextSize(r2, r0)     // Catch:{ 1zB -> 0x018b }
            goto L_0x0192
        L_0x018b:
            r2 = move-exception
            java.lang.String r1 = "Error parsing scaled text size for text input"
            r0 = 0
            X.C30967GcS.A01(r9, r3, r1, r2, r0)
        L_0x0192:
            if (r8 == 0) goto L_0x019a
            r11.setTypeface(r8)
        L_0x0197:
            r0 = 91
            goto L_0x01c0
        L_0x019a:
            r0 = 54
            java.lang.String r1 = X.C86114wI.A0m(r5, r0)
            if (r1 == 0) goto L_0x0197
            if (r9 == 0) goto L_0x01b0
            android.content.Context r0 = r11.getContext()     // Catch:{ 1zB -> 0x01b8 }
            android.graphics.Typeface r0 = X.C101096Pw.A00(r0, r4, r1)     // Catch:{ 1zB -> 0x01b8 }
            r11.setTypeface(r0)     // Catch:{ 1zB -> 0x01b8 }
            goto L_0x0197
        L_0x01b0:
            int r0 = X.AnonymousClass7Kk.A09(r1)     // Catch:{ 1zB -> 0x01b8 }
            r11.setTypeface(r4, r0)     // Catch:{ 1zB -> 0x01b8 }
            goto L_0x0197
        L_0x01b8:
            r2 = move-exception
            java.lang.String r1 = "Error parsing text style for text input"
            r0 = 0
            X.C30967GcS.A01(r9, r3, r1, r2, r0)
            goto L_0x0197
        L_0x01c0:
            java.lang.String r1 = X.C86114wI.A0m(r5, r0)     // Catch:{ 1zB -> 0x01e1 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x01cc
            float r0 = X.AnonymousClass7Kk.A01(r1)     // Catch:{ 1zB -> 0x01e1 }
        L_0x01cc:
            int r1 = (int) r0     // Catch:{ 1zB -> 0x01e1 }
            if (r1 < 0) goto L_0x01e8
            android.text.TextPaint r0 = r11.getPaint()     // Catch:{ 1zB -> 0x01e1 }
            int r0 = r0.getFontMetricsInt(r4)     // Catch:{ 1zB -> 0x01e1 }
            if (r1 == r0) goto L_0x01e8
            int r1 = r1 - r0
            float r1 = (float) r1     // Catch:{ 1zB -> 0x01e1 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setLineSpacing(r1, r0)     // Catch:{ 1zB -> 0x01e1 }
            return
        L_0x01e1:
            r2 = move-exception
            java.lang.String r1 = "Error parsing lineHeight for text input"
            r0 = 0
            X.C30967GcS.A01(r9, r3, r1, r2, r0)
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121977Jb.A03(android.graphics.Typeface, X.3HX, X.7h3, com.instagram.common.bloks.component.textinput.BloksEditText, X.6n9, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7H0 A00(X.L1i r10, X.C112976qV r11, X.C127397h3 r12, java.lang.String r13, int r14, int r15) {
        /*
            java.lang.Object r9 = r11.A05
            X.3HX r9 = (X.AnonymousClass3HX) r9
            r1 = 0
            if (r9 == 0) goto L_0x0025
            X.4rP r0 = r9.A02
            X.76t r0 = r0.ATb()
            X.6jX r0 = r0.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0025
            android.content.Context r3 = r11.A04
            X.C04220Ms.A0B(r3, r1)
            r5 = 0
            com.instagram.common.bloks.component.textinput.EditTextForMeasure r11 = new com.instagram.common.bloks.component.textinput.EditTextForMeasure     // Catch:{ NullPointerException -> 0x002c }
            r11.<init>(r3, r5)     // Catch:{ NullPointerException -> 0x002c }
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r11.setBackgroundResource(r0)     // Catch:{ NullPointerException -> 0x002c }
            goto L_0x004d
        L_0x0025:
            android.content.Context r3 = r11.A04
            java.lang.Object r11 = r10.AFU(r3)
            goto L_0x004b
        L_0x002c:
            r4 = move-exception
            java.lang.String r2 = r4.getMessage()
            if (r2 == 0) goto L_0x00df
            java.lang.String r0 = "ConstantState.newDrawable"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 == 0) goto L_0x00df
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r0 = 2131493712(0x7f0c0350, float:1.8610912E38)
            android.view.View r11 = r2.inflate(r0, r5, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.textinput.EditTextForMeasure"
            X.C04220Ms.A0C(r11, r0)
        L_0x004b:
            com.instagram.common.bloks.component.textinput.BloksEditText r11 = (com.instagram.common.bloks.component.textinput.BloksEditText) r11
        L_0x004d:
            r10 = r12
            java.lang.String r6 = X.C18220wO.A0o(r12)
            r2 = 54
            android.util.SparseArray r0 = r12.A04
            java.lang.String r7 = X.C86114wI.A0m(r0, r2)
            java.lang.String r5 = "Error parsing text style for text input"
            r8 = 0
            java.lang.String r4 = "TextInputBinderUtils"
            if (r9 == 0) goto L_0x0081
            if (r6 == 0) goto L_0x0098
            android.content.Context r2 = r9.A00
            X.794 r0 = X.AnonymousClass794.A00()
            X.3TV r0 = r0.A05
            android.graphics.Typeface r8 = r0.A01(r2, r6, r1)
            if (r7 == 0) goto L_0x0098
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0098
            android.graphics.Typeface r8 = X.C101096Pw.A00(r3, r8, r7)     // Catch:{ 1zB -> 0x007c }
            goto L_0x0098
        L_0x007c:
            r0 = move-exception
            X.C30967GcS.A01(r9, r4, r5, r0, r1)
            goto L_0x0098
        L_0x0081:
            if (r6 == 0) goto L_0x0098
            if (r7 == 0) goto L_0x008e
            int r1 = X.AnonymousClass7Kk.A09(r7)     // Catch:{ 1zB -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            X.C30967GcS.A01(r9, r4, r5, r0, r1)
        L_0x008e:
            X.794 r0 = X.AnonymousClass794.A00()
            X.3TV r0 = r0.A05
            android.graphics.Typeface r8 = r0.A01(r3, r6, r1)
        L_0x0098:
            r9.getClass()
            java.lang.Object r0 = X.AnonymousClass7K7.A03(r9, r12)
            X.6n9 r0 = (X.C111326n9) r0
            if (r13 != 0) goto L_0x00a9
            android.text.Editable r0 = r0.A0L
            java.lang.String r13 = r0.toString()
        L_0x00a9:
            r12 = 0
            A03(r8, r9, r10, r11, r12, r13)
            r11.measure(r14, r15)
            int r0 = r11.getLineCount()
            X.6hq r3 = new X.6hq
            r3.<init>(r8, r0)
            int r1 = android.view.View.MeasureSpec.getMode(r14)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x00da
            int r2 = android.view.View.MeasureSpec.getSize(r14)
        L_0x00c5:
            int r1 = r11.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "TextInput is being measured with unspecified width"
            X.C30967GcS.A02(r4, r0)
        L_0x00d4:
            X.7H0 r0 = new X.7H0
            r0.<init>(r2, r1, r3)
            return r0
        L_0x00da:
            int r2 = r11.getMeasuredWidth()
            goto L_0x00c5
        L_0x00df:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121977Jb.A00(X.L1i, X.6qV, X.7h3, java.lang.String, int, int):X.7H0");
    }

    public static Object A02(AnonymousClass3HX r4, C127397h3 r5) {
        float f;
        String A0m = C86114wI.A0m(r5.A04, 53);
        if (A0m != null) {
            try {
                f = AnonymousClass7Kk.A01(A0m);
            } catch (C29721zB e) {
                C30967GcS.A01(r4, "TextInputBinderUtils", "Error parsing text input size", e, 0);
            }
            return new C111326n9(r5.A0O(50, ""), f);
        }
        f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        return new C111326n9(r5.A0O(50, ""), f);
    }

    public static void A04(AnonymousClass3HX r0, C127397h3 r1, BloksEditText bloksEditText) {
        C111326n9 r12 = (C111326n9) AnonymousClass7K7.A03(r0, r1);
        r12.A0A = bloksEditText.onSaveInstanceState();
        bloksEditText.setEnabled(true);
        bloksEditText.setKeyListener(r12.A0M);
        bloksEditText.setText("");
        C121887Iq.A03(bloksEditText, r12, r12.A02);
        bloksEditText.setSingleLine(false);
        r12.A0H = false;
    }

    public static void A05(AnonymousClass3HX r4, C127397h3 r5, BloksEditText bloksEditText) {
        C111326n9 r52 = (C111326n9) AnonymousClass7K7.A03(r4, r5);
        r52.A0L = bloksEditText.getText();
        bloksEditText.removeTextChangedListener(r52.A0O);
        TextWatcher textWatcher = r52.A0D;
        if (textWatcher != null) {
            bloksEditText.removeTextChangedListener(textWatcher);
        }
        bloksEditText.setFocusable(true);
        bloksEditText.A00 = null;
        bloksEditText.setFilters(A00);
        bloksEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        bloksEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        bloksEditText.setGravity(8388659);
        bloksEditText.setTypeface(Typeface.DEFAULT);
        bloksEditText.setHint("");
        bloksEditText.setMaxLines(Integer.MAX_VALUE);
        bloksEditText.setImeOptions(r52.A01);
        bloksEditText.setTextColor(r52.A06);
        bloksEditText.setHintTextColor(r52.A05);
        bloksEditText.setBackground(r52.A08);
        if (Build.VERSION.SDK_INT >= 29) {
            C121887Iq.A02(bloksEditText, r52);
        }
        bloksEditText.setShowSoftInputOnFocus(true);
        bloksEditText.setOnKeyListener((View.OnKeyListener) null);
        bloksEditText.setTextSize(0, r52.A00);
        Rect rect = r52.A07;
        bloksEditText.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        r52.A0N = null;
        bloksEditText.setEllipsize(r52.A0B);
        bloksEditText.setShadowLayer(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, bloksEditText.A01);
        bloksEditText.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    }
}
