package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1qD  reason: invalid class name and case insensitive filesystem */
public final class C26201qD extends C23161cb {
    public static final String __redex_internal_original_name = "ManageDataSettingsFragment";
    public AnonymousClass3HL A00;
    public C24651jm A01;
    public boolean A02;
    public final View.OnClickListener A03 = C18190wL.A0H(this, 451);
    public final C82394pY A04 = C18220wO.A0P(this, 37);

    public final String getModuleName() {
        return "manage_data_settings";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1030563880);
        super.onCreate(bundle);
        this.A00 = AnonymousClass3VH.A00().A00.A07;
        this.A02 = true;
        C14030oh.A09(1790002474, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2119326409);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.manage_data_settings_review_layout);
        TextView A0L = AnonymousClass0wJ.A0L(A0H, R.id.content_title);
        ViewGroup A0J = C18220wO.A0J(A0H, R.id.paragraphs_container);
        View requireViewById = A0H.requireViewById(R.id.manage_data_settings_button);
        ProgressButton progressButton = (ProgressButton) A0H.findViewById(R.id.accept_button);
        AnonymousClass3HL r0 = this.A00;
        if (r0 != null) {
            A0L.setText(r0.A01);
            AnonymousClass2PC.A00(getContext(), A0J, this.A00.A03);
            requireViewById.setOnClickListener(this.A03);
            C24651jm r02 = new C24651jm(this, progressButton, AnonymousClass3VH.A00().A08);
            this.A01 = r02;
            registerLifecycleListener(r02);
            C38040KHr.A01.A03(this.A04, AnonymousClass45F.class);
        }
        C14030oh.A09(1836752628, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1326448076);
        super.onDestroy();
        if (this.A00 != null) {
            unregisterLifecycleListener(this.A01);
            C38040KHr.A01.A04(this.A04, AnonymousClass45F.class);
        }
        C14030oh.A09(1442027818, A022);
    }
}
