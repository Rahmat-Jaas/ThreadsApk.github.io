package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Calendar;

/* renamed from: X.1sf  reason: invalid class name and case insensitive filesystem */
public final class C27531sf extends C22461Ye implements C11630kW {
    public static final String __redex_internal_original_name = "EnterAgeFragment";
    public EditText A00;
    public TextView A01;
    public NotificationBar A02;
    public ProgressButton A03;
    public TextView A04;
    public TextView A05;
    public final TextWatcher A06 = new IDxWAdapterShape193S0100000_1_I2(this, 10);
    public final Runnable A07 = new AnonymousClass4PW(this);

    public final String getModuleName() {
        return "enter_age";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(367901935);
        AnonymousClass3YT.A00.A01(this.A01, this.A02, "add_age");
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A0E = C18190wL.A0E(A0H);
        this.A02 = C18240wQ.A0U(A0H);
        layoutInflater.inflate(R.layout.nux_enter_age_fragment, A0E, true);
        TextView A0G = C18180wK.A0G(A0H, R.id.field_detail);
        this.A05 = A0G;
        if (A0G != null) {
            A0G.setText(AnonymousClass0wJ.A0o(this, DateUtils.formatDateTime(getRootActivity(), Calendar.getInstance().getTimeInMillis(), 24), 2131826841));
        }
        EditText editText = (EditText) A0H.findViewById(R.id.entered_age);
        this.A00 = editText;
        if (editText != null) {
            editText.addTextChangedListener(this.A06);
        }
        this.A01 = C18180wK.A0G(A0H, R.id.error);
        TextView A0G2 = C18180wK.A0G(A0H, R.id.add_birthday_link);
        this.A04 = A0G2;
        if (A0G2 != null) {
            AnonymousClass0wJ.A16(A0G2, 606, this);
        }
        ProgressButton A0c = C18230wP.A0c(A0H);
        this.A03 = A0c;
        if (A0c != null) {
            AnonymousClass0wJ.A16(A0c, 607, this);
        }
        C14030oh.A09(-523766988, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1374654636);
        super.onDestroyView();
        EditText editText = this.A00;
        if (editText != null) {
            editText.removeCallbacks(this.A07);
        }
        this.A03 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        C14030oh.A09(1245554873, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1555630562);
        super.onResume();
        EditText editText = this.A00;
        if (editText != null) {
            editText.postDelayed(this.A07, 200);
        }
        C14030oh.A09(-1359973329, A022);
    }
}
