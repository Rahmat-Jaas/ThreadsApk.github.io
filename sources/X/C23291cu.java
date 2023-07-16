package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.1cu  reason: invalid class name and case insensitive filesystem */
public final class C23291cu extends C34640IcN implements C81414nk {
    public static final String __redex_internal_original_name = "ActionSheetFragment";
    public View A00;
    public TextView A01;
    public AnonymousClass11A A02 = new AnonymousClass11A();
    public boolean A03;
    public RecyclerView A04;
    public C10300i6 A05;

    public final String getModuleName() {
        return "action_sheet_fragment";
    }

    public final boolean shouldCreatePictureInPictureBackdrop() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final AnonymousClass24C getStatusBarType() {
        return AnonymousClass24C.PERSIST;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-697543618);
        super.onCreate(bundle);
        this.A05 = C18190wL.A0S(requireArguments());
        this.A03 = true;
        C14030oh.A09(-1373500174, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-2068645825);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.action_sheet_fragment);
        C14030oh.A09(1794132875, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(366275168);
        super.onPause();
        this.A03 = false;
        C14030oh.A09(-1000883304, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(285494348);
        super.onResume();
        C14030oh.A09(-891348585, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = view;
        this.A04 = C18230wP.A0L(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.A04.setAdapter(this.A02);
        this.A04.setLayoutManager(linearLayoutManager);
    }
}
