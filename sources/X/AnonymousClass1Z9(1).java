package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.barcelona.R;

/* renamed from: X.1Z9  reason: invalid class name */
public final class AnonymousClass1Z9 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PlaylistReelsTitleFragment";
    public EditText A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "playlist_reels_title_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) AnonymousClass0wJ.A0I(view, R.id.playlist_title_edittext);
        this.A00 = editText;
        if (editText == null) {
            C04220Ms.A0E("titleEditText");
            throw null;
        } else {
            editText.postDelayed(new C72564Oq(this), 500);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            AnonymousClass4u2.A07(r3, 2131832583);
            r3.Crj(C65183sV.A00, R.drawable.instagram_check_pano_outline_24);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-945582769);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_playlist_title, viewGroup, false);
        C14030oh.A09(462331886, A02);
        return inflate;
    }
}
