package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.redex.IDxAListenerShape258S0200000_1_I2;
import com.facebook.redex.IDxLListenerShape381S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1bD  reason: invalid class name */
public final class AnonymousClass1bD extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ProfileInputFragment";
    public EditText A00;
    public int A01;
    public C10300i6 A02;
    public final C58813Hj A03 = new C58813Hj();

    public final String getModuleName() {
        return "profile_input_fragment";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        Bundle bundle = this.mArguments;
        if (bundle == null) {
            return false;
        }
        C58813Hj r1 = this.A03;
        if (!r1.A02(bundle)) {
            return false;
        }
        r1.A00(bundle, AnonymousClass0wJ.A0n(this.A00));
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1727545602);
        super.onCreate(bundle);
        this.A02 = C18190wL.A0S(requireArguments());
        Window A0F = C18190wL.A0F(this);
        A0F.getClass();
        this.A01 = A0F.getAttributes().softInputMode | 240;
        C14030oh.A09(1169973525, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-489795676);
        Bundle requireArguments = requireArguments();
        View inflate = layoutInflater.inflate(R.layout.layout_configurable_input_wizard_step, viewGroup, false);
        AnonymousClass0wJ.A0L(inflate, R.id.step_title).setText(requireArguments.getInt("EXTRA_TITLE_STRING_RES_ID"));
        AnonymousClass0wJ.A0L(inflate, R.id.step_subtitle).setText(requireArguments.getInt("EXTRA_SUBTITLE_STRING_RES_ID"));
        EditText editText = (EditText) inflate.requireViewById(R.id.input_field);
        this.A00 = editText;
        C18250wR.A0q(requireArguments, editText, "EXTRA_CONTENT");
        this.A00.setHint(requireArguments.getInt("EXTRA_HINT_STRING_RES_ID"));
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape381S0100000_1_I2(this, 2));
        int i = requireArguments.getInt("EXTRA_INPUT_IME_ACTION", -1);
        if (i != -1) {
            this.A00.setImeOptions(i);
        }
        int i2 = requireArguments.getInt("EXTRA_INPUT_MAX_LINES", 1);
        if (i2 > 1) {
            this.A00.setSingleLine(false);
            this.A00.setImeOptions(1073741824);
            this.A00.setInputType(655361);
            this.A00.setMaxLines(i2);
            this.A00.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        int i3 = requireArguments.getInt("EXTRA_INPUT_MAX_CHARACTERS", -1);
        if (i3 > 0) {
            this.A00.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
        }
        this.A00.setOnEditorActionListener(new IDxAListenerShape258S0200000_1_I2(1, requireArguments, this));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.progress_button);
        progressButton.setText(requireArguments.getInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID"));
        AnonymousClass0wJ.A18(progressButton, 159, requireArguments, this);
        C14030oh.A09(249663314, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(426063504);
        super.onPause();
        Window A0F = C18190wL.A0F(this);
        A0F.getClass();
        A0F.setSoftInputMode(this.A01);
        InputMethodManager inputMethodManager = (InputMethodManager) getRootActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            C18230wP.A14(this.A00, inputMethodManager);
        }
        C14030oh.A09(43996054, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(474407593);
        super.onResume();
        Window A0F = C18190wL.A0F(this);
        A0F.getClass();
        A0F.setSoftInputMode(16);
        C14030oh.A09(-908014243, A022);
    }
}
