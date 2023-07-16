package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.barcelona.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7Dp  reason: invalid class name and case insensitive filesystem */
public final class C121007Dp {
    public String A00;
    public final IgFormField A01;
    public final IgFormField A02;
    public final IgFormField A03;
    public final IgFormField A04;
    public final IgFormField A05;
    public final IgFormField A06;
    public final IgFormField A07;
    public final IgFormField A08;
    public final IgFormField A09;

    public static void A01(IgFormField igFormField, String str, Map map) {
        String trim = igFormField.A00.getText().toString().trim();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(trim)) {
            map.put(str, trim);
        }
    }

    public C121007Dp(Context context, View view) {
        this.A07 = (IgFormField) view.requireViewById(R.id.given_name);
        this.A06 = (IgFormField) view.requireViewById(R.id.family_name);
        this.A03 = (IgFormField) view.requireViewById(R.id.address_line_1);
        this.A04 = (IgFormField) view.requireViewById(R.id.address_line_2);
        this.A01 = (IgFormField) view.requireViewById(R.id.address_level_1);
        this.A02 = (IgFormField) view.requireViewById(R.id.address_level_2);
        this.A08 = (IgFormField) view.requireViewById(R.id.postal_code);
        this.A05 = (IgFormField) view.requireViewById(R.id.email);
        this.A09 = (IgFormField) view.requireViewById(R.id.tel);
        IgFormField igFormField = this.A05;
        igFormField.setRuleChecker(new AnonymousClass4Cw(context));
        this.A07.setInputType(8288);
        this.A06.setInputType(8288);
        for (IgFormField inputType : Arrays.asList(new IgFormField[]{this.A03, this.A04, this.A01, this.A02})) {
            inputType.setInputType(8304);
        }
        this.A08.setInputType(112);
        igFormField.setInputType(33);
        this.A09.setInputType(3);
    }

    public static AutofillData A00(C121007Dp r3) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String str = r3.A00;
        if (str != null) {
            A0y.put("id", str);
        }
        A01(r3.A07, "given-name", A0y);
        A01(r3.A06, "family-name", A0y);
        A01(r3.A03, "address-line1", A0y);
        A01(r3.A04, "address-line2", A0y);
        A01(r3.A01, "address-level1", A0y);
        A01(r3.A02, "address-level2", A0y);
        A01(r3.A08, "postal-code", A0y);
        A01(r3.A05, "email", A0y);
        A01(r3.A09, "tel", A0y);
        return new AutofillData((Map) A0y);
    }
}
