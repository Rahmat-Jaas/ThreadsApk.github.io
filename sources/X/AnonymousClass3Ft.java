package X;

import android.text.TextWatcher;
import android.widget.EditText;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxObjectShape170S0200000_1_I2;
import java.util.Locale;

/* renamed from: X.3Ft  reason: invalid class name */
public final class AnonymousClass3Ft {
    public TextWatcher A00;
    public EditText A01;
    public C07530bf A02;
    public Integer A03;
    public boolean A04 = false;

    public final void A00(AnonymousClass4tS r10, Integer num) {
        String str;
        String str2;
        String str3;
        EditText editText = this.A01;
        if (editText != null && this.A04) {
            C13330nS A022 = C13330nS.A02(this.A02);
            double A002 = C18200wM.A00();
            String str4 = "";
            if (r10.Aiy() != null) {
                str = r10.Aiy().A00;
            } else {
                str = str4;
            }
            String A0g = C18200wM.A0g();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "reg_field_interacted"), 2612);
            C18180wK.A1B(A0I, A002);
            AnonymousClass0wJ.A1A(A0I, A002, AnonymousClass269.A00());
            switch (this.A03.intValue()) {
                case 0:
                    str2 = "PHONE_FIELD";
                    break;
                case 1:
                    str2 = "EMAIL_FIELD";
                    break;
                case 2:
                    str2 = "FULLNAME_FIELD";
                    break;
                case 3:
                    str2 = "PASSWORD_FIELD";
                    break;
                default:
                    str2 = "USERNAME_FIELD";
                    break;
            }
            Locale locale = Locale.US;
            if (C18240wQ.A05(A0I, num, "field_name", str2.toLowerCase(locale)) != 0) {
                str3 = "TAPPED";
            } else {
                str3 = "STARTED_TYPING";
            }
            A0I.A0T("interaction_type", str3.toLowerCase(locale));
            C18180wK.A19(A0I);
            C18180wK.A1A(A0I, AnonymousClass269.A00());
            AnonymousClass269.A08(A0I, r10.BDt().A01);
            C18210wN.A19(A0I, str);
            if (A0g != null) {
                str4 = A0g;
            }
            A0I.A0T("guid", str4);
            A0I.Bb4();
            this.A04 = false;
            editText.post(new C72634Pc(this));
        }
    }

    public AnonymousClass3Ft(EditText editText, AnonymousClass4tS r4, C07530bf r5, Integer num) {
        this.A02 = r5;
        this.A03 = num;
        this.A01 = editText;
        IDxObjectShape170S0200000_1_I2 iDxObjectShape170S0200000_1_I2 = new IDxObjectShape170S0200000_1_I2(6, this, r4);
        this.A00 = iDxObjectShape170S0200000_1_I2;
        editText.addTextChangedListener(iDxObjectShape170S0200000_1_I2);
        this.A01.setOnTouchListener(new C65583tp(this, r4));
    }
}
