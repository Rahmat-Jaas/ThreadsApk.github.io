package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.pando.TreeJNI;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl;

/* renamed from: X.1ks  reason: invalid class name and case insensitive filesystem */
public final class C24941ks extends AnonymousClass1lO {
    public final C11630kW A00;
    public final AnonymousClass36U A01;

    public C24941ks(C11630kW r2, AnonymousClass36U r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Class modelClass() {
        return AnonymousClass48T.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        TreeJNI treeValue;
        String A0Y;
        TreeJNI treeValue2;
        String A0Y2;
        AnonymousClass48T r9 = (AnonymousClass48T) mfV;
        AnonymousClass13Y r10 = (AnonymousClass13Y) m5o;
        AnonymousClass0wJ.A1N(r9, r10);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = r10.A03;
        String str = null;
        gradientSpinnerAvatarView.setOnClickListener((View.OnClickListener) null);
        gradientSpinnerAvatarView.A04();
        TextView textView = r10.A01;
        C18250wR.A0t(textView);
        IgImageView igImageView = r10.A02;
        igImageView.A09();
        FBReactorOfContentImpl fBReactorOfContentImpl = r9.A00;
        Class<FBReactorOfContentImpl.Node> cls = FBReactorOfContentImpl.Node.class;
        TreeJNI treeValue3 = fBReactorOfContentImpl.getTreeValue("node", cls);
        if (treeValue3 != null) {
            str = C18220wO.A0l(treeValue3);
        }
        textView.setText(str);
        AnonymousClass0wJ.A18(gradientSpinnerAvatarView, 227, this, r9);
        TreeJNI treeValue4 = fBReactorOfContentImpl.getTreeValue("node", cls);
        if (!(treeValue4 == null || (treeValue2 = treeValue4.getTreeValue("profile_picture(height:200,width:200)", FBReactorOfContentImpl.Node.ProfilePicture100.class)) == null || (A0Y2 = C18250wR.A0Y(treeValue2)) == null)) {
            gradientSpinnerAvatarView.A09(C18250wR.A0K(A0Y2), this.A00);
            gradientSpinnerAvatarView.setBottomBadgeDrawable(r10.A00);
            gradientSpinnerAvatarView.A01 = C09860go.A03(C18240wQ.A0B(r10), 3);
        }
        TreeJNI treeValue5 = fBReactorOfContentImpl.getTreeValue("feedback_reaction_info", FBReactorOfContentImpl.FeedbackReactionInfo.class);
        if (treeValue5 != null && (treeValue = treeValue5.getTreeValue("face_image(height:50,width:50)", FBReactorOfContentImpl.FeedbackReactionInfo.FaceImage.class)) != null && (A0Y = C18250wR.A0Y(treeValue)) != null) {
            igImageView.setUrl(C18250wR.A0K(A0Y), this.A00);
        }
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass13Y(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_reaction, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
