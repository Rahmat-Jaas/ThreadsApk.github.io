package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape261S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1Yo  reason: invalid class name and case insensitive filesystem */
public final class C22561Yo extends C34640IcN {
    public static final String __redex_internal_original_name = "TwoFacContactFormFragment";
    public CheckBox A00;
    public EditText A01;
    public RadioGroup A02;
    public RadioGroup A03;
    public C07530bf A04;
    public ProgressButton A05;
    public SearchEditText A06;
    public SearchEditText A07;
    public final TextWatcher A08 = new IDxObjectShape282S0100000_1_I2(this, 13);
    public final C63873iU A09 = C63873iU.A06(this, 74);

    public final String getModuleName() {
        return "two_fac_contact_form";
    }

    public static String A00(C22561Yo r1) {
        Integer num;
        int checkedRadioButtonId = r1.A02.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.account_type_company) {
            num = AnonymousClass006.A00;
        } else if (checkedRadioButtonId == R.id.account_type_personal_with_photo) {
            num = AnonymousClass006.A01;
        } else if (checkedRadioButtonId != R.id.account_type_personal_without_photo) {
            return "";
        } else {
            num = AnonymousClass006.A0C;
        }
        switch (num.intValue()) {
            case 0:
                return "COMPANY";
            case 1:
                return "PERSONAL_WITH_PHOTO";
            default:
                return "PERSONAL_WITHOUT_PHOTO";
        }
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-658856937);
        super.onCreate(bundle);
        C07530bf A042 = AnonymousClass0RA.A0C.A04(this.mArguments);
        this.A04 = A042;
        AnonymousClass3YT.A00.A02(A042, "request_support_impression");
        C14030oh.A09(708410926, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1060891684);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.two_fac_contact_form, C18190wL.A0E(A0H), true);
        AnonymousClass0wJ.A0L(A0H, R.id.field_title).setText(2131837056);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.field_detail);
        C313225m r1 = C313225m.values()[this.mArguments.getInt("flow_key")];
        C313225m r5 = C313225m.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW;
        int i = 2131830177;
        if (r1 == r5) {
            i = 2131837055;
        }
        A0L.setText(i);
        SearchEditText searchEditText = (SearchEditText) A0H.requireViewById(R.id.signup_email_edittext);
        this.A07 = searchEditText;
        searchEditText.setHint(2131837052);
        C63163fI.A05(this.A07);
        SearchEditText searchEditText2 = (SearchEditText) A0H.requireViewById(R.id.contact_email_edittext);
        this.A06 = searchEditText2;
        searchEditText2.setHint(2131837051);
        C63163fI.A05(this.A06);
        SearchEditText searchEditText3 = this.A07;
        TextWatcher textWatcher = this.A08;
        searchEditText3.addTextChangedListener(textWatcher);
        this.A06.addTextChangedListener(textWatcher);
        EditText editText = (EditText) A0H.requireViewById(R.id.additional_details_edittext);
        this.A01 = editText;
        editText.setHint(2131837050);
        this.A01.setOnTouchListener(new IDxTListenerShape261S0100000_1_I2(this, 1));
        ProgressButton A0O = C18210wN.A0O(A0H);
        this.A05 = A0O;
        A0O.setText(2131837056);
        this.A05.setEnabled(false);
        AnonymousClass0wJ.A16(this.A05, 510, this);
        this.A02 = (RadioGroup) A0H.findViewById(R.id.account_type_radiogroup);
        TextView A0L2 = AnonymousClass0wJ.A0L(A0H, R.id.log_in_button);
        C18200wM.A18(AnonymousClass0wJ.A0B(this), A0L2, 2131837085);
        AnonymousClass0wJ.A16(A0L2, 511, this);
        AnonymousClass3X6.A00(A0L2);
        this.A03 = (RadioGroup) A0H.requireViewById(R.id.failed_reason_radiogroup);
        C313225m r2 = C313225m.values()[this.mArguments.getInt("flow_key")];
        RadioGroup radioGroup = this.A03;
        int i2 = 0;
        if (r2 == r5) {
            i2 = 8;
        }
        radioGroup.setVisibility(i2);
        CheckBox checkBox = (CheckBox) A0H.requireViewById(R.id.same_email_chbox);
        this.A00 = checkBox;
        checkBox.setOnCheckedChangeListener(new IDxCListenerShape267S0100000_1_I2((Object) this, 27));
        C14030oh.A09(-1554092179, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(245706080);
        super.onPause();
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(383453669, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(820693324);
        super.onResume();
        C18180wK.A15(this);
        C14030oh.A09(1166372088, A022);
    }
}
