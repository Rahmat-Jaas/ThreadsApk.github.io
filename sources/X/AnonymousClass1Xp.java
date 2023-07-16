package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape208S0100000_6_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1Xp  reason: invalid class name */
public final class AnonymousClass1Xp extends C34640IcN {
    public static final String __redex_internal_original_name = "PinnedCommentBottomSheetFragment";
    public JM7 A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "pinned_comment_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1584686105);
        IgdsHeadline igdsHeadline = new IgdsHeadline(requireContext(), (AttributeSet) null, 0, 0);
        igdsHeadline.A08(R.drawable.pinned_comments, false);
        igdsHeadline.setHeadline(2131832562);
        igdsHeadline.setBody(2131832560);
        igdsHeadline.A09(new IDxCListenerShape208S0100000_6_I2((Object) this, 121), 2131832561);
        C14030oh.A09(111909390, A02);
        return igdsHeadline;
    }
}
