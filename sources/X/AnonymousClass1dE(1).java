package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape46S0100000_I2_26;

/* renamed from: X.1dE  reason: invalid class name */
public final class AnonymousClass1dE extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "ClipsDraftBackupNuxFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape46S0100000_I2_26(this, 25));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18180wK.A0r(requireContext(), C18200wM.A0J(view, R.id.clips_draft_backup_nux_icon), R.drawable.ig_illustrations_illo_drafts_backup_android_refresh);
        AnonymousClass0wJ.A16(view.requireViewById(R.id.clips_draft_backup_nux_ok_button), 239, this);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(this.A00))), "clips_draft_backup_nux", true);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1148018033);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_drafts_backups_nux, viewGroup, false);
        C14030oh.A09(572763814, A02);
        return inflate;
    }
}
