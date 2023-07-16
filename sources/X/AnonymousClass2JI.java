package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.bloks.common.implementations.product.storyviewer.StoryViewerOverlayUtil$FragmentLifecycleObserver;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.2JI  reason: invalid class name */
public final class AnonymousClass2JI {
    public static final Object A00(AnonymousClass601 r15, C63893iY r16) {
        String str;
        View view;
        ViewGroup viewGroup;
        C63893iY r1 = r16;
        boolean A1Z = AnonymousClass0wJ.A1Z(r1, r15);
        C130667qT A08 = C63913ic.A08(r15);
        FragmentActivity A05 = C63913ic.A05(r15);
        List list = r1.A00;
        C127397h3 r0 = (C127397h3) list.get(A1Z ? 1 : 0);
        if (r0 != null) {
            str = C18230wP.A0o(r0);
        } else {
            str = null;
        }
        Fragment A00 = AnonymousClass2C3.A00(A05);
        if (!(A00 == null || (view = A00.mView) == null || (viewGroup = (ViewGroup) view.getParent()) == null || A00.mDetached || A00.mRemoving)) {
            C121997Jj r6 = (C121997Jj) list.get(0);
            View findViewWithTag = viewGroup.findViewWithTag("story_viewer_media_container_view_tag");
            LLF llf = new LLF(A05);
            if (findViewWithTag != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(findViewWithTag.getWidth(), findViewWithTag.getHeight());
                layoutParams.setMargins(0, findViewWithTag.getTop(), 0, 0);
                llf.setLayoutParams(layoutParams);
            }
            SparseArray sparseArray = new SparseArray();
            AnonymousClass3HX r02 = r15.A00;
            if (r02 != null) {
                Object obj = r02.A01.get(R.id.video_player_origin);
                if (PlayerOrigin.class.isInstance(obj) && obj != null) {
                    sparseArray.put(R.id.video_player_origin, obj);
                }
            }
            C58513Fy r03 = new C58513Fy(A05, r6, A08);
            r03.A00 = sparseArray;
            C121247Ez A002 = r03.A00();
            A002.A06(llf);
            viewGroup.setOnKeyListener(new C65563td(viewGroup, llf, A002));
            C14340pE r13 = A00.mLifecycleRegistry;
            StoryViewerOverlayUtil$FragmentLifecycleObserver storyViewerOverlayUtil$FragmentLifecycleObserver = new StoryViewerOverlayUtil$FragmentLifecycleObserver(viewGroup, r13, llf, A002, str);
            r13.A07(storyViewerOverlayUtil$FragmentLifecycleObserver);
            llf.setTag(R.id.stories_overlay, storyViewerOverlayUtil$FragmentLifecycleObserver);
            viewGroup.addView(llf);
            llf.setVisibility(0);
        }
        return null;
    }
}
