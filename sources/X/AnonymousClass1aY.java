package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1aY  reason: invalid class name */
public final class AnonymousClass1aY extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "DirectWelcomeMessageSettingFragment";
    public Activity A00;
    public Context A01;
    public Bundle A02;
    public View A03;
    public EditText A04;
    public TextView A05;
    public Toast A06;
    public C61083Rv A07;
    public AnonymousClass493 A08;
    public IgSwitch A09;
    public UserSession A0A;
    public String A0B = "business_setting";
    public boolean A0C;
    public final TextWatcher A0D = new IDxObjectShape282S0100000_1_I2(this, 8);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.setTitle(A05().getString(2131826101));
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 376);
    }

    public final String getModuleName() {
        return "direct_greeting_setting_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (r6.length() == 0) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r3 = 0
            r1 = r16
            X.C04220Ms.A0B(r1, r3)
            r0 = r17
            super.onViewCreated(r1, r0)
            r15.A01()
            java.lang.String r0 = r15.A0B
            java.lang.String r2 = "inbox_qp"
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            r1 = 1
            if (r0 == 0) goto L_0x0020
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r15.A08()
            r0.setChecked(r1)
        L_0x0020:
            X.493 r0 = r15.A07()
            java.lang.Boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = A00(r15)
            A04(r15, r0)
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r15.A08()
            r0.setChecked(r1)
        L_0x0036:
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r15.A08()
            boolean r0 = r0.isChecked()
            android.view.View r1 = r15.A03
            if (r1 == 0) goto L_0x00bd
            if (r0 != 0) goto L_0x00ab
            r0 = 8
            r1.setVisibility(r0)
        L_0x0049:
            X.3Rv r8 = r15.A07
            if (r8 == 0) goto L_0x00c0
            X.493 r0 = r15.A07()
            java.lang.Boolean r9 = r0.A03
            X.493 r0 = r15.A07()
            java.lang.String r6 = r0.A05
            X.493 r0 = r15.A07()
            java.lang.String r5 = r0.A04
            X.493 r0 = r15.A07()
            java.lang.String r1 = r0.A05
            X.493 r0 = r15.A07()
            java.lang.Boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00a2
            r4 = 1
        L_0x006e:
            java.lang.String r0 = r15.A0B
            boolean r3 = X.C04220Ms.A0I(r0, r2)
            X.29Z r7 = X.AnonymousClass29Z.WELCOME_MESSAGE_SETTINGS_SCREEN_IMPRESSION
            r2 = 0
            if (r6 == 0) goto L_0x0080
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            java.lang.Boolean r10 = X.C18240wQ.A0X(r0)
            if (r5 == 0) goto L_0x008d
            int r0 = r5.length()
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r2 = 1
        L_0x008e:
            java.lang.Boolean r11 = X.C18240wQ.A0X(r2)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            if (r3 == 0) goto L_0x009f
            java.lang.String r13 = "source_qp"
        L_0x009a:
            r14 = 0
            X.C61083Rv.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x009f:
            java.lang.String r13 = "source_business_options"
            goto L_0x009a
        L_0x00a2:
            java.lang.String r0 = A00(r15)
            boolean r4 = X.C04220Ms.A0I(r0, r1)
            goto L_0x006e
        L_0x00ab:
            r1.setVisibility(r3)
            android.widget.EditText r0 = r15.A06()
            r0.requestFocus()
            android.widget.EditText r0 = r15.A06()
            X.C09860go.A0K(r0)
            goto L_0x0049
        L_0x00bd:
            java.lang.String r0 = "messageSection"
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r0 = "directWelcomeMessageLogger"
        L_0x00c2:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1aY.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(AnonymousClass1aY r4) {
        String string;
        C04620Ok r1 = C06810aP.A01;
        UserSession userSession = r4.A0A;
        if (userSession != null) {
            User A012 = r1.A01(userSession);
            if (A012.A0g() == AnonymousClass266.A04) {
                string = AnonymousClass0wJ.A0l(r4.A05(), A012.Ak2(), 2131826096);
            } else {
                string = r4.A05().getString(2131826097);
            }
            C04220Ms.A06(string);
            return string;
        }
        C18210wN.A0m();
        throw null;
    }

    public static final void A03(AnonymousClass1aY r2) {
        if (!C04220Ms.A0I(r2.A0B, "inbox_qp")) {
            r2.A01();
        } else if (r2.A07().A03 != null) {
            A04(r2, r2.A07().A05);
        }
    }

    public final Context A05() {
        Context context = this.A01;
        if (context != null) {
            return context;
        }
        C04220Ms.A0E("viewContext");
        throw null;
    }

    public final EditText A06() {
        EditText editText = this.A04;
        if (editText != null) {
            return editText;
        }
        C04220Ms.A0E("messageItem");
        throw null;
    }

    public final AnonymousClass493 A07() {
        AnonymousClass493 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("directWelcomeMessageSettingManager");
        throw null;
    }

    public final IgSwitch A08() {
        IgSwitch igSwitch = this.A09;
        if (igSwitch != null) {
            return igSwitch;
        }
        C04220Ms.A0E("messageToggle");
        throw null;
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A0A;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    private final void A01() {
        A08().setChecked(C04220Ms.A0I(A07().A03, C18180wK.A0Y()));
        A04(this, A07().A05);
        if (A08().isChecked()) {
            View view = this.A03;
            if (view != null) {
                view.setVisibility(0);
            } else {
                C04220Ms.A0E("messageSection");
                throw null;
            }
        }
    }

    public static final void A02(AnonymousClass1aY r2) {
        r2.A07().A02 = null;
        Toast toast = r2.A06;
        if (toast != null) {
            toast.cancel();
        }
        r2.A06 = null;
        r2.A06().setEnabled(true);
        r2.A08().setEnabled(true);
    }

    public static void A04(AnonymousClass1aY r1, String str) {
        r1.A06().setText(str);
        r1.A06().setSelection(AnonymousClass0hA.A01(str));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-3092669);
        super.onCreate(bundle);
        this.A00 = requireActivity();
        this.A02 = requireArguments();
        this.A01 = requireContext();
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle bundle2 = this.A02;
        if (bundle2 != null) {
            UserSession A062 = r1.A06(bundle2);
            this.A0A = A062;
            AnonymousClass493 A002 = C35112Md.A00(this, A062);
            C04220Ms.A0B(A002, 0);
            this.A08 = A002;
            Bundle bundle3 = this.A02;
            if (bundle3 != null) {
                this.A0B = C18210wN.A0b(bundle3, "entry_point", "business_setting");
                UserSession userSession = this.A0A;
                if (userSession != null) {
                    this.A07 = new C61083Rv(this, userSession);
                    C14030oh.A09(1299708704, A022);
                    return;
                }
                str = "userSession";
                C04220Ms.A0E(str);
                throw null;
            }
        }
        str = "bundle";
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1021318755);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D2 = C18180wK.A0D(layoutInflater, viewGroup, R.layout.direct_welcome_message_setting, false);
        EditText editText = (EditText) AnonymousClass0wJ.A0I(A0D2, R.id.welcome_message_message_edit_input);
        C04220Ms.A0B(editText, 0);
        this.A04 = editText;
        IgSwitch igSwitch = (IgSwitch) AnonymousClass0wJ.A0I(A0D2, R.id.welcome_message_enable_toggle_switch);
        C04220Ms.A0B(igSwitch, 0);
        this.A09 = igSwitch;
        TextView textView = (TextView) AnonymousClass0wJ.A0I(A0D2, R.id.welcome_message_edit_title);
        C04220Ms.A0B(textView, 0);
        this.A05 = textView;
        this.A03 = AnonymousClass0wJ.A0I(A0D2, R.id.welcome_message_message_section);
        A06().addTextChangedListener(this.A0D);
        A06().setHint(A00(this));
        A08().A07 = new IDxTListenerShape295S0100000_1_I2(this, 14);
        C14030oh.A09(-1947931894, A022);
        return A0D2;
    }
}
