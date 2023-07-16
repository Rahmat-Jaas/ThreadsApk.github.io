package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.bloks.common.implementations.product.storyviewer.StoryViewerOverlayUtil$FragmentLifecycleObserver;
import com.instagram.barcelona.R;

/* renamed from: X.2JH  reason: invalid class name */
public final class AnonymousClass2JH {
    public static Object A00(AnonymousClass601 r4, C63893iY r5) {
        String A0o;
        View view;
        ViewGroup viewGroup;
        C63913ic.A0C(r4);
        C04220Ms.A0B(r4, 0);
        FragmentActivity A05 = C63913ic.A05(r4);
        C127397h3 A02 = C63893iY.A02(r5, 0);
        if (A02 == null) {
            A0o = null;
        } else {
            A0o = C18230wP.A0o(A02);
        }
        Fragment A00 = AnonymousClass2C3.A00(A05);
        if (A00 != null && (view = A00.mView) != null && (viewGroup = (ViewGroup) view.getParent()) != null && !A00.mDetached && !A00.mRemoving) {
            if (A0o == null) {
                A0o = "";
            }
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    StoryViewerOverlayUtil$FragmentLifecycleObserver storyViewerOverlayUtil$FragmentLifecycleObserver = (StoryViewerOverlayUtil$FragmentLifecycleObserver) viewGroup.getChildAt(childCount).getTag(R.id.stories_overlay);
                    if (storyViewerOverlayUtil$FragmentLifecycleObserver != null && A0o.equals(storyViewerOverlayUtil$FragmentLifecycleObserver.A00)) {
                        storyViewerOverlayUtil$FragmentLifecycleObserver.onDestroy();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return null;
    }
}
