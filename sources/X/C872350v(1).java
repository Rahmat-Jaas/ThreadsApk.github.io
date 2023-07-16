package X;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.List;

/* renamed from: X.50v  reason: invalid class name and case insensitive filesystem */
public final class C872350v extends ViewStructure {
    public int A00 = -1;
    public int A01;
    public ViewStructure.HtmlInfo A02;
    public AutofillValue A03;
    public CharSequence A04;
    public String A05;
    public CharSequence[] A06;
    public String[] A07;
    public final List A08 = AnonymousClass0wJ.A0v();

    public final int addChildCount(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C872350v r1 = new C872350v();
            r1.A05 = this.A05;
            this.A08.add(r1);
        }
        return this.A08.size();
    }

    public final void asyncCommit() {
    }

    public final AutofillId getAutofillId() {
        return null;
    }

    public final Bundle getExtras() {
        return null;
    }

    public final CharSequence getText() {
        return null;
    }

    public final int getTextSelectionEnd() {
        return 0;
    }

    public final int getTextSelectionStart() {
        return 0;
    }

    public final boolean hasExtras() {
        return false;
    }

    public final void setAccessibilityFocused(boolean z) {
    }

    public final void setActivated(boolean z) {
    }

    public final void setAlpha(float f) {
    }

    public final void setAutofillId(AutofillId autofillId) {
    }

    public final void setCheckable(boolean z) {
    }

    public final void setChecked(boolean z) {
    }

    public final void setChildCount(int i) {
    }

    public final void setClassName(String str) {
    }

    public final void setClickable(boolean z) {
    }

    public final void setContentDescription(CharSequence charSequence) {
    }

    public final void setContextClickable(boolean z) {
    }

    public final void setDataIsSensitive(boolean z) {
    }

    public final void setElevation(float f) {
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocusable(boolean z) {
    }

    public final void setFocused(boolean z) {
    }

    public final void setId(int i, String str, String str2, String str3) {
    }

    public final void setInputType(int i) {
    }

    public final void setLocaleList(LocaleList localeList) {
    }

    public final void setLongClickable(boolean z) {
    }

    public final void setOpaque(boolean z) {
    }

    public final void setSelected(boolean z) {
    }

    public final void setText(CharSequence charSequence) {
    }

    public final void setText(CharSequence charSequence, int i, int i2) {
    }

    public final void setTextLines(int[] iArr, int[] iArr2) {
    }

    public final void setTextStyle(float f, int i, int i2, int i3) {
    }

    public final void setTransformation(Matrix matrix) {
    }

    public final void setVisibility(int i) {
    }

    public final ViewStructure asyncNewChild(int i) {
        C872350v r1 = new C872350v();
        r1.A05 = this.A05;
        return r1;
    }

    public final int getChildCount() {
        return this.A08.size();
    }

    public final CharSequence getHint() {
        return this.A04;
    }

    public final ViewStructure newChild(int i) {
        C872350v r1 = new C872350v();
        r1.A05 = this.A05;
        this.A08.add(i, r1);
        return r1;
    }

    public final ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(String str) {
        return new C872250t();
    }

    public final void setAutofillId(AutofillId autofillId, int i) {
        this.A01 = i;
    }

    public final void setAutofillHints(String[] strArr) {
        this.A07 = strArr;
    }

    public final void setAutofillOptions(CharSequence[] charSequenceArr) {
        this.A06 = charSequenceArr;
    }

    public final void setAutofillType(int i) {
        this.A00 = i;
    }

    public final void setAutofillValue(AutofillValue autofillValue) {
        this.A03 = autofillValue;
    }

    public final void setHint(CharSequence charSequence) {
        this.A04 = charSequence;
    }

    public final void setHtmlInfo(ViewStructure.HtmlInfo htmlInfo) {
        this.A02 = htmlInfo;
    }

    public final void setWebDomain(String str) {
        this.A05 = str;
    }

    public final void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
    }
}
