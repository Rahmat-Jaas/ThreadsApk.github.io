package com.instagram.reels.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class FBStoryViewerFragmentImpl extends TreeJNI implements C81204nM {

    public final class ProfilePhoto extends TreeJNI implements C81204nM {

        public final class InlineXFBXPSProfilePhoto extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "url"};
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXFBXPSProfilePhoto.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"has_interop_enabled", "id", "is_blocked_by_viewer", "is_friends_with_viewer", "is_verified", "is_viewer_story_hidden_from_user", FXPFAccessLibraryDebugFragment.NAME};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ProfilePhoto.class, "profile_photo(height:$profile_pic_height,width:$profile_pic_width)");
    }
}
