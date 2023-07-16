package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.instagram.barcelona.R;

/* renamed from: X.3CM  reason: invalid class name */
public final class AnonymousClass3CM {
    public ArrayAdapter A00;
    public final AutoCompleteTextView A01;
    public final C18900y5 A02;
    public final C82734qB A03;
    public final AnonymousClass265 A04;

    public AnonymousClass3CM(Context context, AutoCompleteTextView autoCompleteTextView, C11630kW r11, C10300i6 r12, AnonymousClass35S r13, C82734qB r14, AnonymousClass265 r15, int i, boolean z) {
        this.A01 = autoCompleteTextView;
        autoCompleteTextView.setDropDownHorizontalOffset(context.getResources().getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset));
        autoCompleteTextView.setDropDownBackgroundDrawable(context.getDrawable(C121907Is.A02(context, R.attr.menuPanelBackground)));
        this.A02 = new C18900y5(context, r11, r12, r13, i, z);
        this.A03 = r14;
        this.A04 = r15;
    }
}
