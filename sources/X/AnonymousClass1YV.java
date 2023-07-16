package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.1YV  reason: invalid class name */
public final class AnonymousClass1YV extends C34640IcN {
    public static final String __redex_internal_original_name = "FbCommentMiniProfileContainerFragment";
    public String A00;
    public String A01;
    public String A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final String A04 = "FB";

    public final String getModuleName() {
        return "facebook_comments_bottom_sheet_miniprofile";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View inflate = ((ViewStub) AnonymousClass0wJ.A0J(view2, R.id.miniprofile_container_title_bar)).inflate();
        C04220Ms.A06(inflate);
        IgBloksScreenConfig A0N = C18190wL.A0N(AnonymousClass0wJ.A0U(this.A03));
        A0N.A0P = "com.bloks.www.miniprofile.entrypoint";
        FragmentActivity activity = getActivity();
        HashMap A0y = AnonymousClass0wJ.A0y();
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        HashMap A0y3 = AnonymousClass0wJ.A0y();
        BitSet bitSet = new BitSet(4);
        A0y2.put("id", this.A00);
        bitSet.set(1);
        A0y2.put(FXPFAccessLibraryDebugFragment.NAME, this.A01);
        bitSet.set(2);
        A0y2.put("initial_photo_uri", this.A02);
        A0y2.put("privacy_level", 0L);
        bitSet.set(3);
        A0y.put("destination_app", this.A04);
        bitSet.set(0);
        if (bitSet.nextClearBit(0) >= 4) {
            C63743iE r1 = new C63743iE(C37067Jjv.A02(A0y), A0y2, "com.bloks.www.miniprofile.entrypoint");
            r1.A00 = 719983200;
            r1.A05 = null;
            r1.A01 = 0;
            r1.A03 = null;
            r1.A02 = null;
            Fragment A002 = C63743iE.A00(activity, A0N, r1, A0y3);
            C12560m7 childFragmentManager = getChildFragmentManager();
            C04220Ms.A06(childFragmentManager);
            AnonymousClass01J r12 = new AnonymousClass01J(childFragmentManager);
            r12.A0D(A002, R.id.fragment_container);
            r12.A08();
            View A0K = AnonymousClass0wJ.A0K(inflate, R.id.fb_comment_thread_back_button);
            A0K.setVisibility(0);
            AnonymousClass0wJ.A0K(inflate, R.id.fb_comment_thread_more_button).setVisibility(8);
            AnonymousClass0wJ.A17(A0K, 334, this);
            TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.fb_comment_thread_title);
            String str = this.A01;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            return;
        }
        throw C18180wK.A0a("Missing Required Props");
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2035434838);
        super.onCreate(bundle);
        this.A00 = requireArguments().getString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_ID");
        this.A01 = requireArguments().getString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_NAME");
        this.A02 = requireArguments().getString("FbCommentMiniProfileContainerFragment.ARG_FACEBOOK_PROFILE_PICTURE_URI");
        C14030oh.A09(-239155572, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-749044451);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_fb_comment_thread_miniprofile, viewGroup, false);
        C14030oh.A09(420563185, A022);
        return inflate;
    }
}
