package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1av  reason: invalid class name */
public final class AnonymousClass1av extends C34640IcN implements C11630kW, C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public CheckBox A00;
    public EditText A01;
    public UserSession A02;
    public ProgressButton A03;
    public int A04;
    public int A05;
    public AnonymousClass3CP A06;
    public final TextWatcher A07 = new IDxObjectShape282S0100000_1_I2(this, 12);
    public volatile boolean A08;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.CtT(true);
        AnonymousClass4u2.A06(r3);
        r3.setTitle(requireActivity().getString(2131824557));
    }

    public final String getModuleName() {
        return "create_password";
    }

    public static void A00(AnonymousClass1av r3) {
        boolean z = true;
        r3.A01.setEnabled(!r3.A08);
        r3.A03.setShowProgressBar(r3.A08);
        boolean isEmpty = TextUtils.isEmpty(C18180wK.A0f(r3.A01));
        ProgressButton progressButton = r3.A03;
        if (isEmpty) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        return this.A08;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1513898534);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(833851426, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(62035656);
        this.A05 = C18180wK.A0F(this).getAttributes().softInputMode;
        C18180wK.A15(this);
        this.A04 = requireActivity().getResources().getDimensionPixelOffset(C121907Is.A02(requireActivity(), R.attr.tabBarHeight));
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_create_password, viewGroup, false);
        IgImageView A0M = C18250wR.A0M(inflate, R.id.user_avatar_image_view);
        UserSession userSession = this.A02;
        C04620Ok r8 = C06810aP.A01;
        C18220wO.A1L(this, A0M, r8.A01(userSession));
        AnonymousClass0wJ.A0L(inflate, R.id.username_text_view).setText(C18200wM.A0k(this.A02, r8));
        C18200wM.A19(requireActivity().getResources(), AnonymousClass0wJ.A0L(inflate, R.id.subtitle_textview), C18200wM.A0k(this.A02, r8), 2131824559);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A03 = progressButton;
        AnonymousClass0wJ.A16(progressButton, 499, this);
        EditText editText = (EditText) inflate.requireViewById(R.id.password_edittext);
        this.A01 = editText;
        editText.setTypeface(Typeface.DEFAULT);
        C18240wQ.A0z(this.A01);
        this.A01.setImeOptions(6);
        this.A01.setInputType(524416);
        C18210wN.A12(this.A01, this, 3);
        CheckBox checkBox = (CheckBox) inflate.requireViewById(R.id.remember_password_checkbox);
        this.A00 = checkBox;
        if (C63533hk.A02(this.A02).A0I(this.A02.getUserId())) {
            i = 8;
        }
        checkBox.setVisibility(i);
        this.A00.setChecked(true);
        this.A06 = new AnonymousClass3CP(this.A03, (ScrollView) inflate.findViewById(R.id.scroll_view), this.A04);
        C14030oh.A09(1670654861, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(212791645);
        super.onDestroyView();
        C18180wK.A0F(this).setSoftInputMode(this.A05);
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
        C14030oh.A09(73182095, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-2028163371);
        super.onPause();
        this.A01.removeTextChangedListener(this.A07);
        C18180wK.A0F(this).setSoftInputMode(this.A05);
        C14030oh.A09(1324876479, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(540239747);
        super.onResume();
        this.A01.addTextChangedListener(this.A07);
        C18180wK.A15(this);
        C14030oh.A09(-1387275431, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(249118226);
        super.onStart();
        AnonymousClass3CP r0 = this.A06;
        if (r0 != null) {
            r0.A00.CLs(getActivity());
        }
        C14030oh.A09(-1565163683, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(230082091);
        super.onStop();
        AnonymousClass3CP r0 = this.A06;
        if (r0 != null) {
            r0.A00.onStop();
        }
        C14030oh.A09(609858429, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
