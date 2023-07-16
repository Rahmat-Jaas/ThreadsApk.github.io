package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;

/* renamed from: X.7QE  reason: invalid class name */
public final class AnonymousClass7QE implements TextWatcher {
    public int A00;
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C110436lg A05;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        C110436lg r2;
        EditText editText;
        int i;
        if (!this.A04 && editable.length() > 0 && (editText = r2.A03) != null) {
            this.A04 = true;
            if (this.A03) {
                int selectionStart = editText.getSelectionStart();
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i2 = selectionStart - 1;
                    if (Character.isDigit(editable.charAt(i2))) {
                        editable.delete(i2, selectionStart);
                        break;
                    } else {
                        editable.delete(i2, selectionStart);
                        selectionStart = i2;
                    }
                }
            }
            if ((r2 = this.A05).A03 != null) {
                String replaceAll = editable.toString().replaceAll("\\D", "");
                while (true) {
                    i = 1;
                    if (replaceAll.charAt(0) != '0' || replaceAll.length() <= 1) {
                        Number number = 0;
                    } else {
                        replaceAll = replaceAll.substring(1);
                    }
                }
                Number number2 = 0;
                if (!TextUtils.isEmpty(replaceAll)) {
                    number2 = Double.valueOf(Double.parseDouble(replaceAll));
                }
                if (number2.doubleValue() >= 1.0E17d) {
                    r2.A03.setSelection(0);
                    r2.A03.setText(this.A01);
                    r2.A03.setSelection(this.A01.length() - this.A00);
                } else if (number2.doubleValue() >= 0.0d) {
                    NumberFormat numberFormat = r2.A04;
                    if (numberFormat == null) {
                        numberFormat = AnonymousClass6OB.A00(C86114wI.A0B(r2.A03.getContext()).locale);
                        r2.A04 = numberFormat;
                    }
                    String format = numberFormat.format(number2);
                    r2.A03.setSelection(0);
                    r2.A03.setText(format);
                    if (number2.doubleValue() != 0.0d) {
                        boolean z = this.A02;
                        int A012 = AnonymousClass0hA.A01(format);
                        if (z) {
                            int i3 = A012 - 1;
                            while (true) {
                                if (i3 < 0) {
                                    i = 0;
                                    break;
                                } else if (Character.isDigit(format.charAt(i3))) {
                                    i = i3 + 1;
                                    break;
                                } else {
                                    i3--;
                                }
                            }
                        } else {
                            i = A012 - this.A00;
                        }
                    }
                    EditText editText2 = r2.A03;
                    editText2.setSelection(Math.min(Math.max(i, 0), editText2.getText().length()));
                    r2.A01 = r2.A03.getSelectionStart();
                    r2.A00 = r2.A03.getSelectionEnd();
                } else {
                    editable.clear();
                    r2.A01 = 0;
                    r2.A00 = 0;
                }
            }
            this.A04 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (java.lang.Character.isDigit(r4.charAt(r5)) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = r4.toString()
            r3.A01 = r0
            int r1 = r4.length()
            int r1 = r1 - r5
            r2 = 0
            r0 = 0
            if (r7 != 0) goto L_0x0014
            r0 = r6
        L_0x0014:
            int r1 = r1 - r0
            r3.A00 = r1
            if (r7 >= r6) goto L_0x0024
            char r0 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isDigit(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r3.A03 = r0
            int r0 = r4.length()
            if (r0 != 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            r3.A02 = r2
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QE.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public AnonymousClass7QE(AnonymousClass3HX r3, C127397h3 r4) {
        Object A042 = AnonymousClass7K7.A04(r3, r4);
        AnonymousClass7Ko.A07(A042, "Extension mapper missing for 13713");
        this.A05 = (C110436lg) A042;
    }
}
