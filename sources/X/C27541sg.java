package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape870S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.1sg  reason: invalid class name and case insensitive filesystem */
public final class C27541sg extends C22461Ye implements C11630kW, C82424pb {
    public static final String __redex_internal_original_name = "AddBirthdayFragment";
    public int A00;
    public int A01;
    public int A02;
    public DatePicker A03;
    public TextView A04;
    public NotificationBar A05;
    public ProgressButton A06;
    public boolean A07 = false;
    public TextView A08;
    public TextView A09;
    public final DatePicker.OnDateChangedListener A0A = new IDxCListenerShape870S0100000_1_I2(this, 0);
    public final C63873iU A0B = C63873iU.A06(this, 105);

    public static void A00(C27541sg r4) {
        C63313hF.A04(r4.A01, r4.A02, AnonymousClass265.A0e, "birthday_add_age_instead_tapped");
        C25786Drz A002 = C63463hW.A00(r4.requireActivity(), r4.A01);
        RegFlowExtras regFlowExtras = r4.A00;
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
        C18180wK.A0x(A062, new C27531sf(), A002);
    }

    public static void A01(C27541sg r6) {
        String A0o;
        int A002 = AnonymousClass3Zk.A00(r6.A02, r6.A01, r6.A00);
        TextView textView = r6.A09;
        if (textView != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(r6.A02, r6.A01, r6.A00);
            textView.setText(DateFormat.getDateInstance(1, C31103Gfm.A02()).format(instance.getTime()));
            r6.A09.setHint((CharSequence) null);
        }
        TextView textView2 = r6.A08;
        if (textView2 != null) {
            textView2.setVisibility(0);
            TextView textView3 = r6.A08;
            if (A002 == 1) {
                A0o = r6.getString(2131821025);
            } else {
                A0o = AnonymousClass0wJ.A0o(r6, Integer.valueOf(A002), 2131821022);
            }
            textView3.setText(A0o);
            int i = R.color.igds_secondary_text;
            if (A002 <= 4) {
                i = R.color.igds_error_or_destructive;
            }
            C18180wK.A0s(r6.getRootActivity(), r6.A08, i);
        }
        C15730rn A003 = C15730rn.A00(r6, "dob_picker_scrolled");
        Calendar instance2 = Calendar.getInstance();
        instance2.set(r6.A02, r6.A01, r6.A00);
        A003.A0D("to_date", new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(instance2.getTime()));
        C18180wK.A1K(A003, r6.A01);
    }

    public final String getModuleName() {
        return "add_birthday";
    }

    public final boolean onBackPressed() {
        C07530bf r3 = this.A01;
        C313625r r1 = this.A02;
        AnonymousClass0wJ.A1N(r3, "enter_birthday");
        C62223Xv.A00(r3, r1, (Boolean) null, (Integer) null, "enter_birthday");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1274438222);
        super.onCreate(bundle);
        Calendar instance = Calendar.getInstance();
        this.A02 = instance.get(1) - 1;
        this.A01 = instance.get(2);
        this.A00 = C18240wQ.A07(instance);
        C14030oh.A09(-130713762, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(519179889);
        AnonymousClass3YT.A00.A01(this.A01, this.A02, "enter_birthday");
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A0J = C18220wO.A0J(A0H, R.id.content_container);
        this.A05 = (NotificationBar) A0H.requireViewById(R.id.notification_bar);
        layoutInflater.inflate(R.layout.nux_add_birthday_fragment, A0J, true);
        this.A08 = AnonymousClass0wJ.A0L(A0H, R.id.calculated_age);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.date_of_birth);
        this.A09 = A0L;
        if (A0L != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(this.A02, this.A01, this.A00);
            A0L.setHint(DateFormat.getDateInstance(1, C31103Gfm.A02()).format(instance.getTime()));
        }
        TextView A0L2 = AnonymousClass0wJ.A0L(A0H, R.id.add_age_link);
        this.A04 = A0L2;
        if (A0L2 != null) {
            AnonymousClass0wJ.A16(A0L2, 579, this);
        }
        ProgressButton A0O = C18210wN.A0O(A0H);
        this.A06 = A0O;
        AnonymousClass0wJ.A16(A0O, 580, this);
        DatePicker datePicker = (DatePicker) A0H.requireViewById(R.id.birthday_date_picker);
        this.A03 = datePicker;
        datePicker.init(this.A02, this.A01, this.A00, this.A0A);
        this.A03.setMaxDate(Calendar.getInstance().getTimeInMillis());
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, -150);
        this.A03.setMinDate(instance2.getTimeInMillis());
        if (Calendar.getInstance().get(1) - this.A02 != 1) {
            A01(this);
        }
        View requireViewById = A0H.requireViewById(R.id.field_detail_link);
        C18210wN.A0y(requireViewById);
        AnonymousClass0wJ.A16(requireViewById, 581, this);
        C14030oh.A09(-500045565, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-95512604);
        super.onDestroyView();
        this.A03 = null;
        this.A09 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        C14030oh.A09(-433202099, A022);
    }
}
