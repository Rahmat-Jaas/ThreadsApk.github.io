package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape870S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.1Zx  reason: invalid class name and case insensitive filesystem */
public final class C22801Zx extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ActivityCenterDatePickerFragment";
    public GregorianCalendar A00;
    public TextView A01;
    public UserSession A02;
    public String A03;
    public final DateFormat A04 = DateFormat.getDateInstance(1, C31103Gfm.A02());
    public final Calendar A05 = Calendar.getInstance();

    public final String getModuleName() {
        return "select_date";
    }

    public static void A00(C22801Zx r4) {
        r4.A01.setText(r4.A04.format(Long.valueOf(r4.A00.getTimeInMillis())));
        C18180wK.A0s(r4.requireContext(), r4.A01, R.color.igds_primary_text);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.Crl(C18190wL.A0L(C18190wL.A0K(), this, 358));
        r5.Crr(new C25348Dk8(C18210wN.A0H(this, 359), this.A03, 0));
    }

    public final void onCreate(Bundle bundle) {
        Resources A0B;
        int i;
        int A022 = C14030oh.A02(1310106775);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_TITLE");
        if (string != null) {
            if (string.equals("start_title")) {
                A0B = AnonymousClass0wJ.A0B(this);
                i = 2131836102;
            } else if (string.equals("end_title")) {
                A0B = AnonymousClass0wJ.A0B(this);
                i = 2131826831;
            }
            this.A03 = A0B.getString(i);
            int i2 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            this.A00 = gregorianCalendar;
            gregorianCalendar.setTimeInMillis(C18220wO.A09(i2));
            C14030oh.A09(-1290924667, A022);
        }
        A0B = AnonymousClass0wJ.A0B(this);
        i = 2131835420;
        this.A03 = A0B.getString(i);
        int i22 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        this.A00 = gregorianCalendar2;
        gregorianCalendar2.setTimeInMillis(C18220wO.A09(i22));
        C14030oh.A09(-1290924667, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(722879113);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_select_date);
        this.A01 = AnonymousClass0wJ.A0L(A0H, R.id.select_date_text_view);
        A00(this);
        DatePicker datePicker = (DatePicker) A0H.requireViewById(R.id.select_date_picker);
        datePicker.setMaxDate(this.A05.getTimeInMillis());
        datePicker.init(this.A00.get(1), this.A00.get(2), C18240wQ.A07(this.A00), new IDxCListenerShape870S0100000_1_I2(this, 1));
        C14030oh.A09(1864753333, A022);
        return A0H;
    }
}
