package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.1dl  reason: invalid class name */
public final class AnonymousClass1dl extends C22302CTd {
    public static final String __redex_internal_original_name = "VideoCaptionsShareFragment";
    public UserSession A00;
    public AnonymousClass1fC A01;
    public final List A02 = AnonymousClass0wJ.A0v();

    public final String getModuleName() {
        return "video_captions_share";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-259674346);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(C18250wR.A07(this));
        this.A01 = new AnonymousClass1fC(requireContext(), this.A00, this);
        List list = this.A02;
        list.add(AnonymousClass4MC.A05(this, 7, 2131823101, C28161tl.A04(this.A00).getBoolean("generate_captions_for_feed_videos", true)));
        String string = getString(2131837801);
        String string2 = getString(2131829580);
        SpannableStringBuilder A0D = C18190wL.A0D(string, string2);
        AnonymousClass3Zw.A02(A0D, this, string2, 4);
        list.add(new C63293hC(A0D));
        this.A01.setItems(list);
        setAdapter(this.A01);
        C14030oh.A09(1489154812, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1558964744);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.video_captions_share_settings);
        C14030oh.A09(-697469875, A022);
        return A0H;
    }
}
