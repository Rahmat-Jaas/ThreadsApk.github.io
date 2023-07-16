package X;

import android.view.View;
import androidx.recyclerview.widget.IDxAdapterShape3S0300000_1_I2;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.3r8  reason: invalid class name and case insensitive filesystem */
public final class C64593r8 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IDxAdapterShape3S0300000_1_I2 A01;
    public final /* synthetic */ String A02;

    public C64593r8(IDxAdapterShape3S0300000_1_I2 iDxAdapterShape3S0300000_1_I2, String str, int i) {
        this.A01 = iDxAdapterShape3S0300000_1_I2;
        this.A02 = str;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-733739434);
        IDxAdapterShape3S0300000_1_I2 iDxAdapterShape3S0300000_1_I2 = this.A01;
        C57513Bi r1 = (C57513Bi) iDxAdapterShape3S0300000_1_I2.A00;
        SearchEditText searchEditText = r1.A03;
        String str = this.A02;
        searchEditText.setText(str);
        searchEditText.setSelection(str.length());
        r1.A00.setVisibility(8);
        C09860go.A0K(searchEditText);
        int i = this.A00;
        C61763Vg A03 = C63313hF.A03((C10300i6) iDxAdapterShape3S0300000_1_I2.A01, C313625r.SAC, AnonymousClass2AT.A0D.A00, "username_suggestion_tapped");
        A03.A02("username_position", i);
        A03.A01();
        C14030oh.A0C(527197948, A05);
    }
}
